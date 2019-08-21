package com.pzy.study.proxys;


import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.*;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/21
 */
public class ProxyUtils {


    private static String rt = "\r\n";

    public static String get$Proxy0(Class<?> clazz){
        Method[] methods = clazz.getMethods();
        String proxyClass = "package com.pzy.study.proxys;" + rt + rt
                + "import java.lang.reflect.Method;" + rt
                + "import java.lang.reflect.InvocationHandler; " +rt
                + "public class $Proxy0 implements " +clazz.getName() +"{"
                + rt + "InvocationHandler h;" + rt
                + "public $Proxy0(InvocationHandler h){" +rt
                + "this.h = h;" + rt +"}" + rt
                + getMethodString(methods ,clazz)
                + rt + "}";
        return proxyClass;
    }

    private static String getMethodString(Method[] methods , Class<?> clazz){
        String proxyMethod = "";
        for (Method method : methods) {
            proxyMethod += "public String "+method.getName()
                    + "() throws Throwable {" + rt + "Method md = "
                    + clazz.getName() + ".class.getMethod(\"" + method.getName()
                    + "\",new Class[]{});" + rt
                    + "return (String)this.h.invoke(this , md ,null);" + rt + "}" + rt;
        }
        return proxyMethod;
    }

    public static void writeFile(String proxyClass , String path){
        File f = new File(path);
        try {
            FileWriter fw = new FileWriter(f);
            fw.write(proxyClass);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void compileJavaFile(String fileName) {
        try {
            //获得当前系统中的编译器
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            //获得文件管理者
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> fileObjects = manager.getJavaFileObjects(fileName);
            //编译任务
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, fileObjects);
            //开始编译，执行完可在当前目录下看到.class文件
            task.call();
            //关闭文件管理者
            manager.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Object loadClassToJvm(InvocationHandler h) {
        try {
            //使用自定义类加载器
            MyClassLoader loader = new MyClassLoader("D:\\projects\\application-study\\src\\main\\java\\com\\pzy\\study\\proxys");
            //得到动态代理类的反射对象
            Class<?> $Proxy0 = loader.findClass("$Proxy0");
            //通过反射机制获取动态代理类$Proxy0的构造函数，其参数类型是调用处理器接口类型
            Constructor<?> constructors = $Proxy0.getConstructor(InvocationHandler.class);
            //通过构造函数创建动态代理类实例
            return constructors.newInstance(h);
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object newInstance(ClassLoader classLoader , Class<?> clazz , InvocationHandler h){
        String $Proxy0 = get$Proxy0(clazz);
        writeFile($Proxy0 ,"D:\\projects\\application-study\\src\\main\\java\\com\\pzy\\study\\proxys\\$Proxy0.java");
        compileJavaFile("D:\\projects\\application-study\\src\\main\\java\\com\\pzy\\study\\proxys\\$Proxy0.java");
        return loadClassToJvm(h);
    }

    public static void main(String[] args) throws Throwable {
        MyClassLoader myClassLoader = new MyClassLoader("D:\\projects\\application-study\\src\\main\\java\\com\\pzy\\study\\proxys");
        FooService fooService = (FooService)ProxyUtils.newInstance(myClassLoader, HelloWorld.class, new MyInvocationHandler(new FooService()));
        fooService.execute();
    }
}
