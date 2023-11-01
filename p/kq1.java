package p.kq1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.offline_esperanto.proto.EsOffline$DownloadRequest;
import com.google.protobuf.c;
import java.lang.String;

public final class kq1 extends b implements u74	// class@001c60 from classes.dex
{

    public void kq1(){
       super(EsOffline$DownloadRequest.f());
    }
    public final void c(String p0){
       this.copyOnWrite();
       EsOffline$DownloadRequest.e(this.instance, p0);
    }
}
