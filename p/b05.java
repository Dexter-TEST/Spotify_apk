package p.b05;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import com.spotify.clientfoundations.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsRequest;
import io.reactivex.rxjava3.core.Observable;
import java.lang.String;
import p.s74;
import p.a05;
import p.yf2;
import java.lang.Object;
import p.co5;

public final class b05 extends ClientBase	// class@00102b from classes.dex
{
    public final Transport a;

    public void b05(CosmosTransport p0){
       this.a = p0;
    }
    public final Observable a(EsOffline$GetContextsRequest p0){
       Observable observable = this.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeContexts", p0).map(new a05(0));
       co5.l(observable, "callStream\(\"spotify.offl…     }\n                }\)");
       return observable;
    }
}
