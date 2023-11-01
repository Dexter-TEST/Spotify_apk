package p.gs0;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.kg4;
import p.en6;
import java.lang.StringBuilder;

public final class gs0	// class@001769 from classes.dex
{
    public final String a;
    public final int b;

    public void gs0(String p0,int p1){
       co5.o(p0, "imageUri");
       kg4.t(p1, "shape");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof gs0) {
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
       return (en6.A(this.b) + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return "ContentStackElement\(imageUri="+this.a+", shape="+en6.E(this.b)+')';
    }
}
