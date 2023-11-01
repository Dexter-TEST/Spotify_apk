package p.vv0;
import p.i16;
import p.as7;
import java.lang.Object;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import io.reactivex.rxjava3.core.Observable;
import java.lang.String;
import p.co5;
import p.zr7;
import p.yf2;

public final class vv0 implements i16	// class@002a6e from classes.dex
{
    public final i16 a;

    public void vv0(as7 p0){
       this.a = p0;
       super();
    }
    public final Observable resolve(Request p0){
       co5.o(p0, "request");
       Observable observable = this.a.resolve(p0).flatMap(new zr7(p0, 1));
       co5.l(observable, "request: Request\): Obser…wrap\(request, response\) }");
       return observable;
    }
}
