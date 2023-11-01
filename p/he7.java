package p.he7;
import p.fe7;
import p.tb6;
import com.spotify.connectivity.sessionservice.SessionService;
import p.ge7;
import java.lang.Object;
import com.spotify.clientfoundations.appstorage.userdirectoryimpl.NativeUserDirectoryManagerImpl;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.sessionapi.SessionApi;
import java.lang.String;
import com.spotify.clientfoundations.appstorage.userdirectoryimpl.NativeUserDirectoryManagerImpl$Companion;

public final class he7 implements fe7, tb6	// class@001839 from classes.dex
{
    public final NativeUserDirectoryManagerImpl a;

    public void he7(SessionService p0,ge7 p1){
       super();
       this.a = NativeUserDirectoryManagerImpl.Companion.create(p0.getNativeSession().getCanonicalUsername(), p1.a, p1.b);
    }
    public final Object getApi(){
       return this;
    }
    public final void shutdown(){
       this.a.destroy();
    }
}
