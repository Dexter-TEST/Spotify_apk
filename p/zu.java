package p.zu;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;

public final class zu	// class@002f6e from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public void zu(String p0,String p1,String p2,String p3,long p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean equals(Object p0){
       zu ta;
       zu td;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof zu) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_001c :
             if (this.b.equals(p0.b) && this.c.equals(p0.c)) {
                ta = p0.d;
                if ((td = this.d) == null) {
                   if (ta != null) {
                   label_0048 :
                      b = false;
                   label_0049 :
                      return b;
                   }
                }else if(td.equals(ta)){
                }
                if (!(this.e - p0.e)) {
                   goto label_0049 ;
                }else {
                   goto label_0048 ;
                }
             }else {
                goto label_0048 ;
             }
          }else {
             goto label_0048 ;
          }
       }else if(ta.equals(p0.a)){
          goto label_001c ;
       }else {
          goto label_0048 ;
       }
    }
    public final int hashCode(){
       zu ta;
       zu td;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       int i2 = 0xf4243;
       i1 = (((((i1 ^ i2) * i2) ^ this.b.hashCode()) * i2) ^ this.c.hashCode()) * i2;
       if ((td = this.d) != null) {
          i = td.hashCode();
       }
       zu te = this.e;
       return (((i ^ i1) * i2) ^ (int)((te >> 32) ^ te));
    }
    public final String toString(){
       return "PlaylistEntity{tag="+this.a+", uri="+this.b+", name="+this.c+", userUri="+this.d+", created="+this.e+"}";
    }
}
