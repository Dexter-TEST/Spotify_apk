package p.jx5;
import p.yf2;
import com.spotify.cosmos.cosmonaut.Converter;
import java.lang.reflect.Type;
import java.lang.Object;
import com.spotify.clientfoundations.cosmos.cosmos.Response;
import java.lang.String;
import p.co5;
import com.spotify.cosmos.cosmonaut.TypedResponse;
import java.util.Map;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public final class jx5 implements yf2	// class@001b64 from classes.dex
{
    public final int a;
    public final Converter b;
    public final Type c;

    public void jx5(int p0,Converter p1,Type p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final Object a(Response p0){
       String uri;
       Map headers;
       Object obj;
       jx5 tb = this.b;
       jx5 tc = this.c;
       String str = "response";
       switch (this.a){
           case 0:
             break;
           default:
             co5.o(p0, str);
             if ((obj = tb.convert(tc, p0.getBody())) != null) {
                return obj;
             }
             throw new IllegalStateException("failed to decode \'"+p0+"\' as "+tc.toString());
       }
       co5.o(p0, str);
       int status = p0.getStatus();
       if ((uri = p0.getUri()) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       if ((headers = p0.getHeaders()) != null) {
          return new TypedResponse(status, uri, headers, tb.convert(tc, p0.getBody()));
       }
       throw new IllegalStateException("Required value was null.".toString());
    }
    public final Object apply(Object p0){
       switch (this.a){
           case 0:
           default:
             return this.a(p0);
       }
       return this.a(p0);
    }
}
