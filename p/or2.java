package p.or2;
import p.i07;
import java.lang.String;
import p.tr2;
import p.e70;
import java.lang.Class;
import java.lang.Object;
import p.co5;
import p.mo1;
import p.as2;
import java.lang.Integer;
import java.util.Set;

public final class or2 extends i07	// class@0002ea from classes2.dex
{
    public final tr2 e;
    public final int f;
    public final e70 g;
    public final int h;

    public void or2(String p0,tr2 p1,int p2,e70 p3,int p4,boolean p5){
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       super(p0, true);
    }
    public final long a(){
       try{
          or2 tg = this.g;
          this.e.C.getClass();
          co5.o(tg, "source");
          tg.skip((long)this.h);
          this.e.P.g0(this.f, mo1.x);
          or2 te = this.e;
          _monitor_enter(te);
          this.e.R.remove(Integer.valueOf(this.f));
          _monitor_exit(te);
          return -1;
       }catch(java.io.IOException e0){
       }
    }
}
