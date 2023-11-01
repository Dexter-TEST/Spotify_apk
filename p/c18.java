package p.c18;
import p.z18;
import p.v18;
import p.u18;
import java.lang.Object;
import java.lang.Enum;
import java.lang.String;
import java.lang.StringBuilder;

public final class c18 extends z18	// class@00117c from classes.dex
{
    public final v18 a;
    public final u18 b;

    public void c18(v18 p0,u18 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       c18 ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof z18) {
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
       c18 ta;
       c18 tb;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       i1 = (i1 ^ 0xf4243) * 0xf4243;
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       return (i ^ i1);
    }
    public final String toString(){
       return "NetworkConnectionInfo{networkType="+this.a+", mobileSubtype="+this.b+"}";
    }
}
