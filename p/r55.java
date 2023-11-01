package p.r55;
import p.zf2;
import p.gi3;
import p.i77;
import java.lang.Object;
import p.jc7;
import java.lang.String;
import p.co5;
import android.app.Activity;
import java.lang.CharSequence;
import p.je5;
import p.ub4;
import p.ha;
import p.ma;
import p.de5;
import p.ia;
import p.j46;
import p.la;

public final class r55 extends gi3 implements zf2	// class@00247e from classes.dex
{
    public final int a;
    public final i77 b;

    public void r55(i77 p0,int p1){
       this.a = p1;
       this.b = p0;
       super(1);
    }
    public final Object invoke(Object p0){
       jc7 a = jc7.a;
       String str = "item";
       r55 tb = this.b;
       switch (this.a){
           case 0:
             co5.o(p0, str);
             tb.e.e(new ia(p0, true));
             return a;
           case 1:
             co5.o(p0, "tag");
             tb.e.e(new ha(p0));
             return a;
           case 2:
             co5.o(p0, "title");
             tb.f.setTitle(p0);
             return a;
           default:
             co5.o(p0, str);
             tb.e.e(new la(p0));
             return a;
       }
    }
}
