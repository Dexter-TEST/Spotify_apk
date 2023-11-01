package p.pq1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsPause$PauseRequest;
import com.google.protobuf.c;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsPauseresumeOrigin$PauseResumeOrigin;

public final class pq1 extends b implements u74	// class@0022ad from classes.dex
{

    public void pq1(){
       super(EsPause$PauseRequest.h());
    }
    public final void c(EsLoggingParams$LoggingParams p0){
       this.copyOnWrite();
       EsPause$PauseRequest.e(this.instance, p0);
    }
    public final void d(EsCommandOptions$CommandOptions p0){
       this.copyOnWrite();
       EsPause$PauseRequest.f(this.instance, p0);
    }
    public final void e(EsPauseresumeOrigin$PauseResumeOrigin p0){
       this.copyOnWrite();
       EsPause$PauseRequest.g(this.instance, p0);
    }
}
