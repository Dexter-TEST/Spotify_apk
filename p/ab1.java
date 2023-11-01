package p.ab1;
import p.fe2;
import p.cb1;
import java.lang.Object;
import androidx.fragment.app.o;
import androidx.fragment.app.Fragment;
import java.lang.String;
import p.co5;
import java.util.AbstractCollection;
import java.util.Collection;
import p.eo5;
import p.vj3;
import p.dk3;

public final class ab1 implements fe2	// class@000f4a from classes.dex
{
    public final cb1 a;

    public void ab1(cb1 p0){
       this.a = p0;
    }
    public final void b(o p0,Fragment p1){
       ab1 ta = this.a;
       co5.o(ta, "this$0");
       co5.o(p1, "childFragment");
       cb1 e = ta.e;
       eo5.d(e);
       if (e.remove(p1.getTag())) {
          p1.getLifecycle().a(ta.f);
       }
       return;
    }
}
