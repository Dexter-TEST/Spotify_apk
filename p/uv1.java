package p.uv1;
import p.pr0;
import p.c64;
import p.gj1;
import p.oz;
import p.so6;
import p.zb;
import p.pv6;
import p.kc3;
import p.u94;
import java.lang.Object;
import android.os.Build$VERSION;
import p.op7;
import p.np7;
import p.mp7;
import java.util.Set;
import p.co5;
import android.media.AudioAttributes$Builder;
import android.content.ClipData;
import p.sr0;
import p.ur0;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.work.impl.WorkDatabase;
import java.lang.String;
import java.util.ArrayList;
import p.aq6;
import p.as;
import java.lang.Boolean;
import p.vt;
import p.xp7;
import p.k07;
import java.lang.CharSequence;
import p.qo6;
import p.ap5;
import p.wn0;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import p.jj1;
import java.lang.Runnable;
import io.reactivex.rxjava3.core.Observable;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import p.t14;
import p.tu6;
import java.util.List;
import com.google.common.collect.c;
import p.ys5;
import p.vj;
import p.xu5;
import p.ly0;
import p.xj0;
import p.x61;
import p.yy6;
import p.xq7;
import p.i77;
import p.et0;
import p.b7;
import p.fy0;
import p.c26;
import p.vx5;
import p.x65;
import p.w65;
import android.os.AsyncTask;
import java.util.concurrent.Executor;
import com.spotify.legacyglue.contextmenu.glue.StretchingGradientDrawable;
import p.rk2;
import android.graphics.drawable.Drawable;
import android.view.View;
import p.j07;
import java.lang.Void;
import p.es;
import p.xc6;
import p.wc6;
import java.util.HashMap;
import java.util.Map;
import p.gs2;
import p.r2;
import p.az5;
import p.xl0;
import p.mp2;
import org.json.JSONObject;
import android.util.Log;
import p.u44;
import p.uc6;
import p.a70;
import java.lang.Class;
import java.io.FileWriter;
import java.io.File;
import java.io.Writer;
import java.io.Closeable;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.util.concurrent.atomic.AtomicReference;
import p.m07;
import p.a28;
import p.vv7;
import p.e64;
import p.f67;
import p.p67;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ActionMenuView;
import p.w5;
import android.view.Menu;
import android.view.Window$Callback;
import p.nq5;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import p.d74;
import android.view.MenuItem;
import android.os.Bundle;
import p.tp2;
import p.wh7;
import p.dh7;
import p.i80;
import java.util.Locale;
import java.lang.Float;

public class uv1 implements pr0, c64, gj1, oz, so6, zb, pv6, kc3, u94	// class@002928 from classes.dex
{
    public final int a;
    public Object b;

