package p.rq1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsPlay$PlayRequest;
import com.google.protobuf.c;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsPreparePlay$PreparePlayRequest;

public final class rq1 extends b implements u74	// class@002538 from classes.dex
{

    public void rq1(){
       super(EsPlay$PlayRequest.g());
    }
    public final void c(EsLoggingParams$LoggingParams p0){
       this.copyOnWrite();
       EsPlay$PlayRequest.e(this.instance, p0);
    }
    public final void d(EsPreparePlay$PreparePlayRequest p0){
       this.copyOnWrite();
       EsPlay$PlayRequest.f(this.instance, p0);
    }
}
