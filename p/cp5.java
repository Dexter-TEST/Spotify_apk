package p.cp5;
import p.dt3;
import java.lang.Object;
import java.util.HashSet;
import java.lang.String;
import java.util.Locale;
import android.content.Context;
import java.io.File;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.System;
import java.lang.Throwable;
import android.util.Log;
import p.bp5;
import java.io.Serializable;
import java.io.FilenameFilter;
import android.os.Build;
import p.li5;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.FileDescriptor;
import java.io.Closeable;
import p.ab4;

public final class cp5	// class@001252 from classes.dex
{
    public final HashSet a;
    public final dt3 b;
    public final dt3 c;

    public void cp5(){
       super();
       this.a = new HashSet();
       this.b = new dt3(12);
       this.c = new dt3(11);
    }
    public static void d(String p0,Object[] p1){
       String.format(Locale.US, p0, p1);
    }
    public final File a(Context p0,String p1,String p2){
       this.b.getClass();
       p1 = dt3.q(p1);
       int i = 0;
       int i1 = (p2 != null && p2.length())? 0: 1;
       if (i1) {
          return new File(p0.getDir("lib", i), p1);
       }else {
          return new File(p0.getDir("lib", i), p1+"."+p2);
       }
    }
    public final void b(Context p0,String p1){
       int i = 0;
       int i1 = 1;
       int i2 = (p1 != null && p1.length())? 0: 1;
       if (!i2) {
          Object[] objArray = new Object[i1];
          objArray[i] = p1;
          cp5.d("Beginning load of %s...", objArray);
          this.c(p0, p1, null);
          return;
       }else {
          throw new IllegalArgumentException("Given library is either null or empty");
       }
    }
    public final void c(Context p0,String p1,String p2){
       Object[] objArray;
       Object[] objArray1;
       File[] uFileArray;
       String str;
       li5 oli5;
       int i3;
       InputStream inputStream;
       Closeable uCloseable;
       int i5;
       li5 b1;
       String[] stringArray;
       String cPU_ABI2;
       cp5 uocp5 = this;
       Object obj = p1;
       cp5 b = uocp5.b;
       cp5 a = uocp5.a;
       if (a.contains(obj)) {
          objArray = new Object[]{obj};
          cp5.d("%s already loaded previously!", objArray);
          return;
       }else {
          int i = 2;
          try{
             b.getClass();
             System.loadLibrary(p1);
             a.add(obj);
             objArray1 = new Object[i];
             objArray1[0] = obj;
             objArray1[1] = p2;
             cp5.d("%s \(%s\) was loaded normally!", objArray1);
             return;
          }catch(java.lang.UnsatisfiedLinkError e0){
             try{
                objArray1 = new Object[v7];
                objArray1[v6] = Log.getStackTraceString(e0);
                cp5.d("Loading the library normally failed: %s", objArray1);
                objArray = new Object[i];
                objArray[v6] = obj;
                objArray[v7] = p2;
                cp5.d("%s \(%s\) was not loaded normally, re-linking...", objArray);
                File uFile = this.a(p0, p1, p2);
                if (!uFile.exists()) {
                   File uFile1 = this.a(p0, p1, p2);
                   b.getClass();
                   if ((uFileArray = v2.getDir("lib", v6).listFiles(new bp5(uocp5, v6, dt3.q(p1)))) != null) {
                      i5 = uFileArray.length;
                      int i6 = 0;
                   label_0076 :
                      if (i6 < i5) {
                         object oobject = uFileArray[i6];
                         if (!oobject.getAbsolutePath().equals(uFile1.getAbsolutePath())) {
                            oobject.delete();
                         }
                         i6 = i6 + 1;
                         goto label_0076 ;
                      }
                   }
                   String[] sUPPORTED_AB = Build.SUPPORTED_ABIS;
                   if (sUPPORTED_AB.length <= 0) {
                      String[] stringArray1 = ((cPU_ABI2 = Build.CPU_ABI2) != null && cPU_ABI2.length())? 0: 1;
                      if (!str) {
                         stringArray1 = new String[i];
                         stringArray1[v6] = Build.CPU_ABI;
                         stringArray1[v7] = cPU_ABI2;
                         sUPPORTED_AB = stringArray1;
                      }else {
                         sUPPORTED_AB = new String[v7];
                         sUPPORTED_AB[v6] = Build.CPU_ABI;
                      }
                   }
                   str = dt3.q(p1);
                   uocp5.c.getClass();
                   if ((oli5 = dt3.n(v2, sUPPORTED_AB, str, uocp5)) != null) {
                      int i1 = 0;
                   label_00c4 :
                      int i2 = i1 + 1;
                      if (i1 < 5) {
                         String str1 = "Found %s! Extracting...";
                         Object[] objArray2 = new Object[v7];
                         objArray2[v6] = str;
                         try{
                            cp5.d(str1, objArray2);
                            if (uFile.exists() || uFile.createNewFile()) {
                               try{
                                  inputStream = oli5.b.getInputStream(oli5.c);
                                  try{
                                     uCloseable = new FileOutputStream(uFile);
                                     int i4 = 4096;
                                     byte[] uobyteArray = new byte[i4];
                                     long l = 0;
                                  label_00f7 :
                                     if ((i5 = inputStream.read(uobyteArray)) == -1) {
                                        uCloseable.flush();
                                        uCloseable.getFD().sync();
                                        if (l - uFile.length()) {
                                        }else {
                                           dt3.g(inputStream);
                                           dt3.g(uCloseable);
                                           uFile.setReadable(v7, v6);
                                           uFile.setExecutable(v7, v6);
                                           try{
                                              uFile.setWritable(v7);
                                              b1 = oli5.b;
                                              if (b1 == null) {
                                              label_0162 :
                                                 b.getClass();
                                                 System.load(uFile.getAbsolutePath());
                                                 a.add(obj);
                                                 objArray = new Object[2];
                                                 objArray[v6] = obj;
                                                 objArray[1] = p2;
                                                 cp5.d("%s \(%s\) was re-linked!", objArray);
                                                 return;
                                              }
                                           }catch(java.io.IOException e0){
                                           }
                                        }
                                     }else {
                                        try{
                                           uCloseable.write(uobyteArray, v6, i5);
                                           l = l + (long)i5;
                                           i3 = true;
                                           i = 2;
                                           goto label_00f7 ;
                                        }catch( e0){
                                        }
                                     }
                                  }catch(java.io.FileNotFoundException e0){
                                  label_0148 :
                                     uCloseable = null;
                                  }catch(java.io.IOException e0){
                                  }
                               }catch(java.io.FileNotFoundException e0){
                                  inputStream = null;
                                  goto label_0148 ;
                               }catch(java.io.IOException e0){
                               }
                               dt3.g(inputStream);
                               dt3.g(uCloseable);
                            }
                         }catch(java.io.IOException e0){
                         }catch(java.io.FileNotFoundException e0){
                         }catch(java.io.IOException e0){
                         }
                         i1 = i2;
                         i3 = 1;
                         i = 2;
                         goto label_00c4 ;
                      }else {
                         b1 = oli5.b;
                         if (b1 == null) {
                         }
                      }
                      b1.close();
                      goto label_0162 ;
                   }else {
                      try{
                         stringArray = dt3.o(v2, str);
                      }catch(java.lang.Exception e0){
                         stringArray = new String[1];
                         stringArray[v6] = e0.toString();
                      }
                      throw new ab4(str, sUPPORTED_AB, stringArray);
                   }
                }
             }catch(java.io.IOException e0){
             }
          }
       }
    }
}
