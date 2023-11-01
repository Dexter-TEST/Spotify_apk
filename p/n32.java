package p.n32;
import java.lang.String;
import p.kg4;
import java.lang.Object;
import p.co5;
import p.en6;
import java.lang.StringBuilder;
import p.hr7;

public final class n32	// class@001f5a from classes.dex
{
    public final int a;
    public final int b;
    public final String c;

    public void n32(int p0,int p1,String p2){
       kg4.t(p0, "kind");
       kg4.t(p1, "errorCode");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof n32) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.c.hashCode() + ((en6.A(this.b) + (en6.A(this.a) * 31)) * 31));
    }
    public final String toString(){
       return hr7.a("EventDescription\(kind="+kg4.F(this.a)+", errorCode="+kg4.E(this.b)+", errorMessage=", this.c, ')');
    }
}
