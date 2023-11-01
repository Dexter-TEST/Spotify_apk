package p.ir1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsResume$ResumeRequest;
import com.google.protobuf.c;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsPauseresumeOrigin$PauseResumeOrigin;

public final class ir1 extends b implements u74	// class@0019eb from classes.dex
{

    public void ir1(){
       super(EsResume$ResumeRequest.h());
    }
    public final void c(EsLoggingParams$LoggingParams p0){
       this.copyOnWrite();
       EsResume$ResumeRequest.e(this.instance, p0);
    }
    public final void d(EsCommandOptions$CommandOptions p0){
       this.copyOnWrite();
       EsResume$ResumeRequest.f(this.instance, p0);
    }
    public final void e(EsPauseresumeOrigin$PauseResumeOrigin p0){
       this.copyOnWrite();
       EsResume$ResumeRequest.g(this.instance, p0);
    }
}
