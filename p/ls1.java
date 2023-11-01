package p.ls1;
import p.ht0;
import p.qs3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.player.esperanto.proto.EsGetQueueRequest$GetQueueRequest;
import p.s74;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import p.a05;
import p.yf2;
import p.ks1;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import p.ba2;
import p.m92;
import p.yo0;

public final class ls1	// class@001db1 from classes.dex
{
    public final ht0 a;
    public final qs3 b;

    public void ls1(ht0 p0,qs3 p1){
       co5.o(p0, "playerClient");
       co5.o(p1, "loggingParamsFactory");
       super();
       this.a = p0;
       this.b = p1;
       EsGetQueueRequest$GetQueueRequest getQueueRequ = EsGetQueueRequest$GetQueueRequest.f();
       co5.l(getQueueRequ, "getDefaultInstance\(\)");
       Observable observable = p0.callStream("spotify.player.esperanto.proto.ContextPlayer", "GetQueue", getQueueRequ);
       observable = observable.map(new a05(9));
       co5.l(observable, "callStream\(\"spotify.play…     }\n                }\)");
       m92 om92 = new m92(observable.map(ks1.a).toFlowable(BackpressureStrategy.c).s());
    }
}
