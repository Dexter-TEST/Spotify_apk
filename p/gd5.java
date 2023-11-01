package p.gd5;
import p.yf2;
import p.mp;
import java.lang.Object;
import p.ub5;
import p.na5;
import p.vp;
import java.lang.Class;
import p.oh0;
import com.spotify.login5.v3.challenges.proto.CodeSolution;
import java.lang.String;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.xs3;
import p.uu3;
import com.spotify.login5.v3.proto.LoginRequest;
import com.spotify.login5.v3.proto.ClientInfo;
import p.h;
import com.spotify.login5.v3.identifiers.proto.PhoneNumber;
import p.i80;
import p.pd0;
import com.spotify.login5.v3.proto.ChallengeSolutions;
import p.od0;
import com.spotify.login5.v3.proto.ChallengeSolution;
import p.bc3;
import com.spotify.login5.v3.proto.Challenges;
import java.util.Iterator;
import java.util.List;
import com.spotify.login5.v3.proto.Challenge;
import com.spotify.login5.v3.challenges.proto.HashcashChallenge;
import com.spotify.login5.v3.challenges.proto.HashcashSolution;
import p.ap5;
import java.lang.IllegalStateException;
import io.reactivex.rxjava3.core.Single;
import p.uf;
import io.reactivex.rxjava3.core.SingleTransformer;
import p.ab0;
import p.vc5;
import io.reactivex.rxjava3.core.Observable;
import p.ab5;
import p.y35;
import p.x35;
import com.spotify.login5.v3.credentials.proto.OneTimeToken;
import p.l01;
import java.util.Objects;
import p.sp;
import io.reactivex.rxjava3.core.Completable;

public final class gd5 implements yf2	// class@0016ea from classes.dex
{
    public final int a;
    public final mp b;

    public void gd5(mp p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       int i = 1;
       gd5 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.getClass();
             x35 ox35 = OneTimeToken.g();
             ox35.c(p0.I);
             vp d = tb.d;
             Objects.requireNonNull(d);
             return tb.b.a(new y35(ox35.build())).flatMap(new sp(d, i)).compose(new uf()).map(new ab0(15)).onErrorReturn(new ab0(16));
       }
       na5 a = p0.H.a;
       tb.getClass();
       oh0 ooh0 = CodeSolution.g();
       ooh0.c(p0.I);
       CodeSolution uCodeSolutio = ooh0.build();
       vp b = tb.b;
       b.getClass();
       uu3 ouu3 = LoginRequest.p();
       ouu3.d(b.b());
       ouu3.i(a.c);
       h a1 = a.a;
       ouu3.f(a1);
       pd0 opd0 = ChallengeSolutions.g();
       od0 ood0 = ChallengeSolution.h();
       h b1 = a.b;
       Iterator iterator = b1.f().iterator();
       while (true) {
          int i1 = 2;
          if (iterator.hasNext()) {
             Challenge uChallenge = iterator.next();
             if (uChallenge.f() == i1) {
                ood0.c(uCodeSolutio);
                opd0.c(ood0.build());
             }else if(uChallenge.f() == i){
                ood0.d(ap5.b(a1, uChallenge.h()));
                opd0.c(ood0.build());
             }else {
                break ;
             }
          }else {
             ouu3.c(opd0.build());
             return b.c(ouu3.build(), b1).compose(new uf()).onErrorReturn(new ab0(17)).flatMapObservable(new vc5(i1, p0));
          }
       }
       throw new IllegalStateException("Unexpected challenge from login5! I will die!");
    }
}
