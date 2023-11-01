package p.jv7;
import p.ky;
import p.pt7;
import p.vo;
import p.ko1;
import p.bl2;
import p.mv7;
import android.os.IInterface;
import p.pv7;

public abstract class jv7 extends ky	// class@001b55 from classes.dex
{
    public final int w;

    public void jv7(pt7 p0,int p1){
       this.w = p1;
       if (p1 != 1) {
          super(vo.b, p0);
          return;
       }else {
          super(vo.a, p0);
          return;
       }
    }
    public void H(bl2 p0){
       this.J(p0.i());
    }
    public abstract void J(pv7 p0);
}
