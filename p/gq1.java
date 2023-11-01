package p.gq1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsGetStateRequest$GetStateRequest;
import com.google.protobuf.c;
import p.oq1;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;

public final class gq1 extends b implements u74	// class@001759 from classes.dex
{

    public void gq1(){
       super(EsGetStateRequest$GetStateRequest.g());
    }
    public final void c(oq1 p0){
       this.copyOnWrite();
       EsGetStateRequest$GetStateRequest.e(this.instance, p0.build());
    }
    public final void d(oq1 p0){
       this.copyOnWrite();
       EsGetStateRequest$GetStateRequest.f(this.instance, p0.build());
    }
}
