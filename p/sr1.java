package p.sr1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsStop$StopRequest;
import com.google.protobuf.c;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;

public final class sr1 extends b implements u74	// class@002683 from classes.dex
{

    public void sr1(){
       super(EsStop$StopRequest.f());
    }
    public final void c(EsLoggingParams$LoggingParams p0){
       this.copyOnWrite();
       EsStop$StopRequest.e(this.instance, p0);
    }
}
