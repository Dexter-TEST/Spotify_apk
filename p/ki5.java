package p.ki5;
import java.lang.String;
import java.lang.Long;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;

public final class ki5	// class@001c1d from classes.dex
{
    public final String a;
    public final Long b;

    public void ki5(String p0,Long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ki5) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       ki5 tb;
       int i = this.a.hashCode() * 31;
       int i1 = ((tb = this.b) == null)? 0: tb.hashCode();
       return (i + i1);
    }
    public final String toString(){
       return "Preference\(key="+this.a+", value="+this.b+')';
    }
}
