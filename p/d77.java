package p.d77;
import java.lang.String;
import p.kg4;
import java.lang.Object;
import p.en6;
import java.lang.StringBuilder;

public final class d77	// class@0012f4 from classes.dex
{
    public final int a;
    public final int b;

    public void d77(int p0){
       kg4.t(1, "source");
       super();
       this.a = p0;
       this.b = 1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof d77) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (en6.A(this.b) + (this.a * 31));
    }
    public final String toString(){
       return "TrackProgress\(progress="+this.a+", source="+kg4.H(this.b)+')';
    }
}
