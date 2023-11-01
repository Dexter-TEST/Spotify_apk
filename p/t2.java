package p.t2;
import io.reactivex.rxjava3.core.SingleTransformer;
import java.lang.Object;
import p.ju2;
import java.lang.Class;
import p.p33;
import java.lang.String;
import p.fu2;
import p.iu2;
import p.c03;
import p.st2;
import p.ty0;
import java.io.Serializable;
import p.sp6;
import p.au2;
import p.do5;
import p.k23;
import java.util.List;
import java.lang.Iterable;
import p.ab2;
import p.s2;
import p.jg2;
import com.google.common.collect.c;
import io.reactivex.rxjava3.core.Single;
import p.up0;
import p.yf2;

public final class t2 implements SingleTransformer	// class@0026ec from classes.dex
{

    public void t2(){
       super();
    }
    public static ju2 a(t2 p0,ju2 p1){
       p33 op33;
       p0.getClass();
       ju2 oju2 = null;
       if (p1 == null) {
       }else if((op33 = p1.D()) == null){
          oju2 = op33.a();
       }
       if (oju2 != null && p1.q().c().equals("ac:track")) {
          oju2 = p1.a().k(c03.b).r().d("click", ty0.j().d("addToPlaylist").a("uri", oju2)).c(do5.n0(sp6.a0)).g();
       }else {
          oju2 = p1.a().h(ab2.b(p1.j()).m(new s2(p0, 1)).d()).g();
       }
       return oju2;
    }
    public final Single h(Single p0){
       return p0.map(new up0(7, this));
    }
}
