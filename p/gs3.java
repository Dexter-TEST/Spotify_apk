package p.gs3;
import java.lang.Object;
import java.lang.Class;
import p.dd;
import java.lang.String;
import java.lang.System;

public abstract class gs3	// class@00176c from classes.dex
{

    public void gs3(){
       super();
    }
    public static dd a(Class p0){
       if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
          return new dd(p0.getSimpleName(), 0);
       }
       return new dd(p0.getSimpleName(), 1);
    }
    public abstract void b(String p0);
    public abstract void c(String p0);
    public abstract void d(String p0);
}
