package p.fd5;
import p.yf2;
import p.mp;
import p.zg0;
import java.lang.Object;
import p.db5;
import p.vp;
import java.lang.Class;
import p.ma5;
import com.spotify.login5.v3.identifiers.proto.PhoneNumber;
import java.lang.String;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.xs3;
import p.uu3;
import com.spotify.login5.v3.proto.LoginRequest;
import com.spotify.login5.v3.proto.ClientInfo;
import com.spotify.login5.v3.proto.Challenges;
import io.reactivex.rxjava3.core.Single;
import p.e16;
import p.uf;
import io.reactivex.rxjava3.core.SingleTransformer;
import p.ab0;
import p.c16;
import io.reactivex.rxjava3.core.Observable;
import p.eb5;
import p.h;
import p.i80;

public final class fd5 implements yf2	// class@0015a9 from classes.dex
{
    public final int a;
    public final mp b;
    public final zg0 c;

    public void fd5(mp p0,zg0 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object apply(Object p0){
       fd5 tc = this.c;
       Challenges uChallenges = null;
       fd5 tb = this.b;
       switch (this.a){
           case 0:
           default:
             eb5 h = p0.H;
             vp b1 = tb.b;
             b1.getClass();
             uu3 ouu31 = LoginRequest.p();
             ouu31.d(b1.b());
             ouu31.i(h.c);
             ouu31.f(h.a);
             return b1.c(ouu31.build(), uChallenges).compose(new uf()).onErrorReturn(new ab0(18)).flatMapObservable(new c16(p0, 17, tc));
       }
       tb.getClass();
       ma5 oma5 = PhoneNumber.j();
       oma5.d(p0.H);
       oma5.c(p0.I);
       oma5.e(p0.J);
       PhoneNumber phoneNumber = oma5.build();
       vp b = tb.b;
       b.getClass();
       uu3 ouu3 = LoginRequest.p();
       ouu3.d(b.b());
       ouu3.i(phoneNumber);
       Single single = b.c(ouu3.build(), uChallenges);
       return single.flatMap(new e16(1, tb)).compose(new uf()).onErrorReturn(new ab0(12)).flatMapObservable(new c16(p0, 16, tc));
    }
}
