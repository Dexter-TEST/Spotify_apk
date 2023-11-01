package p.hs;
import p.cz0;
import p.bz0;
import p.i73;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;

public final class hs extends cz0	// class@0018b6 from classes.dex
{
    public final bz0 a;
    public final i73 b;
    public final Boolean c;
    public final int d;

    public void hs(bz0 p0,i73 p1,Boolean p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       hs tb;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof cz0) {
          return false;
       }
       if (this.a.equals(p0.a)) {
          if ((tb = this.b) == null) {
             if (p0.b != null) {
             label_0040 :
                b = false;
             label_0041 :
                return b;
             }
          }else if(tb.equals(p0.b)){
          }
          if ((tb = this.c) == null) {
             if (p0.c != null) {
             }
          }else if(tb.equals(p0.c)){
          }
          if (this.d == p0.d) {
             goto label_0041 ;
          }else {
             goto label_0040 ;
          }
       }else {
          goto label_0040 ;
       }
    }
    public final int hashCode(){
       hs tb;
       int i = 0xf4243;
       int i1 = (this.a.hashCode() ^ i) * i;
       int i2 = 0;
       int i3 = ((tb = this.b) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i;
       if ((tb = this.c) != null) {
          i2 = tb.hashCode();
       }
       return (((i1 ^ i2) * i) ^ this.d);
    }
    public final String toString(){
       return en6.o("Application{execution="+this.a+", customAttributes="+this.b+", background="+this.c+", uiOrientation=", this.d, "}");
    }
}
