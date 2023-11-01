package p.ss;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class ss	// class@002692 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;

    public void ss(String p0,String p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       ss tc;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ss) {
          return false;
       }
       if (this.a.equals(p0.a) && this.b.equals(p0.b)) {
          p0 = p0.c;
          if ((tc = this.c) == null) {
             if (p0 == null) {
             label_0030 :
                return b;
             }
          }else if(tc.equals(p0)){
             goto label_0030 ;
          }
       }
       b = false;
       goto label_0030 ;
    }
    public final int hashCode(){
       ss tc;
       int i = (((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243;
       int i1 = ((tc = this.c) == null)? 0: tc.hashCode();
       return (i ^ i1);
    }
    public final String toString(){
       return en6.p("CreatePlaylistResponse{name="+this.a+", uri="+this.b+", navigateTo=", this.c, "}");
    }
}
