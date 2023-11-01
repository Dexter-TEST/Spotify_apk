package p.ob0;
import p.qb0;
import p.uq7;
import java.util.UUID;
import p.xy5;
import java.lang.String;
import p.bo0;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import p.t36;

public final class ob0 extends qb0	// class@0020e5 from classes.dex
{
    public final uq7 b;
    public final UUID c;

    public void ob0(uq7 p0,UUID p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void b(){
       ob0 tb = this.b;
       uq7 c = tb.C;
       c.c();
       qb0.a(tb, this.c.toString());
       c.r();
       c.m();
       t36.a(tb.B, tb.C, tb.E);
    }
}
