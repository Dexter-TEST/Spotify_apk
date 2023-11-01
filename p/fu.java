package p.fu;
import p.i65;
import p.r45;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class fu implements i65	// class@001641 from classes.dex
{
    public final r45 a;
    public final r45 b;
    public final String c;

    public void fu(r45 p0,r45 p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final r45 a(){
       return this.b;
    }
    public final r45 e(){
       return this.a;
    }
    public final boolean equals(Object p0){
       fu tc;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof fu) {
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
       fu tc;
       int i = (((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243;
       int i1 = ((tc = this.c) == null)? 0: tc.hashCode();
       return (i ^ i1);
    }
    public final String next(){
       return this.c;
    }
    public final String toString(){
       return en6.p("PageImpl{header="+this.a+", items="+this.b+", next=", this.c, "}");
    }
}
