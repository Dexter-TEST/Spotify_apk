package p.an1;
import p.ac;
import java.lang.Object;
import p.tk7;
import p.ab3;
import java.lang.Class;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import java.lang.String;
import p.en6;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.wk7;

public final class an1	// class@000fb5 from classes.dex
{
    public final ac a;

    public void an1(ac p0){
       this.a = p0;
       super();
    }
    public void a(tk7 p0,tk7 p1,int p2){
       an1 ta = this.a;
       ta.getClass();
       wo3 owo3 = LiteInteraction.l();
       owo3.f("lite/entity/context-menu");
       owo3.h(p0.a);
       owo3.g(p1.a);
       owo3.d("hit");
       owo3.c(en6.e(p2));
       ta.a.a(owo3.build());
    }
    public void b(wk7 p0,int p1,String p2){
       an1 ta = this.a;
       ta.getClass();
       wo3 owo3 = LiteInteraction.l();
       owo3.f("lite/settings");
       owo3.h("spotify:settings");
       owo3.g(p0.a);
       owo3.d("hit");
       owo3.c(en6.e(p1));
       owo3.e(p2);
       ta.a.a(owo3.build());
    }
}
