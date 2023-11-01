package p.gu0;
import p.iy3;
import p.iz3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class gu0	// class@00177b from classes.dex
{
    public final iy3 a;
    public final iz3 b;

    public void gu0(iy3 p0,iz3 p1){
       co5.o(p1, "lyricsViewConfiguration");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof gu0) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return "ControllerBundle\(progressTransformer="+this.a+", lyricsViewConfiguration="+this.b+')';
    }
}
