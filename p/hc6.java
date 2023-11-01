package p.hc6;
import p.u74;
import com.google.protobuf.b;
import com.spotify.limited_offlining_esperanto.proto.SetOfflineRequest;
import com.google.protobuf.c;
import java.util.List;
import java.lang.String;

public final class hc6 extends b implements u74	// class@001826 from classes.dex
{

    public void hc6(){
       super(SetOfflineRequest.g());
    }
    public final void c(List p0){
       this.copyOnWrite();
       SetOfflineRequest.e(this.instance, p0);
    }
    public final void d(String p0){
       this.copyOnWrite();
       SetOfflineRequest.f(this.instance, p0);
    }
}
