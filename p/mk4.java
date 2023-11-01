package p.mk4;
import p.yf2;
import java.lang.Object;
import p.x55;
import p.f66;
import java.lang.Boolean;
import java.lang.String;
import p.g66;
import p.b96;
import p.sm;
import java.lang.CharSequence;
import p.vu2;
import p.cv2;
import java.lang.Class;
import p.av2;
import p.c1;
import java.lang.Integer;
import android.support.v4.media.session.PlaybackStateCompat;
import p.jj5;
import p.r45;
import android.support.v4.media.MediaMetadataCompat;
import p.do5;
import p.r44;
import p.y06;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.uw5;
import java.util.concurrent.TimeUnit;
import p.s36;
import p.mo;
import p.im4;
import java.util.Set;
import p.jm4;
import p.om4;
import p.tm4;
import p.bn4;
import p.rm4;
import p.jc7;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import p.an4;
import p.sm4;
import p.nm4;
import p.cn4;
import p.dn4;
import p.qm4;

public final class mk4 implements yf2	// class@001eb2 from classes.dex
{
    public final int a;

    public void mk4(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       x55 n = x55.N;
       int i = 1;
       switch (this.a){
           case 0:
             return new qm4(n);
           case 1:
             return new dn4(n);
           case 2:
             return new cn4(n);
           case 3:
             return new nm4(n);
           case 4:
             return new nm4(n);
           case 5:
             return new sm4(n);
           case 6:
             return new an4(n);
           case 7:
             return new rm4(p0);
           case 8:
             return new bn4(p0.intValue());
           case 9:
             p0 = (!p0.intValue())? Observable.timer(50, TimeUnit.MILLISECONDS, s36.b): Observable.empty();
             return p0;
             break;
           case 10:
             return new tm4(p0.intValue());
           case 11:
             return new om4(p0);
           case 12:
             return new jm4((p0.isEmpty() ^ i));
           case 13:
             return new im4(p0);
           case 14:
             p0 = (p0.a == 6)? Observable.timer(100, TimeUnit.MILLISECONDS, s36.b): Observable.empty();
             return p0;
             break;
           case 15:
             return Observable.create(new y06(p0, i)).subscribeOn(id.a());
           case 16:
             return uw5.r(p0);
           case 17:
             return Observable.create(new y06(p0, 2)).subscribeOn(id.a());
           case 18:
             return Observable.create(new y06(p0, 3)).subscribeOn(id.a());
           case 19:
             return Boolean.valueOf(do5.K(p0));
           case 20:
             return r45.d(p0);
           case 21:
             return r45.d(p0);
           case 22:
             int i1 = (p0.booleanValue())? 0x7f120055: 0x7f120056;
             return Integer.valueOf(i1);
             break;
           case 23:
             p0.getClass();
             return p0;
           case 24:
             p0.getClass();
             return p0;
           case 25:
             return p0.a;
           case 26:
             if (p0.b.length()) {
                i = false;
             }
             return Boolean.valueOf(i);
             break;
           case 27:
             return new g66(p0);
           case 28:
             return Boolean.valueOf(p0.m);
           default:
             return Boolean.valueOf(p0.m);
       }
    }
}
