package p.cb;
import p.db;
import p.sl6;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;

public final class cb extends db	// class@0011d8 from classes.dex
{
    public final String a;
    public final sl6 b;

    public void cb(sl6 p0,String p1){
       co5.o(p1, "step");
       co5.o(p0, "skipType");
       super();
       this.a = p1;
       this.b = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof cb) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return "ShowSkipDialog\(step="+this.a+", skipType="+this.b+')';
    }
}
