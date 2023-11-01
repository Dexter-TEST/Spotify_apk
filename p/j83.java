package p.j83;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.messaging.quicksilverliteintegration.DisplayOrchestrator;
import p.ae2;
import p.tj5;
import p.w12;
import java.lang.Object;
import p.g83;
import p.h83;
import java.lang.String;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.a;
import android.os.Handler;
import android.os.Looper;
import p.jg1;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import android.content.Context;
import android.view.View;
import p.sb4;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.f83;
import p.ir0;
import p.co3;
import p.tn6;
import p.ko1;
import p.rm;
import p.bi5;
import p.vc5;
import p.yf2;

public final class j83	// class@001a86 from classes.dex
{
    public Disposable a;
    public Disposable b;
    public final Observable c;
    public final DisplayOrchestrator d;
    public final o e;
    public final tj5 f;
    public final w12 g;
    public ViewGroup h;
    public ViewGroup i;
    public float j;
    public final g83 k;
    public final h83 l;

    public void j83(Observable p0,DisplayOrchestrator p1,ae2 p2,tj5 p3,w12 p4){
       super();
       this.k = new g83(this);
       this.l = new h83(this);
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
    }
    public static void a(j83 p0){
       Fragment uFragment;
       j83 e = p0.e;
       if ((uFragment = e.D("IN_APP_MESSAGING_BANNER_FRAGMENT_TAG")) != null) {
          a uoa = new a(e);
          uoa.j(uFragment);
          uoa.e(false);
       }
       new Handler(Looper.getMainLooper()).post(new jg1(8, p0));
       return;
    }
    public final void b(){
       j83 ta;
       if ((ta = this.a) != null && !ta.isDisposed()) {
          this.a.dispose();
       }
       if ((ta = this.b) != null && !ta.isDisposed()) {
          this.b.dispose();
       }
       if ((ta = this.h) != null) {
          j83 tf = this.f;
          tf.getClass();
          if (ta != null) {
             new Handler(ta.getContext().getMainLooper()).post(new jg1(7, ta));
             tj5 a = tf.a;
             if (a.d()) {
                a.g();
                a.b();
             }
          }
       }
       return;
    }
    public final void c(){
       if (this.h == null) {
          return;
       }
       this.b();
       this.a = this.c.observeOn(id.a()).subscribe(new f83(this, 0));
       j83 tg = this.g;
       this.b = tg.e.r(tg.i).filter(new rm(0)).flatMap(new vc5(18, this)).subscribe(new f83(this, 1));
       return;
    }
    public final void d(){
       Fragment uFragment;
       j83 te = this.e;
       if ((uFragment = te.D("IN_APP_MESSAGING_FULLSCREEN_FRAGMENT_TAG")) != null) {
          a uoa = new a(te);
          uoa.j(uFragment);
          uoa.e(false);
       }
       return;
    }
}
