package p.ii4;
import p.mv5;
import p.ae1;
import p.xr6;
import p.cv5;
import java.lang.String;
import android.net.Uri;
import java.lang.Object;
import p.dm5;
import p.c90;
import p.zu5;
import p.bv5;
import p.cx5;
import p.ud5;
import p.fx5;
import p.gi4;
import java.lang.Long;
import android.os.Message;
import android.os.Handler;
import p.g70;
import p.nn6;
import p.hi4;
import android.net.NetworkInfo;

public final class ii4 extends mv5	// class@00199d from classes.dex
{
    public final ae1 a;
    public final xr6 b;

    public void ii4(ae1 p0,xr6 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean b(cv5 p0){
       String scheme = p0.c.getScheme();
       boolean b = (!"http".equals(scheme) && !"https".equals(scheme))? false: true;
       return b;
    }
    public final int d(){
       return 2;
    }
    public final dm5 e(cv5 p0,int p1){
       c90 o;
       ii4 oii4 = this;
       if (p1) {
          int i = 0;
          int i1 = 1;
          int i2 = ((p1 & 0x04))? 1: 0;
          if (i2) {
             o = c90.o;
          }else if(!((p1 & 0x01))){
             i2 = 1;
          }else {
             i2 = 0;
          }
          i2 = i2 ^ i1;
          if (!((p1 & 0x02))) {
             i = 1;
          }
          c90 v16 = new c90(i2, (i ^ 0x01), -1, -1, false, false, false, -1, -1, false, false, false, null);
          o = v16;
       }else {
          o = null;
       }
       zu5 ozu5 = new zu5();
       ozu5.g(p0.c.toString());
       if (o != null) {
          ozu5.c(o);
       }
       cx5 uocx5 = oii4.a.r(ozu5.b());
       cx5 x = uocx5.x;
       if (uocx5.x()) {
          ud5 t = ud5.t;
          ud5 c = ud5.c;
          ud5 oud5 = (uocx5.z == null)? t: c;
          int i3 = 0;
          if (oud5 == c && !(x.f() - i3)) {
             x.close();
             throw new gi4();
          }else if(oud5 == t && (x.f() - i3) > 0){
             xr6 b = oii4.b.b;
             b.sendMessage(b.obtainMessage(4, Long.valueOf(x.f())));
          }
          return new dm5(x.y(), oud5);
       }else {
          x.close();
          throw new hi4(uocx5.t);
       }
    }
    public final boolean f(NetworkInfo p0){
       boolean b = (p0 != null && !p0.isConnected())? false: true;
       return b;
    }
}
