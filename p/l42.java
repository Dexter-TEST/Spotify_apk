package p.l42;
import java.math.BigInteger;
import java.io.File;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.io.FileNotFoundException;
import p.fe3;
import java.lang.reflect.Method;
import java.lang.Boolean;
import java.lang.RuntimeException;
import java.lang.Throwable;
import p.q42;
import p.oz0;
import java.io.FileFilter;
import java.lang.NullPointerException;

public abstract class l42	// class@000293 from classes2.dex
{
    public static final int a;

    static {
       BigInteger uBigInteger = BigInteger.valueOf(1024);
       uBigInteger.multiply(uBigInteger.multiply(uBigInteger.multiply(uBigInteger.multiply(uBigInteger.multiply(uBigInteger)))));
       uBigInteger.multiply(BigInteger.valueOf(1024).multiply(BigInteger.valueOf(0x1000000000000000)));
    }
    public static void a(File p0){
       File[] uFileArray;
       if (!p0.exists()) {
          throw new IllegalArgumentException(p0+" does not exist");
       }
       if (!p0.isDirectory()) {
          throw new IllegalArgumentException(p0+" is not a directory");
       }
       if ((uFileArray = p0.listFiles()) == null) {
          throw new IOException("Failed to list contents of "+p0);
       }
       int len = uFileArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uFileArray[i];
          try{
             l42.b(oobject);
          }catch(java.io.IOException e1){
          }
          i = i + 1;
       }
       if (!null) {
          return;
       }
       throw null;
    }
    public static void b(File p0){
       if (p0.isDirectory()) {
          if (p0.exists()) {
             if (!l42.c(p0)) {
                l42.a(p0);
             }
             if (!p0.delete()) {
                throw new IOException("Unable to delete directory "+p0+".");
             }
          }
       }else {
          boolean b = p0.exists();
          if (!p0.delete()) {
             if (!b) {
                throw new FileNotFoundException("File does not exist: "+p0);
             }else {
                throw new IOException("Unable to delete file: "+p0);
             }
          }
       }
       return;
    }
    public static boolean c(File p0){
       File uFile;
       File parentFile;
       File[] uFileArray;
       int i = 0;
       int i1 = 1;
       if (fe3.a) {
          try{
             Object[] objArray = new Object[i];
             Object[] objArray1 = new Object[i1];
             objArray1[i] = fe3.c.invoke(p0, objArray);
             return fe3.b.invoke(null, objArray1).booleanValue();
          }catch(java.lang.IllegalAccessException e5){
             throw new RuntimeException(e5);
          }catch(java.lang.reflect.InvocationTargetException e5){
             throw new RuntimeException(e5);
          }
       }else if(p0 != null){
          int i2 = (q42.a == '\')? 1: 0;
          if (i2) {
             return i;
          }else if(p0.getParent() == null){
             uFile = p0;
          }else {
             uFile = new File(p0.getParentFile().getCanonicalFile(), p0.getName());
          }
          if (uFile.getCanonicalFile().equals(uFile.getAbsoluteFile())) {
             if (!p0.exists()) {
                p0 = p0.getCanonicalFile();
                if ((parentFile = p0.getParentFile()) != null && (parentFile.exists() && ((uFileArray = parentFile.listFiles(new oz0(i1, p0))) != null && uFileArray.length > 0))) {
                   i = true;
                }
             }
             return i;
          }else {
             return i1;
          }
       }else {
          throw new NullPointerException("File must not be null");
       }
    }
}
