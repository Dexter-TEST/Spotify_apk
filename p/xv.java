package p.xv;
import p.zv;
import p.gr;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import p.nq5;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.StringBuilder;

public final class xv	// class@002cfa from classes.dex
{
    public final zv a;
    public final gr b;
    public final List c;

    public void xv(zv p0,gr p1,List p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static xv a(zv p0,gr p1,ArrayList p2){
       nq5 onq5 = new nq5(9);
       if (p0 == null) {
          throw new NullPointerException("Null entity");
       }
       onq5.a = p0;
       onq5.b = p1;
       onq5.c = p2;
       return new xv(p0, p1, p2);
    }
    public final boolean equals(Object p0){
       xv tb;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof xv) {
          return false;
       }
       if (this.a.equals(p0.a)) {
          xv b1 = p0.b;
          if ((tb = this.b) == null) {
             if (b1 != null) {
             label_002f :
                b = false;
             label_0030 :
                return b;
             }
          }else if(tb.equals(b1)){
          }
          if (this.c.equals(p0.c)) {
             goto label_0030 ;
          }else {
             goto label_002f ;
          }
       }else {
          goto label_002f ;
       }
    }
    public final int hashCode(){
       xv tb;
       int i = 0xf4243;
       int i1 = (this.a.hashCode() ^ i) * i;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       return (((i1 ^ i2) * i) ^ this.c.hashCode());
    }
    public final String toString(){
       return "Track{entity="+this.a+", albumInternal="+this.b+", artists="+this.c+"}";
    }
}
