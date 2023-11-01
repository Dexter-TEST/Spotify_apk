package p.f30;
import p.og2;
import com.spotify.cosmos.cosmonaut.Converter;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import p.b30;

public final class f30 implements og2	// class@00154b from classes.dex
{
    public final int a;
    public final Type b;
    public final Converter c;

    public void f30(int p0,Converter p1,Type p2){
       super();
       this.a = p0;
       this.b = p2;
       this.c = p1;
    }
    public final Object apply(Object p0){
       String str = "args";
       try{
          co5.o(p0, str);
          f30 tc = this.c;
          co5.j(tc, "null cannot be cast to non-null type com.spotify.cosmos.cosmonaut.Converter<kotlin.Any, kotlin.ByteArray?>");
          if ((p0 = tc.convert(this.b, p0[this.a])) != null) {
          }else {
             throw new IllegalStateException("Required value was null.".toString());
          }
       }catch(java.io.IOException e4){
          Object[] objArray = new Object[0];
          Logger.c(e4, "Unexpected IO exception", objArray);
          p0 = b30.b;
       }
       return p0;
    }
}
