package p.rx3;
import p.vx3;
import p.qw3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class rx3 extends vx3	// class@002577 from classes.dex
{
    public final qw3 a;

    public void rx3(qw3 p0){
       co5.o(p0, "lyrics");
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof rx3) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return "Loaded\(lyrics="+this.a+')';
    }
}
