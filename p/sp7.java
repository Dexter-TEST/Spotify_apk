package p.sp7;
import p.rp7;
import p.xp7;
import android.view.WindowInsets;
import p.qp7;
import p.l55;
import android.view.View;
import p.pc1;
import android.view.DisplayCutout;
import java.lang.Object;
import java.util.Objects;

public class sp7 extends rp7	// class@002677 from classes.dex
{

    public void sp7(xp7 p0,WindowInsets p1){
       super(p0, p1);
    }
    public xp7 a(){
       return xp7.g(l55.j(this.c), null);
    }
    public pc1 e(){
       DisplayCutout uDisplayCuto;
       pc1 opc1 = ((uDisplayCuto = l55.h(this.c)) == null)? null: new pc1(uDisplayCuto);
       return opc1;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof sp7) {
          return false;
       }
       if (!Objects.equals(this.c, p0.c) || !Objects.equals(this.g, p0.g)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return this.c.hashCode();
    }
}
