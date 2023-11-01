package p.bw;
import p.pz5;
import java.lang.String;
import p.zv;
import java.lang.Object;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import p.r45;
import java.lang.StringBuilder;

public final class bw implements pz5	// class@00114f from classes.dex
{
    public final String a;
    public final String b;
    public final int c;
    public final zv d;

    public void bw(String p0,String p1,int p2,zv p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static bw b(String p0,String p1,int p2,zv p3){
       Integer integer;
       if (p0 == null) {
          throw new NullPointerException("Null uri");
       }
       if (p1 == null) {
          throw new NullPointerException("Null uid");
       }
       String str = ((integer = Integer.valueOf(p2)) == null)? " position": "";
       if (str.isEmpty()) {
          return new bw(p0, p1, integer.intValue(), p3);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final String a(){
       return this.a;
    }
    public final r45 c(){
       return r45.a(this.d);
    }
    public final boolean equals(Object p0){
       bw td;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof bw) {
          return false;
       }
       if (this.a.equals(p0.a) && (this.b.equals(p0.b) && this.c == p0.c)) {
          p0 = p0.d;
          if ((td = this.d) == null) {
             if (p0 == null) {
             label_0036 :
                return b;
             }
          }else if(td.equals(p0)){
             goto label_0036 ;
          }
       }
       b = false;
       goto label_0036 ;
    }
    public final int hashCode(){
       bw td;
       int i = (((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c) * 0xf4243;
       int i1 = ((td = this.d) == null)? 0: td.hashCode();
       return (i ^ i1);
    }
    public final int position(){
       return this.c;
    }
    public final String toString(){
       return "TrackRow{uri="+this.a+", uid="+this.b+", position="+this.c+", trackInternal="+this.d+"}";
    }
}
