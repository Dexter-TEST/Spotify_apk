package p.o93;
import java.lang.Object;
import java.util.ArrayList;
import android.graphics.Path;
import p.v97;
import p.mf7;
import p.z52;

public final class o93	// class@0020d5 from classes.dex
{
    public final ArrayList a;

    public void o93(){
       super();
       this.a = new ArrayList();
    }
    public final void a(Path p0){
       v97 ov97;
       o93 ta = this.a;
       int i = ta.size();
       while ((i = i - 1) >= 0) {
          if ((ov97 = ta.get(i)) != null && ov97.a == null) {
             float f = ov97.d.i() / 100.00f;
             float f1 = ov97.e.i() / 100.00f;
             float f2 = ov97.f.i() / 360.00f;
             mf7.a(p0, f, f1, f2);
          }
       }
       return;
    }
}
