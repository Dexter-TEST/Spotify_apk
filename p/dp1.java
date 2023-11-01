package p.dp1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import com.google.protobuf.c;
import com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean;

public final class dp1 extends b implements u74	// class@00138c from classes.dex
{

    public void dp1(){
       super(EsContextPlayerOptions$ContextPlayerOptionOverrides.h());
    }
    public final void c(EsOptional$OptionalBoolean p0){
       this.copyOnWrite();
       EsContextPlayerOptions$ContextPlayerOptionOverrides.e(this.instance, p0);
    }
    public final void d(EsOptional$OptionalBoolean p0){
       this.copyOnWrite();
       EsContextPlayerOptions$ContextPlayerOptionOverrides.f(this.instance, p0);
    }
    public final void e(EsOptional$OptionalBoolean p0){
       this.copyOnWrite();
       EsContextPlayerOptions$ContextPlayerOptionOverrides.g(this.instance, p0);
    }
}
