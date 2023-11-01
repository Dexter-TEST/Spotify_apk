package p.nd6;
import p.sy;
import p.sv3;
import p.bw3;
import p.jn0;
import p.ni3;
import p.kd6;
import java.lang.String;
import java.util.List;
import p.qr0;
import java.util.Collections;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.Canvas;
import p.uv1;
import p.o11;

public final class nd6 extends sy	// class@001fb9 from classes.dex
{
    public final qr0 A;
    public final jn0 B;

    public void nd6(sv3 p0,bw3 p1,jn0 p2,ni3 p3){
       super(p1, p3);
       this.B = p2;
       qr0 oqr0 = new qr0(p1, this, new kd6("__container", p3.a, false), p0);
       this.A = oqr0;
       oqr0.c(Collections.emptyList(), Collections.emptyList());
    }
    public final void a(RectF p0,Matrix p1,boolean p2){
       super.a(p0, p1, p2);
       this.A.a(p0, this.n, p2);
    }
    public final void i(Canvas p0,Matrix p1,int p2){
       this.A.e(p0, p1, p2);
    }
    public final uv1 j(){
       ni3 w;
       if ((w = this.p.w) != null) {
          return w;
       }
       return this.B.p.w;
    }
    public final o11 k(){
       ni3 x;
       if ((x = this.p.x) != null) {
          return x;
       }
       return this.B.p.x;
    }
}
