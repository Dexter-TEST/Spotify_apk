package p.u11;
import p.lv1;
import p.vd6;
import java.lang.Math;

public final class u11 extends lv1	// class@002820 from classes.dex
{

    public void u11(){
       super();
    }
    public final void n(float p0,float p1,vd6 p2){
       p2.d((p1 * p0), 180.00f, 90.00f);
       double d = (double)p1;
       double d1 = (double)p0;
       p2.c((float)((Math.sin(Math.toRadians((double)90.00f)) * d) * d1), (float)((Math.sin(Math.toRadians((double)0)) * d) * d1));
    }
}
