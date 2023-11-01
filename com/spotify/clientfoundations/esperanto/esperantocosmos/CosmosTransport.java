package com.spotify.clientfoundations.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.clientfoundations.esperanto.esperantocosmos.EsperantoRxRouter;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.nio.charset.Charset;
import p.zf2;
import com.spotify.clientfoundations.cosmos.cosmos.Response;
import io.reactivex.rxjava3.core.Observable;
import java.lang.StringBuilder;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import com.spotify.clientfoundations.esperanto.esperantocosmos.CosmosTransport$call$mapFunc$1;
import p.e16;
import p.yf2;
import io.reactivex.rxjava3.core.Single;

public final class CosmosTransport implements Transport	// class@00057f from classes.dex
{
    private final Charset CHARSET_UTF8;
    private final EsperantoRxRouter mRouter;

    public void CosmosTransport(EsperantoRxRouter p0){
       co5.o(p0, "mRouter");
       super();
       this.mRouter = p0;
       this.CHARSET_UTF8 = Charset.forName("UTF8");
    }
    public static byte[] a(zf2 p0,Response p1){
       return CosmosTransport.call$lambda-0(p0, p1);
    }
    public static final Charset access$getCHARSET_UTF8$p(CosmosTransport p0){
       return p0.CHARSET_UTF8;
    }
    private final Observable call(String p0,String p1,byte[] p2,String p3){
       p0 = "sp://esperanto/"+p0+'/'+p1;
       Request request = new Request(p3, p0, p2);
       CosmosTransport$call$mapFunc$1 uocall$mapFu = new CosmosTransport$call$mapFunc$1(this, p0);
       Observable observable = this.mRouter.resolve(request);
       observable = observable.map(new e16(2, uocall$mapFu));
       co5.l(observable, "mRouter.resolve\(request\).map\(mapFunc\)");
       return observable;
    }
    private static final byte[] call$lambda-0(zf2 p0,Response p1){
       co5.o(p0, "$tmp0");
       return p0.invoke(p1);
    }
    public Single callSingle(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       Single single = this.call(p0, p1, p2, "POST").firstOrError();
       co5.l(single, "call\(service, method, pa…uest.POST\).firstOrError\(\)");
       return single;
    }
    public Observable callStream(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       return this.call(p0, p1, p2, "SUB");
    }
    public byte[] callSync(String p0,String p1,byte[] p2){
       co5.o(p0, "service");
       co5.o(p1, "method");
       co5.o(p2, "payload");
       byte[] uobyteArray = new byte[0];
       return uobyteArray;
    }
}
