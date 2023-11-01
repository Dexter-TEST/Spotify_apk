package p.bg0;
import com.spotify.clientfoundations.esperanto.esperantocosmos.EsperantoRxRouter;
import p.i16;
import java.lang.Object;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import io.reactivex.rxjava3.core.Observable;
import java.lang.String;
import p.co5;

public final class bg0 implements EsperantoRxRouter	// class@0010b8 from classes.dex
{
    public final i16 a;

    public void bg0(i16 p0){
       this.a = p0;
       super();
    }
    public final Observable resolve(Request p0){
       co5.o(p0, "request");
       return this.a.resolve(p0);
    }
}
