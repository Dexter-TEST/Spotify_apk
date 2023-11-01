package p.ce7;
import p.w93;
import p.yx6;
import p.ly7;
import p.lo4;
import p.v90;
import java.lang.Object;
import p.c0;
import com.spotify.lite.database.room.UserRoomDatabase;
import p.m91;
import p.xy5;
import p.nr7;
import io.reactivex.rxjava3.core.Observable;
import p.n56;
import java.lang.Boolean;
import java.util.concurrent.ExecutorService;
import android.os.Handler;
import android.os.Looper;
import p.vq7;
import p.ta6;
import p.ex3;
import p.px3;
import p.ed;
import p.or7;
import java.lang.Integer;
import p.kb7;
import p.jb7;
import p.lb7;
import java.lang.String;
import java.util.ArrayList;
import p.u90;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import java.util.Locale;
import java.lang.Long;
import android.content.ClipDescription;
import p.c81;
import p.fw;
import p.dt;
import p.u16;
import java.lang.Class;
import p.ye7;
import p.qo5;
import p.r16;
import p.qe3;
import p.xv7;
import p.lz7;
import p.dx7;
import p.mz7;
import android.net.Uri;
import p.ss;
import java.lang.IllegalStateException;
import java.lang.Runnable;
import p.tp2;
import p.e15;
import p.p61;
import p.s90;
import android.widget.Scroller;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.lang.CharSequence;
import p.zl5;
import android.view.animation.Animation;

public final class ce7 implements w93, yx6, ly7, lo4, v90	// class@0011f2 from classes.dex
{
    public Object a;
    public Object b;
    public Object c;

    public void ce7(){
       super();
       c0 a = c0.a;
       this.b = a;
       this.c = a;
    }
    public void ce7(UserRoomDatabase p0){
       super();
       this.a = p0;
       this.b = new m91(this, p0, 17);
       this.c = new nr7(this, p0, 5);
    }
    public void ce7(Observable p0,n56 p1){
       super();
       this.a = p1;
       this.b = Observable.just(Boolean.TRUE);
       this.c = p0.distinctUntilChanged();
    }
    public void ce7(Object p0){
       super();
    }
    public void ce7(Object p0,Object p1,Object p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void ce7(ExecutorService p0){
       super();
       this.b = new Handler(Looper.getMainLooper());
       this.c = new vq7(0, this);
       this.a = new ta6(p0);
    }
    public void ce7(ex3 p0,px3 p1,ed p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void ce7(or7 p0,Integer p1){
       this.c = p0;
       super();
       lb7 this.a = p1;
       jb7 ojb7 = p0.b.b();
       this.a = new lb7("skeleton_view", null, null, this.a, null);
       ojb7.i.add(this.a);
       ojb7.j = true;
       this.b = ojb7.a();
    }
    public void ce7(u90 p0,Type p1,Executor p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public static String l(long p0){
       p0 = p0 / 1000;
       long l = p0 % 60;
       Object[] objArray = new Object[]{Long.valueOf((p0 / 60)),Long.valueOf(l)};
       return String.format(Locale.getDefault(), "%d:%02d", objArray);
    }
    public final ClipDescription a(){
       return this.b;
    }
    public final Object b(){
       ce7 ta = this.a;
       ce7 tb = this.b;
       ce7 tc = this.c;
       c81 d = ta.d;
       d.getClass();
       Object[] objArray = new Object[]{tb.c,tc.a,tb.a};
       ye7.C("SQLiteEventStore");
       String.format("Storing event with priority=%s, name=%s for destination %s", objArray);
       d.x(new qo5(d, tb, tc)).longValue();
       ta.a.a(tb, 1);
       return null;
    }
    public final Object c(){
       return new lz7(this.a.c(), this.b.c(), this.c.c());
    }
    public final Object d(){
       return null;
    }
    public final Uri e(){
       return this.a;
    }
    public final void f(){
    }
    public final Type g(){
       return this.a;
    }
    public final Uri h(){
       return this.c;
    }
    public final ss i(){
       String str = (this.a == null)? " name": "";
       if (this.b == null) {
          str = str.concat(" uri");
       }
       if (str.isEmpty()) {
          return new ss(this.a, this.b, this.c);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final void j(Runnable p0){
       this.a.execute(p0);
    }
    public final Object k(){
       tp2.v(this.a);
       throw null;
    }
    public final Object m(e15 p0){
       ce7 tb;
       if ((tb = this.b) == null) {
       }else {
          p61 op61 = new p61(tb, p0);
       }
       return p0;
    }
    public final void n(){
       View view;
       ce7 tb = this.b;
       if (tb != null) {
          tb.forceFinished(true);
       }
       if (this.a != null) {
          tb = this.c;
          if (tb != null && (view = tb.get()) != null) {
             view.removeCallbacks(this.a);
          }
       }
       return;
    }
    public final void o(boolean p0,int p1,int p2,float p3){
       ce7 tc = this.c;
       this.a.setMax(p1);
       if (tc != null) {
          tc.setText(ce7.l((long)p1));
       }
       tc = this.b;
       this.a.setProgress(p2);
       if (tc != null) {
          tc.setText(ce7.l((long)p2));
       }
       this.a.clearAnimation();
       if ((0 - p3) && (!p0 && p1 > p2)) {
          zl5 v6 = new zl5(this.a, this.b, p2, p1, p3);
          this.a.startAnimation(v6);
       }
       return;
    }
}
