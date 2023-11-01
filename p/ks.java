package p.ks;
import p.xy0;
import java.lang.String;
import p.i73;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class ks extends xy0	// class@001c78 from classes.dex
{
    public final String a;
    public final String b;
    public final i73 c;
    public final xy0 d;
    public final int e;

    public void ks(String p0,String p1,i73 p2,xy0 p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean equals(Object p0){
       ks tb;
       ks td;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof xy0) {
          return false;
       }
       if (this.a.equals(p0.a)) {
          if ((tb = this.b) == null) {
             if (p0.b != null) {
             label_0048 :
                b = false;
             label_0049 :
                return b;
             }
          }else if(tb.equals(p0.b)){
          }
          if (this.c.equals(p0.c)) {
             tb = p0.d;
             if ((td = this.d) == null) {
                if (tb != null) {
                }
             }else if(td.equals(tb)){
             }
             if (this.e == p0.e) {
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
    }
    public final int hashCode(){
       ks tb;
       int i = 0xf4243;
       int i1 = (this.a.hashCode() ^ i) * i;
       int i2 = 0;
       int i3 = ((tb = this.b) == null)? 0: tb.hashCode();
       i1 = (((i1 ^ i3) * i) ^ this.c.hashCode()) * i;
       if ((tb = this.d) != null) {
          i2 = tb.hashCode();
       }
       return (((i1 ^ i2) * i) ^ this.e);
    }
    public final String toString(){
       return en6.o("Exception{type="+this.a+", reason="+this.b+", frames="+this.c+", causedBy="+this.d+", overflowCount=", this.e, "}");
    }
}
