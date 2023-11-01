package p.qs3;
import p.zg0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.rt;
import java.lang.Class;
import p.zq7;
import p.ic;
import java.lang.System;
import java.lang.Long;
import p.jj5;
import p.r45;
import p.a30;
import p.jg2;

public final class qs3	// class@002405 from classes.dex
{
    public final zg0 a;

    public void qs3(zg0 p0){
       co5.o(p0, "clock");
       super();
       this.a = p0;
    }
    public final rt a(rt p0){
       p0.getClass();
       zq7 ozq7 = new zq7(p0);
       this.a.getClass();
       Long longx = Long.valueOf(System.currentTimeMillis());
       longx.getClass();
       ozq7.a = new jj5(longx);
       return ozq7.e();
    }
    public final rt b(r45 p0){
       rt e = rt.e;
       co5.l(e, "EMPTY");
       return p0.g(new a30(1, this)).e(this.a(e));
    }
}
