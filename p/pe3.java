package p.pe3;
import p.ve3;
import p.me3;
import p.ue0;
import p.ve0;
import p.re3;

public class pe3 extends ve3	// class@002246 from classes.dex
{
    public final boolean b;

    public void pe3(me3 p0){
       boolean b = true;
       super(b);
       this.w(p0);
       ue0 oue0 = this.s();
       if (oue0 instanceof ve0) {
       }else {
          oue0 = null;
       }
       if (oue0 != null) {
          ve3 ove3 = oue0.k();
          while (!ove3.p()) {
             oue0 = ove3.s();
             if (oue0 instanceof ve0) {
             }else {
                oue0 = null;
             }
             if (oue0 != null) {
                ove3 = oue0.k();
             }
          }
          this.b = b;
          return;
       }
       b = false;
    }
    public final boolean p(){
       return this.b;
    }
    public final boolean q(){
       return true;
    }
}
