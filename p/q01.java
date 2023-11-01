package p.q01;
import p.r01;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import p.en6;
import java.lang.StringBuilder;
import p.et0;

public final class q01 extends r01	// class@002305 from classes.dex
{
    public final String a;
    public final String b;
    public final int c;

    public void q01(String p0,String p1,int p2){
       co5.o(p1, "password");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof q01) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
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
       q01 tc;
       int i = tp2.g(this.b, (this.a.hashCode() * 31), 31);
       int i1 = ((tc = this.c) == null)? 0: en6.A(tc);
       return (i + i1);
    }
    public final String toString(){
       return "UserPassword\(username="+this.a+", source="+et0.u(this.c)+')';
    }
}
