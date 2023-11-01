package p.bq3;
import android.content.Context;
import p.l32;
import java.lang.Object;
import java.io.File;
import p.tv;
import p.p25;
import java.lang.String;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.NullPointerException;
import p.b7;
import p.co5;
import android.os.StatFs;
import java.lang.Math;
import java.lang.IllegalStateException;
import java.io.IOException;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import java.util.Set;
import com.google.common.collect.d;
import p.d73;
import p.te5;
import p.a73;
import java.util.Collections;
import android.content.pm.ApplicationInfo;
import java.lang.Class;
import android.os.Build$VERSION;
import android.os.storage.StorageManager;
import p.n6;
import android.app.usage.StorageStatsManager;
import java.util.UUID;
import p.p3;
import p.aq3;
import java.lang.StringBuilder;
import p.jl;
import android.os.Process;
import android.os.UserHandle;
import p.k11;
import android.app.usage.StorageStats;
import p.xe7;
import android.os.storage.StorageVolume;
import p.ns0;
import android.os.Environment;
import p.ys5;
import com.google.common.collect.c;
import java.util.Collection;
import p.io2;
import java.util.Arrays;

public final class bq3	// class@001115 from classes.dex
{
    public final Context a;
    public final l32 b;

    public void bq3(Context p0,l32 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static tv b(File p0,File p1,File p2,boolean p3){
       File n;
       p25 op25 = new p25(2);
       op25.e("");
       if ((n = tv.n) == null) {
          throw new NullPointerException("Null volume");
       }
       op25.k = n;
       op25.i = n;
       op25.j = n;
       op25.a = Long.valueOf(0);
       op25.b = Long.valueOf(0);
       op25.c = Long.valueOf(0);
       op25.d = Long.valueOf(0);
       Boolean fALSE = Boolean.FALSE;
       op25.f = fALSE;
       op25.g = fALSE;
       op25.l = fALSE;
       op25.m = fALSE;
       op25.h = fALSE;
       if (p0 == null) {
          throw new NullPointerException("Null volume");
       }
       op25.k = p0;
       op25.i = p1;
       op25.j = p2;
       op25.h = Boolean.valueOf(p3);
       return op25.c();
    }
    public static void e(p25 p0,File p1){
       long l;
       b7 b;
       b7 b1;
       b7 uob7 = new b7(21);
       try{
          int i = 0;
          String absolutePath = p1.getAbsolutePath();
          String str = "path";
          try{
             co5.o(absolutePath, str);
             if ((b = uob7.b) == null) {
                uob7.b = new StatFs(absolutePath);
             }else {
                b.restat(absolutePath);
             }
             if ((b1 = uob7.b) != null) {
                try{
                   long availableBlo = b1.getAvailableBlocksLong();
                   if ((b1 = uob7.b) != null) {
                      l = b1.getBlockSizeLong();
                      l = l * availableBlo;
                      if ((b1 = uob7.b) != null) {
                         availableBlo = b1.getBlockCountLong();
                         if ((uob7 = uob7.b) != null) {
                            long blockSizeLon = uob7.getBlockSizeLong();
                            Long.signum(blockSizeLon);
                            long l1 = Math.max(i, ((blockSizeLon * availableBlo) - l));
                         }else {
                            throw new IllegalStateException("Required value was null.".toString());
                         }
                      }else {
                         throw new IllegalStateException("Required value was null.".toString());
                      }
                      p0.a = Long.valueOf(i);
                      p0.b = Long.valueOf(l);
                      return;
                   }else {
                      throw new IllegalStateException("Required value was null.".toString());
                   }
                }catch(java.io.IOException e0){
                   l = i;
                }catch(java.io.IOException e0){
                }
                Object[] objArray = new Object[]{p1};
                Logger.j(e0, "Unable to stat %s", objArray);
             }else {
                throw new IllegalStateException("Required value was null.".toString());
             }
          }catch(java.lang.RuntimeException e0){
             throw new IOException(e0);
          }
       }catch(java.io.IOException e0){
       }
    }
    public static Set f(String[] p0){
       if (p0 == null || !p0.length) {
          return Collections.emptySet();
       }
       d73 uod73 = new d73();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (!te5.a(oobject)) {
             uod73.D0(new File(oobject));
          }
          i = i + 1;
       }
       return uod73.H0();
    }
    public final tv a(){
       bq3 ta = this.a;
       p25 op25 = new p25(bq3.b(new File(ta.getApplicationInfo().dataDir), new File(ta.getFilesDir(), "core-cache"), new File(ta.getCacheDir(), "core-volatile"), true));
       op25.e(ta.getString(R.string.storage_location_app_internal));
       op25.g = Boolean.TRUE;
       return op25.c();
    }
    public final tv c(tv p0){
       StorageManager storageManag1;
       StorageVolume storageVolum;
       object oobject;
       boolean b1;
       p0.getClass();
       p25 op25 = new p25(p0);
       boolean b = true;
       int i = 26;
       StorageManager storageManag = StorageManager.class;
       bq3 ta = this.a;
       tv k = p0.k;
       if (Build$VERSION.SDK_INT >= i) {
          storageManag1 = n6.e(ta, storageManag);
          StorageStatsManager storageStats = n6.e(ta, StorageStatsManager.class);
          if (storageManag1 != null && storageStats != null) {
             try{
                UUID uUID = p3.p(storageManag1, k);
                long l = aq3.e(storageStats, uUID);
                op25.a = Long.valueOf((p3.e(storageStats, uUID) - l));
                op25.b = Long.valueOf(l);
             }catch(java.io.FileNotFoundException e1){
                Object[] objArray = new Object[2];
                objArray[0] = k;
                objArray[b] = e1.getMessage();
                Logger.b("Unable to get storage stats for %s, %s", objArray);
             }catch(java.io.IOException e1){
                objArray = new Object[b];
                objArray[0] = k;
                Logger.c(e1, "Unable to get storage stats for %s", objArray);
             }catch(java.lang.IllegalArgumentException e1){
                objArray = new Object[b];
                objArray[0] = k;
                Logger.c(e1, "Failure to get storage stats for %s", objArray);
             }catch(java.lang.RuntimeException e1){
                jl.f("Failure to get storage stats for "+k, e1);
             }
          }
          bq3.e(op25, k);
       }else {
          bq3.e(op25, k);
       }
       tv h = p0.h;
       p0 = p0.j;
       if (Build$VERSION.SDK_INT >= i) {
          storageManag1 = n6.e(ta, storageManag);
          StorageStatsManager storageStats1 = n6.e(ta, StorageStatsManager.class);
          if (storageManag1 != null && storageStats1 != null) {
             try{
                StorageStats storageStats2 = aq3.g(storageStats1, p3.p(storageManag1, k), ta.getPackageName(), k11.h(Process.myUid()));
                op25.c = Long.valueOf((aq3.d(storageStats2) + p3.d(storageStats2)));
                op25.d = Long.valueOf(p3.C(storageStats2));
             }catch(java.io.FileNotFoundException e1){
                Object[] objArray1 = new Object[2];
                objArray1[0] = k;
                objArray1[b] = e1.getMessage();
                Logger.b("Unable to get app stats for %s, %s", objArray1);
             }catch(java.io.IOException e1){
             }catch(android.content.pm.PackageManager$NameNotFoundException e1){
             }catch(java.lang.IllegalArgumentException e1){
                objArray1 = new Object[b];
                objArray1[0] = k;
                Logger.c(e1, "Failure to get app stats for %s", objArray1);
             }catch(java.lang.RuntimeException e1){
                jl.f("Failure to get app stats for "+k, e1);
             }
          }
          this.d(op25, k, p0, h);
       }else {
          this.d(op25, k, p0, h);
       }
       if (h == null) {
          p0 = op25.c();
          op25 = new p25(p0);
          if (!xe7.U(p0.i) || !xe7.U(p0.j)) {
             b = false;
          }
          op25.g = Boolean.valueOf(b);
          p0 = p0.k;
          if (Build$VERSION.SDK_INT >= 24 && ((storageManag1 = n6.e(ta, storageManag)) != null && (storageVolum = k11.i(storageManag1, p0)) != null)) {
             op25.e(k11.o(storageVolum, ta));
             op25.m = Boolean.valueOf(k11.C(storageVolum));
             op25.l = Boolean.valueOf(k11.D(storageVolum));
             p0 = op25.c();
          }else {
             File[] uFileArray = ns0.b(ta, null);
             String absolutePath = p0.getAbsolutePath();
             int len = uFileArray.length;
             i = 0;
             while (i < len) {
                if ((oobject = uFileArray[i]) != null && oobject.getAbsolutePath().startsWith(absolutePath)) {
                   String str = (this.g(oobject))? ta.getString(R.string.storage_location_sdcard): ta.getString(R.string.storage_location_app_external);
                   absolutePath = str;
                   break ;
                }
                i = i + 1;
             }
             op25.e(absolutePath);
             Boolean uBoolean = Boolean.valueOf(this.g(p0));
             try{
                op25.m = uBoolean;
                b1 = Environment.isExternalStorageEmulated(p0);
             }catch(java.lang.IllegalArgumentException e1){
                jl.f("Illegal file, "+p0+this.i(), e1);
             }
             op25.l = Boolean.valueOf(b1);
             p0 = op25.c();
          }
          op25 = new p25(p0);
       }
       return op25.c();
    }
    public final void d(p25 p0,File p1,File p2,boolean p3){
       long l;
       long l1;
       int i = 0;
       int i1 = 1;
       bq3 tb = this.b;
       if (p3) {
          File[] uFileArray = new File[i1];
          uFileArray[i] = p1;
          tb.getClass();
          bq3 ta = this.a;
          ApplicationInfo applicationI = ta.getApplicationInfo();
          String[] stringArray = new String[]{applicationI.nativeLibraryDir,applicationI.publicSourceDir,applicationI.sourceDir};
          l = l32.c(bq3.f(applicationI.splitSourceDirs)) + (l32.c(bq3.f(stringArray)) + l32.c(c.p(uFileArray)));
          File[] uFileArray1 = new File[i1];
          uFileArray1[i] = ta.getCacheDir();
          l1 = l32.c(c.p(uFileArray1));
       }else {
          File[] uFileArray2 = new File[i1];
          uFileArray2[i] = p1;
          tb.getClass();
          File[] uFileArray3 = new File[i1];
          uFileArray3[i] = p2;
          l1 = l32.c(c.p(uFileArray3));
          l = l32.c(c.p(uFileArray2));
       }
       p0.c = Long.valueOf(l);
       p0.d = Long.valueOf(l1);
       return;
    }
    public final boolean g(File p0){
       boolean b;
       try{
          b = Environment.isExternalStorageRemovable(p0);
          return b;
       }catch(java.lang.IllegalArgumentException e0){
          jl.f("Illegal file, "+b+this.i(), e0);
          return false;
       }
    }
    public final tv h(File p0){
       if (io2.j(this.a.getApplicationInfo().dataDir, p0.getAbsolutePath())) {
          return this.a();
       }
       return bq3.b(p0, new File(p0, "core-cache"), new File(p0, "core-volatile"), false);
    }
    public final String i(){
       bq3 ta = this.a;
       return "; dataDir="+ta.getApplicationInfo().dataDir+", files="+ta.getFilesDir()+", cache="+ta.getCacheDir()+", externals="+Arrays.toString(ns0.b(ta, ""))+", externalCaches="+Arrays.toString(ns0.a(ta));
    }
}
