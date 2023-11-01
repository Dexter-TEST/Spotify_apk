package p.ur1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.storage.esperanto.proto.EsStorage$SetCacheSizeLimitParams;
import com.google.protobuf.c;
import p.tr1;
import com.spotify.storage.esperanto.proto.EsStorage$CacheSizeLimit;

public final class ur1 extends b implements u74	// class@002905 from classes.dex
{

    public void ur1(){
       super(EsStorage$SetCacheSizeLimitParams.f());
    }
    public final void c(tr1 p0){
       this.copyOnWrite();
       EsStorage$SetCacheSizeLimitParams.e(this.instance, p0.build());
    }
}
