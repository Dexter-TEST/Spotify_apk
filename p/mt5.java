package p.mt5;
import p.lt5;
import p.tb6;
import p.ps1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.remoteconfig.NativeRemoteConfigImpl;
import p.nt5;
import java.lang.Class;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.remoteconfig.NativeRemoteConfig;

public final class mt5 implements lt5, tb6	// class@001f01 from classes.dex
{
    public final NativeRemoteConfigImpl a;

    public void mt5(ps1 p0){
       co5.o(p0, "esperantoResolver");
       super();
       NativeRemoteConfigImpl.Companion.getClass();
       NativeRemoteConfigImpl nativeRemote = NativeRemoteConfigImpl.access$createInternal(new nt5(p0));
       NativeRemoteConfigImpl.access$initialize(nativeRemote);
       this.a = nativeRemote;
    }
    public final Object getApi(){
       return this;
    }
    public final void shutdown(){
       this.a.destroy();
    }
}
