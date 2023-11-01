package p.tz0;
import java.lang.String;
import java.nio.charset.Charset;
import p.nz0;
import p.rz0;
import p.sz0;
import java.io.File;
import p.es;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.Arrays;
import p.oz0;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.StringBuilder;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import p.az7;
import java.util.Iterator;
import java.util.Comparator;

public final class tz0	// class@00280d from classes.dex
{
    public final AtomicInteger a;
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final vc6 f;
    public static final Charset g;
    public static final int h;
    public static final nz0 i;
    public static final rz0 j;
    public static final sz0 k;

    static {
       tz0.g = Charset.forName("UTF-8");
       tz0.h = 15;
       tz0.i = new nz0();
       tz0.j = rz0.a;
       tz0.k = sz0.a;
    }
    public void tz0(File p0,es p1){
       super();
       this.a = new AtomicInteger(0);
       File uFile = new File(p0, "report-persistence");
       this.b = new File(uFile, "sessions");
       this.c = new File(uFile, "priority-reports");
       this.d = new File(uFile, "reports");
       this.e = new File(uFile, "native-reports");
       this.f = p1;
    }
    public static ArrayList a(List[] p0){
       ArrayList uArrayList = new ArrayList();
       int len = p0.length;
       int i = 0;
       int i2 = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          i2 = i2 + p0[i1].size();
       }
       uArrayList.ensureCapacity(i2);
       len = p0.length;
       for (; i < len; i = i + 1) {
          uArrayList.addAll(p0[i]);
       }
       return uArrayList;
    }
    public static List d(File p0,FilenameFilter p1){
       if (!p0.isDirectory()) {
          return Collections.emptyList();
       }
       File[] uFileArray = (p1 == null)? p0.listFiles(): p0.listFiles(p1);
       List list = (uFileArray != null)? Arrays.asList(uFileArray): Collections.emptyList();
       return list;
    }
    public static List e(File p0,oz0 p1){
       if (!p0.isDirectory()) {
          return Collections.emptyList();
       }
       File[] uFileArray = (p1 == null)? p0.listFiles(): p0.listFiles(p1);
       List list = (uFileArray != null)? Arrays.asList(uFileArray): Collections.emptyList();
       return list;
    }
    public static void f(File p0){
       int i = (!p0.exists() && !p0.mkdirs())? 0: 1;
       if (i) {
          return;
       }else {
          throw new IOException("Could not create directory "+p0);
       }
    }
    public static String g(File p0){
       int i;
       byte[] uobyteArray = new byte[8192];
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       FileInputStream uFileInputSt = new FileInputStream(p0);
       while ((i = uFileInputSt.read(uobyteArray)) > 0) {
          uByteArrayOu.write(uobyteArray, 0, i);
       }
       uFileInputSt.close();
       return new String(uByteArrayOu.toByteArray(), tz0.g);
    }
    public static void h(File p0){
       if (p0 == null) {
          return;
       }
       if (p0.isDirectory()) {
          File[] uFileArray = p0.listFiles();
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             tz0.h(uFileArray[i]);
          }
       }
       p0.delete();
       return;
    }
    public static void i(File p0,String p1){
       OutputStreamWriter outputStream = new OutputStreamWriter(new FileOutputStream(p0), tz0.g);
       outputStream.write(p1);
       outputStream.close();
    }
    public final void b(String p0){
       az7 uoaz7 = new az7(p0, 3);
       List[] listArray = new List[]{tz0.d(this.c, uoaz7),tz0.d(this.e, uoaz7),tz0.d(this.d, uoaz7)};
       Iterator iterator = tz0.a(listArray).iterator();
       while (iterator.hasNext()) {
          iterator.next().delete();
       }
       return;
    }
    public final ArrayList c(){
       int i = 2;
       List[] listArray = new List[i];
       List[] listArray1 = new List[i];
       int i1 = 0;
       listArray1[i1] = tz0.e(this.c, null);
       listArray1[1] = tz0.e(this.e, null);
       listArray[i1] = tz0.a(listArray1);
       listArray[1] = tz0.e(this.d, null);
       for (; i1 < i; i1 = i1 + 1) {
          Collections.sort(listArray[i1], tz0.j);
       }
       return tz0.a(listArray);
    }
}
