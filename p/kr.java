package p.kr;
import java.lang.String;
import java.lang.Object;
import p.hr;
import java.lang.Long;
import java.lang.StringBuilder;

public final class kr	// class@001c6f from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public void kr(String p0,String p1,String p2,long p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static kr a(long p0,String p1,String p2,String p3){
       hr ohr = new hr();
       ohr.d(p1);
       ohr.c(p2);
       ohr.d = Long.valueOf(p0);
       ohr.a = p3;
       return ohr.b();
    }
    public final boolean equals(Object p0){
       kr ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof kr) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_001c :
             if (this.b.equals(p0.b) && (this.c.equals(p0.c) && !(this.d - p0.d))) {
             label_003a :
                return b;
             }
          }
       }else if(ta.equals(p0.a)){
          goto label_001c ;
       }
       b = false;
       goto label_003a ;
    }
    public final int hashCode(){
       kr ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       kr td = this.d;
       return (((((((i ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ (int)((td >> 32) ^ td));
    }
    public final String toString(){
       return "ArtistEntity{tag="+this.a+", uri="+this.b+", name="+this.c+", created="+this.d+"}";
    }
}
