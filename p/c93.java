package p.c93;
import java.lang.annotation.Annotation;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class c93	// class@0011c0 from classes.dex
{
    public final Annotation a;
    public final int b;

    public void c93(Annotation p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof c93) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((this.a.hashCode() * 31) + this.b);
    }
    public final String toString(){
       return tp2.n("IndexedAnnotation\(annot="+this.a+", index=", this.b, ')');
    }
}
