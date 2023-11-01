package p.ex1;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class ex1	// class@001515 from classes.dex
{
    public final long a;
    public final long b;

    public void ex1(long p0,long p1){
       super();
       if (!(p1)) {
          this.a = 0;
          this.b = 1;
          return;
       }else {
          this.a = p0;
          this.b = p1;
          return;
       }
    }
    public final String toString(){
       return this.a+"/"+this.b;
    }
}
