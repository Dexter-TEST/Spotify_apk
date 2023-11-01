package p.dr1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$BoolResponse;
import com.google.protobuf.c;

public final class dr1 extends b implements u74	// class@00139e from classes.dex
{

    public void dr1(){
       super(EsRemoteConfig$BoolResponse.f());
    }
    public final void c(boolean p0){
       this.copyOnWrite();
       EsRemoteConfig$BoolResponse.e(this.instance, p0);
    }
}
