package p.o15;
import p.ub0;
import androidx.activity.b;
import p.k15;
import java.lang.Object;
import p.gk;
import java.lang.Class;
import java.util.concurrent.CopyOnWriteArrayList;
import android.os.Build$VERSION;

public final class o15 implements ub0	// class@00208f from classes.dex
{
    public final k15 a;
    public final b b;

    public void o15(b p0,k15 p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public final void cancel(){
       o15 tb = this.b;
       o15 ta = this.a;
       tb.b.remove(ta);
       ta.getClass();
       ta.b.remove(this);
       if (Build$VERSION.SDK_INT >= 33) {
          ta.c = null;
          tb.c();
       }
       return;
    }
}
