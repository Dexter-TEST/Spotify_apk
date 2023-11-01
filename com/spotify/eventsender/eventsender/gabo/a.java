package com.spotify.eventsender.eventsender.gabo.a;
import p.qu1;
import com.spotify.eventsender.eventsender.gabo.c;
import p.yh2;
import p.hs3;
import java.lang.Object;
import java.util.List;
import com.spotify.eventsender.gabo.PublishEventsRequest;
import java.util.Objects;
import p.vr1;
import java.lang.Iterable;
import p.ab2;
import p.jg2;
import com.google.common.collect.c;
import p.wm5;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.bw1;
import p.tm5;
import com.spotify.eventsender.eventsender.gabo.b;
import p.s90;
import p.bx5;
import p.cb4;
import p.cx5;
import com.spotify.eventsender.gabo.PublishEventsResponse;
import java.lang.String;
import p.mp2;
import p.bc3;
import java.lang.Integer;
import p.no5;
import p.s11;
import java.lang.Comparable;
import p.t11;
import p.pb1;
import p.qb1;
import p.zt0;
import p.gr7;
import p.ci5;
import p.rp;
import com.google.common.collect.d;
import p.mc6;
import java.util.Set;
import java.lang.NullPointerException;
import p.tp2;

public final class a implements qu1	// class@0008ae from classes.dex
{
    public final yh2 a;
    public final hs3 b;
    public final tm5 c;

    public void a(c p0,yh2 p1,hs3 p2){
       super();
       this.c = p0;
       this.a = p1;
       this.b = p2;
    }
    public final PublishEventsRequest a(List p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       wm5 owm5 = PublishEventsRequest.g();
       owm5.c(ab2.b(p0).m(new vr1(1, ta)).d());
       return owm5.build();
    }
    public final bw1 b(List p0){
       b uob;
       if ((uob = this.c.get()) != null) {
          return this.d(p0.size(), uob.b(this.a(p0)).b());
       }
       throw new cb4();
    }
    public final bw1 c(List p0){
       b uob;
       if ((uob = this.c.get()) != null) {
          return this.d(p0.size(), uob.a(this.a(p0)).b());
       }
       throw new cb4();
    }
    public final bw1 d(int p0,bx5 p1){
       d uod;
       bx5 a = p1.a;
       cx5 t = a.t;
       p1 = p1.b;
       if (t == 200 && p1 != null) {
          int i = 0;
          boolean b = (a.w.a("Spotify-Back-Off") != null)? true: false;
          zt0 ozt0 = zt0.G(new no5(new s11(Integer.valueOf(i)), new s11(Integer.valueOf(p0))), pb1.b);
          if ((uod = ab2.b(p1.f()).a(new gr7(20)).m(new rp(10)).k()) != null) {
             return new bw1(b, new mc6(ozt0, uod), ab2.b(p1.f()).a(new gr7(21)).m(new rp(11)).k());
          }else {
             throw new NullPointerException("set2");
          }
       }else {
          this.b.a(tp2.k("Received error code: ", t));
          return new bw1();
       }
    }
}
