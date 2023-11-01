package p.lk4;
import p.ir0;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import java.lang.Object;
import java.lang.Boolean;
import com.spotify.litelyrics.lyrics.widget.LyricsWidgetPresenter;
import p.t00;
import p.cu;
import java.lang.Class;
import p.qk4;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import java.lang.String;
import android.content.Context;
import p.mo;
import p.r45;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import p.au;
import p.fh5;
import android.animation.Animator;
import android.graphics.drawable.ColorDrawable;
import android.animation.ArgbEvaluator;
import java.lang.Integer;
import android.animation.TypeEvaluator;
import android.animation.ObjectAnimator;
import com.spotify.legacyglue.icons.SpotifyIconView;
import p.sp6;
import android.content.res.ColorStateList;
import p.n6;
import com.spotify.litecomponents.nowplayingwidgets.RepeatButton;
import com.spotify.litecomponents.nowplayingwidgets.ShuffleButton;
import android.widget.SeekBar;
import android.widget.ProgressBar;
import p.ic;
import android.os.SystemClock;
import p.ce7;
import p.tk7;
import p.vk7;
import p.ll4;
import java.util.Iterator;
import java.util.HashSet;
import p.nn4;

public final class lk4 implements ir0	// class@001d6f from classes.dex
{
    public final int a;
    public final NowPlayingActivity b;

