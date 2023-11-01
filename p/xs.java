package p.xs;
import p.zs;
import p.at;
import p.lv;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import p.lq5;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.StringBuilder;

public final class xs	// class@002cdf from classes.dex
{
    public final zs a;
    public final at b;
    public final lv c;
    public final List d;

    public void xs(zs p0,at p1,lv p2,List p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static xs a(zs p0,at p1,lv p2,ArrayList p3){
       lq5 olq5 = new lq5(9);
       if (p0 == null) {
          throw new NullPointerException("Null entity");
       }
       olq5.b = p0;
       olq5.c = p1;
       olq5.t = p2;
       olq5.v = p3;
       return new xs(p0, p1, p2, p3);
    }
    public final boolean equals(Object p0){
       xs tb;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof xs) {
          return false;
       }
       if (this.a.equals(p0.a)) {
          xs b1 = p0.b;
          if ((tb = this.b) == null) {
             if (b1 != null) {
             label_003e :
                b = false;
             label_003f :
                return b;
             }
          }else if(tb.equals(b1)){
          }
          b1 = p0.c;
          if ((tb = this.c) == null) {
             if (b1 != null) {
             }
          }else if(tb.equals(b1)){
          }
          if (this.d.equals(p0.d)) {
             goto label_003f ;
          }else {
             goto label_003e ;
          }
       }else {
          goto label_003e ;
       }
    }
    public final int hashCode(){
       xs tb;
       int i = 0xf4243;
       int i1 = (this.a.hashCode() ^ i) * i;
       int i2 = 0;
       int i3 = ((tb = this.b) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i;
       if ((tb = this.c) != null) {
          i2 = tb.hashCode();
       }
       return (((i1 ^ i2) * i) ^ this.d.hashCode());
    }
    public final String toString(){
       return "Episode{entity="+this.a+", progressInternal="+this.b+", showInternal="+this.c+", images="+this.d+"}";
    }
}
