package p.wt;
import p.tv;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class wt	// class@002ba6 from classes.dex
{
    public final boolean a;
    public final long b;
    public final long c;
    public final tv d;

    public void wt(boolean p0,long p1,long p2,tv p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       wt td;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof wt) {
          return false;
       }
       if (this.a == p0.a && (!(this.b - p0.b) && !(this.c - p0.c))) {
          p0 = p0.d;
          if ((td = this.d) == null) {
             if (p0 == null) {
             label_0032 :
                return b;
             }
          }else if(td.equals(p0)){
             goto label_0032 ;
          }
       }
       b = false;
       goto label_0032 ;
    }
    public final int hashCode(){
       wt td;
       int i = (this.a != null)? 1231: 1237;
       wt tb = this.b;
       tb = this.c;
       i = (((((i ^ 0xf4243) * 0xf4243) ^ (int)(tb ^ (tb >> 32))) * 0xf4243) ^ (int)(tb ^ (tb >> 32))) * 0xf4243;
       int i1 = ((td = this.d) == null)? 0: td.hashCode();
       return (i ^ i1);
    }
    public final String toString(){
       return "MoveStorageProgress{idle="+this.a+", estimated="+this.b+", transferred="+this.c+", location="+this.d+"}";
    }
}
