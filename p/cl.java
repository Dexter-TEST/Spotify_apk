package p.cl;
import p.oi;
import p.bl;
import p.oe5;
import p.sp6;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class cl extends oi	// class@001231 from classes.dex
{
    public final bl H;
    public final boolean I;
    public final oe5 J;

    public void cl(bl p0){
       super();
       this.H = p0;
       this.I = false;
       this.J = new oe5();
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof cl) {
          return false;
       }
       if (!co5.c(this.H, p0.H)) {
          return false;
       }
       if (this.I != p0.I) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       cl tI;
       int i = this.H.hashCode() * 31;
       if ((tI = this.I) != null) {
          tI = 1;
       }
       return (i + tI);
    }
    public final String toString(){
       return kg4.p("Artist\(image="+this.H+", shouldExtractColor=", this.I, ')');
    }
}
