package p.ry;
import p.my;
import p.sy;
import java.lang.Object;
import p.z52;
import p.bw3;

public final class ry implements my	// class@002585 from classes.dex
{
    public final sy a;

    public void ry(sy p0){
       this.a = p0;
    }
    public final void b(){
       ry ta = this.a;
       boolean b = (!(0x3f800000 - ta.r.i()))? true: false;
       if (b != ta.x) {
          ta.x = b;
          ta.o.invalidateSelf();
       }
       return;
    }
}
