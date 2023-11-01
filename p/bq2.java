package p.bq2;
import p.dq2;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class bq2 extends dq2	// class@001114 from classes.dex
{
    public final int a;
    public final int b;

    public void bq2(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof bq2) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((this.a * 31) + this.b);
    }
    public final String toString(){
       return tp2.n("RecyclerViewHighlightState\(lineIndex="+this.a+", characterCount=", this.b, ')');
    }
}
