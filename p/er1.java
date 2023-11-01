package p.er1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$EnumResponse;
import com.google.protobuf.c;
import java.lang.String;

public final class er1 extends b implements u74	// class@0014e0 from classes.dex
{

    public void er1(){
       super(EsRemoteConfig$EnumResponse.f());
    }
    public final void c(String p0){
       this.copyOnWrite();
       EsRemoteConfig$EnumResponse.e(this.instance, p0);
    }
}
