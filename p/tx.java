package p.tx;
import p.nn0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.cy1;
import p.t00;
import java.io.Closeable;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.lang.System;
import android.os.Build;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.t63;
import p.ci3;
import p.ev0;
import p.y37;
import p.ld;
import p.md;
import java.io.File;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.os.Build$VERSION;
import p.m55;
import p.a32;
import p.l42;
import java.lang.StringBuilder;
import p.a47;
import p.cp5;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.util.zip.ZipFile;
import java.lang.Character;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.regex.Pattern;
import java.util.HashSet;
import java.util.Enumeration;
import java.util.regex.Matcher;
import p.eb3;
import java.util.Collection;
import p.u32;
import p.b80;
import java.lang.Class;
import java.io.InputStream;
import java.lang.Long;
import p.v32;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import p.o32;
import java.io.OutputStream;

public abstract class tx	// class@002803 from classes.dex
{
    public final nn0 a;
    public final int b;
    public boolean c;
    public final t00 d;

    public void tx(nn0 p0){
       co5.o(p0, "fileFactory");
       super();
       this.a = p0;
       this.b = 5;
       this.d = t00.b(cy1.a);
    }
    public static void a(Closeable p0){
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static String[] g(Context p0){
       ApplicationInfo splitSourceD;
       String[] stringArray;
       ApplicationInfo applicationI = p0.getApplicationInfo();
       if ((splitSourceD = applicationI.splitSourceDirs) != null) {
          int i = (!splitSourceD.length)? 1: 0;
          if ((i ^ 1)) {
             i = splitSourceD.length + 1;
             stringArray = new String[i];
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                stringArray[i1] = "";
             }
             applicationI = applicationI.sourceDir;
             co5.l(applicationI, "appInfo.sourceDir");
             stringArray[0] = applicationI;
             System.arraycopy(splitSourceD, 0, stringArray, 1, splitSourceD.length);
          label_0038 :
             return stringArray;
          }
       }
       stringArray = new String[]{applicationI};
       applicationI = applicationI.sourceDir;
       co5.l(applicationI, "appInfo.sourceDir");
       goto label_0038 ;
    }
    public static String[] h(){
       String[] stringArray;
       String[] sUPPORTED_AB = Build.SUPPORTED_ABIS;
       co5.l(sUPPORTED_AB, "SUPPORTED_ABIS");
       int i = 0;
       int i1 = (!sUPPORTED_AB.length)? 1: 0;
       if ((i1 ^ 1)) {
          return sUPPORTED_AB;
       }else {
          String cPU_ABI2 = Build.CPU_ABI2;
          if (!TextUtils.isEmpty(cPU_ABI2)) {
             stringArray = new String[2];
             String cPU_ABI = Build.CPU_ABI;
             co5.l(cPU_ABI, "CPU_ABI");
             stringArray[0] = cPU_ABI;
             co5.l(cPU_ABI2, "CPU_ABI2");
             stringArray[1] = cPU_ABI2;
          }else {
             stringArray = new String[]{cPU_ABI2};
             cPU_ABI2 = Build.CPU_ABI;
             co5.l(cPU_ABI2, "CPU_ABI");
          }
          return stringArray;
       }
    }
    public abstract ci3 b(t63 p0);
    public synchronized final void c(Context p0,ev0 p1,y37 p2,boolean p3){
       long l;
       String str = ".lzma";
       md omd = p2.a("load_lzma_library");
       try{
          omd.g("load_lzma_library");
          omd.a("library_name", p1.a);
          omd.i("check_library", null, false);
          File dir = p0.getDir("lib_extracted", false);
          tx ta = this.a;
          String str1 = "extractedLibDir";
          try{
             co5.l(dir, str1);
             PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(p0.getPackageName(), false);
             l = (Build$VERSION.SDK_INT >= 28)? m55.b(packageInfo): (long)packageInfo.versionCode;
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             l = 0;
          }
          a32 uoa32 = ta.g(dir, String.valueOf(l));
          if (!uoa32.exists()) {
             omd.g("cleanup_old_directory");
             l42.a(dir);
             uoa32.mkdir();
             omd.c("cleanup_old_directory");
          }
          String str2 = System.mapLibraryName(p1.a);
          str1 = System.mapLibraryName(p1.a+e0);
          co5.l(str2, "libName");
          a32 uoa321 = this.a.d(uoa32, str2);
          uoa321.getAbsolutePath();
          if (!uoa321.exists()) {
             this.d.onNext(cy1.b);
             omd.a("unpacking_needed", "yes");
             omd.i("unpack_library", null, false);
             co5.l(str1, "compressedLibName");
             this.f(p0, tx.h(), str1, uoa321);
             omd.c("unpack_library");
             this.d.onNext(cy1.c);
          }else {
             this.d.onNext(cy1.t);
             omd.a("unpacking_needed", "no");
          }
          omd.c("check_library");
          if (p3) {
             omd.i("load_library", null, false);
             System.load(uoa321.getAbsolutePath());
             omd.c("load_library");
          }
          omd.a("outcome", "success");
          omd.c("load_lzma_library");
       }catch(java.lang.Exception e0){
          if (p3) {
             new cp5().b(p0, p1.a);
             omd.c("load_lzma_library");
          }else {
             omd.a("outcome", "failure");
             throw new IllegalStateException("Couldn\'t load library", e0);
          }
       }
       a47 uoa47 = omd.b();
       p2.b(uoa47);
       return;
    }
    public final t63 d(Context p0,String[] p1,String p2){
       ZipEntry entry;
       tx otx = this;
       int i = p1;
       String[] stringArray = tx.g(p0);
       int len = stringArray.length;
       int i1 = 0;
       while (true) {
          ZipFile zipFile = null;
          if (i1 >= len) {
             return zipFile;
          }
          object oobject = stringArray[i1];
          int i2 = 0;
       label_0011 :
          int i3 = i2 + 1;
          tx b = otx.b;
          if (i2 < b) {
             try{
                zipFile = new ZipFile(otx.a.a(oobject), 1);
             }catch(java.io.IOException e0){
                i2 = i3;
                goto label_0011 ;
             }
          }
          try{
             if (zipFile != null) {
                int i4 = 0;
                while (true) {
                   i2 = i4 + 1;
                   if (i4 < b) {
                      i4 = i.length;
                      i3 = 0;
                      while (true) {
                         if (i3 < i4) {
                            Object[] objArray = new Object[]{Character.valueOf(File.separatorChar),i[i3],Character.valueOf(File.separatorChar),p2};
                            String str = String.format("lib%s%s%s%s", Arrays.copyOf(objArray, 4));
                            co5.l(str, "format\(format, *args\)");
                            if ((entry = zipFile.getEntry(str)) != null) {
                               break ;
                            }else {
                               i3 = i3 + 1;
                            }
                         }else {
                            i4 = i2;
                         }
                      }
                      return new t63(otx, zipFile, entry);
                   }else {
                      zipFile.close();
                   }
                }
             }
             i1 = i1 + 1;
          }catch(java.io.IOException e0){
          }
       }
    }
    public final String[] e(Context p0,String p1){
       String str;
       Object[] objArray = new Object[]{Character.valueOf(File.separatorChar),Character.valueOf(File.separatorChar),Character.valueOf(File.separatorChar),p1};
       p1 = String.format("lib%s\([^\\%s]*\)%s%s", Arrays.copyOf(objArray, 4));
       co5.l(p1, "format\(format, *args\)");
       Pattern pattern = Pattern.compile(p1);
       HashSet hashSet = new HashSet();
       String[] stringArray = tx.g(p0);
       int len = stringArray.length;
       int i = 0;
       while (i < len) {
          object oobject = stringArray[i];
          try{
             ZipFile zipFile = new ZipFile(this.a.a(oobject), 1);
             Enumeration uEnumeration = zipFile.entries();
             co5.l(uEnumeration, "zipFile.entries\(\)");
             while (uEnumeration.hasMoreElements()) {
                Matcher matcher = pattern.matcher(uEnumeration.nextElement().getName());
                if (matcher.matches() && (str = matcher.group(1)) != null) {
                   hashSet.add(str);
                }
             }
             eb3.d(zipFile, null);
             i = i + 1;
          }catch(java.io.IOException e0){
          }
       }
       stringArray = new String[0];
       return hashSet.toArray(stringArray);
    }
    public final void f(Context p0,String[] p1,String p2,a32 p3){
       ci3 uoci3;
       Closeable uCloseable;
       int i2;
       String[] stringArray;
       tx otx = this;
       String str = p2;
       File uFile = p3;
       String str1 = "toString\(this\)";
       tx a = otx.a;
       cy1 a1 = cy1.a;
       tx d = otx.d;
       StringBuilder str2 = ".temp";
       String str3 = "Could not find \'";
       t63 ot63 = this.d(p0, p1, p2);
       boolean b = false;
       if (ot63 != null) {
          str = p3.getParent();
          co5.l(str, "destination.parent");
          a32 uoa32 = a.f(str, p3.getName().concat(str2));
          int i = 0;
          while (true) {
             int i1 = i + 1;
             if (i >= otx.b) {
                throw new IllegalStateException("Couldn\'t extract the library from the APK!");
             }
             try{
                if (uoa32.exists() || uoa32.createNewFile()) {
                   try{
                      uoci3 = otx.b(ot63);
                      try{
                         uCloseable = a.e(uoa32, b);
                         uCloseable.getClass();
                         byte[] uobyteArray = new byte[8192];
                         long l = 0;
                         while ((i2 = uoci3.read(uobyteArray)) != -1) {
                            uCloseable.write(uobyteArray, b, i2);
                            l = l + (long)i2;
                            uobyteArray = uobyteArray;
                            b = false;
                         }
                         Long longx = Long.valueOf(l);
                         FileDescriptor fD = uCloseable.a.getFD();
                         co5.l(fD, "outputStream.fd");
                         fD.sync();
                         long l1 = uoa32.length();
                         if (longx == null || (longx.longValue() - l1)) {
                         }else {
                            tx.a(uoci3);
                            tx.a(uCloseable);
                            if (uoa32.renameTo(new File(p3.getPath()))) {
                               uFile.setReadable(true, b);
                               uFile.setExecutable(true, b);
                               try{
                                  uFile.setWritable(true);
                                  t63 b1 = ot63.b;
                                  if (b1 != null) {
                                     co5.i(b1);
                                     b1.close();
                                  }
                               }catch(java.io.IOException e0){
                                  d.onNext(a1);
                               }
                            }
                         }
                      }catch(java.io.IOException e0){
                         uCloseable = null;
                      }
                   }catch(java.io.IOException e0){
                      uoci3 = null;
                   }
                   tx.a(uoci3);
                   tx.a(uCloseable);
                }
             }catch(java.io.IOException e0){
             }catch(java.io.IOException e0){
             }
          }
          return;
       }else {
          Context uContext = p0;
          try{
             stringArray = otx.e(uContext, str);
          }catch(java.lang.Exception e0){
             stringArray = new String[]{e0.toString()};
          }
          d.onNext(a1);
          str = Arrays.toString(p1);
          co5.l(str, str1);
          str2 = str3+str+"\'. Looked for: "+str;
          String str4 = Arrays.toString(stringArray);
          co5.l(str4, str1);
          str2 = str2+", but only found: "+str4;
          throw new IllegalStateException(str2+'.');
       }
    }
}
