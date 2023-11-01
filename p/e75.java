package p.e75;
import p.lv1;
import java.lang.String;
import p.i70;
import java.lang.Object;
import java.util.Objects;
import p.gv5;
import p.su0;

public final class e75 extends lv1	// class@0001ce from classes2.dex
{
    public final int P;
    public final String Q;
    public final su0 R;
    public final boolean S;

    public void e75(String p0,boolean p1,int p2){
       i70 a = i70.a;
       this.P = p2;
       if (p2 != 1) {
          super();
          Objects.requireNonNull(p0, "name == null");
          this.Q = p0;
          this.R = a;
          this.S = p1;
          return;
       }else {
          super();
          Objects.requireNonNull(p0, "name == null");
          this.Q = p0;
          this.R = a;
          this.S = p1;
          return;
       }
    }
    public final void a(gv5 p0,Object p1){
       e75 tS = this.S;
       e75 tQ = this.Q;
       e75 tR = this.R;
       switch (this.P){
           case 0:
             if (p1 != null && (p1 = tR.a(p1)) != null) {
                p0.a(tQ, p1, tS);
             }
             break;
           default:
             if (p1 != null && (p1 = tR.a(p1)) != null) {
                p0.c(tQ, p1, tS);
             }
             return;
       }
       return;
    }
}
