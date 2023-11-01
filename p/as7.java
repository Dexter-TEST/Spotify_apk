package p.as7;
import p.i16;
import java.lang.Object;
import p.t00;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import io.reactivex.rxjava3.core.Observable;
import java.lang.String;
import p.co5;
import p.ir2;
import p.bi5;
import p.yf2;
import p.zr7;
import p.bu5;

public final class as7 implements i16	// class@000fe6 from classes.dex
{
    public final t00 a;
    public bu5 b;
    public Handler c;
    public HandlerThread d;

    public void as7(){
       super();
       this.a = t00.a();
    }
    public final Observable resolve(Request p0){
       as7 tb;
       Observable observable;
       co5.o(p0, "request");
       if ((tb = this.b) == null) {
          observable = this.a.filter(ir2.j0).map(ir2.T).switchMap(new zr7(p0, 0));
          co5.l(observable, "request: Request\): Obser…olve\(request\) }\n        }");
       }else {
          observable = tb.resolve(p0);
       }
       return observable;
    }
}
