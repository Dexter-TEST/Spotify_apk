package p.ez1;
import p.iz1;
import p.c;
import java.lang.Class;
import java.lang.Object;
import p.jz1;
import p.s97;
import java.lang.String;
import java.lang.StringBuilder;

public final class ez1 extends iz1	// class@001526 from classes.dex
{
    public final c a;

    public void ez1(c p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(jz1 p0,s97 p1,s97 p2,jz1 p3,jz1 p4,jz1 p5){
       return p0.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ez1) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "FacebookLoginSucceeded{credentials="+this.a+'}';
    }
}
