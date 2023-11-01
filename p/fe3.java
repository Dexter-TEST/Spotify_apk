package p.fe3;
import java.lang.Thread;
import java.lang.ClassLoader;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.reflect.Array;
import java.io.File;

public abstract class fe3	// class@0001f0 from classes2.dex
{
    public static final boolean a;
    public static final Method b;
    public static final Method c;
    public static final Object d;
    public static final Object e;

    static {
       boolean i = 0;
       try{
          ClassLoader contextClass = Thread.currentThread().getContextClassLoader();
          Class uClass = contextClass.loadClass("java.nio.file.Files");
          Class uClass1 = contextClass.loadClass("java.nio.file.Path");
          Class uClass2 = contextClass.loadClass("java.nio.file.attribute.FileAttribute");
          Class[] uClassArray = new Class[]{uClass1};
          fe3.b = uClass.getMethod("isSymbolicLink", uClassArray);
          uClassArray = new Class[]{uClass1};
          uClass.getMethod("delete", uClassArray);
          uClassArray = new Class[]{uClass1};
          uClass.getMethod("readSymbolicLink", uClassArray);
          Class[] obj = Array.newInstance(uClass2, i);
          fe3.e = obj;
          uClassArray = new Class[]{uClass1,uClass1,obj.getClass()};
          uClass.getMethod("createSymbolicLink", uClassArray);
          Object obj1 = Array.newInstance(contextClass.loadClass("java.nio.file.LinkOption"), i);
          fe3.d = obj1;
          Class[] uClassArray1 = new Class[]{uClass1,obj1.getClass()};
          uClass.getMethod("exists", uClassArray1);
          obj = new Class[i];
          fe3.c = File.class.getMethod("toPath", obj);
          Class[] uClassArray2 = new Class[i];
          uClass1.getMethod("toFile", uClassArray2);
          i = true;
          fe3.a = e0;
       }catch(java.lang.ClassNotFoundException e0){
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
}
