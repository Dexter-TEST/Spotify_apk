package p.zm6;
import p.a02;
import p.ta3;
import p.tm5;
import p.b17;
import p.xe7;
import java.lang.Object;
import android.app.Application;
import java.lang.Boolean;
import p.o60;
import p.ym6;

public final class zm6 implements a02	// class@002f28 from classes.dex
{
    public final tm5 a;
    public final tm5 b;
    public final tm5 c;
    public final tm5 d;

    public void zm6(ta3 p0,tm5 p1){
       super();
       this.a = p0;
       this.b = b17.x;
       this.c = xe7.D;
       this.d = p1;
    }
    public final Object get(){
       return new ym6(this.a.get(), this.b.get().booleanValue(), this.c.get().booleanValue(), this.d.get());
    }
}
