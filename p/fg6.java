package p.fg6;
import p.uw5;
import java.lang.String;
import java.lang.Object;
import p.xe7;
import java.lang.StringBuilder;
import p.hr7;

public final class fg6 extends uw5	// class@0015c3 from classes.dex
{
    public final String A;

    public void fg6(String p0){
       super();
       this.A = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof fg6) {
          return false;
       }
       return xe7.u(p0.A, this.A);
    }
    public final int hashCode(){
       fg6 tA;
       int i = 0;
       int i1 = ((tA = this.A) != null)? tA.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       return hr7.a("ShowSignupError{message=", this.A, '}');
    }
}
