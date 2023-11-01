package p.nb1;
import p.xo0;
import p.nv1;
import java.lang.Object;
import p.hr0;
import p.ap0;
import p.ob1;
import java.lang.Class;
import p.vc1;
import p.vf;
import p.hk5;
import p.ov1;

public final class nb1 implements xo0	// class@001fa2 from classes.dex
{
    public final int a;
    public final Object b;

    public void nb1(nv1 p0){
       this.a = 1;
       super();
       this.b = p0;
    }
    public void nb1(xo0 p0){
       this.a = 0;
       super();
       this.b = p0;
    }
    public final ap0 d(hr0 p0){
       nb1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return new ov1(tb.a(p0));
       }
       ob1 oob1 = new ob1(p0, null);
       ap0 uoap0 = tb.d(oob1);
       uoap0.getClass();
       ob1 oob11 = new ob1(uoap0, uoap0);
       vc1[] ovc1Array = new vc1[]{oob11,oob1};
       vf ovf = new vf(ovc1Array);
       return new hk5(this, oob11, ovf);
    }
}
