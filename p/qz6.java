package p.qz6;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import p.co5;
import p.tp2;
import p.kg4;
import java.lang.StringBuilder;

public final class qz6	// class@002447 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public void qz6(String p0,String p1,String p2,List p3,List p4){
       co5.o(p3, "columnNames");
       co5.o(p4, "referenceColumnNames");
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
       boolean b = false;
       if (!p0 instanceof qz6) {
          return b;
       }
       if (!co5.c(this.a, p0.a)) {
          return b;
       }
       if (!co5.c(this.b, p0.b)) {
          return b;
       }
       if (!co5.c(this.c, p0.c)) {
          return b;
       }
       if (co5.c(this.d, p0.d)) {
          b = co5.c(this.e, p0.e);
       }
       return b;
    }
    public final int hashCode(){
       return (this.e.hashCode() + kg4.j(this.d, tp2.g(this.c, tp2.g(this.b, (this.a.hashCode() * 31), 31), 31), 31));
    }
    public final String toString(){
       return kg4.o("ForeignKey{referenceTable=\'"+this.a+"\', onDelete=\'"+this.b+" +\', onUpdate=\'"+this.c+"\', columnNames="+this.d+", referenceColumnNames=", this.e, '}');
    }
}
