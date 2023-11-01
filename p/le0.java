package p.le0;
import p.je0;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class le0 extends je0	// class@001d36 from classes.dex
{

    static {
       le0 ole0 = new le0(1, 0);
    }
    public void le0(char p0,char p1){
       super(p0, p1);
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof le0) {
          je0 ta = this.a;
          je0 tb = this.b;
          int i = (co5.r(ta, tb) > 0)? 1: 0;
          if (i) {
             je0 oje0 = ((oje0 = p0) > 0)? 1: 0;
             if (oje0) {
             label_0031 :
                b = true;
             }
          }
          if (ta == p0.a && tb == p0.b) {
             goto label_0031 ;
          }
       }
       return b;
    }
    public final int hashCode(){
       je0 ta = this.a;
       je0 tb = this.b;
       int i = (co5.r(ta, tb) > 0)? 1: 0;
       int i1 = (i)? -1: (ta * 31) + tb;
       return i1;
    }
    public final String toString(){
       return this.a+".."+this.b;
    }
}
