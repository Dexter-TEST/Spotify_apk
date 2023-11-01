package p.qr1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsSkipPrev$SkipPrevRequest;
import com.google.protobuf.c;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;

public final class qr1 extends b implements u74	// class@0023fb from classes.dex
{

    public void qr1(){
       super(EsSkipPrev$SkipPrevRequest.i());
    }
    public final void c(boolean p0){
       this.copyOnWrite();
       EsSkipPrev$SkipPrevRequest.e(this.instance, p0);
    }
    public final void d(EsLoggingParams$LoggingParams p0){
       this.copyOnWrite();
       EsSkipPrev$SkipPrevRequest.f(this.instance, p0);
    }
    public final void e(EsCommandOptions$CommandOptions p0){
       this.copyOnWrite();
       EsSkipPrev$SkipPrevRequest.g(this.instance, p0);
    }
    public final void f(EsContextTrack$ContextTrack p0){
       this.copyOnWrite();
       EsSkipPrev$SkipPrevRequest.h(this.instance, p0);
    }
}
