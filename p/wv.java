package p.wv;
import java.lang.String;
import p.y57;
import java.lang.Object;
import java.lang.StringBuilder;

public final class wv	// class@002bb8 from classes.dex
{
    public final String a;
    public final long b;
    public final y57 c;

    public void wv(String p0,long p1,y57 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       wv ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof wv) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_001c :
             if (!(this.b - p0.b)) {
                p0 = p0.c;
                if ((ta = this.c) == null) {
                   if (p0 == null) {
                   label_0035 :
                      return b;
                   }
                }else if(ta.equals(p0)){
                   goto label_0035 ;
                }
             }
          }
       }else if(ta.equals(p0.a)){
          goto label_001c ;
       }
       b = false;
       goto label_0035 ;
    }
    public final int hashCode(){
       wv ta;
       wv tc;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       wv tb = this.b;
       i1 = (((i1 ^ 0xf4243) * 0xf4243) ^ (int)((tb >> 32) ^ tb)) * 0xf4243;
       if ((tc = this.c) != null) {
          i = tc.hashCode();
       }
       return (i ^ i1);
    }
    public final String toString(){
       return "TokenResult{token="+this.a+", tokenExpirationTimestamp="+this.b+", responseCode="+this.c+"}";
    }
}
