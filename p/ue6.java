package p.ue6;
import p.io2;
import java.lang.Math;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.String;

public final class ue6 extends io2	// class@002897 from classes.dex
{
    public final int G;
    public Object[] H;
    public long I;
    public long J;
    public int K;

    public void ue6(int p0,int p1,int p2){
       super();
       this.G = p0;
    }
    public final long E(){
       return Math.min(this.J, this.I);
    }
    public final Object[] F(int p0,int p1,Object[] p2){
       int i = 0;
       int i1 = (p1 > 0)? 1: 0;
       if (i1) {
          Object[] objArray = new Object[p1];
          this.H = objArray;
          if (p2 == null) {
             return objArray;
          }else {
             long l = this.E();
             for (; i < p0; i = i + 1) {
                long l1 = (long)i + l;
                int i2 = (int)l1;
                int i3 = p2.length - 1;
                i3 = i3 & i2;
                int i4 = p1 - 1;
                i2 = i2 & i4;
                objArray[i2] = p2[i3];
             }
             return objArray;
          }
       }else {
          throw new IllegalStateException("Buffer size overflow".toString());
       }
    }
}
