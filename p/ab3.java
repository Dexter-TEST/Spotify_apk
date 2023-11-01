package p.ab3;
import p.ac;
import p.t74;
import java.lang.Object;
import p.v55;
import p.vk7;
import java.lang.String;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import p.x55;
import p.en6;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.jp3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LitePageView;
import p.yp3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteSmartlockNonAuth;

public final class ab3 implements ac	// class@000f4c from classes.dex
{
    public final t74 a;

    public void ab3(t74 p0){
       super();
       this.a = p0;
    }
    public final void a(v55 p0,vk7 p1,vk7 p2,int p3,String p4){
       x55 ox55 = LiteInteraction.l();
       ox55.f(p0.a);
       ox55.h(p1.a());
       ox55.g(p2.a());
       ox55.d(en6.f(2));
       ox55.c(en6.e(p3));
       if (p4 != null) {
          ox55.e(p4);
       }
       this.a.a(ox55.build());
       return;
    }
    public final void b(v55 p0,vk7 p1){
       jp3 ojp3 = LitePageView.i();
       ojp3.d("enter");
       ojp3.c(p0.a);
       ojp3.e(p1.a());
       this.a.a(ojp3.build());
    }
    public final void c(v55 p0,vk7 p1){
       jp3 ojp3 = LitePageView.i();
       ojp3.d("exit");
       ojp3.c(p0.a);
       ojp3.e(p1.a());
       this.a.a(ojp3.build());
    }
    public final void d(String p0,String p1){
       yp3 oyp3 = LiteSmartlockNonAuth.h();
       oyp3.c(p0);
       oyp3.d(p1);
       this.a.a(oyp3.build());
    }
}
