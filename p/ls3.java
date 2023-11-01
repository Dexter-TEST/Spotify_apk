package p.ls3;
import p.ze;
import p.i70;
import java.lang.String;
import java.lang.System;
import java.util.LinkedHashSet;
import org.slf4j.impl.StaticLoggerBinder;
import java.lang.Throwable;
import p.xe7;
import java.lang.IllegalStateException;
import java.lang.CharSequence;
import java.lang.ClassLoader;
import java.lang.Class;
import java.util.Enumeration;
import java.lang.Object;
import java.net.URL;
import java.util.Set;
import p.ILoggerFactory;
import p.is3;
import p.ue7;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import p.nv6;
import java.util.concurrent.LinkedBlockingQueue;
import p.ov6;
import p.se4;
import java.lang.reflect.Method;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Arrays;

public abstract class ls3	// class@0002a7 from classes2.dex
{
    public static int a;
    public static final ze b;
    public static final i70 c;
    public static final boolean d;
    public static final String[] e;
    public static final String f;

    static {
       String str;
       ls3.b = new ze();
       ls3.c = new i70();
       try{
          str = "slf4j.detectLoggerNameMismatch";
          str = System.getProperty(str);
       }catch(java.lang.SecurityException e0){
          str = null;
       }
       boolean b = (str == null)? false: str.equalsIgnoreCase("true");
       ls3.d = b;
       String[] stringArray = new String[]{"1.6","1.7"};
       ls3.e = stringArray;
       ls3.f = "org/slf4j/impl/StaticLoggerBinder.class";
    }
    public static final void a(){
       String message1;
       LinkedHashSet linkedHashSe;
       String str = "Failed to instantiate SLF4J LoggerFactory";
       int i = 2;
       try{
          if (!ls3.f()) {
             linkedHashSe = ls3.b();
             ls3.i(linkedHashSe);
          }else {
             linkedHashSe = null;
          }
          StaticLoggerBinder.getSingleton();
          ls3.a = 3;
          ls3.h(linkedHashSe);
       label_007f :
          ls3.g();
          return;
       }catch(java.lang.NoClassDefFoundError e2){
          String message = ((message = e2.getMessage()) == null || (!message.contains("org/slf4j/impl/StaticLoggerBinder") || message.contains("org.slf4j.impl.StaticLoggerBinder")))? 0: 1;
          if (message) {
             ls3.a = 4;
             xe7.V("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
             xe7.V("Defaulting to no-operation \(NOP\) logger implementation");
             xe7.V("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
             goto label_007f ;
          }else {
             ls3.a = i;
             xe7.W(str, e2);
             throw e2;
          }
       }catch(java.lang.NoSuchMethodError e0){
          if ((message1 = e0.getMessage()) != null && message1.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton\(\)")) {
             ls3.a = i;
             xe7.V("slf4j-api 1.6.x \(or later\) is incompatible with this binding.");
             xe7.V("Your binding is version 1.5.5 or earlier.");
             xe7.V("Upgrade your binding to version 1.6.x.");
          }
          throw e0;
       }catch(java.lang.Exception e2){
          ls3.a = i;
          xe7.W(str, e2);
          throw new IllegalStateException("Unexpected initialization failure", e2);
       }
    }
    public static LinkedHashSet b(){
       LinkedHashSet linkedHashSe;
       try{
          linkedHashSe = new LinkedHashSet();
          ClassLoader classLoader = ls3.class.getClassLoader();
          String f = ls3.f;
          Enumeration systemResour = (classLoader == null)? ClassLoader.getSystemResources(f): classLoader.getResources(f);
          while (systemResour.hasMoreElements()) {
             linkedHashSe.add(systemResour.nextElement());
          }
       }catch(java.io.IOException e1){
          xe7.W("Error getting resources from path", e1);
       }
       return linkedHashSe;
    }
    public static ILoggerFactory c(){
       int a;
       int i = 3;
       int i1 = 1;
       if (!ls3.a) {
          ls3 ols3 = ls3.class;
          _monitor_enter(ols3);
          if (!ls3.a) {
             ls3.a = i1;
             ls3.a();
             if (ls3.a == i) {
                ls3.j();
             }
          }
          _monitor_exit(ols3);
       }
       if ((a = ls3.a) != i1) {
          if (a != 2) {
             if (a != i) {
                if (a == 4) {
                   return ls3.c;
                }else {
                   throw new IllegalStateException("Unreachable code");
                }
             }else {
                return StaticLoggerBinder.getSingleton().getLoggerFactory();
             }
          }else {
             throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
          }
       }else {
          return ls3.b;
       }
    }
    public static is3 d(Class p0){
       String name;
       is3 ois3 = ls3.e(p0.getName());
       if (ls3.d) {
          ue7 a = xe7.a;
          Class uClass = null;
          if (a == null) {
             if (xe7.b) {
                a = uClass;
             }else {
                try{
                   a = new ue7();
                }catch(java.lang.SecurityException e0){
                   a = uClass;
                }
                xe7.a = a;
                xe7.b = true;
             }
          }
          if (a != null) {
             Class[] classContext = a.getClassContext();
             name = xe7.class.getName();
             int i = 0;
             while (i < classContext.length && !name.equals(classContext[i].getName())) {
                i = i + 1;
             }
             if (i < classContext.length && (i = i + 2) < classContext.length) {
                uClass = classContext[i];
             }else {
                throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
             }
          }
          if (uClass != null && ((uClass.isAssignableFrom(p0) ^ 1))) {
             Object[] objArray = new Object[]{ois3.getName(),uClass.getName()};
             xe7.V(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", objArray));
             xe7.V("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
          }
       }
       return ois3;
    }
    public static is3 e(String p0){
       return ls3.c().e(p0);
    }
    public static boolean f(){
       String str = "java.vendor.url";
       try{
          str = System.getProperty(str);
       }catch(java.lang.SecurityException e0){
          str = null;
       }
       if (str == null) {
          return false;
       }
       return str.toLowerCase().contains("android");
    }
    public static void g(){
       ov6 oov6;
       ze b = ls3.b;
       _monitor_enter(b);
       boolean b1 = true;
       b.a = b1;
       Iterator iterator = new ArrayList(b.b.values()).iterator();
       while (iterator.hasNext()) {
          nv6 onv6 = iterator.next();
          onv6.b = ls3.e(onv6.a);
       }
       _monitor_exit(b);
       ze oze = ls3.b.c;
       int i = oze.size();
       ArrayList uArrayList = new ArrayList(128);
       int i1 = 0;
       while (true) {
          if (!oze.drainTo(uArrayList, 128)) {
          }else {
             Iterator iterator1 = uArrayList.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   if ((oov6 = iterator1.next()) != null) {
                      ov6 a = oov6.a;
                      nv6 a1 = a.a;
                      int i3 = (a.b == null)? 1: 0;
                      if (!i3) {
                         if (!a.b instanceof se4) {
                            if (a.g()) {
                               if (a.g()) {
                                  try{
                                     Object[] objArray = new Object[b1];
                                     objArray[0] = oov6;
                                     a.t.invoke(a.b, objArray);
                                  }catch(java.lang.IllegalAccessException e0){
                                  }catch(java.lang.IllegalArgumentException e0){
                                  }catch(java.lang.reflect.InvocationTargetException e0){
                                  }
                               }
                            }else {
                               xe7.V(a1);
                            }
                         }
                      }else {
                      }
                   }
                   int i2 = i1 + 1;
                   if (!i1) {
                      if (oov6.a.g()) {
                         xe7.V("A number \(".append(i).append("\) of logging calls during the initialization phase have been intercepted and are").toString());
                         xe7.V("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                         xe7.V("See also http://www.slf4j.org/codes.html#replay");
                      }else if(oov6.a.b instanceof se4){
                         xe7.V("The following set of substitute loggers may have been accessed");
                         xe7.V("during the initialization phase. Logging calls during this");
                         xe7.V("phase were not honored. However, subsequent logging calls to these");
                         xe7.V("loggers will work as normally expected.");
                         xe7.V("See also http://www.slf4j.org/codes.html#substituteLogger");
                      }
                   }
                   i1 = i2;
                }else {
                   uArrayList.clear();
                }
             }
             b = ls3.b;
             b.b.clear();
             b.c.clear();
             return;
          }
       }
       throw new IllegalStateException("Delegate logger cannot be null at this state.");
    }
    public static void h(LinkedHashSet p0){
       if (p0 != null) {
          int i = 1;
          if (p0.size() <= i) {
             i = 0;
          }
          if (i) {
             xe7.V("Actual binding is of type ["+StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr()+"]");
          }
       }
       return;
    }
    public static void i(LinkedHashSet p0){
       int i = 1;
       if (p0.size() > i) {
       }else {
          i = 0;
       }
       if (i) {
          xe7.V("Class path contains multiple SLF4J bindings.");
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             xe7.V("Found binding in [".append(iterator.next()).append("]").toString());
          }
          xe7.V("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
       }
       return;
    }
    public static final void j(){
       try{
          String rEQUESTED_AP = StaticLoggerBinder.REQUESTED_API_VERSION;
          String[] e = ls3.e;
          int len = e.length;
          int i = 0;
          int i1 = 0;
          while (i < len) {
             if (rEQUESTED_AP.startsWith(e[i])) {
                i1 = 1;
             }
             i = i + 1;
          }
          if (!i1) {
             xe7.V("The requested version "+rEQUESTED_AP+" by your slf4j binding is not compatible with "+Arrays.asList(ls3.e).toString());
             xe7.V("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
          }
          return;
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
