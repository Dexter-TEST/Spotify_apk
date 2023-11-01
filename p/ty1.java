package p.ty1;
import p.oi;
import p.c;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class ty1 extends oi	// class@002805 from classes.dex
{
    public final c H;

    public void ty1(c p0){
       super();
       p0.getClass();
       this.H = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ty1) {
          return false;
       }
       return p0.H.equals(this.H);
    }
    public final int hashCode(){
       return (this.H.hashCode() + 0);
    }
    public final String toString(){
       return "LoginToSpotify{credentials="+this.H+'}';
    }
}
