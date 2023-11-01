package p.pr2;
import p.i07;
import java.lang.String;
import p.tr2;
import java.util.List;
import java.lang.Class;
import java.lang.Object;
import p.co5;
import p.mo1;
import p.as2;
import java.lang.Integer;
import java.util.Set;

public final class pr2 extends i07	// class@000301 from classes2.dex
{
    public final tr2 e;
    public final int f;
    public final List g;

    public void pr2(String p0,tr2 p1,int p2,List p3,boolean p4){
       this.e = p1;
       this.f = p2;
       this.g = p3;
       super(p0, true);
    }
    public final long a(){
       pr2 tg = this.g;
       this.e.C.getClass();
       String str = "responseHeaders";
       try{
          co5.o(tg, str);
          this.e.P.g0(this.f, mo1.x);
          pr2 te = this.e;
          _monitor_enter(te);
          this.e.R.remove(Integer.valueOf(this.f));
          _monitor_exit(te);
          return -1;
       }catch(java.io.IOException e0){
       }
    }
}
