package p.yr;
import p.sy0;
import p.i73;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class yr extends sy0	// class@002e16 from classes.dex
{
    public final i73 a;
    public final String b;

    public void yr(i73 p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       yr tb;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof sy0) {
          return false;
       }
       if (this.a.equals(p0.a)) {
          if ((tb = this.b) == null) {
             if (p0.b == null) {
             label_002f :
                return b;
             }
          }else if(tb.equals(p0.b)){
             goto label_002f ;
          }
       }
       b = false;
       goto label_002f ;
    }
    public final int hashCode(){
       yr tb;
       int i = (this.a.hashCode() ^ 0xf4243) * 0xf4243;
       int i1 = ((tb = this.b) == null)? 0: tb.hashCode();
       return (i ^ i1);
    }
    public final String toString(){
       return en6.p("FilesPayload{files="+this.a+", orgId=", this.b, "}");
    }
}
