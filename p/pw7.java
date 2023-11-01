package p.pw7;
import p.i28;
import p.jd;
import java.lang.String;
import android.content.Intent;
import android.content.Context;
import p.iy7;
import p.lz7;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import p.ay7;
import p.ow7;
import p.fv1;
import p.kw7;
import android.os.Bundle;
import android.os.BaseBundle;
import java.util.ArrayList;
import java.lang.Integer;
import p.vj1;
import p.ll;
import java.lang.Exception;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Long;
import p.l08;
import p.ew7;
import p.bw7;
import p.dy7;
import java.util.HashMap;
import p.v08;
import p.aw7;
import p.fw7;
import java.util.List;
import p.cw7;

public final class pw7 implements i28	// class@0022e7 from classes.dex
{
    public final String a;
    public final iy7 b;
    public final lz7 c;
    public final ow7 d;
    public final ow7 e;
    public final AtomicBoolean f;
    public static final jd g;
    public static final Intent h;

    static {
       pw7.g = new jd("AssetPackServiceImpl");
       pw7.h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    }
    public void pw7(Context p0,iy7 p1,lz7 p2){
       Context applicationC;
       ow7 ay7.b(p0);
       Context applicationC1;
       ow7 ay7.b(p0)1;
       super();
       this.f = new AtomicBoolean();
       this.a = p0.getPackageName();
       this.b = p1;
       this.c = p2;
       if (ay7.b(p0)) {
          Context uContext = ((applicationC = p0.getApplicationContext()) != null)? applicationC: p0;
          jd g = pw7.g;
          Intent h = pw7.h;
          fv1 c = fv1.C;
          ay7.b(p0) = new ow7(uContext, g, "AssetPackService", h, c);
          this.d = ay7.b(p0);
          Context uContext1 = ((applicationC1 = p0.getApplicationContext()) != null)? applicationC1: p0;
          ay7.b(p0)1 = new ow7(uContext1, g, "AssetPackService-keepAlive", h, c);
          this.e = ay7.b(p0);
       }
       Object[] objArray = new Object[0];
       pw7.g.a("AssetPackService initiated.", objArray);
       return;
    }
    public static Bundle h(){
       Bundle uBundle = new Bundle();
       uBundle.putInt("playcore_version_code", 0x2afb);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(Integer.valueOf(0));
       Integer integer = Integer.valueOf(1);
       uArrayList.add(integer);
       uBundle.putIntegerArrayList("supported_compression_formats", uArrayList);
       uArrayList = new ArrayList();
       uArrayList.add(integer);
       uArrayList.add(Integer.valueOf(2));
       uBundle.putIntegerArrayList("supported_patch_formats", uArrayList);
       return uBundle;
    }
    public static vj1 i(){
       Object[] objArray = new Object[]{Integer.valueOf(-11)};
       pw7.g.c("onError\(%d\)", objArray);
       vj1 ovj1 = new vj1();
       ovj1.f(new ll(-11, 0));
       return ovj1;
    }
    public static Bundle k(Map p0){
       Bundle uBundle = pw7.h();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Bundle uBundle1 = new Bundle();
          uBundle1.putString("installed_asset_module_name", uEntry.getKey());
          uBundle1.putLong("installed_asset_module_version", uEntry.getValue().longValue());
          uArrayList.add(uBundle1);
       }
       uBundle.putParcelableArrayList("installed_asset_module", uArrayList);
       return uBundle;
    }
    public final void a(int p0){
       pw7 td;
       if ((td = this.d) == null) {
          throw new dy7("The Play Store app is not installed or is an unofficial version.", p0);
       }
       Object[] objArray = new Object[0];
       pw7.g.e("notifySessionFailed", objArray);
       l08 ol08 = new l08();
       td.b(new ew7(this, ol08, p0, ol08), ol08);
       return;
    }
    public final vj1 b(HashMap p0){
       pw7 td;
       if ((td = this.d) == null) {
          return pw7.i();
       }
       Object[] objArray = new Object[0];
       pw7.g.e("syncPacks", objArray);
       l08 ol08 = new l08();
       v08 v2 = new v08(this, ol08, p0, ol08, 2);
       td.b(v2, ol08);
       return ol08.a;
    }
    public final vj1 c(int p0,String p1,int p2,String p3){
       pw7 d;
       if ((d = this.d) == null) {
          return pw7.i();
       }
       Object[] objArray = new Object[]{p1,p3,Integer.valueOf(p2),Integer.valueOf(p0)};
       pw7.g.e("getChunkFileDescriptor\(%s, %s, %d, session=%d\)", objArray);
       l08 ol08 = new l08();
       aw7 v12 = new aw7(this, ol08, p0, p1, p3, p2, ol08, 1);
       d.b(v12, ol08);
       return ol08.a;
    }
    public final void d(int p0,String p1){
       this.j(p1, p0, 10);
    }
    public synchronized final void e(){
       Object[] objArray;
       int i = 0;
       if (this.e == null) {
          objArray = new Object[i];
          pw7.g.f("Keep alive connection manager is not initialized.", objArray);
          return;
       }else {
          jd g = pw7.g;
          Object[] objArray1 = new Object[i];
          g.e("keepAlive", objArray1);
          if (!this.f.compareAndSet(i, true)) {
             objArray = new Object[i];
             g.e("Service is already kept alive.", objArray);
             return;
          }else {
             l08 ol08 = new l08();
             this.e.b(new fw7(this, ol08, ol08, i), ol08);
             return;
          }
       }
    }
    public final void f(List p0){
       pw7 td;
       if ((td = this.d) == null) {
          return;
       }
       Object[] objArray = new Object[]{p0};
       pw7.g.e("cancelDownloads\(%s\)", objArray);
       l08 ol08 = new l08();
       v08 v2 = new v08(this, ol08, p0, ol08, 1);
       td.b(v2, ol08);
       return;
    }
    public final void g(int p0,String p1,int p2,String p3){
       pw7 d;
       if ((d = this.d) == null) {
          throw new dy7("The Play Store app is not installed or is an unofficial version.", p0);
       }
       Object[] objArray = new Object[0];
       pw7.g.e("notifyChunkTransferred", objArray);
       l08 ol08 = new l08();
       aw7 v12 = new aw7(this, ol08, p0, p1, p3, p2, ol08, 0);
       d.b(v12, ol08);
       return;
    }
    public final void j(String p0,int p1,int p2){
       pw7 td;
       if ((td = this.d) == null) {
          throw new dy7("The Play Store app is not installed or is an unofficial version.", p1);
       }
       Object[] objArray = new Object[0];
       pw7.g.e("notifyModuleCompleted", objArray);
       l08 ol08 = new l08();
       cw7 v2 = new cw7(this, ol08, p1, p0, ol08, p2);
       td.b(v2, ol08);
       return;
    }
}
