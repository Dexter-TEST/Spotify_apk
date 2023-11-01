package p.ig1;
import p.ir0;
import p.ng1;
import java.lang.Object;
import p.l51;
import java.lang.Class;
import p.z4;
import java.lang.Boolean;
import p.t00;
import p.m65;
import androidx.recyclerview.widget.RecyclerView;
import p.og1;
import p.vs;
import java.lang.Throwable;
import p.t67;
import java.util.List;
import java.util.Collection;
import com.google.common.collect.c;
import p.do5;
import com.spotify.webapi.service.models.Entity;
import java.util.Collections;
import com.spotify.webapi.service.models.TrackSimple;
import p.i77;
import p.rv;
import p.ym6;
import p.ev;
import android.view.MotionEvent;
import p.zr5;
import p.md3;
import p.wh7;
import android.view.View;
import p.eh7;
import java.lang.String;
import android.util.Log;
import android.view.ViewParent;
import android.view.VelocityTracker;
import java.lang.Integer;
import p.us;
import java.lang.CharSequence;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import p.vo2;
import p.fn0;
import com.spotify.webapi.service.models.Episode;
import com.spotify.webapi.service.models.Track;
import p.sp6;
import p.p65;
import p.q65;
import java.util.Objects;
import p.lg1;
import p.o06;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.kg1;
import p.yf2;
import p.rz5;
import p.mg1;
import io.reactivex.rxjava3.core.ObservableSource;
import p.s36;
import p.yq5;
import p.wd5;
import p.lc1;
import android.os.Message;
import android.os.Handler;
import java.lang.IllegalArgumentException;

public final class ig1 implements ir0	// class@001988 from classes.dex
{
    public final int a;
    public final ng1 b;

