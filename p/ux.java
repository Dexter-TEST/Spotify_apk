package p.ux;
import p.au0;
import p.ex0;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.UnsupportedOperationException;
import p.dx0;
import java.lang.Throwable;
import p.tx5;
import p.eb3;
import java.lang.StackTraceElement;
import java.lang.Class;
import p.v51;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import java.lang.Integer;
import p.oi;
import java.lang.reflect.Method;
import java.lang.ClassLoader;
import p.ko1;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;

public abstract class ux implements au0, ex0, Serializable	// class@002941 from classes.dex
{
    public final au0 a;

    public void ux(au0 p0){
       super();
       this.a = p0;
    }
    public final ex0 a(){
       ux ta = this.a;
       if (ta instanceof ex0) {
       }else {
          ta = null;
       }
       return ta;
    }
    public au0 c(Object p0,au0 p1){
       co5.o(p1, "completion");
       throw new UnsupportedOperationException("create\(Any?;Continuation\) has not been overridden");
    }
    public final void d(Object p0){
       ux a;
       ux oux = this;
       while (true) {
          a = oux.a;
          co5.i(a);
          if ((p0 = oux.f(p0)) == dx0.a) {
             return;
          }
          oux.g();
          if (a instanceof ux) {
             oux = a;
          }else {
             break ;
          }
       }
       a.d(p0);
       return;
    }
    public final StackTraceElement e(){
       StackTraceElement stackTraceEl1;
       int i2;
       Object[] objArray;
       ko1 c1;
       StackTraceElement stackTraceEl2;
       v51 annotation = this.getClass().getAnnotation(v51.class);
       StackTraceElement stackTraceEl = null;
       if (annotation == null) {
       }else {
          int i = annotation.v();
          boolean b = true;
          if (i <= b) {
             i = -1;
             int i1 = 0;
             try{
                Field declaredFiel = this.getClass().getDeclaredField("label");
                declaredFiel.setAccessible(b);
                stackTraceEl1 = declaredFiel.get(this);
                if (stackTraceEl1 instanceof Integer) {
                }else {
                   stackTraceEl1 = stackTraceEl;
                }
                i2 = (stackTraceEl1 != null)? stackTraceEl1.intValue(): 0;
                i2 = i2 - b;
             }catch(java.lang.Exception e0){
                i2 = -1;
             }
             if (i2 >= 0) {
                i = e0.l()[i2];
             }
             ko1 c = oi.c;
             ko1 b1 = oi.b;
             if (c == null) {
                try{
                   Class[] uClassArray = new Class[i1];
                   Class[] uClassArray1 = new Class[i1];
                   Class[] uClassArray2 = new Class[i1];
                   ko1 oko1 = new ko1(Class.class.getDeclaredMethod("getModule", uClassArray), this.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", uClassArray1), this.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", uClassArray2), 15);
                   oi.c = oko1;
                   c = oko1;
                }catch(java.lang.Exception e0){
                   oi.c = b1;
                   c = b1;
                }
             }
             if (c != b1) {
                if ((b1 = c.b) != null) {
                   objArray = new Object[i1];
                   stackTraceEl1 = b1.invoke(this.getClass(), objArray);
                }else {
                   stackTraceEl1 = stackTraceEl;
                }
                if (stackTraceEl1 != null) {
                   if ((c1 = c.c) != null) {
                      objArray = new Object[i1];
                      stackTraceEl1 = c1.invoke(stackTraceEl1, objArray);
                   }else {
                      stackTraceEl1 = stackTraceEl;
                   }
                   if (stackTraceEl1 != null) {
                      if ((c = c.t) != null) {
                         Object[] objArray1 = new Object[i1];
                         stackTraceEl2 = c.invoke(stackTraceEl1, objArray1);
                      }else {
                         stackTraceEl2 = stackTraceEl;
                      }
                      if (stackTraceEl2 instanceof String) {
                         stackTraceEl = stackTraceEl2;
                      }
                   }
                }
             }
             String str = (stackTraceEl == null)? e0.c(): stackTraceEl+'/'+e0.c();
             stackTraceEl = new StackTraceElement(str, e0.m(), e0.f(), i);
          }else {
             throw new IllegalStateException("Debug metadata version mismatch. Expected: 1, got "+i+". Please update the Kotlin standard library.".toString());
          }
       }
       return stackTraceEl;
    }
    public abstract Object f(Object p0);
    public void g(){
    }
    public String toString(){
       StackTraceElement stackTraceEl;
       String str = "Continuation at ";
       if ((stackTraceEl = this.e()) != null) {
       }else {
          stackTraceEl = this.getClass().getName();
       }
       return str+stackTraceEl;
    }
}
