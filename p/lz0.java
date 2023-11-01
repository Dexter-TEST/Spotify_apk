package p.lz0;
import p.mz0;
import p.yf2;
import p.cg7;
import p.su0;
import java.lang.Object;
import p.fx5;
import java.lang.String;
import java.lang.Double;
import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import p.co5;
import p.uj0;
import p.vv7;
import android.util.JsonReader;
import p.ns;
import p.nz0;
import p.kg3;
import android.graphics.PointF;
import p.ug3;
import java.lang.IllegalArgumentException;
import p.tp2;

public final class lz0 implements mz0, yf2, cg7, su0	// class@001def from classes.dex
{
    public static final lz0 a;
    public static final lz0 b;
    public static final lz0 c;
    public static final lz0 t;

    static {
       lz0.a = new lz0();
       lz0.b = new lz0();
       lz0.c = new lz0();
       lz0.t = new lz0();
    }
    public void lz0(){
       super();
    }
    public Object a(Object p0){
       return Double.valueOf(p0.J());
    }
    public Object apply(Object p0){
       co5.o(p0, "p0");
       return vv7.g(p0);
    }
    public Object k(JsonReader p0){
       return nz0.d(p0);
    }
    public Object n(kg3 p0,float p1){
       int i;
       PointF pointF;
       if ((i = p0.j0()) == 1) {
          pointF = ug3.b(p0, p1);
       }else if(i == 3){
          pointF = ug3.b(p0, p1);
       }else if(i == 7){
          PointF pointF1 = new PointF(((float)p0.g0() * p1), ((float)p0.g0() * p1));
          while (p0.J()) {
             p0.n0();
          }
          pointF = pointF1;
       }else {
          throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(tp2.A(i)));
       }
       return pointF;
    }
}
