package p.ew;
import java.lang.String;
import java.lang.Long;
import java.lang.Object;
import p.ce7;
import java.lang.NullPointerException;
import java.lang.StringBuilder;

public final class ew	// class@001513 from classes.dex
{
    public final String a;
    public final Long b;
    public final Long c;

    public void ew(String p0,Long p1,Long p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static ew a(String p0,Long p1,Long p2){
       ce7 uoce7 = new ce7(null);
       if (p0 == null) {
          throw new NullPointerException("Null uri");
       }
       uoce7.a = p0;
       uoce7.b = p1;
       uoce7.c = p2;
       return new ew(p0, p1, p2);
    }
    public final boolean equals(Object p0){
       ew tb;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ew) {
          return false;
       }
       if (this.a.equals(p0.a)) {
          ew b1 = p0.b;
          if ((tb = this.b) == null) {
             if (b1 != null) {
             label_0034 :
                b = false;
             label_0035 :
                return b;
             }
          }else if(tb.equals(b1)){
          }
          p0 = p0.c;
          if ((b1 = this.c) == null) {
             if (p0 == null) {
                goto label_0035 ;
             }else {
                goto label_0034 ;
             }
          }else if(b1.equals(p0)){
             goto label_0035 ;
          }else {
             goto label_0034 ;
          }
       }else {
          goto label_0034 ;
       }
    }
    public final int hashCode(){
       ew tb;
       ew tc;
       int i = 0xf4243;
       int i1 = (this.a.hashCode() ^ i) * i;
       int i2 = 0;
       int i3 = ((tb = this.b) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i;
       if ((tc = this.c) != null) {
          i2 = tc.hashCode();
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return "TrackRowInfo{uri="+this.a+", trackCreated="+this.b+", episodeCreated="+this.c+"}";
    }
}
