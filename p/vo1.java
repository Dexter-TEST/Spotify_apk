package p.vo1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsAddToQueueRequest$AddToQueueRequest;
import com.google.protobuf.c;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;

public final class vo1 extends b implements u74	// class@002a32 from classes.dex
{

    public void vo1(){
       super(EsAddToQueueRequest$AddToQueueRequest.h());
    }
    public final void c(EsLoggingParams$LoggingParams p0){
       this.copyOnWrite();
       EsAddToQueueRequest$AddToQueueRequest.e(this.instance, p0);
    }
    public final void d(EsCommandOptions$CommandOptions p0){
       this.copyOnWrite();
       EsAddToQueueRequest$AddToQueueRequest.f(this.instance, p0);
    }
    public final void e(EsContextTrack$ContextTrack p0){
       this.copyOnWrite();
       EsAddToQueueRequest$AddToQueueRequest.g(this.instance, p0);
    }
}
