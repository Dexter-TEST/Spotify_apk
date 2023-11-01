package p.b15;
import p.da0;
import p.e15;
import p.ca0;
import java.lang.Object;
import p.t90;
import java.io.IOException;
import p.s90;
import java.lang.Throwable;
import p.do5;
import p.cx5;
import p.bx5;

public final class b15 implements da0	// class@000174 from classes2.dex
{
    public final ca0 a;
    public final e15 b;

    public void b15(e15 p0,ca0 p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void onFailure(t90 p0,IOException p1){
       this.a.g(this.b, p1);
       return;
    }
    public final void onResponse(t90 p0,cx5 p1){
       b15 tb = this.b;
       this.a.j(tb, tb.d(p1));
       return;
    }
}
