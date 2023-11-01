package p.hk3;
import java.util.HashMap;
import java.lang.reflect.Constructor;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.tp2;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Package;
import p.av6;
import java.lang.StringBuilder;
import java.lang.reflect.AccessibleObject;
import java.util.List;
import p.ye7;
import p.zf0;
import java.lang.Boolean;
import java.lang.reflect.Method;
import p.g25;
import java.lang.annotation.Annotation;
import p.xf0;
import p.dk3;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.IllegalArgumentException;

public abstract class hk3	// class@00186b from classes.dex
{
    public static final HashMap a;
    public static final HashMap b;

    static {
       hk3.a = new HashMap();
       hk3.b = new HashMap();
    }
    public static void a(Constructor p0,Object p1){
       int i = 1;
       try{
          Object[] objArray = new Object[i];
          objArray[0] = p1;
          p0 = p0.newInstance(objArray);
          co5.l(p0, "{\n            constructo…tance\(`object`\)\n        }");
          tp2.t(p0);
          throw null;
       }catch(java.lang.IllegalAccessException e2){
          throw new RuntimeException(e2);
       }catch(java.lang.InstantiationException e2){
          throw new RuntimeException(e2);
       }catch(java.lang.reflect.InvocationTargetException e2){
          throw new RuntimeException(e2);
       }
    }
    public static int b(Class p0){
       Integer integer;
       Constructor uConstructor;
       zf0 b1;
       Boolean uBoolean;
       boolean b2;
       Class superclass;
       Class[] obj;
       int i2;
       object oobject;
       String name;
       HashMap a = hk3.a;
       if ((integer = a.get(p0)) != null) {
          return integer.intValue();
       }
       int i = 1;
       if (p0.getCanonicalName() != null) {
          int i1 = 0;
          List list = null;
          try{
             Package package = p0.getPackage();
             String canonicalNam = p0.getCanonicalName();
             if (package != null) {
                name = package.getName();
             label_002b :
                co5.l(name, "fullPackage");
                b1 = (!name.length())? 1: 0;
                if (!b1) {
                   co5.l(canonicalNam, "name");
                   canonicalNam = canonicalNam.substring((name.length() + i));
                   co5.l(canonicalNam, "this as java.lang.String\).substring\(startIndex\)");
                }
                co5.l(canonicalNam, "if \(fullPackage.isEmpty\(…g\(fullPackage.length + 1\)");
                canonicalNam = av6.x0(canonicalNam, ".", "_").concat("_LifecycleAdapter");
                b1 = (!name.length())? 1: 0;
                if (!b1) {
                   canonicalNam = name+'.'+canonicalNam;
                }
                Class[] uClassArray = new Class[i];
                uClassArray[i1] = p0;
                uConstructor = Class.forName(canonicalNam).getDeclaredConstructor(uClassArray);
                if (!uConstructor.isAccessible()) {
                   uConstructor.setAccessible(i);
                }
             }else {
                name = "";
                goto label_002b ;
             }
          }catch(java.lang.ClassNotFoundException e0){
             uConstructor = list;
          }catch(java.lang.NoSuchMethodException e12){
             throw new RuntimeException(e12);
          }
          HashMap b = hk3.b;
          if (uConstructor != null) {
             b.put(p0, ye7.J(uConstructor));
          }else {
             zf0 c = zf0.c;
             b1 = c.b;
             if ((uBoolean = b1.get(p0)) != null) {
                b2 = uBoolean.booleanValue();
             }else {
                try{
                   Method[] declaredMeth = p0.getDeclaredMethods();
                   i2 = declaredMeth.length;
                   int i4 = 0;
                   while (true) {
                      if (i4 < i2) {
                         if (declaredMeth[i4].getAnnotation(g25.class) != null) {
                            c.a(p0, declaredMeth);
                            b2 = true;
                         }else {
                            i4 = i4 + 1;
                         }
                      }else {
                         b1.put(p0, Boolean.FALSE);
                         b2 = false;
                      }
                   }
                }catch(java.lang.NoClassDefFoundError e12){
                   throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e12);
                }
             }
             if (!b2) {
                uBoolean = ((superclass = p0.getSuperclass()) != null && dk3.class.isAssignableFrom(superclass))? 1: 0;
                if (uBoolean) {
                   co5.l(superclass, "superclass");
                   if (hk3.b(superclass) != i) {
                      obj = b.get(superclass);
                      co5.i(obj);
                      list = new ArrayList(obj);
                   }
                }
                obj = p0.getInterfaces();
                co5.l(obj, "klass.interfaces");
                int len = obj.length;
                i2 = 0;
                while (true) {
                   if (i2 < len) {
                      int i3 = ((oobject = obj[i2]) != null && dk3.class.isAssignableFrom(oobject))? 1: 0;
                      if (i3) {
                         co5.l(oobject, "intrface");
                         if (hk3.b(oobject) != i) {
                            if (list == null) {
                               list = new ArrayList();
                            }
                            Object obj1 = b.get(oobject);
                            co5.i(obj1);
                            list.addAll(obj1);
                         }
                      }
                      i2 = i2 + 1;
                   }else if(list != null){
                      b.put(p0, list);
                   }
                }
             }
          }
          i = 2;
       }
       a.put(p0, Integer.valueOf(i));
       return i;
    }
}
