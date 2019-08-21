package com.pzy.study.proxys;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler; 
public class $Proxy0 implements HelloWorld{
InvocationHandler h;
public $Proxy0(InvocationHandler h){
this.h = h;
}
public String execute() throws Throwable {
Method md =HelloWorld.class.getMethod("execute",new Class[]{});
return (String)this.h.invoke(this , md ,null);
}

}