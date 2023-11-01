package p.d08;
import p.k18;
import p.h18;
import p.zv7;
import java.lang.Object;
import java.lang.Enum;
import java.lang.String;
import java.lang.StringBuilder;

public final class d08 extends k18	// class@0012b6 from classes.dex
{
    public final h18 a;
    public final zv7 b;

    public void d08(h18 p0,zv7 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       d08 ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof k18) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_0020 :
             if ((ta = this.b) == null) {
                if (p0.b == null) {
                label_0037 :
                   return b;
                }
             }else if(ta.equals(p0.b)){
                goto label_0037 ;
             }
          }
       }else if(ta.equals(p0.a)){
          goto label_0020 ;
       }
       b = false;
       goto label_0037 ;
    }
    public final int hashCode(){
       d08 ta;
       d08 tb;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       i1 = (i1 ^ 0xf4243) * 0xf4243;
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       return (i ^ i1);
    }
    public final String toString(){
       return "ClientInfo{clientType="+this.a+", androidClientInfo="+this.b+"}";
    }
}
