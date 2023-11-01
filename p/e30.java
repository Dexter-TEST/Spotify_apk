package p.e30;
import p.og2;
import java.util.ArrayList;
import com.spotify.cosmos.cosmonaut.Converter;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.List;
import p.t75;
import java.lang.Class;
import p.t65;
import java.util.Map;
import p.xe7;
import p.q14;
import java.lang.reflect.Type;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import p.b30;

public final class e30 implements og2	// class@00140b from classes.dex
{
    public final List a;
    public final Converter b;

    public void e30(ArrayList p0,Converter p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object apply(Object p0){
       co5.o(p0, "args");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          t75 ot75 = iterator.next();
          ot75.getClass();
          linkedHashMa.putAll(xe7.H(new t65(ot75.a, p0[ot75.b])));
       }
       p0 = q14.r0(linkedHashMa);
       try{
          e30 tb = this.b;
          co5.j(tb, "null cannot be cast to non-null type com.spotify.cosmos.cosmonaut.Converter<kotlin.Any, kotlin.ByteArray>");
          if ((p0 = tb.convert(Map.class, p0)) != null) {
          }else {
             throw new IllegalStateException("Required value was null.".toString());
          }
       }catch(java.io.IOException e6){
          Object[] objArray = new Object[0];
          Logger.c(e6, "Unexpected IO exception", objArray);
          p0 = b30.b;
       }
       return p0;
    }
}
