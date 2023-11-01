package p.sd;
import p.yd;
import java.util.ArrayList;
import java.lang.Object;
import p.qy;
import java.util.List;
import p.ph3;
import p.zl2;
import p.u95;

public final class sd implements yd	// class@00260d from classes.dex
{
    public final List a;

    public void sd(ArrayList p0){
       this.a = p0;
       super();
    }
    public final qy a(){
       sd ta = this.a;
       if (ta.get(0).c()) {
          return new zl2(1, ta);
       }
       return new u95(ta);
    }
    public final List b(){
       return this.a;
    }
    public final boolean c(){
       sd ta = this.a;
       int i = 0;
       if (ta.size() == 1 && ta.get(i).c()) {
          i = true;
       }
       return i;
    }
}
