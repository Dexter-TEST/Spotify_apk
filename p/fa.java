package p.fa;
import p.ma;
import p.ls6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class fa extends ma	// class@001591 from classes.dex
{
    public final ls6 a;

    public void fa(ls6 p0){
       co5.o(p0, "step");
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof fa) {
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
       return "NextStep\(step="+this.a+')';
    }
}
