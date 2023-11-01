package p.tf1;
import java.lang.String;
import p.kg4;
import java.lang.Object;
import p.en6;
import java.lang.StringBuilder;
import p.et0;

public final class tf1	// class@00275b from classes.dex
{
    public final int a;
    public final int b;

    public void tf1(){
       kg4.t(4, "format");
       kg4.t(2, "formatCase");
       super();
       this.a = 4;
       this.b = 2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof tf1) {
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
       return (en6.A(this.b) + (en6.A(this.a) * 31));
    }
    public final String toString(){
       return "FormatOptions\(format="+et0.x(this.a)+", formatCase="+et0.y(this.b)+')';
    }
}
