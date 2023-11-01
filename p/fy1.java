package p.fy1;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import p.dj0;
import p.ey1;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class fy1	// class@00165e from classes.dex
{
    public final List a;
    public final ey1 b;
    public final List c;
    public final List d;

    public void fy1(ArrayList p0){
       ey1 uoey1 = dj0.l0(p0);
       List list = (p0.isEmpty())? null: p0.subList(1, p0.size());
       super();
       this.a = p0;
       this.b = uoey1;
       this.c = list;
       this.d = null;
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof fy1) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       fy1 tb;
       int i = this.a.hashCode() * 31;
       int i1 = 0;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       i = (i + i2) * 31;
       i2 = ((tb = this.c) == null)? 0: tb.hashCode();
       i = (i + i2) * 31;
       if ((tb = this.d) != null) {
          i1 = tb.hashCode();
       }
       return (i + i1);
    }
    public final String toString(){
       return kg4.o("FacePile\(faces="+this.a+", primaryFace="+this.b+", secondaryFaces="+this.c+", customColors=", this.d, ')');
    }
}
