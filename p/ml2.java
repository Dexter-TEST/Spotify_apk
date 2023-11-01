package p.ml2;
import p.we;
import p.q12;
import java.lang.Object;
import p.ye7;
import java.util.Arrays;
import java.lang.String;
import p.fh5;

public final class ml2	// class@001eb9 from classes.dex
{
    public final we a;
    public final q12 b;

    public void ml2(we p0,q12 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (p0 != null && (p0 instanceof ml2 && (ye7.x(this.a, p0.a) && ye7.x(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b};
       return Arrays.hashCode(objArray);
    }
    public final String toString(){
       fh5 uofh5 = ye7.X(this);
       uofh5.b(this.a, "key");
       uofh5.b(this.b, "feature");
       return uofh5.toString();
    }
}
