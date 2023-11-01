package p.us;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class us	// class@002914 from classes.dex
{
    public final String a;
    public final String b;
    public final boolean c;

    public void us(String p0,String p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       us ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof us) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_001c :
             if ((ta = this.b) == null) {
                if (p0.b != null) {
                label_0034 :
                   b = false;
                label_0035 :
                   return b;
                }
             }else if(ta.equals(p0.b)){
             }
             if (this.c == p0.c) {
                goto label_0035 ;
             }else {
                goto label_0034 ;
             }
          }else {
             goto label_0034 ;
          }
       }else if(ta.equals(p0.a)){
          goto label_001c ;
       }else {
          goto label_0034 ;
       }
    }
    public final int hashCode(){
       us ta;
       us tb;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       i1 = (i1 ^ 0xf4243) * 0xf4243;
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       i = (i ^ i1) * 0xf4243;
       i1 = (this.c != null)? 1231: 1237;
       return (i ^ i1);
    }
    public final String toString(){
       return en6.q("EditPlaylistHeader{title="+this.a+", image="+this.b+", enableReorder=", this.c, "}");
    }
}
