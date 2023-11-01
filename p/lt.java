package p.lt;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import p.ko1;
import java.lang.NullPointerException;
import java.lang.StringBuilder;

public final class lt	// class@001dc1 from classes.dex
{
    public final String a;
    public final Integer b;
    public final Integer c;

    public void lt(String p0,Integer p1,Integer p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static lt a(Integer p0,Integer p1,String p2){
       ko1 oko1 = new ko1(9, 0);
       if (p2 == null) {
          throw new NullPointerException("Null url");
       }
       oko1.b = p2;
       oko1.c = p0;
       oko1.t = p1;
       return new lt(p2, p0, p1);
    }
    public final boolean equals(Object p0){
       lt tb;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof lt) {
          return false;
       }
       if (this.a.equals(p0.a)) {
          lt b1 = p0.b;
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
       lt tb;
       lt tc;
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
       return "Image{url="+this.a+", width="+this.b+", height="+this.c+"}";
    }
}
