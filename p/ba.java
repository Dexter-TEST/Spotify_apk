package p.ba;
import p.ma;
import p.p46;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class ba extends ma	// class@00108b from classes.dex
{
    public final p46 a;

    public void ba(p46 p0){
       co5.o(p0, "response");
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ba) {
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
       return "ConcludeStep\(response="+this.a+')';
    }
}
