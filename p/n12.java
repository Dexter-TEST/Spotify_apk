package p.n12;
import androidx.viewpager2.adapter.a;
import androidx.fragment.app.Fragment;
import p.b12;
import java.lang.IllegalStateException;
import java.lang.String;
import p.tp2;
import p.t02;
import p.v02;
import p.z02;

public final class n12 extends a	// class@001f47 from classes.dex
{
    public final boolean C;

    public void n12(Fragment p0,boolean p1){
       super(p0);
       this.C = p1;
    }
    public final int d(){
       int i = (this.C != null)? 4: 3;
       return i;
    }
    public final Fragment y(int p0){
       if (!p0) {
          return new z02();
       }
       if (p0 == 1) {
          return new v02();
       }
       if (p0 == 2) {
          return new t02();
       }
       if (p0 == 3) {
          return new b12();
       }
       throw new IllegalStateException(tp2.k("Unknown position: ", p0));
    }
}
