package com.spotify.connectivity.auth.esperanto.proto.a;
import p.yf2;
import java.lang.Object;
import com.google.protobuf.Empty;
import com.spotify.connectivity.auth.esperanto.proto.SessionService;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$SendEndSongsResult;
import com.spotify.connectivity.auth.esperanto.proto.GetStateResult;
import com.spotify.connectivity.auth.esperanto.proto.SessionStateClientImpl;
import com.spotify.connectivity.auth.esperanto.proto.SessionClientImpl;
import com.spotify.connectivity.auth.esperanto.proto.SessionStateService;

public final class a implements yf2	// class@000645 from classes.dex
{
    public final int a;

    public void a(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       switch (this.a){
           case 0:
             return SessionClientImpl.a(p0);
           case 1:
             return SessionClientImpl.b(p0);
           case 2:
             return SessionClientImpl.c(p0);
           case 3:
             return SessionStateClientImpl.a(p0);
           case 4:
             return SessionService.a(p0);
           case 5:
             return SessionService.c(p0);
           case 6:
             return SessionService.b(p0);
           default:
             return SessionStateService.a(p0);
       }
    }
}
