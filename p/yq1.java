package p.yq1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsPreparePlay$PreparePlayRequest;
import com.google.protobuf.c;
import com.spotify.player.esperanto.proto.EsContext$Context;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;

public final class yq1 extends b implements u74	// class@002e08 from classes.dex
{

    public void yq1(){
       super(EsPreparePlay$PreparePlayRequest.h());
    }
    public final void c(EsContext$Context p0){
       this.copyOnWrite();
       EsPreparePlay$PreparePlayRequest.e(this.instance, p0);
    }
    public final void d(EsPreparePlayOptions$PreparePlayOptions p0){
       this.copyOnWrite();
       EsPreparePlay$PreparePlayRequest.f(this.instance, p0);
    }
    public final void e(EsPlayOrigin$PlayOrigin p0){
       this.copyOnWrite();
       EsPreparePlay$PreparePlayRequest.g(this.instance, p0);
    }
}
