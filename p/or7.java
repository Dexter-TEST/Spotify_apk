package p.or7;
import p.zb0;
import p.ly7;
import p.lo4;
import p.h25;
import java.lang.Object;
import p.c0;
import java.util.LinkedHashMap;
import android.content.Context;
import java.lang.String;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.ComponentName;
import p.b51;
import android.content.Intent;
import android.os.Build$VERSION;
import android.app.PendingIntent;
import p.e54;
import p.d54;
import p.c54;
import p.b54;
import android.os.Handler;
import android.os.Looper;
import p.w44;
import p.a54;
import p.z44;
import p.r44;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.lang.IllegalArgumentException;
import p.b28;
import p.eb4;
import java.lang.Integer;
import p.jb7;
import p.kb7;
import p.lb7;
import p.g63;
import p.gy6;
import p.n;
import p.c73;
import p.jk3;
import p.us;
import java.lang.Boolean;
import p.wb4;
import p.ob1;
import p.nb4;
import java.lang.Class;
import p.wl6;
import p.ul6;
import p.xy5;
import p.m91;
import p.nr7;
import p.ff1;
import java.lang.StringBuilder;
import android.os.Bundle;
import java.lang.ClassLoader;
import p.n63;
import java.lang.Throwable;
import p.to1;
import p.sn4;
import p.a81;
import android.graphics.drawable.Drawable;
import p.p;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.os.SystemClock;
import android.os.BaseBundle;
import java.util.Collection;
import android.graphics.Bitmap$Config;
import p.p3;
import coil.target.GenericViewTarget;
import android.widget.ImageView;
import android.view.View;
import android.util.Log;
import p.dt0;
import p.ct0;
import java.util.concurrent.TimeUnit;
import p.vl6;
import p.m73;
import java.lang.Long;
import p.jl;
import p.x37;
import p.ic;
import p.am0;
import p.un2;
import java.lang.Runnable;
import p.t00;
import io.reactivex.rxjava3.core.Observable;
import p.yl6;
import p.vs3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fn0;
import p.lf5;
import p.rp;
import p.bi5;
import io.reactivex.rxjava3.core.Scheduler;
import p.ft6;
import p.v05;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import p.i77;
import p.rv;
import p.ym6;
import java.lang.IllegalStateException;
import p.hy7;
import p.jy7;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import p.i28;
import p.tu6;
import p.gv;
import java.util.Set;
import p.kg4;
import p.zy5;
import android.database.Cursor;
import p.vv7;
import p.tp2;
import java.util.List;
import java.util.Map;
import p.co5;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import p.vv1;
import p.dj0;
import p.fl6;
import p.u45;
import p.r;
import p.uk;
import p.uw5;
import p.jb1;
import android.graphics.ColorSpace;
import p.mp2;
import p.zz6;
import p.n75;
import android.animation.Animator;
import androidx.fragment.app.o;
import androidx.fragment.app.v;
import java.util.Objects;
import java.util.Map$Entry;
import java.lang.Number;
import p.jv1;

public final class or7 implements zb0, ly7, lo4, h25	// class@002179 from classes.dex
{
    public Object a;
    public Object b;
    public Object c;
    public static int t;

