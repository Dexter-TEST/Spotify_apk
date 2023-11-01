package p.ge2;
import p.ej4;
import java.lang.Object;
import p.p6;
import androidx.fragment.app.Fragment;
import p.rr3;
import java.lang.String;
import java.lang.Enum;
import java.lang.Class;
import android.os.Bundle;
import java.lang.Throwable;
import p.w53;
import p.ac;
import p.v55;
import p.vk7;
import p.ab3;
import p.jj4;
import p.kp3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LitePageViewNonAuth;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import androidx.fragment.app.o;
import android.view.View;

public final class ge2 extends ej4	// class@0016ef from classes.dex
{
    public final int o0;
    public final Object p0;

    public void ge2(int p0,Object p1){
       this.o0 = p0;
       this.p0 = p1;
    }
    public final void S0(p6 p0,Fragment p1){
       Object[] objArray = new Object[]{p0.name(),p1.getClass().getSimpleName(),p1.getArguments()};
       this.p0.a('I', "FRAGMENT", String.format("%s\(class=%s, args=%s\)", objArray), null);
    }
    public final void j0(Fragment p0){
       switch (this.o0){
           case 1:
           default:
             return;
       }
       this.S0(p6.v, p0);
       return;
    }
    public final void k0(Fragment p0){
       switch (this.o0){
           case 1:
           default:
             return;
       }
       this.S0(p6.b, p0);
       return;
    }
    public final void l0(Fragment p0){
       switch (this.o0){
           case 1:
           default:
             return;
       }
       this.S0(p6.t, p0);
       return;
    }
    public final void m0(Fragment p0){
       switch (this.o0){
           case 1:
           default:
             return;
       }
       this.S0(p6.D, p0);
       return;
    }
    public final void n0(Fragment p0){
       switch (this.o0){
           case 1:
           default:
             return;
       }
       this.S0(p6.E, p0);
       return;
    }
    public final void o0(Fragment p0){
       switch (this.o0){
           case 0:
             break;
           default:
             this.S0(p6.z, p0);
             return;
       }
       ge2 tp0 = this.p0;
       if (p0 instanceof w53) {
          w53 ow53 = p0;
          v55 ov55 = ow53.h();
          tp0.c(ov55, ow53.b());
       }
       if (p0 instanceof jj4) {
          p0.getClass();
          tp0.getClass();
          kp3 okp3 = LitePageViewNonAuth.i();
          okp3.d("exit");
          okp3.c("lite/welcome");
          okp3.e("spotify:welcome");
          tp0.a.a(okp3.build());
       }
       return;
    }
    public final void p0(Fragment p0){
       switch (this.o0){
           case 1:
           default:
             return;
       }
       this.S0(p6.a, p0);
       return;
    }
    public final void q0(Fragment p0){
       switch (this.o0){
           case 1:
           default:
             return;
       }
       this.S0(p6.c, p0);
       return;
    }
    public final void r0(Fragment p0){
       switch (this.o0){
           case 0:
             break;
           default:
             this.S0(p6.y, p0);
             return;
       }
       ge2 tp0 = this.p0;
       if (p0 instanceof w53) {
          w53 ow53 = p0;
          v55 ov55 = ow53.h();
          tp0.b(ov55, ow53.b());
       }
       if (p0 instanceof jj4) {
          p0.getClass();
          tp0.getClass();
          kp3 okp3 = LitePageViewNonAuth.i();
          okp3.d("enter");
          okp3.c("lite/welcome");
          okp3.e("spotify:welcome");
          tp0.a.a(okp3.build());
       }
       return;
    }
    public final void s0(Fragment p0){
       switch (this.o0){
           case 1:
           default:
             return;
       }
       this.S0(p6.B, p0);
       return;
    }
    public final void t0(Fragment p0){
       switch (this.o0){
           case 1:
           default:
             return;
       }
       this.S0(p6.x, p0);
       return;
    }
    public final void u0(Fragment p0){
       switch (this.o0){
           case 1:
           default:
             return;
       }
       this.S0(p6.A, p0);
       return;
    }
    public final void v0(o p0,Fragment p1,View p2){
       switch (this.o0){
           case 1:
           default:
             return;
       }
       this.S0(p6.w, p1);
       return;
    }
    public final void w0(Fragment p0){
       switch (this.o0){
           case 1:
           default:
             return;
       }
       this.S0(p6.C, p0);
       return;
    }
}
