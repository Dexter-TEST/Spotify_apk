package p.bz7;
import p.i28;
import p.jd;
import java.lang.String;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.File;
import p.ax7;
import android.content.Context;
import p.mz7;
import p.hy7;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import p.vj1;
import java.util.ArrayList;
import p.l18;
import java.lang.IllegalStateException;
import java.lang.Integer;
import p.ox7;
import android.os.ParcelFileDescriptor;
import p.yq3;
import java.lang.Exception;
import p.jy7;
import java.util.concurrent.Executor;
import p.yx5;
import java.lang.Runnable;
import java.util.List;
import android.os.Bundle;
import android.os.BaseBundle;
import p.io2;
import java.util.Arrays;
import p.xe7;
import java.util.Collection;
import android.content.Intent;
import p.t5;
import p.az7;
import java.io.FilenameFilter;

public final class bz7 implements i28	// class@001168 from classes.dex
{
    public final String a;
    public final ax7 b;
    public final Context c;
    public final mz7 d;
    public final hy7 e;
    public final Handler f;
    public static final jd g;

    static {
       bz7.g = new jd("FakeAssetPackService");
       AtomicInteger uAtomicInteg = new AtomicInteger(1);
    }
    public void bz7(File p0,ax7 p1,Context p2,mz7 p3,hy7 p4){
       super();
       this.f = new Handler(Looper.getMainLooper());
       this.a = p0.getAbsolutePath();
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final void a(int p0){
       Object[] objArray = new Object[0];
       bz7.g.e("notifySessionFailed", objArray);
    }
    public final vj1 b(HashMap p0){
       Object[] objArray = new Object[0];
       bz7.g.e("syncPacks\(\)", objArray);
       ArrayList uArrayList = new ArrayList();
       vj1 ovj1 = new vj1();
       vj1 b = ovj1.b;
       _monitor_enter(b);
       if (!((ovj1.a ^ 1))) {
          throw new IllegalStateException("Task is already complete");
       }
       ovj1.a = true;
       ovj1.d = uArrayList;
       _monitor_exit(b);
       ovj1.c.d(ovj1);
       return ovj1;
    }
    public final vj1 c(int p0,String p1,int p2,String p3){
       vj1 ovj1;
       Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p3,Integer.valueOf(p2)};
       bz7.g.e("getChunkFileDescriptor\(session=%d, %s, %s, %d\)", objArray);
       try{
          ovj1 = new vj1();
          File[] uFileArray = this.i(p1);
          int len = uFileArray.length;
          int i = 0;
          while (true) {
             if (i < len) {
                object oobject = uFileArray[i];
                if (ox7.Q(oobject).equals(p3)) {
                   ParcelFileDescriptor parcelFileDe = ParcelFileDescriptor.open(oobject, 0x10000000);
                   vj1 b = ovj1.b;
                   _monitor_enter(b);
                   if (!((ovj1.a ^ 1))) {
                      throw new IllegalStateException("Task is already complete");
                   }
                   ovj1.a = true;
                   ovj1.d = parcelFileDe;
                   _monitor_exit(b);
                   ovj1.c.d(ovj1);
                   break ;
                }else {
                   i = i + 1;
                }
             }else {
                objArray = new Object[]{p3};
                throw new yq3(String.format("Local testing slice for \'%s\' not found.", objArray));
             }
          }
       }catch(java.io.FileNotFoundException e9){
          Object[] objArray1 = new Object[]{e9};
          bz7.g.f("getChunkFileDescriptor failed", objArray1);
          ovj1.f(new yq3("Asset Slice file not found.", e9));
       }catch(p.yq3 e9){
          objArray1 = new Object[]{e9};
          bz7.g.f("getChunkFileDescriptor failed", objArray1);
          ovj1.f(e9);
       }
       return ovj1;
    }
    public final void d(int p0,String p1){
       Object[] objArray = new Object[0];
       bz7.g.e("notifyModuleCompleted", objArray);
       this.e.c().execute(new yx5(this, p0, p1));
    }
    public final void e(){
       Object[] objArray = new Object[0];
       bz7.g.e("keepAlive", objArray);
    }
    public final void f(List p0){
       Object[] objArray = new Object[]{p0};
       bz7.g.e("cancelDownload\(%s\)", objArray);
    }
    public final void g(int p0,String p1,int p2,String p3){
       Object[] objArray = new Object[0];
       bz7.g.e("notifyChunkTransferred", objArray);
    }
    public final void h(String p0,int p1){
       int i1;
       Bundle uBundle = new Bundle();
       bz7 td = this.d;
       uBundle.putInt("app_version_code", td.a());
       uBundle.putInt("session_id", p1);
       File[] uFileArray = this.i(p0);
       ArrayList uArrayList = new ArrayList();
       int len = uFileArray.length;
       long l = 0;
       int i = 0;
       while (true) {
          i1 = 1;
          if (i < len) {
             object oobject = uFileArray[i];
             l = l + oobject.length();
             ArrayList uArrayList1 = new ArrayList();
             uArrayList1.add(null);
             String str = ox7.Q(oobject);
             uBundle.putParcelableArrayList(io2.D("chunk_intents", p0, str), uArrayList1);
             String str1 = io2.D("uncompressed_hash_sha256", p0, str);
             try{
                File[] uFileArray1 = new File[i1];
                uFileArray1[0] = oobject;
                uBundle.putString(str1, xe7.m0(Arrays.asList(uFileArray1)));
                uBundle.putLong(io2.D("uncompressed_size", p0, str), oobject.length());
                uArrayList.add(str);
                i = i + 1;
             }catch(java.security.NoSuchAlgorithmException e14){
                throw new yq3("SHA256 algorithm not supported.", e14);
             }catch(java.io.IOException e14){
                Object[] objArray = new Object[io2.D("uncompressed_size", p0, str)];
                objArray[0] = oobject.length();
                throw new yq3(String.format("Could not digest file: %s.", objArray), e14);
             }
          }else {
             break ;
          }
       }
       uBundle.putStringArrayList(io2.C("slice_ids", p0), uArrayList);
       uBundle.putLong(io2.C("pack_version", p0), (long)td.a());
       uBundle.putInt(io2.C("status", p0), 4);
       uBundle.putInt(io2.C("error_code", p0), 0);
       uBundle.putLong(io2.C("bytes_downloaded", p0), l);
       uBundle.putLong(io2.C("total_bytes_to_download", p0), l);
       String[] stringArray = new String[i1];
       stringArray[0] = p0;
       uBundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(stringArray)));
       uBundle.putLong("bytes_downloaded", l);
       uBundle.putLong("total_bytes_to_download", l);
       this.f.post(new t5(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", uBundle), 29));
       return;
    }
    public final File[] i(String p0){
       File[] uFileArray;
       int len;
       Object[] objArray;
       File uFile = new File(this.a);
       if (uFile.isDirectory()) {
          if ((uFileArray = uFile.listFiles(new az7(p0, 0))) != null) {
             if (len = uFileArray.length) {
                int i = 0;
                while (true) {
                   if (i < len) {
                      if (ox7.Q(uFileArray[i]).equals(p0)) {
                         break ;
                      }else {
                         i = i + 1;
                      }
                   }else {
                      objArray = new Object[]{p0};
                      throw new yq3(String.format("No main slice available for pack \'%s\'.", objArray));
                   }
                }
                return uFileArray;
             }else {
                objArray = new Object[]{p0};
                throw new yq3(String.format("No APKs available for pack \'%s\'.", objArray));
             }
          }else {
             objArray = new Object[]{p0};
             throw new yq3(String.format("Failed fetching APKs for pack \'%s\'.", objArray));
          }
       }else {
          objArray = new Object[]{uFile};
          throw new yq3(String.format("Local testing directory \'%s\' not found.", objArray));
       }
    }
}
