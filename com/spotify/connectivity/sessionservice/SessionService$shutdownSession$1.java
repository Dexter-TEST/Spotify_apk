package com.spotify.connectivity.sessionservice.SessionService$shutdownSession$1;
import java.lang.Runnable;
import com.spotify.connectivity.sessionservice.SessionService;
import java.lang.Object;
import com.spotify.connectivity.auth.NativeSession;

final class SessionService$shutdownSession$1 implements Runnable	// class@00081e from classes.dex
{
    final SessionService this$0;

    public void SessionService$shutdownSession$1(SessionService p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       this.this$0.getNativeSession().prepareForShutdown();
       this.this$0.getNativeSession().destroy();
    }
}
