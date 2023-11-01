package p.df6;
import p.cf6;
import p.tb6;
import p.fv1;
import java.lang.Object;
import com.spotify.shoreline.esperanto.java.impl.NativeShorelineLoggerImpl;
import p.nt5;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.shoreline.esperanto.java.impl.NativeShorelineLoggerImpl$Companion;
import com.spotify.shoreline.esperanto.java.api.NativeShorelineLogger;

public final class df6 implements cf6, tb6	// class@001339 from classes.dex
{
    public final NativeShorelineLoggerImpl a;

    public void df6(fv1 p0){
       super();
       this.a = NativeShorelineLoggerImpl.Companion.create(new nt5(p0));
    }
    public final Object getApi(){
       return this;
    }
    public final void shutdown(){
       this.a.destroy();
    }
}
