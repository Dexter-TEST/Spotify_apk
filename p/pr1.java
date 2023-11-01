package p.pr1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsSkipNext$SkipNextRequest;
import com.google.protobuf.c;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;

public final class pr1 extends b implements u74	// class@0022b6 from classes.dex
{

    public void pr1(){
       super(EsSkipNext$SkipNextRequest.h());
    }
    public final void c(EsLoggingParams$LoggingParams p0){
       this.copyOnWrite();
       EsSkipNext$SkipNextRequest.e(this.instance, p0);
    }
    public final void d(EsCommandOptions$CommandOptions p0){
       this.copyOnWrite();
       EsSkipNext$SkipNextRequest.f(this.instance, p0);
    }
    public final void e(EsContextTrack$ContextTrack p0){
       this.copyOnWrite();
       EsSkipNext$SkipNextRequest.g(this.instance, p0);
    }
}