    public void ig1(ng1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       ng1 k;
       ng1 r;
       l51 c;
       int i5;
       int i7;
       md3 s;
       z4 a;
       vs c1;
       int i = 7;
       int i1 = 0;
       int i2 = 0x7f12011d;
       int i3 = 0x7f12011f;
       ig1 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             k = tb.K;
             String str = "tag == null";
             if (!p0.intValue()) {
                p0 = tb.G;
                if (k != null) {
                   p0 = p0.d.h;
                   p0.sendMessage(p0.obtainMessage(12, k));
                }else {
                   p0.getClass();
                   throw new IllegalArgumentException(str);
                }
             }else {
                p0 = tb.G;
                if (k != null) {
                   p0 = p0.d.h;
                   p0.sendMessage(p0.obtainMessage(11, k));
                }else {
                   p0.getClass();
                   throw new IllegalArgumentException(str);
                }
             }
             return;
             break;
           case 1:
             tb.v.setTitle(p0.a);
             tb.V.setTitle(p0.a);
             r = tb.R;
             r.e();
             i2 = 3;
             Episode uEpisode = Episode.class;
             Track track = Track.class;
             if (p0.c != null) {
                p0 = tb.L;
                p0.t = sp6.B;
                p0.c = sp6.L;
                tb.U.w(track, p0);
                tb.U.w(uEpisode, tb.L);
                p0 = tb.L;
                Objects.requireNonNull(p0);
                lg1 uEpisode1 = new lg1(p0, i1);
                p0 = new o06(uEpisode1, i1);
                ng1 l = tb.L;
                Objects.requireNonNull(l);
                uEpisode1 = new lg1(l, 1);
                o06 l1 = new o06(uEpisode1, 1);
                tb.Q.c(l1.observeOn(id.a()).subscribe(new ig1(tb, 5)));
                r.c(tb.P.g.distinctUntilChanged().hide().observeOn(id.a()).doOnNext(new ig1(tb, 6)).doOnNext(new ig1(tb, i)).map(new kg1(tb, 2)).switchMap(new kg1(tb, i2)).observeOn(id.a()).subscribe(new ig1(tb, 8), new ig1(tb, 9)));
             }else {
                p0 = tb.M;
                p0.t = sp6.q0;
                tb.U.w(track, p0);
                tb.U.w(uEpisode, tb.N);
                p0 = tb.M;
                Objects.requireNonNull(p0);
                mg1 i4 = new mg1(1, p0);
                p0 = new o06(i4, i1);
                k = tb.N;
                Objects.requireNonNull(k);
                mg1 omg1 = new mg1(i1, k);
                p0 = Observable.merge(p0, new o06(omg1, i1));
             }
             r.c(p0.doOnNext(new ig1(tb, 2)).observeOn(s36.c).switchMap(new kg1(tb, 1)).observeOn(id.a()).subscribe(new ig1(tb, i2), new ig1(tb, 4)));
             tb.U.g();
             return;
             break;
           case 2:
             tb.getClass();
             tb.A(p0.intValue(), 2, i);
             return;
           case 3:
             tb.getClass();
             tb.J.onNext(Boolean.valueOf(p0.a));
             c = p0.c;
             if ((p0 = p0.b) != null) {
                tb.B(i3, p0);
             }else if(c != null){
                p0 = tb.T;
                if (p0.b.remove(c)) {
                   p0.w.onNext(do5.u0(c.o(p0.b)));
                }
                i5 = (c instanceof TrackSimple)? 0x7f120120: 0x7f12011b;
                tb.H.c(rv.a(i5).l());
             }
             return;
             break;
           case 4:
             tb.B(i3, p0);
             return;
           case 5:
             tb.getClass();
             if (!p0.b.getActionMasked()) {
                k = tb.O;
                p0 = tb.x.H(p0.a);
                p0.getClass();
                md3 m = k.m;
                md3 q = k.q;
                m.getClass();
                int i6 = (m.f != null)? 0x30003: 0;
                i2 = eh7.d(q);
                if (i7 = i6 & 0x303030) {
                   i6 = i6 & (~ i7);
                   if (!i2) {
                      i2 = i7 >> 2;
                   }else {
                      i2 = i7 >> 1;
                      i6 = i6 | (-3158065 & i2);
                      i2 = (i2 & 0x303030) >> 2;
                   }
                   i6 = i6 | i2;
                }
                if ((i6 & 0xff0000)) {
                   i1 = 1;
                }
                if (!i1) {
                   Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
                }else if(p0.a.getParent() != k.q){
                   Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                }else if((s = k.s) != null){
                   s.recycle();
                }
                k.s = VelocityTracker.obtain();
                k.i = 0;
                k.h = 0;
                k.q(p0, 2);
             }
             return;
             break;
           case 6:
             tb.x.suppressLayout(1);
             p0.f = i1;
             return;
           case 7:
             tb.getClass();
             tb.A(p0.a, 1, 18);
             return;
           case 8:
             tb.getClass();
             tb.J.onNext(Boolean.valueOf(p0.a));
             a = p0.a;
             tb.x.suppressLayout(a);
             tb.P.f = a ^ 1;
             c = p0.c;
             if ((p0 = p0.b) != null) {
                tb.B(i2, p0);
                if (c != null) {
                   p0 = tb.T;
                   if ((c1 = c.c) != null) {
                      p0.b.clear();
                      p0.b.addAll(c1);
                      p0.w.onNext(do5.u0(c.o(p0.b)));
                   }else {
                      p0.getClass();
                   }
                }
             }else if(c != null){
                vs a1 = c.a;
                p0 = tb.T.b.get(a1);
                r = tb.T;
                r.getClass();
                c1 = c.b;
                if (a1 != c1 && (a1 >= null && c1 >= null)) {
                   if (a1 <= c1) {
                      Collections.rotate(r.b.subList(a1, (c1 + 1)), -1);
                   }else {
                      Collections.rotate(r.b.subList(c1, (a1 + 1)), 1);
                   }
                   r.w.onNext(do5.u0(c.o(r.b)));
                }
                i5 = (p0 instanceof TrackSimple)? 0x7f12011e: 0x7f12011a;
                tb.H.c(rv.a(i5).l());
             }
             return;
             break;
           default:
             tb.B(i2, p0);
             return;
       }
    }
}
