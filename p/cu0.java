package p.cu0;
import p.da0;
import p.zf2;
import p.t90;
import p.wb0;
import java.lang.Object;
import java.lang.Throwable;
import p.lp5;
import p.jc7;
import java.io.IOException;
import p.tx5;
import p.eb3;
import p.cx5;

public final class cu0 implements da0, zf2	// class@001278 from classes.dex
{
    public final t90 a;
    public final vb0 b;

    public void cu0(t90 p0,wb0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object invoke(Object p0){
       this.a.cancel();
       return jc7.a;
    }
    public final void onFailure(t90 p0,IOException p1){
       if (p0.G == null) {
          this.b.d(eb3.h(p1));
       }
       return;
    }
    public final void onResponse(t90 p0,cx5 p1){
       this.b.d(p1);
    }
}
