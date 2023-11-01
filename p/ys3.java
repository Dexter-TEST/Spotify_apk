package p.ys3;
import p.ay;
import com.spotify.login5.v3.proto.LoginResponse;
import p.xp;
import com.spotify.login5.v3.proto.LoginOk;
import java.lang.String;
import p.i80;
import com.spotify.login5.v3.proto.LoginRequest;
import p.pd0;
import com.spotify.login5.v3.proto.ChallengeSolutions;
import p.od0;
import com.spotify.login5.v3.proto.ChallengeSolution;
import com.spotify.login5.v3.proto.Challenges;
import p.bc3;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import com.spotify.login5.v3.proto.Challenge;
import com.spotify.login5.v3.challenges.proto.HashcashChallenge;
import com.spotify.login5.v3.challenges.proto.HashcashSolution;
import p.ap5;
import com.google.protobuf.c;
import com.google.protobuf.b;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.AssertionError;
import p.uu3;

public abstract class ys3	// class@002e1a from classes.dex
{
    public static final yx a;

    static {
       ys3.a = ay.d;
    }
    public static xp a(LoginResponse p0){
       return new xp(p0.j().f(), p0.j().getUsername(), ys3.a.c(p0.j().h().p()));
    }
    public static LoginRequest b(LoginRequest p0,LoginResponse p1){
       Challenge uChallenge;
       pd0 opd0 = ChallengeSolutions.g();
       od0 ood0 = ChallengeSolution.h();
       Iterator iterator = p1.f().f().iterator();
       while (true) {
          if (iterator.hasNext()) {
             uChallenge = iterator.next();
             if (uChallenge.f() == 2) {
                throw new AssertionError("Cannot solve "+uChallenge);
             }
             if (uChallenge.f() == 1) {
                ood0.d(ap5.b(p1.i(), uChallenge.h()));
                opd0.c(ood0.build());
             }else {
                break ;
             }
          }else {
             uu3 ouu3 = p0.toBuilder();
             ouu3.c(opd0.build());
             ouu3.f(p1.i());
             return ouu3.build();
          }
       }
       throw new IllegalStateException("Unexpected challenge, "+uChallenge);
    }
}
