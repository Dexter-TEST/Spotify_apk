package p.wf0;
import java.util.Iterator;
import java.util.Collections;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.reflect.Member;
import java.lang.reflect.AccessibleObject;
import java.lang.Class;
import java.lang.reflect.Modifier;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import p.vf3;
import java.io.Closeable;
import java.lang.Exception;
import p.uf3;
import java.lang.RuntimeException;
import java.lang.reflect.Constructor;
import p.tp2;
import p.hg3;
import java.lang.reflect.InvocationTargetException;
import p.he3;
import p.ca7;
import java.lang.Void;
import p.ej4;
import p.ee3;
import java.lang.annotation.Annotation;
import java.lang.Error;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Float;
import java.lang.Byte;
import java.lang.Short;
import java.lang.Character;

public abstract class wf0	// class@002b23 from classes.dex
{
    public static final Iterator a;

    static {
       wf0.a = Collections.emptyIterator();
    }
    public static String a(String p0){
       if (p0 == null) {
          return "[null]";
       }
       return new StringBuilder((p0.length() + 2))+'''+p0+''';
    }
    public static void b(Member p0,boolean p1){
       int i;
       AccessibleObject uAccessibleO = p0;
       boolean b = true;
       try{
          Class declaringCla = p0.getDeclaringClass();
          if (Modifier.isPublic(p0.getModifiers()) && Modifier.isPublic(declaringCla.getModifiers())) {
             i = 1;
          label_0020 :
             if (!i || (p1 || wf0.m(declaringCla))) {
                uAccessibleO.setAccessible(b);
             }
          }else {
             i = 0;
             goto label_0020 ;
          }
       }catch(java.lang.SecurityException e6){
          if (!uAccessibleO.isAccessible()) {
             throw new IllegalArgumentException("Cannot access "+p0+" \(from class "+p0.getDeclaringClass().getName()+"; failed to set access: "+e6.getMessage());
          }
       }catch(java.lang.RuntimeException e6){
          if ("InaccessibleObjectException".equals(e6.getClass().getSimpleName())) {
             Object[] objArray = new Object[5];
             objArray[0] = p0.getClass().getSimpleName();
             objArray[b] = p0.getName();
             objArray[2] = wf0.p(p0.getDeclaringClass());
             objArray[3] = e6.getClass().getName();
             objArray[4] = e6.getMessage();
             throw new IllegalArgumentException(String.format("Failed to call `setAccess\(\)` on %s \'%s\' \(of class %s\) due to `%s`, problem: %s", objArray), e6);
          }else {
             throw e6;
          }
       }
       return;
    }
    public static String c(Object p0){
       if (p0 == null) {
          return "[null]";
       }
       if (p0 instanceof Class) {
       }else {
          p0 = p0.getClass();
       }
       return wf0.p(p0);
    }
    public static void d(vf3 p0,Closeable p1,Exception p2){
       if (p0 != null) {
          uf3 a = uf3.a;
          try{
             p0.b(a);
             p0.close();
          }catch(java.lang.Exception e1){
             p2.addSuppressed(e1);
          }
       }
       if (p1 != null) {
          try{
             p1.close();
          }catch(java.lang.Exception e1){
             p2.addSuppressed(e1);
          }
       }
       wf0.r(p2);
       wf0.s(p2);
       throw new RuntimeException(p2);
    }
    public static Object e(Class p0,boolean p1){
       Constructor uConstructor;
       if ((uConstructor = wf0.g(p0, p1)) == null) {
          throw new IllegalArgumentException(tp2.j(p0, "Class ", " has no default \(no arg\) constructor"));
       }
       int i = 0;
       try{
          Object[] objArray = new Object[i];
          return uConstructor.newInstance(objArray);
       }catch(java.lang.Exception e3){
          Throwable throwable = wf0.i(e3);
          wf0.s(throwable);
          wf0.q(throwable);
          throw new IllegalArgumentException("Failed to instantiate class "+p0.getName()+", problem: "+e3.getMessage(), throwable);
       }
    }
    public static String f(Throwable p0){
       if (p0 instanceof hg3) {
          return p0.b();
       }
       if (p0 instanceof InvocationTargetException && p0.getCause() != null) {
          return p0.getCause().getMessage();
       }
       return p0.getMessage();
    }
    public static Constructor g(Class p0,boolean p1){
       String str = "Default constructor for ";
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Constructor declaredCons = p0.getDeclaredConstructor(uClassArray);
          if (p1) {
             wf0.b(declaredCons, p1);
          }else if(Modifier.isPublic(declaredCons.getModifiers())){
             throw new IllegalArgumentException(str+p0.getName()+" is not accessible \(non-public?\): not allowed to try modify access via Reflection: cannot instantiate type");
          }
          return declaredCons;
       }catch(java.lang.NoSuchMethodException e0){
          return null;
       }catch(java.lang.Exception e3){
          Throwable throwable = wf0.i(e3);
          wf0.s(throwable);
          wf0.q(throwable);
          throw new IllegalArgumentException("Failed to find default constructor of class "+p0.getName()+", problem: "+e3.getMessage(), throwable);
       }
    }
    public static String h(Object p0){
       if (p0 instanceof Class) {
       }else {
          p0 = p0.getClass();
       }
       return wf0.p(p0);
    }
    public static Throwable i(Throwable p0){
       while (p0.getCause() != null) {
          p0 = p0.getCause();
       }
       return p0;
    }
    public static String j(he3 p0){
       if (p0 == null) {
          return "[null]";
       }
       return new StringBuilder(80)+'`'+p0.q()+'`';
    }
    public static boolean k(Class p0,Object p1){
       boolean b = (p1 != null && p1.getClass() == p0)? true: false;
       return b;
    }
    public static boolean l(Class p0){
       boolean b = (p0 != Void.class && (p0 != Void.TYPE && p0 != ej4.class))? false: true;
       return b;
    }
    public static boolean m(Class p0){
       String name = p0.getName();
       boolean b = (!name.startsWith("java.") && !name.startsWith("javax."))? false: true;
       return b;
    }
    public static boolean n(Object p0){
       boolean b = true;
       if (p0 != null) {
          int i = (p0.getClass().getAnnotation(ee3.class) != null)? 1: 0;
          if (!i) {
             b = false;
          }
       }
       return b;
    }
    public static String o(String p0){
       if (p0 == null) {
          return "[null]";
       }
       return wf0.a(p0);
    }
    public static String p(Class p0){
       String str = "[null]";
       if (p0 == null) {
          return str;
       }
       int i = 0;
       while (p0.isArray()) {
          i = i + 1;
          p0 = p0.getComponentType();
       }
       String simpleName = (p0.isPrimitive())? p0.getSimpleName(): p0.getName();
       if (i > 0) {
          StringBuilder str1 = simpleName;
          do {
             str1 = str1.append("[]");
          } while ((i = i - 1) <= 0);
          simpleName = str1;
       }
       if (simpleName != null) {
          str = new StringBuilder((simpleName.length() + 2))+'`'+simpleName+'`';
       }
       return str;
    }
    public static void q(Throwable p0){
       if (!p0 instanceof Error) {
          return;
       }
       throw p0;
    }
    public static void r(Throwable p0){
       if (!p0 instanceof IOException) {
          return;
       }
       throw p0;
    }
    public static void s(Throwable p0){
       if (!p0 instanceof RuntimeException) {
          return;
       }
       throw p0;
    }
    public static void t(Class p0,Object p1,String p2){
       if (p1.getClass() == p0) {
          return;
       }
       Object[] objArray = new Object[]{p1.getClass().getName(),p0.getName(),p2};
       throw new IllegalStateException(String.format("Sub-class %s \(of class %s\) must override method \'%s\'", objArray));
    }
    public static Class u(Class p0){
       if (p0 == Integer.TYPE) {
          return Integer.class;
       }
       if (p0 == Long.TYPE) {
          return Long.class;
       }
       if (p0 == Boolean.TYPE) {
          return Boolean.class;
       }
       if (p0 == Double.TYPE) {
          return Double.class;
       }
       if (p0 == Float.TYPE) {
          return Float.class;
       }
       if (p0 == Byte.TYPE) {
          return Byte.class;
       }
       if (p0 == Short.TYPE) {
          return Short.class;
       }
       if (p0 == Character.TYPE) {
          return Character.class;
       }
       throw new IllegalArgumentException(tp2.j(p0, "Class ", " is not a primitive type"));
    }
}
