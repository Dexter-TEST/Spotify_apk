package p.qw0;
import p.pw0;
import p.tb6;
import java.lang.Object;
import com.spotify.clientfoundations.prefs.prefsimpl.NativePrefs;
import com.spotify.clientfoundations.prefs.prefsimpl.NativePrefs$Companion;

public final class qw0 implements pw0, tb6	// class@002426 from classes.dex
{
    public final NativePrefs a;

    public void qw0(){
       super();
       this.a = NativePrefs.Companion.create();
    }
    public final Object getApi(){
       return this;
    }
    public final void shutdown(){
       this.a.destroy();
    }
}
