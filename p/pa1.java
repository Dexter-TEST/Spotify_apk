package p.pa1;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import p.ra1;
import java.lang.Object;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.io.File;
import android.content.Context;
import java.lang.String;
import p.co5;
import android.os.StatFs;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.AbstractCollection;
import p.cj0;
import android.content.pm.ApplicationInfo;
import java.lang.Iterable;
import java.util.ArrayList;
import p.dj0;
import p.aj0;
import java.util.Iterator;
import p.vt6;
import java.lang.Class;
import android.os.Environment;
import java.lang.RuntimeException;
import p.hi6;
import p.us6;

public final class pa1 implements SingleOnSubscribe	// class@002220 from classes.dex
{
    public final ra1 a;

    public void pa1(ra1 p0){
       this.a = p0;
       super();
    }
    public final void subscribe(SingleEmitter p0){
       int i;
       StatFs statFs;
       vt6 ovt6;
       File[] externalCach;
       File externalFile;
       StatFs statFs1;
       String[] stringArray;
       String[] stringArray1;
       pa1 a = this.a;
       ra1 a1 = a.a;
       String path = a1.getFilesDir().getPath();
       co5.l(path, "context.filesDir.path");
       String str = null;
       try{
          i = 0;
          statFs = new StatFs(path);
       }catch(java.lang.IllegalArgumentException e0){
          Object[] objArray = new Object[i];
          Logger.c(e0, "Cannot access file system", objArray);
          statFs = str;
       }
       if (statFs == null) {
          ovt6 = str;
       }else {
          LinkedHashSet linkedHashSe1 = new LinkedHashSet();
          linkedHashSe1.add(a1.getCacheDir().getPath());
          linkedHashSe1.add(a1.getFilesDir().getPath());
          linkedHashSe1.add(a1.getNoBackupFilesDir().getPath());
          if ((stringArray = a1.fileList()) == null) {
             stringArray = new String[i];
          }
          cj0.d0(linkedHashSe1, stringArray);
          ApplicationInfo applicationI = a1.getApplicationInfo();
          linkedHashSe1.add(applicationI.dataDir);
          linkedHashSe1.add(applicationI.nativeLibraryDir);
          linkedHashSe1.add(applicationI.publicSourceDir);
          linkedHashSe1.add(applicationI.sourceDir);
          if ((applicationI = applicationI.splitSourceDirs) == null) {
             stringArray1 = new String[i];
          }
          cj0.d0(linkedHashSe1, stringArray1);
          long l = statFs.getFreeBytes() + statFs.getTotalBytes();
          long freeBytes = statFs.getFreeBytes();
          ArrayList uArrayList = dj0.i0(linkedHashSe1);
          ArrayList uArrayList1 = new ArrayList(aj0.b0(uArrayList));
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             uArrayList1.add(new File(iterator.next()));
          }
          vt6 iterator1 = new vt6(l, freeBytes, ra1.a(uArrayList1));
          ovt6 = iterator;
       }
       a.b.getClass();
       path = (Environment.isExternalStorageRemovable() && !Environment.isExternalStorageEmulated())? 1: 0;
       if (path) {
          LinkedHashSet linkedHashSe = new LinkedHashSet();
          ra1 a2 = a.a;
          if ((externalCach = a2.getExternalCacheDirs()) == null) {
             externalCach = new File[i];
          }
          cj0.d0(linkedHashSe, externalCach);
          if ((externalCach = a2.getExternalFilesDirs(str)) == null) {
             externalCach = new File[i];
          }
          cj0.d0(linkedHashSe, externalCach);
          path = ((externalFile = a2.getExternalFilesDir(str)) != null)? externalFile.getPath(): str;
          if (path != null) {
             try{
                statFs1 = new StatFs(path);
             }catch(java.lang.IllegalArgumentException e0){
                Object[] objArray1 = new Object[i];
                Logger.c(e0, "Cannot access file system", objArray1);
                statFs1 = str;
             }
             if (statFs1 != null) {
                vt6 str1 = new vt6(statFs1.getTotalBytes(), statFs1.getFreeBytes(), ra1.a(linkedHashSe));
             }
          }
       }else {
          vt6 str2 = new vt6(-1, -1, -1);
       }
       if (str == null) {
          p0.onError(new RuntimeException("Cannot get external structure"));
       }else if(ovt6 == null){
          p0.onError(new RuntimeException("Cannot get internal structure"));
       }else {
          p0.onSuccess(new us6(ovt6, str));
       }
       return;
    }
}
