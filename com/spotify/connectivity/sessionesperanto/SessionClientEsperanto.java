package com.spotify.connectivity.sessionesperanto.SessionClientEsperanto;
import com.spotify.connectivity.sessionapi.SessionClient;
import com.spotify.connectivity.auth.esperanto.proto.SessionClient;
import java.lang.Object;
import java.lang.String;
import p.co5;
import io.reactivex.rxjava3.core.Single;
import com.google.protobuf.Empty;
import com.spotify.connectivity.sessionesperanto.SessionClientEsperanto$sendEndSongs$1;
import p.yf2;
import java.util.Map;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$ProductStateMap$Builder;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$ProductStateMap;
import com.google.protobuf.c;
import com.google.protobuf.b;
import com.spotify.connectivity.sessionesperanto.SessionClientEsperanto$writeProductStateToLegacyStorage$1;

public final class SessionClientEsperanto implements SessionClient	// class@000817 from classes.dex
{
    private final SessionClient esperantoClient;

    public void SessionClientEsperanto(SessionClient p0){
       co5.o(p0, "esperantoClient");
       super();
       this.esperantoClient = p0;
    }
    public Single sendEndSongs(){
       Empty uEmpty = Empty.f();
       co5.l(uEmpty, "getDefaultInstance\(\)");
       Single single = this.esperantoClient.sendEndSongs(uEmpty);
       single = single.map(SessionClientEsperanto$sendEndSongs$1.INSTANCE);
       co5.l(single, "esperantoClient.sendEndS…)\n            }\n        }");
       return single;
    }
    public Single writeProductStateToLegacyStorage(Map p0){
       co5.o(p0, "productState");
       c uoc = EsSession$ProductStateMap.newBuilder().putAllProductStateMap(p0).build();
       co5.l(uoc, "newBuilder\(\).putAllProdu…Map\(productState\).build\(\)");
       Single single = this.esperantoClient.writeProductStateToLegacyStorage(uoc).map(SessionClientEsperanto$writeProductStateToLegacyStorage$1.INSTANCE);
       co5.l(single, "esperantoClient.writePro…).build\(\)\).map { unit\(\) }");
       return single;
    }
}
