package p.p12;
import p.vi7;
import p.mp;
import p.wn3;
import p.i12;
import p.e43;
import p.ew0;
import p.h13;
import p.u67;
import p.we6;
import p.z33;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import p.ju2;
import p.iu2;
import p.ty0;
import java.lang.StringBuilder;
import p.bu2;
import p.c23;
import p.fu2;
import p.su2;
import p.gu2;
import p.i13;
import java.lang.Integer;
import p.tt2;
import p.k23;
import p.sp6;
import java.lang.Enum;
import p.st2;
import p.n13;
import java.io.Serializable;
import java.util.List;
import p.hu2;
import p.lt;
import p.ez2;
import p.au2;
import p.g23;

public final class p12 extends vi7	// class@0021ce from classes.dex
{
    public final u67 A;
    public final we6 B;
    public final mp t;
    public final wn3 v;
    public final e43 w;
    public final i12 x;
    public final z33 y;
    public final h13 z;

    public void p12(mp p0,wn3 p1,i12 p2,e43 p3,ew0 p4,h13 p5,u67 p6,we6 p7){
       super();
       this.t = p0;
       this.v = p1;
       this.x = p2;
       this.y = new z33(1, p4);
       this.w = p3;
       this.z = p5;
       this.A = p6;
       this.B = p7;
    }
    public static ju2 e(int p0,int p1,Context p2,String p3){
       return ty0.k().o("lite-favorites-add-button"+p1).k(ty0.l("favorites:button", bu2.t.a)).s(ty0.z().d(p2.getString(p0))).p(ty0.o().c(ty0.n().a(Integer.valueOf(p1)))).e("click", p12.h(p3)).g();
    }
    public static ju2 f(int p0,String p1){
       return ty0.k().o(String.valueOf(p1)).j("lite:smallIconTitle", "row").s(ty0.z().d(p1)).p(ty0.o().c(ty0.n().e(sp6.l0))).e("click", n13.j().d("contextmenu").a("option", Integer.valueOf(p0)).b()).g();
    }
    public static hu2 g(sp6 p0,List p1){
       i13 oi13 = ty0.n();
       String str = (p1.isEmpty())? null: p1.get(0).a;
       i13 oi131 = oi13.g(str).e(p0);
       if (p0 == sp6.z) {
          oi131 = oi131.d(ez2.c.a);
       }
       return ty0.o().c(oi131).a();
    }
    public static tt2 h(String p0){
       return n13.j().d("navigate").a("uri", p0).b();
    }
}
