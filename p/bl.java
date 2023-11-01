package p.bl;
import java.lang.String;
import p.al;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;

public final class bl	// class@0010ed from classes.dex
{
    public final String a;
    public final mi b;

    public void bl(String p0){
       super();
       this.a = p0;
       this.b = al.C;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof bl) {
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
       bl ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       return (this.b.hashCode() + (i * 31));
    }
    public final String toString(){
       return "ImageData\(uri="+this.a+", cornerRadiusRule="+this.b+')';
    }
}
