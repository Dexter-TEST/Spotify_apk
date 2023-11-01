package p.mr1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsSetRepeatingTrack$SetRepeatingTrackRequest;
import com.google.protobuf.c;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;

public final class mr1 extends b implements u74	// class@001eec from classes.dex
{

    public void mr1(){
       super(EsSetRepeatingTrack$SetRepeatingTrackRequest.h());
    }
    public final void c(EsLoggingParams$LoggingParams p0){
       this.copyOnWrite();
       EsSetRepeatingTrack$SetRepeatingTrackRequest.e(this.instance, p0);
    }
    public final void d(EsCommandOptions$CommandOptions p0){
       this.copyOnWrite();
       EsSetRepeatingTrack$SetRepeatingTrackRequest.f(this.instance, p0);
    }
    public final void e(boolean p0){
       this.copyOnWrite();
       EsSetRepeatingTrack$SetRepeatingTrackRequest.g(this.instance, p0);
    }
}
