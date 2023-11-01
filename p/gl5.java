package p.gl5;
import com.spotify.clientfoundations.esperanto.esperantocosmos.EsperantoRxRouter;
import p.i16;
import java.lang.Object;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import io.reactivex.rxjava3.core.Observable;

public final class gl5 implements EsperantoRxRouter	// class@001730 from classes.dex
{
    public final i16 a;

    public void gl5(i16 p0){
       this.a = p0;
    }
    public final Observable resolve(Request p0){
       return this.a.resolve(p0);
    }
}