    public void lk4(NowPlayingActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       fh5 c;
       cu q;
       lk4 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             cu b = p0.b;
             tb.j0.p.setText(b);
             qk4 p = tb.j0.p;
             int i = 8;
             int i1 = 0;
             int i2 = (TextUtils.isEmpty(b))? 8: 0;
             p.setVisibility(i2);
             String str = ((b = p0.c) != null)? tb.getString(b): "";
             tb.j0.q.setText(str);
             p = tb.j0.q;
             i2 = (TextUtils.isEmpty(str))? 8: 0;
             p.setVisibility(i2);
             tb.j0.v.setText(p0.e);
             tb.j0.u.setText(p0.g);
             int i3 = 1;
             Object[] objArray = new Object[i3];
             objArray[i1] = tb.getString(p0.I.a);
             tb.j0.t.setText(tb.getString(R.string.player_playback_quality_label, objArray));
             b = p0.n;
             if (b.c()) {
                tb.j0.w.setImageBitmap(b.b());
             }else {
                tb.j0.w.setImageDrawable(tb.m0);
             }
             au uoau = p0.o.e(NowPlayingActivity.p0);
             NowPlayingActivity l0 = tb.l0;
             au a = uoau.a;
             if ((c = l0.c) != null) {
                c.cancel();
                l0.c = null;
             }
             if (l0.b.getBackground() instanceof ColorDrawable) {
                int color = l0.b.getBackground().getColor();
                if (a != color) {
                   Object[] objArray1 = new Object[]{Integer.valueOf(color),Integer.valueOf(a)};
                   ObjectAnimator objectAnimat = ObjectAnimator.ofObject(l0.b, "backgroundColor", new ArgbEvaluator(), objArray1);
                   l0.c = objectAnimat;
                   objectAnimat.setDuration(1000);
                   l0.c.start();
                }
             }else {
                l0.b.setBackgroundColor(a);
             }
             tb.j0.v.setTextColor(uoau.b);
             uoau = uoau.c;
             tb.j0.u.setTextColor(uoau);
             tb.j0.t.setTextColor(uoau);
             tb.j0.s.setTextColor(uoau);
             tb.j0.r.setTextColor(uoau);
             qk4 h = tb.j0.h;
             sp6 x = ((q = p0.q) != null)? sp6.X: sp6.Y;
             h.setIcon(x);
             tb.j0.h.setEnabled(p0.x);
             i2 = (p0.A != null)? 0x7f0507cb: 0x7f0507ca;
             tb.j0.g.setColorStateList(n6.c(tb, i2));
             tb.j0.i.setEnabled(p0.z);
             cu u = p0.u;
             tb.j0.e.setSelected(u);
             h = tb.j0.e;
             sp6 q1 = (u != null)? sp6.Q: sp6.P;
             h.setIcon(q1);
             cu f = p0.F;
             tb.j0.e.setEnabled(f);
             tb.j0.f.setSelected(u);
             h = tb.j0.f;
             x = (u != null)? sp6.Q: sp6.P;
             h.setIcon(x);
             tb.j0.f.setEnabled(f);
             tb.j0.l.setSelected(p0.s);
             h = tb.j0.l;
             boolean b1 = (p0.D == null && p0.E == null)? false: true;
             h.setEnabled(b1);
             tb.j0.l.setRepeatMode(p0.H);
             h = tb.j0.m;
             u = p0.r;
             int b2 = ((f = p0.C) != null && u != null)? true: false;
             h.setSelected(b2);
             tb.j0.m.setEnabled(f);
             h = tb.j0.m;
             b1 = (f != null && u != null)? true: false;
             h.setIsShuffling(b1);
             tb.j0.w.setClickable((TextUtils.isEmpty(p0.i) ^ i3));
             b = p0.v;
             u = p0.w;
             if (b == null && u == null) {
                i3 = 0;
             }
             qk4 e = tb.j0.e;
             int i4 = (i3)? 8: 0;
             e.setVisibility(i4);
             e = tb.j0.f;
             i4 = (i3)? 8: 0;
             e.setVisibility(i4);
             e = tb.j0.i;
             i4 = (i3)? 8: 0;
             e.setVisibility(i4);
             e = tb.j0.g;
             i4 = (i3)? 8: 0;
             e.setVisibility(i4);
             e = tb.j0.l;
             i4 = (i3)? 8: 0;
             e.setVisibility(i4);
             e = tb.j0.m;
             i3 = (i3)? 8: 0;
             e.setVisibility(i3);
             qk4 d = tb.j0.d;
             b2 = (b != null)? 8: 0;
             d.setVisibility(b2);
             d = tb.j0.j;
             b2 = (u != null)? 0: 8;
             d.setVisibility(b2);
             d = tb.j0.k;
             b2 = (u != null)? 0: 8;
             d.setVisibility(b2);
             if (b == null && u == null) {
                h = tb.j0.m;
                i3 = (f != null)? 0: 8;
                h.setVisibility(i3);
                h = tb.j0.f;
                i3 = (f != null)? 0: 8;
                h.setVisibility(i3);
                h = tb.j0.e;
                i3 = (f != null)? 8: 0;
                h.setVisibility(i3);
             }
             h = tb.j0.t;
             i3 = (p0.G != null)? 0: 8;
             h.setVisibility(i3);
             tb.j0.A.setEnabled(p0.y);
             if (p0.t != null) {
                tb.j0.b.setVisibility(i1);
             }else {
                tb.j0.b.setVisibility(i);
             }
             i2 = (int)p0.j;
             cu l = p0.l;
             if (q != null) {
                d = 0;
                cu m = p0.m;
                if (m - d) {
                   tb.W.getClass();
                   long l1 = SystemClock.elapsedRealtime() - m;
                   if ((l1 - d) > 0 && (l1 - 0x7fffffff) < 0) {
                      i1 = (int)((float)l1 * l);
                   }
                }
             }
             tb.k0.o(p0.p, i2, ((int)p0.k + i1), l);
             NowPlayingActivity n0 = tb.n0;
             q = p0.d;
             if (n0 == null || !n0.a.equals(q)) {
                if ((n0 = tb.n0) != null) {
                   tb.V.j(n0);
                }
                if (!TextUtils.isEmpty(q)) {
                   tk7 otk7 = new tk7(q);
                   tb.n0 = otk7;
                   tb.V.i(otk7);
                }else {
                   tb.n0 = null;
                }
                if ((n0 = tb.d0) != null) {
                   n0.M = tb.n0;
                }
             }
             Iterator iterator = tb.o0.iterator();
             while (iterator.hasNext()) {
                iterator.next().g(p0);
             }
             return;
             break;
           case 1:
           default:
             tb.d0.P.onNext(Boolean.valueOf(p0.booleanValue()));
             return;
       }
       tb.d0.O.onNext(Boolean.valueOf(p0.booleanValue()));
       return;
    }
}
