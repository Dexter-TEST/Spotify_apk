package p.pp5;
import p.tb1;
import java.lang.Object;
import p.qp5;
import p.ec1;
import p.wb1;
import java.lang.String;
import p.yb1;

public final class pp5	// class@0022a8 from classes.dex
{
    public final tb1 a;

    public void pp5(tb1 p0){
       this.a = p0;
    }
    public final qp5 a(){
       pp5 ta = this.a;
       tb1 e = ta.e;
       _monitor_enter(e);
       ta.b();
       yb1 oyb1 = e.y(ta.c.a);
       _monitor_exit(e);
       qp5 oqp5 = (oyb1 != null)? new qp5(oyb1): null;
       return oqp5;
    }
}
