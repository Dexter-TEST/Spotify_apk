package p.qn6;
import p.c22;
import p.q63;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.en6;

public final class qn6 extends c22	// class@0023dc from classes.dex
{
    public final q63 a;
    public final String b;
    public final int c;

    public void qn6(q63 p0,String p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof qn6 || (!co5.c(this.a, p0.a) || (!co5.c(this.b, p0.b) || this.c != p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       qn6 tb;
       int i = this.a.hashCode() * 31;
       int i1 = ((tb = this.b) != null)? tb.hashCode(): 0;
       return (en6.A(this.c) + ((i + i1) * 31));
    }
}
