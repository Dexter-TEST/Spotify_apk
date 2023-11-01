package p.vp;
import p.mp;
import p.aw6;
import p.np;
import p.dq;
import io.reactivex.rxjava3.core.Completable;
import java.lang.Object;
import p.r45;
import p.bt3;
import p.xp;
import p.c0;
import p.xs3;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Exception;
import p.ok0;
import p.lu6;
import com.spotify.login5.v3.credentials.proto.StoredCredential;
import p.ay;
import p.h80;
import p.i80;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.uu3;
import com.spotify.login5.v3.proto.LoginRequest;
import com.spotify.login5.v3.proto.ClientInfo;
import p.ps6;
import p.ap5;
import java.lang.System;
import io.reactivex.rxjava3.core.Single;
import java.util.Objects;
import p.us3;
import p.ir0;
import p.vs3;
import p.iy1;
import p.l01;
import p.sp;
import p.yf2;
import p.hp6;

public final class vp implements mp	// class@002a41 from classes.dex
{
    public final aw6 a;
    public final np b;
    public final dq c;
    public final Completable d;

    public void vp(aw6 p0,np p1,dq p2,Completable p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final r45 a(){
       r45 or45 = this.c.b();
       if (or45.c()) {
          return r45.a(or45.b().b);
       }
       return c0.a;
    }
    public final Completable b(){
       ok0 ook0;
       vp tb = this.b;
       xs3 a = tb.a;
       r45 or45 = a.b();
       if (!or45.c()) {
          ook0 = Completable.h(new IllegalStateException("no token available"));
       }else {
          xp oxp = or45.b();
          lu6 olu6 = StoredCredential.h();
          olu6.d(oxp.b);
          byte[] uobyteArray = xs3.e.a(oxp.c);
          olu6.c(i80.c(uobyteArray, 0, uobyteArray.length));
          StoredCredential storedCreden = olu6.build();
          uu3 ouu3 = LoginRequest.p();
          ouu3.d(tb.b());
          ouu3.j(storedCreden);
          LoginRequest loginRequest = ouu3.build();
          ps6 ouu31 = new ps6();
          ap5.j("This stopwatch is already running.", (ouu31.a ^ 1));
          ouu31.a = true;
          ouu31.b = System.nanoTime();
          Objects.requireNonNull(a);
          ook0 = tb.d(loginRequest, ouu31).doOnSuccess(new us3(a, 0)).doOnError(new vs3(0, tb)).ignoreElement();
       }
       return ook0;
    }
    public final boolean c(){
       return this.c.b().c();
    }
    public final Single d(String p0,String p1){
       vp td = this.d;
       Objects.requireNonNull(td);
       return this.b.a(new iy1(p0, p1)).flatMap(new sp(td, 2));
    }
    public final Single e(String p0,String p1){
       vp td = this.d;
       Objects.requireNonNull(td);
       return this.b.a(new hp6(p0, p1)).flatMap(new sp(td, 0));
    }
}
