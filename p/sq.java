package p.sq;
import p.oo4;
import java.lang.Object;
import p.wy0;
import p.po4;
import p.js;
import p.vg3;
import java.lang.String;
import p.jz0;
import java.nio.charset.Charset;

public final class sq implements oo4	// class@002681 from classes.dex
{
    public static final sq a;

    static {
       sq.a = new sq();
    }
    public void sq(){
       super();
    }
    public final void a(Object p0,Object p1){
       p1.d("baseAddress", p0.a);
       p1.d("size", p0.b);
       p1.c(p0.c, "name");
       p0 = ((p0 = p0.d) != null)? p0.getBytes(jz0.a): null;
       p1.c(p0, "uuid");
       return;
    }
}
