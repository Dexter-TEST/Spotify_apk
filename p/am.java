package p.am;
import p.b90;
import p.cm;
import java.lang.String;
import java.lang.Object;
import p.dt5;
import io.reactivex.rxjava3.core.Single;
import java.lang.Class;
import java.util.Map;
import p.zp3;
import p.bm;
import p.yf2;

public final class am implements b90	// class@000fb3 from classes.dex
{
    public final cm a;
    public final String b;
    public final int c;

    public void am(cm p0,String p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Single a(dt5 p0){
       am ta = this.a;
       ta.getClass();
       return ta.w.d(cm.e(this.b), p0).map(new bm(this.c));
    }
}
