package p.aa1;
import android.content.DialogInterface$OnClickListener;
import p.ea1;
import java.lang.String;
import p.qo5;
import java.util.Date;
import java.lang.Object;
import android.content.DialogInterface;
import p.co5;

public final class aa1 implements DialogInterface$OnClickListener	// class@000f42 from classes.dex
{
    public final ea1 a;
    public final String b;
    public final qo5 c;
    public final String t;
    public final Date v;
    public final Date w;

    public void aa1(ea1 p0,String p1,qo5 p2,String p3,Date p4,Date p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
    }
    public final void onClick(DialogInterface p0,int p1){
       aa1 ta = this.a;
       co5.o(ta, "this$0");
       aa1 tb = this.b;
       co5.o(tb, "$userId");
       aa1 tc = this.c;
       co5.o(tc, "$permissions");
       aa1 tt = this.t;
       co5.o(tt, "$accessToken");
       ta.C(tb, tc, tt, this.v, this.w);
    }
}
