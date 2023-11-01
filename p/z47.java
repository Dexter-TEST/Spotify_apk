package p.z47;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import java.util.Objects;
import java.lang.StringBuilder;

public final class z47	// class@002e89 from classes.dex
{
    public final Object a;
    public final long b;
    public final TimeUnit c;

    public void z47(Object p0,long p1,TimeUnit p2){
       super();
       Objects.requireNonNull(p0, "value is null");
       this.a = p0;
       this.b = p1;
       Objects.requireNonNull(p2, "unit is null");
       this.c = p2;
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof z47 && (Objects.equals(this.a, p0.a) && (!(this.b - p0.b) && Objects.equals(this.c, p0.c)))) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       z47 tb = this.b;
       return (this.c.hashCode() + (((this.a.hashCode() * 31) + (int)(tb ^ (tb >> 31))) * 31));
    }
    public final String toString(){
       return "Timed[time="+this.b+", unit="+this.c+", value="+this.a+"]";
    }
}
