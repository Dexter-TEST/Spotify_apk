package p.jw0;
import p.yf2;
import java.lang.Object;
import p.x55;
import p.r96;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import p.wm4;
import p.jc7;
import p.mm4;
import p.zm4;
import p.pm4;
import p.fn4;
import p.hn4;
import p.ln4;
import p.in4;
import p.vk4;
import p.ys1;
import p.rt1;
import p.ht1;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.concurrent.TimeUnit;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observable;
import java.lang.String;
import p.vs1;
import android.support.v4.media.MediaMetadataCompat;
import p.zs1;
import p.it1;
import java.util.Map;
import p.a25;
import p.r45;
import p.av3;
import java.lang.Class;
import p.xu3;
import p.wv0;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import p.tv;
import p.jj5;
import p.jw;
import p.co5;
import com.spotify.playerlimited.player.models.LoginRequest;
import com.spotify.playerlimited.player.models.LoginCredentials;
import p.ay;
import p.oe0;
import java.nio.charset.Charset;
import java.lang.Throwable;
import p.cl0;
import p.wu;
import p.nt0;
import p.ur;
import p.aq6;
import p.td7;
import p.mo;
import p.g20;
import p.ry7;
import com.spotify.playerlimited.player.models.GaiaState;
import p.ko6;
import p.xe7;
import com.spotify.playerlimited.player.models.ConnectDevice;
import com.spotify.clientfoundations.cosmos.cosmos.Response;
import java.lang.Integer;
import p.ow0;
import p.s96;
import android.widget.ProgressBar;
import p.xm4;

public final class jw0 implements yf2	// class@001b57 from classes.dex
{
    public final int a;

    public void jw0(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       GaiaState e;
       x55 n = x55.N;
       int i = 0;
       int i1 = 1;
       switch (this.a){
           case 0:
             p0 = (p0.booleanValue())? ow0.G: ow0.H;
             return p0;
             break;
           case 1:
             return p0.get("error");
           case 2:
             return p0.get("type");
           case 3:
             return Integer.valueOf(p0.getStatus());
           case 4:
             if ((e = p0.e) != null) {
                if (!e.length) {
                   i = 1;
                }
                if ((i ^ 0x01)) {
                   ko6 oko6 = xe7.D(e);
                   while (true) {
                      if (oko6.hasNext()) {
                         ConnectDevice uConnectDevi = oko6.next();
                         if (uConnectDevi.a != null) {
                            p0 = uConnectDevi.b;
                            break ;
                         }
                      }
                   }
                   return Boolean.valueOf((p0 ^ i1));
                }
             }
             p0 = p0.d;
             break;
           case 5:
             return ry7.t(p0);
           case 6:
             return ry7.t(p0);
           case 7:
             p0 = ((p0 = p0.g.f()) == null)? null: p0.a;
             return r45.a(td7.d(p0));
             break;
           case 8:
             return cl0.a;
           case 9:
             jw a = p0.a;
             co5.o(a, "username");
             p0 = p0.b;
             co5.o(p0, "credentials");
             LoginRequest loginRequest = new LoginRequest();
             LoginCredentials loginCredent = new LoginCredentials();
             loginCredent.a = "storedSpotifyCredentials";
             loginCredent.b = a;
             loginCredent.c = new String(ay.d.a(p0), oe0.a);
             loginRequest.a = loginCredent;
             return loginRequest;
           case 10:
             return r45.d(p0);
           case 11:
             p0.getClass();
             if (p0 instanceof xu3) {
                p0 = p0.a;
                if (p0 instanceof wv0) {
                   int i2 = (p0.a == 401 && TextUtils.equals("login_region_mismatch", p0.b.get("message")))? 1: 0;
                   if (i2) {
                      i = true;
                   }
                }
             }
             return Boolean.valueOf(i);
             break;
           case 12:
             return r45.a(p0.get("on-demand-trial"));
           case 13:
             return new it1(p0);
           case 14:
             return new zs1(p0);
           case 15:
             return new vs1(p0);
           case 16:
             if ((p0 = p0.a) == 6) {
                p0 = Observable.timer(100, TimeUnit.MILLISECONDS, s36.b);
             }else {
                switch (p0){
                    case 8:
                    case 10:
                    case 11:
                    case 9:
                      i = 1;
                      break;
                    default:
                }
                p0 = (i)? Observable.timer(300, TimeUnit.MILLISECONDS, s36.b): Observable.empty();
             }
             return p0;
             break;
           case 17:
             return new ht1();
           case 18:
             return new rt1();
           case 19:
             return new ys1();
           case 20:
             return new in4();
           case 21:
             return new in4();
           case 22:
             return new ln4(n);
           case 23:
             return new hn4(n);
           case 24:
             return new fn4();
           case 25:
             return new pm4();
           case 26:
             return new zm4();
           case 27:
             return new mm4();
           case 28:
             return new wm4();
           default:
             return new xm4(p0.A.getProgress());
       }
    }
}