    public void uv1(int p0){
       this.a = p0;
       if (p0 != 8) {
          if (p0 != 23) {
             super();
             if ((p0 = Build$VERSION.SDK_INT) >= 30) {
                this.b = new op7();
             }else if(p0 >= 29){
                this.b = new np7();
             }else {
                this.b = new mp7();
             }
             return;
          }else {
             super();
             this.b = co5.H("RawCoreStream");
             return;
          }
       }else {
          super();
          this.b = new AudioAttributes$Builder();
          return;
       }
    }
    public void uv1(int p0,int p1){
       this.a = p0;
       super();
    }
    public void uv1(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void uv1(ClipData p0,int p1){
       this.a = 5;
       super();
       this.b = (Build$VERSION.SDK_INT >= 31)? new sr0(p0, p1): new ur0(p0, p1);
       return;
    }
    public void uv1(Context p0){
       this.a = 7;
       super();
       this.b = p0.getApplicationContext();
    }
    public void uv1(Bitmap p0){
       this.a = 26;
       super(26, p0);
    }
    public void uv1(WorkDatabase p0){
       this.a = 10;
       co5.o(p0, "workDatabase");
       super();
       this.b = p0;
    }
    public void uv1(ArrayList p0){
       this.a = 24;
       super(24, p0);
    }
    public void uv1(aq6 p0){
       this.a = 28;
       super();
       as uoas = new as(1);
       Boolean fALSE = Boolean.FALSE;
       uoas.b = p0;
       uoas.k = fALSE;
       uoas.a = fALSE;
       this.b = uoas.b();
    }
    public void uv1(xp7 p0){
       int sDK_INT;
       this.a = 6;
       super();
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 30) {
          this.b = new op7(p0);
       }else if(sDK_INT >= 29){
          this.b = new np7(p0);
       }else {
          this.b = new mp7(p0);
       }
       return;
    }
    public final qo6 a(k07 p0,CharSequence p1){
       return new qo6(this, p0, p1, 0);
    }
    public final void b(ap5 p0){
       ThreadPoolExecutor v8 = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new wn0("EmojiCompatInitializer"));
       v8.allowCoreThreadTimeOut(true);
       v8.execute(new jj1(this, p0, v8, 0));
    }
    public final Observable c(){
       return Observable.error(new IllegalArgumentException(this.b.a.toString()));
    }
    public final float d(float p0,float p1,float p2){
       uv1 tb = this.b;
       return tu6.k(tb.b, tb.c, p2);
    }
    public final List e(aq6 p0){
       return ys5.v;
    }
    public final xu5 f(vj p0){
       int i;
       vj c = p0.c;
       vj e = p0.e;
       uv1 tb = this.b;
       ly0 b = tb.b;
       String str = ((i = xj0.o0(b, "com.crashlytics.ApiEndpoint", "string")) > 0)? b.getString(i): "";
       ly0 g = tb.g;
       x61 i1 = new x61(str, c, g, 0);
       xu5 x61 c1 = new x61(str, p0.d, g, 1);
       xq7 oxq7 = new xq7(i1, 7, c1);
       uv1 tb1 = this.b;
       c1 = new xu5(e, this.b.j.a, et0.c(p0), tb1.n, oxq7, tb1.o);
       return c1;
    }
    public final void g(c26 p0){
       x65 ox65 = new x65(this.b);
       w65 ow65 = new w65(ox65, new vx5(this, p0));
       Bitmap[] uBitmapArray = new Bitmap[]{ox65.a};
       ow65.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uBitmapArray);
    }
    public final StretchingGradientDrawable h(){
       return this.b.d.getBackground();
    }
    public final j07 i(Object p0){
       Closeable uCloseable;
       String str = "FirebaseCrashlytics";
       p0 = this.b;
       es f = p0.f;
       p0 = p0.b;
       x61 w = f.w;
       int i = 3;
       Object obj = null;
       try{
          HashMap hashMap = x61.e(p0);
          gs2 ogs2 = f.a(hashMap);
          x61.c(ogs2, p0);
          w.u(i);
          hashMap.toString();
          w.u(i);
          p0 = ogs2.a();
          p0.t.a("X-REQUEST-ID");
          w.u(i);
          p0 = f.f(p0);
       }catch(java.io.IOException e10){
          if (w.u(6)) {
             Log.e(str, "Settings request failed.", e10);
          }
          p0 = obj;
       }
       if (p0 != null) {
          uc6 ouc6 = this.b.c.C(p0);
          es e = this.b.e;
          uc6 d = ouc6.d;
          e.getClass();
          try{
             Log.isLoggable(str, i);
             p0.put("expires_at", d);
             File uFile = new File(new a70(e.a).b(), "com.crashlytics.settings.json");
             try{
                FileWriter d1 = new FileWriter(uFile);
                d1.write(p0.toString());
                d1.flush();
             label_00ad :
                xj0.l(uCloseable, "Failed to close settings writer.");
                this.b.getClass();
                p0.toString();
                Log.isLoggable(str, i);
                p0 = this.b;
                p0 = p0.a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                p0.putString("existing_instance_identifier", p0.b.f);
                p0.apply();
                this.b.h.set(ouc6);
                uc6 a = ouc6.a;
                this.b.i.get().b(a);
                p0 = new m07();
                p0.b(a);
                this.b.i.set(p0);
             }catch(java.lang.Exception e2){
             }
             Log.e(str, "Failed to cache settings", e2);
             goto label_00ad ;
          }catch(java.lang.Exception e2){
             uCloseable = obj;
          }
       }
       return vv7.t(obj);
    }
    public final List j(){
       return this.b.g;
    }
    public final void k(e64 p0){
       Toolbar a;
       ActionMenuView k;
       int i = 1;
       switch (this.a){
           case 2:
             if ((a = this.b.F.a.a) != null) {
                k = ((k = a.K) != null && k.e())? 1: 0;
                if (k) {
                label_0025 :
                   if (i) {
                      this.b.G.onPanelClosed(108, p0);
                   }else if(this.b.G.onPreparePanel(0, null, p0)){
                      this.b.G.onMenuOpened(108, p0);
                   }
                }
             }
             i = 0;
             goto label_0025 ;
             break;
           default:
             if ((k = this.b.a.K) == null || !k.e()) {
                i = 0;
             }
             if (!i) {
                Iterator iterator = this.b.a0.b.iterator();
                while (iterator.hasNext()) {
                   iterator.next().d(p0);
                }
             }
             if ((a = this.b.i0) != null) {
                a.k(p0);
             }
             return;
       }
       return;
    }
    public final boolean l(e64 p0,MenuItem p1){
       Toolbar i0;
       boolean b = false;
       switch (this.a){
           case 2:
           default:
             if ((i0 = this.b.i0) != null && i0.l(p0, p1)) {
                b = true;
             }
             return b;
       }
       return b;
    }
    public final void m(Bundle p0){
       tp2.v(this.b);
       throw null;
    }
    public final float n(){
       return (float)this.b.u.getMeasuredHeight();
    }
    public final void o(){
       dh7.k(this.b.d);
       dh7.k(this.b.e);
    }
    public final int p(){
       uv1 tb;
       switch (this.a){
           case 12:
             break;
           default:
             return this.b.size();
       }
       int i = ((tb = this.b) == null)? 0: tb.size();
       return i;
    }
    public final String toString(){
       uv1 tb;
       switch (this.a){
           case 12:
             String str = ((tb = this.b) == null)? "[null]": tb.toString();
             return str;
             break;
           case 27:
           default:
             return super.toString();
       }
       Object[] objArray = new Object[]{Float.valueOf(this.b.b),Float.valueOf(this.b.c)};
       return String.format(Locale.US, "clamp\(%.2f, %.2f\)", objArray);
    }
}
