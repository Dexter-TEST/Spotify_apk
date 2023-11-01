package p.ov5;
import p.pb3;
import java.util.Random;
import java.lang.Object;
import java.lang.String;
import p.ap5;
import p.qu5;
import p.pu5;
import p.ab6;
import io.reactivex.rxjava3.core.Observer;
import p.ob3;
import p.cx5;
import p.yp5;
import p.bv5;
import p.ps2;
import p.nv5;
import com.spotify.liteinstrumentation.instrumentation.events.proto.RequestLatency;
import p.os2;
import java.lang.Class;
import p.gg1;
import java.lang.Enum;
import java.lang.Integer;
import p.fv5;
import com.google.protobuf.c;
import com.google.protobuf.b;

public final class ov5 implements pb3	// class@00219b from classes.dex
{
    public final qu5 a;
    public final ab6 b;
    public final Random c;
    public final float t;

    public void ov5(Random p0){
       super();
       ap5.E(256, "maxSize");
       qu5 oqu5 = new qu5(new pu5());
       this.a = oqu5;
       this.b = new ab6(oqu5);
       this.c = p0;
       this.t = 0.10f;
    }
    public final cx5 intercept(ob3 p0){
       String str;
       cx5 y;
       String str1;
       bv5 d;
       ov5 oov5 = this;
       yp5 oyp5 = p0;
       yp5 e = oyp5.e;
       cx5 uocx5 = oyp5.b(e);
       bv5 a = e.a;
       if (a.b().startsWith("/gabo-receiver-service")) {
       }else if(uocx5.z != null){
          ov5 t = oov5.t;
          if ((t - oov5.c.nextFloat()) <= 0) {
             int i = (int)(uocx5.C - uocx5.B);
             nv5 onv5 = RequestLatency.o();
             os2 oos2 = a.g("");
             oos2.getClass();
             oos2.b = gg1.i("", 0, 0, " \"\':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
             oos2.c = gg1.i("", 0, 0, " \"\':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
             onv5.j(oos2.b().i);
             onv5.k(e.b);
             int i1 = uocx5.b.ordinal();
             int i2 = 1;
             if (i1 != i2) {
                if (i1 != 3) {
                   str = (i1 != 5)? "unknown": "quic";
                }else {
                   str = "http/2";
                }
             }else {
                str = "http/1.1";
             }
             onv5.f(str);
             onv5.c((uocx5.x() ^ i2));
             onv5.d(i);
             onv5.e(i);
             i1 = -1;
             if ((y = uocx5.y) != null && (str1 = cx5.f(y, "content-length")) != null) {
                try{
                   i = Integer.parseInt(str1);
                label_00b4 :
                   onv5.h(i);
                   if ((d = e.d) != null) {
                      i1 = (int)d.a();
                   }
                   onv5.i(i1);
                   onv5.g(t);
                   e0.b.onNext(onv5.build());
                }catch(java.lang.NumberFormatException e0){
                }
             label_00b3 :
                i = -1;
                goto label_00b4 ;
             }else {
                goto label_00b3 ;
             }
          }
       }
       return uocx5;
    }
}
