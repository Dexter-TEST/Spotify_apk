package p.v05;
import p.ir0;
import java.lang.Object;
import com.spotify.login.signupapi.services.model.EmailSignupResponse;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import java.lang.Throwable;
import p.jl;
import io.reactivex.rxjava3.disposables.Disposable;
import p.p54;
import java.util.concurrent.atomic.AtomicInteger;
import p.or7;
import p.fn0;
import p.bo;
import android.os.Handler;
import p.co;
import p.ow0;
import p.gv0;
import p.oo;
import com.spotify.playback.playbacknative.AudioDriver$AudioDriverListener;
import com.spotify.playback.playbacknative.AudioDriver;
import p.a54;
import p.v44;
import p.u65;
import p.tv;
import p.eq3;
import java.lang.StringBuilder;
import com.spotify.connectivity.connectiontype.OfflineStateController;
import com.spotify.connectivity.connectiontype.OfflineState;
import com.spotify.login.signupapi.services.model.FacebookSignupResponse;

public final class v05 implements ir0	// class@002958 from classes.dex
{
    public final int a;

    public void v05(int p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       Object[] objArray;
       p54 b;
       p54 f;
       int i = 1;
       int i1 = 0;
       switch (this.a){
           case 0:
             OfflineStateController.b(p0);
             return;
           case 1:
             OfflineStateController.a(p0);
             return;
           case 2:
             p0.dispose();
             return;
           case 3:
             if (p0.g == null) {
                jl.p(p0+" is not mounted and unusable");
             }
             return;
             break;
           case 4:
             jl.f("Can\'t receive updates of ES configs.", p0);
             return;
           case 5:
             return;
           case 6:
             objArray = new Object[i1];
             Logger.c(p0, "Error in obtaining PlayerTrack", objArray);
             return;
           case 7:
             return;
           case 8:
             jl.p("Core login is taking more than 5s");
             return;
           case 9:
             jl.q("getCacheDir\(\)", p0);
             return;
           case 10:
             return;
           case 11:
             return;
           case 12:
             return;
           case 13:
             if (p0.g.decrementAndGet() <= 0) {
                if ((b = p0.b) != null) {
                   b.n(i1);
                   p0.h.e();
                   if ((f = p0.f) != null) {
                      bo b1 = f.b;
                      b1.removeCallbacksAndMessages(null);
                      f.c.abandonAudioFocus();
                      b1.removeCallbacksAndMessages(null);
                      p0.f = null;
                   }
                }
                bo uobo = p0;
                ow0 m = uobo.m;
                m.a();
                m.b.e();
                m = uobo.t;
                AudioDriver.removeListener(m.b);
                AudioDriver.removeListener(m.c);
                uobo.w.e();
                if (b != null) {
                   b.a.release();
                }
                if ((b = p0.c) != null) {
                   b.f.e();
                }
                p0.b = null;
                p0.c = null;
             }
             return;
             break;
           case 14:
             return;
           case 15:
             return;
           case 16:
             return;
           case 17:
             jl.f("Fails to logout", p0);
             return;
           case 18:
             objArray = new Object[i1];
             Logger.c(p0, "Failed to read page identifier", objArray);
             return;
           case 19:
             objArray = new Object[i1];
             Logger.c(p0, "Failed to process timer message", objArray);
             return;
           case 20:
             objArray = new Object[i];
             objArray[i1] = p0;
             Logger.b("Error validating email: %s", objArray);
             return;
           case 21:
             objArray = new Object[i];
             objArray[i1] = p0;
             Logger.b("Error validating password: %s", objArray);
             return;
           case 22:
             objArray = new Object[i];
             objArray[i1] = p0;
             Logger.e("Signup config: %s", objArray);
             return;
           case 23:
             objArray = new Object[i];
             objArray[i1] = p0;
             Logger.e("Signup response: %s", objArray);
             return;
           default:
             objArray = new Object[i];
             objArray[i1] = p0;
             Logger.e("Facebook Signup response: %s", objArray);
             return;
       }
    }
}
