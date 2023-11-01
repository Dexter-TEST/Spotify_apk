package p.sd5;
import p.yf2;
import java.lang.Object;
import p.ts1;
import p.rs1;
import p.sv;
import p.ot1;
import p.b43;
import p.ss1;
import p.zh1;
import p.st1;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import p.ai1;
import p.tt1;
import p.vu2;
import p.cv2;
import java.lang.Class;
import java.lang.Throwable;
import java.lang.String;
import p.jl;
import p.r45;
import p.aq6;
import p.au2;
import p.td7;
import p.jn1;
import p.cn1;
import p.dn1;
import p.av2;
import p.wu2;
import android.support.v4.media.MediaMetadataCompat;
import p.ox7;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.Integer;
import p.tj;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.spotify.litesignup.phonesignup.view.PhoneNumberView;
import p.xa0;
import p.d37;
import p.wa0;
import p.jc7;
import p.gt1;

public final class sd5 implements yf2	// class@00260a from classes.dex
{
    public final int a;

    public void sd5(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       switch (this.a){
           case 0:
             return new wa0();
           case 1:
             return new wa0();
           case 2:
             return new xa0(p0.toString());
           case 3:
             return ox7.s(p0);
           case 4:
             return Integer.valueOf(1);
           case 5:
             return Boolean.TRUE;
           case 6:
             return Integer.valueOf(p0.a);
           case 7:
             return r45.a(ox7.o(p0, "spotify.media.metadata.TRACK_UID"));
           case 8:
             return r45.a(ox7.h(p0));
           case 9:
             p0.getClass();
             return p0;
           case 10:
             return p0.a;
           case 11:
             p0.getClass();
             return p0;
           case 12:
             return p0.a;
           case 13:
             p0.getClass();
             return p0;
           case 14:
             p0.getClass();
             return p0;
           case 15:
             p0.getClass();
             return p0;
           case 16:
             return r45.a(td7.d(p0.b().q("context_uri")));
           case 17:
             return p0.b();
           case 18:
             jl.f("Error fetching offline resources", p0);
             return Observable.empty();
           case 19:
             jl.f("Error determining offline capabilities", p0);
             return Observable.empty();
           case 20:
             p0.getClass();
             return p0;
           case 21:
             return p0.a;
           case 22:
             return Observable.just(new tt1()).delay(p0.F, TimeUnit.MILLISECONDS);
           case 23:
             return Observable.just(new st1()).delay(p0.F, TimeUnit.MILLISECONDS);
           case 24:
             return new ss1(p0);
           case 25:
             return new ot1(p0);
           case 26:
             return new rs1(p0);
           case 27:
             return new rs1(p0);
           case 28:
             return new ts1(p0);
           default:
             return new gt1(p0.booleanValue());
       }
    }
}
