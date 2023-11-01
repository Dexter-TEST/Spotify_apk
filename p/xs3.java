package p.xs3;
import p.np;
import p.ay;
import p.dq;
import p.zs3;
import p.vg0;
import java.lang.Object;
import p.an5;
import p.l01;
import io.reactivex.rxjava3.core.Single;
import p.iy1;
import p.gy1;
import com.spotify.login5.v3.credentials.proto.FacebookAccessToken;
import java.lang.String;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.uu3;
import com.spotify.login5.v3.proto.LoginRequest;
import com.spotify.login5.v3.proto.ClientInfo;
import p.ps6;
import p.ap5;
import java.lang.System;
import p.hp6;
import p.w75;
import com.spotify.login5.v3.credentials.proto.Password;
import p.y35;
import com.spotify.login5.v3.credentials.proto.OneTimeToken;
import p.at3;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.util.Objects;
import p.us3;
import p.ir0;
import p.ug0;
import java.lang.Class;
import p.nm3;
import com.spotify.login5.v3.proto.Challenges;
import p.ws3;
import p.yf2;
import java.util.concurrent.TimeUnit;
import java.lang.IllegalStateException;

public final class xs3 implements np	// class@002cda from classes.dex
{
    public final dq a;
    public final zs3 b;
    public final vg0 c;
    public final an5 d;
    public static final yx e;

    static {
       xs3.e = ay.d;
    }
    public void xs3(dq p0,zs3 p1,vg0 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = new an5();
    }
    public final Single a(l01 p0){
       uu3 ouu3;
       LoginRequest loginRequest;
       ps6 ops6;
       Single single;
       String str = "This stopwatch is already running.";
       if (p0 instanceof iy1) {
          gy1 ogy1 = FacebookAccessToken.h();
          ogy1.d(p0.a);
          ogy1.c(p0.b);
          FacebookAccessToken uFacebookAcc = ogy1.build();
          ouu3 = LoginRequest.p();
          ouu3.d(this.b());
          ouu3.e(uFacebookAcc);
          loginRequest = ouu3.build();
          ops6 = new ps6();
          ap5.j(str, (ops6.a ^ 1));
          ops6.a = true;
          ops6.b = System.nanoTime();
          single = this.d(loginRequest, ops6);
       }else if(p0 instanceof hp6){
          w75 ow75 = Password.h();
          ow75.c(p0.a);
          ow75.d(p0.b);
          Password password = ow75.build();
          ouu3 = LoginRequest.p();
          ouu3.d(this.b());
          ouu3.h(password);
          loginRequest = ouu3.build();
          ops6 = new ps6();
          ap5.j(str, (ops6.a ^ 1));
          ops6.a = true;
          ops6.b = System.nanoTime();
          single = this.d(loginRequest, ops6);
       }else if(p0 instanceof y35){
          ouu3 = LoginRequest.p();
          ouu3.d(this.b());
          ouu3.g(p0.a);
          loginRequest = ouu3.build();
          ops6 = new ps6();
          ap5.j(str, (ops6.a ^ 1));
          ops6.a = true;
          ops6.b = System.nanoTime();
          single = this.d(loginRequest, ops6);
       }else if(p0 instanceof at3){
          single = Single.just(p0.a);
       }else {
          single = Single.error(new UnsupportedOperationException("Unsupported credentials, method="+p0.a()));
       }
       xs3 ta = this.a;
       Objects.requireNonNull(ta);
       return single.doOnSuccess(new us3(ta, 1));
    }
    public final ClientInfo b(){
       ug0 oug0 = ClientInfo.h();
       xs3 tc = this.c;
       tc.getClass();
       oug0.c();
       oug0.d(tc.d);
       return oug0.build();
    }
    public final Single c(LoginRequest p0,Challenges p1){
       return this.b.a(p0).flatMap(new ws3(this, p0, p1, 1));
    }
    public final Single d(LoginRequest p0,ps6 p1){
       TimeUnit sECONDS = TimeUnit.SECONDS;
       long l = 0;
       if (p1.a != null) {
          l = l + (System.nanoTime() - p1.b);
       }
       if ((sECONDS.convert(l, TimeUnit.NANOSECONDS) - 30) > 0) {
          return Single.error(new IllegalStateException("Timed out trying to login!"));
       }else {
          return this.b.a(p0).flatMap(new ws3(this, p0, p1, 0));
       }
    }
}
