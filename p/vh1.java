package p.vh1;
import p.do5;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class vh1 extends do5	// class@0029f3 from classes.dex
{
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final String J;

    public void vh1(String p0,String p1,String p2,String p3,String p4){
       super();
       p0.getClass();
       this.F = p0;
       p1.getClass();
       this.G = p1;
       p2.getClass();
       this.H = p2;
       p3.getClass();
       this.I = p3;
       p4.getClass();
       this.J = p4;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof vh1) {
          return false;
       }
       if (!p0.F.equals(this.F) || (!p0.G.equals(this.G) || (!p0.H.equals(this.H) || (!p0.I.equals(this.I) || !p0.J.equals(this.J))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.J.hashCode() + tp2.g(this.I, tp2.g(this.H, tp2.g(this.G, tp2.g(this.F, 0, 31), 31), 31), 31));
    }
    public final String toString(){
       return hr7.a("ShowContextMenu{episodeUri="+this.F+", title="+this.G+", subtitle="+this.H+", showUri="+this.I+", imageUri=", this.J, '}');
    }
}
