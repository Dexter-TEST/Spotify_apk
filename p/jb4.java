package p.jb4;
import p.qb4;
import java.lang.Object;
import p.jt;
import java.lang.Exception;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.PrintStream;
import java.lang.Throwable;
import p.xt;

public final class jb4 implements qb4	// class@001aa3 from classes.dex
{

    public void jb4(){
       super();
    }
    public final void a(Object p0,Object p1){
    }
    public final void b(Object p0,jt p1){
    }
    public final void c(Object p0,Object p1,Exception p2){
       System.err.println("error updating model: \'"+p0+"\' with event: \'"+p1+"\' - "+p2);
       p2.printStackTrace(System.err);
    }
    public final void d(Object p0){
    }
    public final void e(Object p0,Exception p1){
       System.err.println("error initialising from model: \'"+p0+"\' - "+p1);
       p1.printStackTrace(System.err);
    }
    public final void f(Object p0,Object p1,xt p2){
    }
}
