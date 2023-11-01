package p.ea;
import p.ma;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class ea extends ma	// class@001450 from classes.dex
{
    public final List a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public void ea(List p0,String p1,String p2,boolean p3,boolean p4){
       co5.o(p1, "clickedUri");
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
       if (!p0 instanceof ea) {
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
       if (this.d != p0.d) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       ea tc;
       ea td;
       int i = tp2.g(this.b, (this.a.hashCode() * 31), 31);
       int i1 = ((tc = this.c) == null)? 0: tc.hashCode();
       i = (i + i1) * 31;
       i1 = 1;
       if ((td = this.d) != null) {
          td = 1;
       }
       i = (i + td) * 31;
       if ((td = this.e) == null) {
          tc = td;
       }
       return (i + i1);
    }
    public final String toString(){
       return kg4.p("InsertMoreItemsList\(newContent="+this.a+", clickedUri="+this.b+", activeTag="+this.c+", append="+this.d+", shouldRemoveItem=", this.e, ')');
    }
}
