package p.d94;
import p.u74;
import com.google.protobuf.b;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MultiRequest;
import com.google.protobuf.c;
import java.lang.String;

public final class d94 extends b implements u74	// class@001303 from classes.dex
{

    public void d94(){
       super(MetadataCosmos$MultiRequest.f());
    }
    public final void c(String p0){
       this.copyOnWrite();
       MetadataCosmos$MultiRequest.e(this.instance, p0);
    }
}
