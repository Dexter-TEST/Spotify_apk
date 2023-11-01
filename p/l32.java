package p.l32;
import java.lang.Object;
import java.io.File;
import p.v17;
import java.lang.String;
import p.ej4;
import java.io.IOException;
import java.lang.StringBuilder;
import p.n42;
import p.n91;
import p.gh0;
import p.fh0;
import java.io.FileInputStream;
import java.util.ArrayDeque;
import java.io.FileOutputStream;
import com.google.common.collect.d;
import com.google.common.collect.b;
import p.b80;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Throwable;
import p.s37;
import java.lang.RuntimeException;
import java.lang.IllegalArgumentException;
import p.xe7;
import p.k32;
import p.fr0;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;
import p.w91;
import java.util.Iterator;
import java.lang.Iterable;

public final class l32	// class@001cd5 from classes.dex
{

    public void l32(){
       super();
    }
    public static void a(File p0,File p1){
       int len;
       File parentFile;
       if (!v17.a) {
          ej4.g("This hits the file system");
       }
       int i = 0;
       if (p0.isDirectory()) {
          if (!p1.isDirectory() && !p1.mkdirs()) {
             throw new IOException("Could not create "+p1);
          }else {
             String[] stringArray = p0.list();
             len = stringArray.length;
             for (; i < len; i = i + 1) {
                object oobject = stringArray[i];
                l32.a(new File(p0, oobject), new File(p1, oobject));
             }
          }
       }else if(p0.isFile()){
          if ((parentFile = p1.getCanonicalFile().getParentFile()) != null) {
             parentFile.mkdirs();
             if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of "+p1);
             }
          }
          len = 1;
          if ((p0.equals(p1) ^ len)) {
             n42[] on42Array = new n42[i];
             n91 len1 = new n91(p1, on42Array, i);
             gh0 ogh0 = new gh0(gh0.t);
             FileInputStream uFileInputSt = new FileInputStream(p0);
             gh0 b = ogh0.b;
             b.addFirst(uFileInputSt);
             FileOutputStream uFileOutputS = new FileOutputStream(len1.b, len1.c.contains(n42.a));
             b.addFirst(uFileOutputS);
             byte[] uobyteArray = new byte[8192];
             while ((len = uFileInputSt.read(uobyteArray)) != -1) {
                uFileOutputS.write(uobyteArray, i, len);
             }
             ogh0.close();
          }else {
             Object[] objArray = new Object[]{p0,p1};
             throw new IllegalArgumentException(xe7.E("Source %s and destination %s must be different", objArray));
          }
       }
       return;
    }
    public static void b(File p0){
       if (!v17.a) {
          ej4.g("This hits the file system");
       }
       l32.d(p0, new k32());
       return;
    }
    public static long c(Collection p0){
       File uFile;
       if (!v17.a) {
          ej4.g("This hits the file system");
       }
       AtomicLong uAtomicLong = new AtomicLong(0);
       w91 ow91 = new w91(1, uAtomicLong);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          if ((uFile = iterator.next()) != null) {
             ow91.accept(uFile);
             l32.d(uFile, ow91);
          }
       }
       return uAtomicLong.get();
    }
    public static void d(File p0,fr0 p1){
       File[] uFileArray;
       if (p0.exists() && (uFileArray = p0.listFiles()) != null) {
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = uFileArray[i];
             if (oobject.isDirectory()) {
                l32.d(oobject, p1);
             }
             p1.accept(oobject);
          }
       }
       return;
    }
}
