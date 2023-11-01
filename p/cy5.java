package p.cy5;
import p.r90;
import p.ps2;
import java.util.List;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import p.v90;
import java.lang.String;
import java.util.Objects;
import p.u90;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.util.ArrayDeque;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.Collections;
import p.se5;
import java.lang.reflect.Method;
import p.zo4;
import java.lang.reflect.Modifier;
import p.js2;
import java.lang.ClassLoader;
import p.ho2;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import p.su0;
import p.qu0;

public final class cy5	// class@0001a6 from classes2.dex
{
    public final ConcurrentHashMap a;
    public final r90 b;
    public final ps2 c;
    public final List d;
    public final List e;
    public final Executor f;
    public final boolean g;

    public void cy5(r90 p0,ps2 p1,List p2,List p3,Executor p4,boolean p5){
       super();
       this.a = new ConcurrentHashMap();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final v90 a(Type p0,Annotation[] p1){
       v90 ov90;
       Objects.requireNonNull(p0, "returnType == null");
       Objects.requireNonNull(p1, "annotations == null");
       cy5 te = this.e;
       int i = te.indexOf(null) + 1;
       int i1 = te.size();
       int i2 = i;
       while (true) {
          if (i2 < i1) {
             if ((ov90 = te.get(i2).a(p0, p1)) != null) {
                break ;
             }else {
                i2 = i2 + 1;
             }
          }else {
             StringBuilder str = "Could not locate call adapter for "+p0+".\n  Tried:";
             int i3 = te.size();
             for (; i < i3; i = i + 1) {
                str = str.append("\n   * ").append(te.get(i).getClass().getName());
             }
             throw new IllegalArgumentException(str);
          }
       }
       return ov90;
    }
    public final Object b(Class p0){
       StringBuilder str;
       if (!p0.isInterface()) {
          throw new IllegalArgumentException("API declarations must be interfaces.");
       }
       int i = 1;
       ArrayDeque uArrayDeque = new ArrayDeque(i);
       uArrayDeque.add(p0);
       while (true) {
          if (!uArrayDeque.isEmpty()) {
             Class uClass = uArrayDeque.removeFirst();
             if (uClass.getTypeParameters().length) {
                str = "Type parameters are unsupported on "+uClass.getName();
                if (uClass != p0) {
                   str = str+" which is an interface of "+p0.getName();
                   break ;
                }
                break ;
             }else {
                Collections.addAll(uArrayDeque, uClass.getInterfaces());
             }
          }else {
             int i1 = 0;
             if (this.g != null) {
                se5 c = se5.c;
                Method[] declaredMeth = p0.getDeclaredMethods();
                int len = declaredMeth.length;
                int i2 = 0;
                while (i2 < len) {
                   object oobject = declaredMeth[i2];
                   int i3 = (c.a != null && zo4.z(oobject))? 1: 0;
                   if (!i3 && !Modifier.isStatic(oobject.getModifiers())) {
                      this.c(oobject);
                   }
                   i2 = i2 + 1;
                }
             }
             Class[] uClassArray = new Class[i];
             uClassArray[i1] = p0;
             return Proxy.newProxyInstance(p0.getClassLoader(), uClassArray, new ho2(this, p0));
          }
       }
       throw new IllegalArgumentException(str);
    }
    public final js2 c(Method p0){
       js2 ojs2;
       js2 ojs21;
       if ((ojs2 = this.a.get(p0)) != null) {
          return ojs2;
       }
       cy5 ta = this.a;
       _monitor_enter(ta);
       if ((ojs21 = this.a.get(p0)) == null) {
          ojs21 = js2.b(this, p0);
          this.a.put(p0, ojs21);
       }
       _monitor_exit(ta);
       return ojs21;
    }
    public final su0 d(Type p0,Annotation[] p1,Annotation[] p2){
       su0 osu0;
       Objects.requireNonNull(p0, "type == null");
       Objects.requireNonNull(p2, "methodAnnotations == null");
       cy5 td = this.d;
       int i = td.indexOf(null) + 1;
       int i1 = td.size();
       int i2 = i;
       while (true) {
          if (i2 < i1) {
             if ((osu0 = td.get(i2).a(p0, p1, p2, this)) != null) {
                break ;
             }else {
                i2 = i2 + 1;
             }
          }else {
             StringBuilder str = "Could not locate RequestBody converter for "+p0+".\n  Tried:";
             int i3 = td.size();
             for (; i < i3; i = i + 1) {
                str = str.append("\n   * ").append(td.get(i).getClass().getName());
             }
             throw new IllegalArgumentException(str);
          }
       }
       return osu0;
    }
    public final su0 e(Type p0,Annotation[] p1){
       su0 osu0;
       Objects.requireNonNull(p0, "type == null");
       Objects.requireNonNull(p1, "annotations == null");
       cy5 td = this.d;
       int i = td.indexOf(null) + 1;
       int i1 = td.size();
       int i2 = i;
       while (true) {
          if (i2 < i1) {
             if ((osu0 = td.get(i2).b(p0, p1, this)) != null) {
                break ;
             }else {
                i2 = i2 + 1;
             }
          }else {
             StringBuilder str = "Could not locate ResponseBody converter for "+p0+".\n"+"  Tried:";
             int i3 = td.size();
             for (; i < i3; i = i + 1) {
                str = str.append("\n   * ").append(td.get(i).getClass().getName());
             }
             throw new IllegalArgumentException(str);
          }
       }
       return osu0;
    }
    public final void f(Type p0,Annotation[] p1){
       Objects.requireNonNull(p0, "type == null");
       cy5 td = this.d;
       int i = td.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          td.get(i1).getClass();
       }
       return;
    }
}
