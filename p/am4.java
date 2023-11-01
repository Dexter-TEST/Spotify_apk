package p.am4;
import p.lv1;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class am4 extends lv1	// class@000faf from classes.dex
{
    public final String P;
    public final String Q;
    public final String R;

    public void am4(String p0,String p1,String p2){
       super();
       p0.getClass();
       this.P = p0;
       p1.getClass();
       this.Q = p1;
       p2.getClass();
       this.R = p2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof am4) {
          return false;
       }
       if (!p0.P.equals(this.P) || (!p0.Q.equals(this.Q) || !p0.R.equals(this.R))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.R.hashCode() + tp2.g(this.Q, tp2.g(this.P, 0, 31), 31));
    }
    public final String toString(){
       return hr7.a("Share{shareUri="+this.P+", pageId="+this.Q+", viewUri=", this.R, '}');
    }
}
