package p.sz6;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import p.co5;
import java.util.Collection;
import java.util.ArrayList;
import p.av6;
import p.kg4;
import java.lang.StringBuilder;

public final class sz6	// class@0026ce from classes.dex
{
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    public void sz6(String p0,boolean p1,List p2,List p3){
       ArrayList uArrayList;
       co5.o(p2, "columns");
       co5.o(p3, "orders");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       if (p3.isEmpty()) {
          int i = p2.size();
          uArrayList = new ArrayList(i);
          for (int i1 = 0; i1 < i; i1++) {
             uArrayList.add("ASC");
          }
       }
       this.d = uArrayList;
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof sz6) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       sz6 ta = this.a;
       p0 = p0.a;
       boolean b = (av6.D0(ta, "index_", false))? av6.D0(p0, "index_", false): co5.c(ta, p0);
       return b;
    }
    public final int hashCode(){
       sz6 ta = this.a;
       int i = (av6.D0(ta, "index_", false))? -1184239155: ta.hashCode();
       return (this.d.hashCode() + kg4.j(this.c, (((i * 31) + this.b) * 31), 31));
    }
    public final String toString(){
       return "Index{name=\'"+this.a+"\', unique="+this.b+", columns="+this.c+", orders="+this.d+"\'}";
    }
}
