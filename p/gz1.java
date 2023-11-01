package p.gz1;
import p.iz1;
import p.jz1;
import p.s97;
import java.lang.Object;
import p.tp2;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class gz1 extends iz1	// class@0017a9 from classes.dex
{
    public final boolean a;

    public void gz1(boolean p0){
       super();
       this.a = p0;
    }
    public final Object a(jz1 p0,s97 p1,s97 p2,jz1 p3,jz1 p4,jz1 p5){
       return p4.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof gz1) {
          return false;
       }
       if (p0.a != this.a) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.a, 0);
    }
    public final String toString(){
       return kg4.p("SpotifyLoginFailed{unknownIdentifier=", this.a, '}');
    }
}
