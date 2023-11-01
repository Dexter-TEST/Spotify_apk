package p.yy2;
import p.sp6;
import java.lang.Object;
import java.lang.Class;
import p.en6;

public final class yy2	// class@002e4e from classes.dex
{
    public final sp6 a;
    public final int b;
    public final int c;

    public void yy2(sp6 p0,int p1,int p2){
       super();
       p0.getClass();
       this.a = p0;
       if (!p1) {
          throw null;
       }
       this.b = p1;
       if (!p2) {
          throw null;
       }
       this.c = p2;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof yy2) {
          return false;
       }
       if (this.a != p0.a || (this.b != p0.b || this.c != p0.c)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (en6.A(this.c) + ((en6.A(this.b) + (this.a.hashCode() * 31)) * 31));
    }
}
