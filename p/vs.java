package p.vs;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class vs	// class@002a5b from classes.dex
{
    public final int a;
    public final int b;
    public final List c;

    public void vs(int p0,int p1,List p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       vs tc;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof vs) {
          return false;
       }
       if (this.a == p0.a && this.b == p0.b) {
          p0 = p0.c;
          if ((tc = this.c) == null) {
             if (p0 == null) {
             label_0028 :
                return b;
             }
          }else if(tc.equals(p0)){
             goto label_0028 ;
          }
       }
       b = false;
       goto label_0028 ;
    }
    public final int hashCode(){
       vs tc;
       int i = (((this.a ^ 0xf4243) * 0xf4243) ^ this.b) * 0xf4243;
       int i1 = ((tc = this.c) == null)? 0: tc.hashCode();
       return (i ^ i1);
    }
    public final String toString(){
       return "MoveEvent{from="+this.a+", to="+this.b+", snapshot="+this.c+"}";
    }
}
