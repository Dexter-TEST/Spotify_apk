package p.mt;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.lang.StringBuilder;

public final class mt	// class@001f04 from classes.dex
{
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public void mt(String p0,String p1,Integer p2,Integer p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       mt tc;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof mt) {
          return false;
       }
       if (this.a.equals(p0.a) && this.b.equals(p0.b)) {
          mt c = p0.c;
          if ((tc = this.c) == null) {
             if (c != null) {
             label_003e :
                b = false;
             label_003f :
                return b;
             }
          }else if(tc.equals(c)){
          }
          p0 = p0.d;
          if ((c = this.d) == null) {
             if (p0 == null) {
                goto label_003f ;
             }else {
                goto label_003e ;
             }
          }else if(c.equals(p0)){
             goto label_003f ;
          }else {
             goto label_003e ;
          }
       }else {
          goto label_003e ;
       }
    }
    public final int hashCode(){
       mt tc;
       mt td;
       int i = 0xf4243;
       int i1 = (((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i;
       int i2 = 0;
       int i3 = ((tc = this.c) == null)? 0: tc.hashCode();
       i1 = (i1 ^ i3) * i;
       if ((td = this.d) != null) {
          i2 = td.hashCode();
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return "ImageEntity{parentUri="+this.a+", url="+this.b+", width="+this.c+", height="+this.d+"}";
    }
}
