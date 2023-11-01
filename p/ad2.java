package p.ad2;
import p.dd2;
import androidx.fragment.app.Fragment;
import p.dh2;
import java.util.concurrent.atomic.AtomicReference;
import p.c7;
import p.z6;
import java.lang.String;
import java.lang.Object;
import androidx.activity.result.a;
import p.ek3;
import p.i7;

public final class ad2 extends dd2	// class@000f5d from classes.dex
{
    public final dh2 a;
    public final AtomicReference b;
    public final c7 c;
    public final z6 d;
    public final Fragment e;

    public void ad2(Fragment p0,dh2 p1,AtomicReference p2,c7 p3,z6 p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public final void a(){
       ad2 te = this.e;
       this.b.set(this.a.apply(null).d(te.generateActivityResultKey(), te, this.c, this.d));
    }
}
