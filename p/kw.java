package p.kw;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;

public final class kw	// class@001c9a from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public void kw(String p0,String p1,String p2,String p3,long p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean equals(Object p0){
       kw ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof kw) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_001c :
             if (this.b.equals(p0.b) && (this.c.equals(p0.c) && (this.d.equals(p0.d) && !(this.e - p0.e)))) {
             label_0044 :
                return b;
             }
          }
       }else if(ta.equals(p0.a)){
          goto label_001c ;
       }
       b = false;
       goto label_0044 ;
    }
    public final int hashCode(){
       kw ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       kw te = this.e;
       return (((((((((i ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243) ^ (int)((te >> 32) ^ te));
    }
    public final String toString(){
       return "UserEntity{tag="+this.a+", uri="+this.b+", username="+this.c+", displayName="+this.d+", created="+this.e+"}";
    }
}
