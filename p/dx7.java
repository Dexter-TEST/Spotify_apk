package p.dx7;
import p.jd;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import p.mz7;
import java.lang.Object;
import java.io.File;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Exception;
import java.util.List;
import java.util.Collections;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.Integer;
import p.dy7;
import java.util.HashMap;
import java.util.Iterator;

public final class dx7	// class@0013d9 from classes.dex
{
    public final Context a;
    public final mz7 b;
    public static final jd c;

    static {
       dx7.c = new jd("AssetPackStorage");
       TimeUnit dAYS = TimeUnit.DAYS;
       dAYS.toMillis(14);
       dAYS.toMillis(28);
    }
    public void dx7(Context p0,mz7 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static long b(File p0,boolean p1){
       if (!p0.exists()) {
          return -1;
       }
       ArrayList uArrayList = new ArrayList();
       jd c = dx7.c;
       if (p1 && p0.listFiles().length > 1) {
          Object[] objArray = new Object[0];
          c.f("Multiple pack versions found, using highest version code.", objArray);
       }
       try{
          File[] uFileArray = p0.listFiles();
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             if (!oobject.getName().equals("stale.tmp")) {
                uArrayList.add(Long.valueOf(oobject.getName()));
             }
             i = i + 1;
          }
       }catch(java.lang.NumberFormatException e9){
          Object[] objArray1 = new Object[0];
          c.d(e9, "Corrupt asset pack directories.", objArray1);
       }
       if (uArrayList.isEmpty()) {
          return -1;
       }else {
          Collections.sort(uArrayList);
          return uArrayList.get((uArrayList.size() - 1)).longValue();
       }
    }
    public static void f(File p0){
       if (p0.listFiles() != null && p0.listFiles().length > 1) {
          boolean b = false;
          long l = dx7.b(p0, b);
          File[] uFileArray = p0.listFiles();
          int len = uFileArray.length;
          while (b < len) {
             object oobject = uFileArray[b];
             if (!oobject.getName().equals(String.valueOf(l)) && !oobject.getName().equals("stale.tmp")) {
                dx7.g(oobject);
             }
             b = b + 1;
          }
       }
       return;
    }
    public static boolean g(File p0){
       File[] uFileArray = p0.listFiles();
       int i = 1;
       if (uFileArray != null) {
          int len = uFileArray.length;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             i = i & dx7.g(uFileArray[i1]);
          }
       }
       if (!p0.delete()) {
          return false;
       }else {
          return i;
       }
    }
    public final void a(int p0,long p1,String p2){
       File uFile = new File(this.d(), p2);
       if (!uFile.exists()) {
          return;
       }
       File[] uFileArray = uFile.listFiles();
       int len = uFileArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uFileArray[i];
          if (!oobject.getName().equals(String.valueOf(p0)) && !oobject.getName().equals("stale.tmp")) {
             dx7.g(oobject);
          }else if(oobject.getName().equals(String.valueOf(p0))){
             File[] uFileArray1 = oobject.listFiles();
             int len1 = uFileArray1.length;
             int i1 = 0;
             while (i1 < len1) {
                object oobject1 = uFileArray1[i1];
                if (!oobject1.getName().equals(String.valueOf(p1))) {
                   dx7.g(oobject1);
                }
                i1 = i1 + 1;
             }
          }
          i = i + 1;
       }
       return;
    }
    public final File c(int p0,long p1,String p2){
       return new File(new File(new File(new File(this.d(), "_tmp"), p2), String.valueOf(p0)), String.valueOf(p1));
    }
    public final File d(){
       return new File(this.a.getFilesDir(), "assetpacks");
    }
    public final ArrayList e(){
       int i;
       ArrayList uArrayList = new ArrayList();
       try{
          i = 0;
          if (this.d().exists() && this.d().listFiles() != null) {
             File[] uFileArray = this.d().listFiles();
             int len = uFileArray.length;
             int i1 = 0;
             while (i1 < len) {
                object oobject = uFileArray[i1];
                if (!oobject.getCanonicalPath().equals(new File(this.d(), "_tmp").getCanonicalPath())) {
                   uArrayList.add(oobject);
                }
                i1 = i1 + 1;
             }
          }else {
             return uArrayList;
          }
       }catch(java.io.IOException e2){
          Object[] objArray = new Object[1];
          objArray[i] = e2;
          dx7.c.c("Could not process directory while scanning installed packs. %s", objArray);
       }
       return uArrayList;
    }
    public final int h(int p0,long p1,String p2){
       File uFile = new File(new File(this.c(p0, p1, p2), "_packs"), "merge.tmp");
       if (!uFile.exists()) {
          return 0;
       }
       Properties properties = new Properties();
       FileInputStream uFileInputSt = new FileInputStream(uFile);
       properties.load(uFileInputSt);
       uFileInputSt.close();
       if (properties.getProperty("numberOfMerges") != null) {
          return Integer.parseInt(properties.getProperty("numberOfMerges"));
       }
       throw new dy7("Merge checkpoint file corrupt.");
    }
    public final long i(String p0){
       return dx7.b(new File(new File(this.d(), p0), String.valueOf((int)dx7.b(new File(this.d(), p0), true))), true);
    }
    public final File j(int p0,long p1,String p2){
       return new File(new File(new File(this.d(), p2), String.valueOf(p0)), String.valueOf(p1));
    }
    public final File k(String p0,int p1,long p2,String p3){
       return new File(new File(new File(this.c(p1, p2, p0), "_slices"), "_unverified"), p3);
    }
    public final File l(String p0,int p1,long p2,String p3){
       return new File(new File(new File(this.c(p1, p2, p0), "_slices"), "_verified"), p3);
    }
    public final String m(String p0){
       Object[] objArray;
       File[] uFileArray;
       int len;
       File uFile = new File(this.d(), p0);
       jd c = dx7.c;
       if (!uFile.exists()) {
          objArray = new Object[]{p0};
          c.a("Pack not found with pack name: %s", objArray);
          return null;
       }else {
          dx7 tb = this.b;
          File uFile1 = new File(uFile, String.valueOf(tb.a()));
          if (!uFile1.exists()) {
             objArray = new Object[]{p0,Integer.valueOf(tb.a())};
             c.a("Pack not found with pack name: %s app version: %s", objArray);
             return null;
          }else if((uFileArray = uFile1.listFiles()) != null && (len = uFileArray.length)){
             if (len <= 1) {
                return uFileArray[0].getCanonicalPath();
             }
             objArray = new Object[]{p0,Integer.valueOf(tb.a())};
             c.c("Multiple pack versions found for pack name: %s app version: %s", objArray);
             return null;
          }else {
             objArray = new Object[]{p0,Integer.valueOf(tb.a())};
             c.a("No pack version found for pack name: %s app version: %s", objArray);
             return null;
          }
       }
    }
    public final HashMap n(){
       HashMap hashMap = new HashMap();
       Iterator iterator = this.e().iterator();
       while (iterator.hasNext()) {
          String name = iterator.next().getName();
          int i = (int)dx7.b(new File(this.d(), name), true);
          long l = dx7.b(new File(new File(this.d(), name), String.valueOf(i)), true);
          if (this.j(i, l, name).exists()) {
             hashMap.put(name, Long.valueOf(l));
          }
       }
       return hashMap;
    }
}
