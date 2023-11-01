package p.ea4;
import p.ci5;
import java.lang.Object;
import p.ew;
import java.lang.Long;

public final class ea4 implements ci5	// class@00144c from classes.dex
{
    public final long a;

    public void ea4(long p0){
       this.a = p0;
    }
    public final boolean apply(Object p0){
       ew b;
       long l;
       boolean b1;
       if (p0 != null) {
          if ((b = p0.b) != null) {
             l = b.longValue();
          }else if((p0 = p0.c) != null){
             l = p0.longValue();
          }else {
             l = -1;
          }
          if ((l - this.a) > 0) {
             b1 = true;
          label_0021 :
             return b1;
          }
       }
       b1 = false;
       goto label_0021 ;
    }
}
