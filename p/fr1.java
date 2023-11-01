package p.fr1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$IntResponse;
import com.google.protobuf.c;

public final class fr1 extends b implements u74	// class@001620 from classes.dex
{

    public void fr1(){
       super(EsRemoteConfig$IntResponse.f());
    }
    public final void c(int p0){
       this.copyOnWrite();
       EsRemoteConfig$IntResponse.e(this.instance, p0);
    }
}
