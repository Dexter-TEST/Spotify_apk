package p.sj;
import p.bi5;
import p.tj;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import p.ic;
import java.lang.System;

public final class sj implements bi5	// class@002642 from classes.dex
{
    public final tj a;
    public final long b;

    public void sj(tj p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean test(Object p0){
       boolean b;
       sj ta = this.a;
       ta.getClass();
       if (p0.intValue() >= 20) {
          ta.v.getClass();
          if ((System.currentTimeMillis() - this.b) >= 0) {
             b = false;
          label_0024 :
             return b;
          }
       }
       b = true;
       goto label_0024 ;
    }
}
