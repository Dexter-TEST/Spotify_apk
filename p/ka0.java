package p.ka0;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.StringBuilder;
import java.io.File;
import java.lang.String;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import org.json.JSONObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.t50;
import android.content.Context;
import p.ej4;
import java.io.FileNotFoundException;
import p.ax7;
import android.os.Bundle;
import com.google.android.play.core.assetpacks.zzbn;
import java.lang.Class;
import p.zk;
import p.wy7;
import p.xy7;
import java.lang.Boolean;
import p.t5;
import android.os.Handler;
import p.jy7;
import p.i28;
import p.bx;
import android.view.View;
import android.widget.FrameLayout;
import p.so2;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p.dh7;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import p.ef;
import p.px7;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import p.ww7;
import p.uq7;
import p.xq6;
import p.nq5;
import p.wk5;
import p.am3;
import java.util.concurrent.Future;
import p.nw1;
import p.qq7;
import p.l81;
import androidx.fragment.app.d;
import androidx.fragment.app.o;
import androidx.fragment.app.v;
import java.util.Objects;
import java.util.List;
import androidx.fragment.app.e;
import java.util.concurrent.Callable;
import p.jr0;
import p.u44;
import android.graphics.Typeface;
import p.uw5;
import p.ra6;
import p.tw1;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class ka0 implements Runnable	// class@001bd3 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object t;

    public void ka0(Object p0,Object p1,Object p2,int p3){
       this.a = p3;
       this.t = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void ka0(Object p0,Object p1,Object p2,int p3,int p4){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final void run(){
       u44 b;
       px7 c;
       so2 d;
       String str1;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 1;
       Bundle uBundle = null;
       ka0 tt = this.t;
       ka0 tc = this.c;
       ka0 tb = this.b;
       switch (this.a){
           case 0:
             if ((b = tb.b) != null) {
                b.q(tc);
             }
             return;
             break;
           case 1:
             tb.accept(tc);
             return;
           case 2:
             try{
                jr0 ojr0 = tb.call();
                tt.post(new ka0(this, tc, ojr0, i3));
                return;
             }catch(java.lang.Exception e0){
             }
             break;
           case 3:
             if (tb.contains(tc)) {
                tb.remove(tc);
                tt.getClass();
                e.j(tc);
             }
             return;
             break;
           case 4:
             tb.a();
             if (o.I(2)) {
                Objects.toString(tc);
             }
             return;
             break;
           case 5:
             try{
                nw1 onw1 = tt.get().booleanValue();
                tb.b(tc, onw1);
                return;
             }catch(java.lang.InterruptedException e0){
             }catch(java.util.concurrent.ExecutionException e0){
             }
             break;
           case 6:
             tb.F.i(tc, tt);
             return;
           case 7:
             tt.getClass();
             tt.getClass();
             tt.getClass();
             tt.getClass();
             tt.getClass();
             return;
           case 8:
             if (tt.b > null) {
                ka0 oka0 = tb;
                if ((c = tt.c) != null) {
                   uBundle = c.getBundle(tc);
                }
                oka0.c(uBundle);
             }
             if (tt.b >= 2) {
                tb.f();
             }
             if (tt.b >= i2) {
                tb.d();
             }
             if (tt.b >= i1) {
                tb.g();
             }
             if (tt.b >= i) {
                tb.getClass();
             }
             return;
             break;
           case 9:
             if (tc != null && (d = tt.d) != null) {
                if (d.computeScrollOffset()) {
                   tt.y(tb, tc, tt.d.getCurrY());
                   dh7.m(tc, this);
                }else {
                   tt.C(tb, tc);
                   if (tc.C != null) {
                      tc.e(tc.f(AppBarLayout$BaseBehavior.A(tb)));
                   }
                }
             }
             return;
             break;
           case 10:
             tt.f(tb, tc);
             return;
           case 11:
             ax7 g = tb.g;
             g.getClass();
             if (g.c(new zk(g, tc)).booleanValue()) {
                tb.o.post(new t5(tb, tt, 28));
                tb.i.c().e();
             }
             return;
             break;
           case 12:
             try{
                StringBuilder str = "";
                BufferedReader uBufferedRea = new BufferedReader(new FileReader(new File(tb)));
                while ((str1 = uBufferedRea.readLine()) != null) {
                   str = str.append(str1);
                }
                uBufferedRea.close();
                JSONObject jSONObject = new JSONObject(str.trim());
                if (TextUtils.isEmpty(jSONObject.toString())) {
                   throw new FileNotFoundException();
                }
                ej4.w(jSONObject, tc, tt);
                return;
             }catch(java.io.FileNotFoundException e0){
             }catch(java.io.IOException e0){
             }catch(org.json.JSONException e0){
             }
             break;
           default:
             tb.getClass();
             cd1.c(tb, tt.a(tc));
             return;
       }
    }
}
