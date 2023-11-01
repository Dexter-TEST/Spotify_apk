package p.aa3;
import java.lang.Object;
import android.graphics.Insets;
import p.u3;
import p.z93;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class aa3	// class@000f44 from classes.dex
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public static final aa3 e;

    static {
       aa3.e = new aa3(0, 0, 0, 0);
    }
    public void aa3(int p0,int p1,int p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static aa3 a(int p0,int p1,int p2,int p3){
       if (!p0 && (!p1 && (!p2 && !p3))) {
          return aa3.e;
       }
       return new aa3(p0, p1, p2, p3);
    }
    public static aa3 b(Insets p0){
       return aa3.a(u3.a(p0), u3.x(p0), u3.A(p0), u3.C(p0));
    }
    public final Insets c(){
       return z93.a(this.a, this.b, this.c, this.d);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || aa3.class != p0.getClass()) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d);
    }
    public final String toString(){
       return tp2.n("Insets{left="+this.a+", top="+this.b+", right="+this.c+", bottom=", this.d, '}');
    }
}
