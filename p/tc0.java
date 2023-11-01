package p.tc0;
import java.util.List;
import java.lang.Object;
import p.co5;
import p.kg4;
import java.lang.String;
import java.lang.StringBuilder;

public final class tc0	// class@00273f from classes.dex
{
    public final int a;
    public final List b;
    public final boolean c;

    public void tc0(int p0,List p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof tc0) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       tc0 tc;
       int i = kg4.j(this.b, (this.a * 31), 31);
       if ((tc = this.c) != null) {
          tc = 1;
       }
       return (i + tc);
    }
    public final String toString(){
       return kg4.p("CellReport\(characterReported="+this.a+", reportedLines="+this.b+", isFullyReported=", this.c, ')');
    }
}
