package p.nl6;
import java.lang.Integer;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class nl6	// class@002001 from classes.dex
{
    public final Integer a;
    public final int b;
    public final int c;
    public final Integer d;
    public final boolean e;

    public void nl6(Integer p0,int p1,int p2,Integer p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof nl6) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       nl6 ta;
       nl6 td;
       nl6 te;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       i1 = ((((i1 * 31) + this.b) * 31) + this.c) * 31;
       if ((td = this.d) != null) {
          i = td.hashCode();
       }
       i1 = (i1 + i) * 31;
       if ((te = this.e) != null) {
          te = 1;
       }
       return (i1 + te);
    }
    public final String toString(){
       return kg4.p("SkipDialogData\(title="+this.a+", body="+this.b+", primaryBtn="+this.c+", secondaryBtn="+this.d+", shouldSendSkipped=", this.e, ')');
    }
}
