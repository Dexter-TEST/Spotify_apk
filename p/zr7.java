package p.zr7;
import p.yf2;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import java.lang.Object;
import p.i16;
import java.lang.String;
import p.co5;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.clientfoundations.cosmos.cosmos.Response;
import p.wv0;
import java.util.Map;
import java.lang.Boolean;
import java.lang.Integer;
import com.spotify.base.java.logging.Logger;
import java.lang.Throwable;
import java.lang.IllegalStateException;

public final class zr7 implements yf2	// class@002f53 from classes.dex
{
    public final int a;
    public final Request b;

    public void zr7(Request p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       String uri;
       Map headers1;
       String action;
       zr7 tb = this.b;
       switch (this.a){
           case 0:
           default:
             co5.o(p0, "response");
             int status = p0.getStatus();
             Map headers = tb.getHeaders();
             String str = "Required value was null.";
             if (headers == null) {
                throw new IllegalStateException(str.toString());
             }
             if (!Boolean.parseBoolean(headers.get("x-bypass-error")) && (status < 200 && status <= 299)) {
                if ((uri = p0.getUri()) != null) {
                   if ((headers1 = p0.getHeaders()) != null) {
                      Object obj = headers1.get("forbidden-reasons");
                      Object[] objArray = new Object[]{uri,Integer.valueOf(status),obj,headers1.get("message"),headers1.get("error"),p0.getBodyString(),headers1,tb};
                      Logger.b("Request to \"%s\" failed status=%d, reason=\"%s\" message=\"%s\" error=\"%s\" response=\"%s\" headers=\"%s\", request=\"%s\"", objArray);
                      String bodyString = p0.getBodyString();
                      if ((action = tb.getAction()) != null) {
                         Map headers2 = tb.getHeaders();
                         co5.j(headers2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String?, kotlin.String?>");
                         wv0 headers3 = new wv0(status, uri, bodyString, headers1, action, headers2, tb.getBody(), obj);
                         p0 = Observable.error(headers);
                         co5.l(p0, "error\(\n                 …      \)\n                \)");
                      }else {
                         throw new IllegalStateException(str.toString());
                      }
                   }else {
                      throw new IllegalStateException(str.toString());
                   }
                }else {
                   throw new IllegalStateException(str.toString());
                }
             }else {
                p0.getUri();
                p0.getStatus();
                p0 = Observable.just(p0);
                co5.l(p0, "just\(it\)");
             }
             return p0;
       }
       co5.o(p0, "router");
       return p0.resolve(tb);
    }
}
