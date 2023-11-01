package p.ki2;
import p.vx1;
import p.s74;
import java.lang.Object;
import p.ji2;
import p.cq7;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class ki2 extends vx1	// class@001c1a from classes.dex
{
    public final Object a;

    public void ki2(s74 p0,Object p1,s74 p2,ji2 p3){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("Null containingTypeDefaultInstance");
       }
       if (p3.b == cq7.w && p2 == null) {
          throw new IllegalArgumentException("Null messageDefaultInstance");
       }
       this.a = p1;
       return;
    }
}
