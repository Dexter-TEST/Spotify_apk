package com.spotify.connectivity.sessionesperanto.SessionClientEsperanto$sendEndSongs$1;
import p.yf2;
import java.lang.Object;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$SendEndSongsResult;
import com.spotify.connectivity.sessionapi.SendEndSongsResult;
import com.spotify.connectivity.sessionapi.SendEndSongsResult$SendEndSongsSuccess;
import com.spotify.connectivity.sessionapi.SendEndSongsResult$SendEndSongsFailure;
import java.lang.String;
import p.co5;

final class SessionClientEsperanto$sendEndSongs$1 implements yf2	// class@000815 from classes.dex
{
    public static final SessionClientEsperanto$sendEndSongs$1 INSTANCE;

    static {
       SessionClientEsperanto$sendEndSongs$1.INSTANCE = new SessionClientEsperanto$sendEndSongs$1();
    }
    public void SessionClientEsperanto$sendEndSongs$1(){
       super();
    }
    public final SendEndSongsResult apply(EsSession$SendEndSongsResult p0){
       SendEndSongsResult$SendEndSongsSuccess iNSTANCE;
       if (p0.getSuccess()) {
          iNSTANCE = SendEndSongsResult$SendEndSongsSuccess.INSTANCE;
       }else {
          String errorDescrip = p0.getErrorDescription();
          co5.l(errorDescrip, "it.errorDescription");
          iNSTANCE = new SendEndSongsResult$SendEndSongsFailure(p0.getErrorCode(), errorDescrip);
       }
       return iNSTANCE;
    }
    public Object apply(Object p0){
       return this.apply(p0);
    }
}
