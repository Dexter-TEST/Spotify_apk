package p.z44;
import java.lang.Object;
import p.y44;
import java.lang.ref.WeakReference;
import p.a54;
import p.x44;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.String;
import android.content.Intent;
import android.os.Build$VERSION;
import java.lang.ref.Reference;
import android.os.Parcelable;
import android.view.KeyEvent;
import p.k54;
import android.os.Message;
import android.view.ViewConfiguration;
import android.support.v4.media.RatingCompat;
import android.os.Looper;

public abstract class z44	// class@002e86 from classes.dex
{
    public final Object a;
    public final y44 b;
    public boolean c;
    public WeakReference d;
    public x44 e;

    public void z44(){
       super();
       this.a = new Object();
       this.b = new y44(this);
       this.d = new WeakReference(null);
    }
    public final void a(a54 p0,x44 p1){
       PlaybackStateCompat playbackStat;
       if (this.c == null) {
          return;
       }
       boolean b = false;
       this.c = b;
       p1.removeMessages(1);
       long l = ((playbackStat = p0.a()) == null)? 0: playbackStat.v;
       playbackStat = (playbackStat != null && playbackStat.a == 3)? 1: 0;
       int i = ((516 & l))? 1: 0;
       if ((l & 514)) {
          b = true;
       }
       if (playbackStat && b) {
          this.d();
       }else if(!playbackStat && i){
          this.e();
       }
       return;
    }
    public void b(String p0){
    }
    public final boolean c(Intent p0){
       KeyEvent parcelableEx;
       int keyCode;
       PlaybackStateCompat playbackStat;
       boolean b = false;
       if (Build$VERSION.SDK_INT >= 27) {
          return b;
       }
       z44 ta = this.a;
       _monitor_enter(ta);
       a54 uoa54 = this.d.get();
       z44 te = this.e;
       _monitor_exit(ta);
       if (uoa54 == null || (te == null || ((parcelableEx = p0.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || parcelableEx.getAction()))) {
          return b;
       }
       k54 ok54 = uoa54.k();
       if ((keyCode = parcelableEx.getKeyCode()) != 79 && keyCode != 85) {
          this.a(uoa54, te);
          return b;
       }else if(!parcelableEx.getRepeatCount()){
          if (this.c != null) {
             te.removeMessages(1);
             this.c = b;
             long l = ((playbackStat = uoa54.a()) == null)? 0: playbackStat.v;
             if ((l & 32)) {
                this.h();
             }
          }else {
             this.c = true;
             te.sendMessageDelayed(te.obtainMessage(1, ok54), (long)ViewConfiguration.getDoubleTapTimeout());
          }
       }else {
          this.a(uoa54, te);
       }
       return 1;
    }
    public void d(){
    }
    public void e(){
    }
    public void f(long p0){
    }
    public void g(RatingCompat p0){
    }
    public void h(){
    }
    public void i(){
    }
    public void j(){
    }
    public final void k(a54 p0,Handler p1){
       z44 ta = this.a;
       _monitor_enter(ta);
       this.d = new WeakReference(p0);
       z44 te = this.e;
       x44 ox44 = null;
       if (te != null) {
          te.removeCallbacksAndMessages(ox44);
       }
       if (p0 != null && p1 != null) {
          ox44 = new x44(this, p1.getLooper(), 0);
       }
       this.e = ox44;
       _monitor_exit(ta);
       return;
    }
}
