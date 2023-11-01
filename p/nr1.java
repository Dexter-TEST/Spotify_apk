package p.nr1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsSetShufflingContext$SetShufflingContextRequest;
import com.google.protobuf.c;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;

public final class nr1 extends b implements u74	// class@002032 from classes.dex
{

    public void nr1(){
       super(EsSetShufflingContext$SetShufflingContextRequest.h());
    }
    public final void c(EsLoggingParams$LoggingParams p0){
       this.copyOnWrite();
       EsSetShufflingContext$SetShufflingContextRequest.e(this.instance, p0);
    }
    public final void d(EsCommandOptions$CommandOptions p0){
       this.copyOnWrite();
       EsSetShufflingContext$SetShufflingContextRequest.f(this.instance, p0);
    }
    public final void e(boolean p0){
       this.copyOnWrite();
       EsSetShufflingContext$SetShufflingContextRequest.g(this.instance, p0);
    }
}