    public void or7(){
       super();
    }
    public void or7(int p0){
       if (p0 != 8) {
          if (p0 != 14) {
             super();
             return;
          }else {
             super();
             c0 a = c0.a;
             this.a = a;
             this.b = a;
             this.c = a;
             return;
          }
       }else {
          super();
          this.a = new LinkedHashMap();
          this.b = new LinkedHashMap();
          this.c = new LinkedHashMap();
          return;
       }
    }
    public void or7(Context p0,String p1){
       ComponentName uComponentNa;
       PendingIntent broadcast;
       int sDK_INT;
       super();
       this.c = new ArrayList();
       if (p0 == null) {
          throw new IllegalArgumentException("context must not be null");
       }
       if (TextUtils.isEmpty(p1)) {
          throw new IllegalArgumentException("tag must not be null or empty");
       }
       if ((uComponentNa = b51.b(p0)) != null) {
          Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
          intent.setComponent(uComponentNa);
          int i = (Build$VERSION.SDK_INT >= 31)? 0x2000000: 0;
          broadcast = PendingIntent.getBroadcast(p0, 0, intent, i);
       }else {
          broadcast = null;
       }
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 29) {
          this.a = new e54(p0, p1);
       }else if(sDK_INT >= 28){
          this.a = new d54(p0, p1);
       }else if(sDK_INT >= 22){
          this.a = new c54(p0, p1);
       }else {
          this.a = new b54(p0, p1);
       }
       Looper looper = (Looper.myLooper() != null)? Looper.myLooper(): Looper.getMainLooper();
       this.a.e(new w44(), new Handler(looper));
       this.a.j(broadcast);
       this.b = new r44(p0, this);
       if (!or7.t) {
          or7.t = (int)(TypedValue.applyDimension(1, 320.00f, p0.getResources().getDisplayMetrics()) + 0x3f000000);
       }
       return;
    }
    public void or7(Object p0,Object p1,Object p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void or7(b28 p0,ly7 p1,ly7 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void or7(eb4 p0,Integer p1){
       this.c = p0;
       super();
       lb7 this.a = p1;
       jb7 ojb7 = p0.b.b();
       this.a = new lb7("squircle_section", null, null, this.a, null);
       ojb7.i.add(this.a);
       ojb7.j = true;
       this.b = ojb7.a();
    }
    public void or7(g63 p0,gy6 p1){
       c73 uoc73;
       super();
       this.a = p0;
       this.b = p1;
       boolean sDK_INT = Build$VERSION.SDK_INT;
       int i = 26;
       if (sDK_INT >= i) {
          if (n.a) {
          label_0028 :
             uoc73 = new c73(false);
          }else if(sDK_INT != i && sDK_INT != 27){
             uoc73 = new c73(true);
          }else {
             uoc73 = new jk3();
          }
       }else {
          sDK_INT = n.a;
          goto label_0028 ;
       }
       this.c = uoc73;
       return;
    }
    public void or7(us p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = Boolean.valueOf(p0.c);
    }
    public void or7(wb4 p0,ob1 p1,nb4 p2){
       super();
       p0.getClass();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void or7(wl6 p0,String p1,ul6 p2){
       super();
       this.b = p0;
       this.a = p1;
       this.c = p2;
    }
    public void or7(xy5 p0){
       super();
       this.a = p0;
       this.b = new m91(this, p0, 6);
       this.c = new nr7(this, p0, 0);
    }
    public static String e(ff1 p0){
       return p0.a+'_'+p0.d;
    }
    public static void f(Bundle p0){
       if (p0 != null) {
          p0.setClassLoader(or7.class.getClassLoader());
       }
       return;
    }
    public static to1 g(n63 p0,Throwable p1){
       Drawable uDrawable;
       if (p1 instanceof sn4) {
          if ((uDrawable = p.b(p0, p0.K, p0.J, p0.M.l)) == null) {
             uDrawable = p.b(p0, p0.I, p0.H, p0.M.k);
          }
       }else {
          uDrawable = p.b(p0, p0.I, p0.H, p0.M.k);
       }
       return new to1(uDrawable, p0, p1);
    }
    public static PlaybackStateCompat h(PlaybackStateCompat p0,MediaMetadataCompat p1){
       PlaybackStateCompat a;
       long l3;
       PlaybackStateCompat playbackStat = p0;
       MediaMetadataCompat mediaMetadat = p1;
       if (playbackStat) {
          int i = -1;
          PlaybackStateCompat b = playbackStat.b;
          if ((b - i) && ((a = playbackStat.a) == 3 || (a == 4 || a == 5))) {
             long l = 0;
             PlaybackStateCompat y = playbackStat.y;
             if ((y - l) > 0) {
                long l1 = SystemClock.elapsedRealtime();
                long l2 = (long)(playbackStat.t * (float)(l1 - y)) + b;
                if (mediaMetadat) {
                   mediaMetadat = mediaMetadat.a;
                   String str = "android.media.metadata.DURATION";
                   if (mediaMetadat.containsKey(str)) {
                      i = mediaMetadat.getLong(str, l);
                   }
                }
                if ((i - l) >= 0 && (l2 - i) > 0) {
                   l3 = i;
                }else if((l2 - l) < 0){
                   l3 = l;
                }else {
                   l3 = l2;
                }
                ArrayList uArrayList = new ArrayList();
                PlaybackStateCompat c = playbackStat.c;
                b = playbackStat.v;
                PlaybackStateCompat w = playbackStat.w;
                a = playbackStat.x;
                if ((y = playbackStat.z) != null) {
                   uArrayList.addAll(y);
                }
                playbackStat = new PlaybackStateCompat(playbackStat.a, l3, c, playbackStat.t, b, w, a, l1, uArrayList, playbackStat.A, playbackStat.B);
             }
          }
       }
       return playbackStat;
    }
    public static boolean j(n63 p0,Bitmap$Config p1){
       int i = (Build$VERSION.SDK_INT >= 26 && p1 == p3.D())? 1: 0;
       if (!i) {
          return true;
       }else if(p0.q == null){
          return false;
       }else {
          p0 = p0.c;
          if (p0 instanceof GenericViewTarget) {
             ImageView imageView = p0.f();
             imageView = (imageView.isAttachedToWindow() && !imageView.isHardwareAccelerated())? 1: 0;
             if (imageView) {
                return false;
             }
          }
          return true;
       }
    }
    public static Bundle p(Bundle p0){
       if (p0 == null) {
          return null;
       }
       try{
          or7.f(p0);
          p0.isEmpty();
          return p0;
       }catch(android.os.BadParcelableException e0){
          Log.e("MediaSessionCompat", "Could not unparcel the data.");
          return e0;
       }
    }
    public final void a(dt0 p0){
       ct0 a;
       or7 tc;
       wl6 b2;
       long l;
       int i = 0x7f0a0484;
       if ((a = p0.a().a) == i) {
          this.b.a();
       }else {
          boolean b = true;
          boolean b1 = false;
          if (a != 0x7f0a0482 && a != 0x7f0a0483) {
             tc = this.b;
             TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
             m73 c1 = vl6.c;
             if (c1.containsKey(Integer.valueOf(a))) {
                l = c1.get(Integer.valueOf(a)).longValue();
             }else {
                jl.d("If a new entry was added to the menu, make sure to add its value on ID_TO_SLEEP_TIMER_VALUE_MAP");
                l = -1;
             }
             tc.a();
             b2 = tc.a;
             if ((l) < 0) {
                b2.getClass();
             }else if(b2.d != null){
                b = false;
             }
             if (b) {
                b2.a();
             }
             b2.e = mILLISECONDS.convert(l, mILLISECONDS);
             b2.a.getClass();
             b2.f = SystemClock.elapsedRealtime();
             am0 b3 = new am0(25, b2);
             x37 b4 = b2.b;
             b4.getClass();
             Handler handler = new Handler();
             b4.a = handler;
             handler.postDelayed(b3, Long.valueOf(b2.e).longValue());
             b2.d = b3;
             b2.g.onNext(Boolean.TRUE);
             b2.h.c(b2.c.a().subscribe(new vs3(14, b2)));
          }else {
             tc = this.b;
             tc.a();
             b2 = tc.b;
             b2.f = b1;
             b2.e = b1;
             b2.c.e();
             b2.g.onNext(Boolean.TRUE);
             b2.f = b;
             lf5 c = b2.c;
             c.c(b2.b.distinctUntilChanged().filter(new rp(4)).observeOn(b2.a).subscribe(new ft6(b2, 2, this.a), new v05(6)));
             c.c(b2.h.a().subscribe(new vs3(13, b2)));
          }
       }
       if ((tc = this.c) != null) {
          if (a == i) {
             tc.getClass();
             tc.c0.c(rv.a(R.string.context_menu_sleep_timer_turn_off_message).l());
          }else {
             tc.getClass();
             tc.c0.c(rv.a(R.string.context_menu_sleep_timer_select_message).l());
          }
       }
       return;
    }
    public final us b(){
       String str = (this.c == null)? " enableReorder": "";
       if (str.isEmpty()) {
          return new us(this.a, this.b, this.c.booleanValue());
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final Object c(){
       ApplicationInfo metaData;
       Context uContext = this.a.a();
       hy7 ohy7 = jy7.a(this.b);
       hy7 ohy71 = jy7.a(this.c);
       try{
          int i = 0;
          if ((metaData = uContext.getPackageManager().getApplicationInfo(uContext.getPackageName(), 128).metaData) != null) {
             String str = metaData.getString("local_testing_dir");
          }
          i28 oi28 = (i == null)? ohy7.c(): ohy71.c();
          tu6.E(oi28);
          return oi28;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
    }
    public final gv d(){
       String str = (this.a == null)? " delta": "";
       if (this.b == null) {
          str = str.concat(" maxAllowedDelay");
       }
       if (this.c == null) {
          str = kg4.l(str, " flags");
       }
       if (str.isEmpty()) {
          gv str1 = new gv(this.a.longValue(), this.b.longValue(), this.c);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final ArrayList i(String p0){
       int i = 1;
       zy5 ozy5 = zy5.x(i, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
       if (p0 == null) {
          ozy5.z(i);
       }else {
          ozy5.s(i, p0);
       }
       this.a.b();
       Cursor uCursor = vv7.J(this.a, ozy5, false);
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          String str = (uCursor.isNull(false))? null: uCursor.getString(false);
          uArrayList.add(str);
       }
       uCursor.close();
       ozy5.y();
       return uArrayList;
    }
    public final Object k(){
       tp2.v(this.a);
       throw null;
    }
    public final boolean l(List p0,Map p1,List p2){
       co5.o(p0, "lastStatsEvents");
       co5.o(p1, "lastRateLimitedEvents");
       co5.o(p2, "lastEventStatesCounters");
       int i = 1;
       if (!this.a.isEmpty() || !((p0.isEmpty() ^ i))) {
          if ((p0.isEmpty() ^ i)) {
             ArrayList uArrayList = new ArrayList(aj0.b0(p0));
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().a);
             }
             if (dj0.F0(uArrayList).containsAll(this.a.keySet()) && p1.keySet().containsAll(this.b.keySet())) {
                ArrayList uArrayList1 = new ArrayList(aj0.b0(p2));
                Iterator iterator1 = p2.iterator();
                while (iterator1.hasNext()) {
                   uArrayList1.add(or7.e(iterator1.next()));
                }
                if (!dj0.F0(uArrayList1).containsAll(this.c.keySet())) {
                }
             }else {
             }
          }else {
          }
       }
       return i;
    }
    public final u45 m(n63 p0,fl6 p1){
       or7 oor7 = this;
       n63 on63 = p0;
       fl6 uofl6 = p1;
       n63 g = (!on63.l.isEmpty() && !uk.i0(r.a, on63.g))? 0: 1;
       if (i) {
          int i = (or7.j(on63, on63.g) && oor7.c.a(uofl6))? 1: 0;
          if (i) {
             i = 1;
          label_003a :
             g = (i)? on63.g: Bitmap$Config.ARGB_8888;
             n63 on631 = g;
             n63 on632 = (oor7.b.t != null)? on63.v: 4;
             boolean b = (on63.r != null && (on63.l.isEmpty() && on631 != Bitmap$Config.ALPHA_8))? true: false;
             jb1 h = jb1.H;
             int i1 = (!co5.c(uofl6.a, h) && !co5.c(uofl6.b, h))? on63.C: 2;
             u45 v17 = new u45(on63.a, on631, on63.h, p1, i1, p.a(p0), b, on63.s, on63.f, on63.n, on63.o, on63.D, on63.t, on63.u, on632);
             return v17;
          }
       }
       g = 0;
       goto label_003a ;
    }
    public final void n(boolean p0){
       this.a.setActive(p0);
       Iterator iterator = this.c.iterator();
       if (!iterator.hasNext()) {
          return;
       }
       tp2.v(iterator.next());
       throw null;
    }
    public final void o(MediaMetadataCompat p0){
       this.a.i(p0);
    }
    public final void onCancel(){
       this.a.end();
       if (o.I(2)) {
          Objects.toString(this.b);
       }
       return;
    }
    public final void q(List p0,Map p1,List p2){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          vv1 ovv1 = iterator.next();
          this.a.put(ovv1.a, ovv1);
       }
       iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          this.b.put(key, Integer.valueOf(uEntry.getValue().intValue()));
       }
       iterator = p2.iterator();
       while (iterator.hasNext()) {
          ff1 uoff1 = iterator.next();
          this.c.put(or7.e(uoff1), new jv1(uoff1.b, uoff1.c));
       }
       return;
    }
}
