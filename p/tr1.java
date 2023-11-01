package p.tr1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.storage.esperanto.proto.EsStorage$CacheSizeLimit;
import com.google.protobuf.c;

public final class tr1 extends b implements u74	// class@0027c6 from classes.dex
{

    public void tr1(){
       super(EsStorage$CacheSizeLimit.f());
    }
    public final void c(long p0){
       this.copyOnWrite();
       EsStorage$CacheSizeLimit.e(this.instance, p0);
    }
}
