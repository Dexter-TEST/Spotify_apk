package p.zm0;
import p.an0;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayList;
import p.dj0;
import p.w70;
import java.lang.Class;
import p.t65;
import p.i22;

public final class zm0	// class@002f22 from classes.dex
{
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public void zm0(an0 p0){
       super();
       this.a = dj0.C0(p0.a);
       this.b = dj0.C0(p0.b);
       this.c = dj0.C0(p0.c);
       this.d = dj0.C0(p0.d);
       this.e = dj0.C0(p0.e);
    }
    public final void a(w70 p0,Class p1){
       this.b.add(new t65(p0, p1));
    }
    public final void b(i22 p0,Class p1){
       this.d.add(new t65(p0, p1));
    }
}
