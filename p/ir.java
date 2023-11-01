package p.ir;
import java.lang.String;
import java.lang.Object;
import p.hr;
import java.lang.Long;
import java.lang.NullPointerException;
import java.lang.StringBuilder;

public final class ir	// class@0019f2 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public void ir(String p0,String p1,String p2,long p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static ir a(long p0,String p1,String p2,String p3){
       hr ohr = new hr();
       if (p1 == null) {
          throw new NullPointerException("Null uri");
       }
       ohr.b = p1;
       if (p2 == null) {
          throw new NullPointerException("Null name");
       }
       ohr.c = p2;
       ohr.d = Long.valueOf(p0);
       ohr.a = p3;
       return ohr.a();
    }
    public final boolean equals(Object p0){
       ir ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ir) {
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
       ir ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       ir td = this.d;
       return (((((((i ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ (int)((td >> 32) ^ td));
    }
    public final String toString(){
       return "AlbumEntity{tag="+this.a+", uri="+this.b+", name="+this.c+", created="+this.d+"}";
    }
}
