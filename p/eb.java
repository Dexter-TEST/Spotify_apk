package p.eb;
import p.ub4;
import p.tb;
import p.m26;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.wa;
import p.xz3;

public final class eb extends ub4	// class@001459 from classes.dex
{
    public final m26 z;

    public void eb(tb p0,m26 p1){
       wa owa;
       co5.o(p1, "savedStateHandle");
       if ((owa = p1.b("VIEW_STATE")) == null) {
          owa = wa.w;
       }
       super(p0, owa, new xz3());
       this.z = p1;
       return;
    }
}
