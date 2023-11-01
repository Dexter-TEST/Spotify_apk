package p.na6;
import java.lang.String;
import java.nio.charset.Charset;
import p.oe7;
import p.li5;
import p.aw1;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import p.r45;
import p.pu1;
import p.jj5;
import p.po2;
import p.oo2;
import p.w51;
import p.m74;
import java.lang.CharSequence;
import p.fo2;
import java.util.Arrays;

public final class na6	// class@001f9e from classes.dex
{
    public final ConcurrentHashMap a;
    public final oe7 b;
    public final li5 c;
    public final aw1 d;
    public static final Charset e;

    static {
       na6.e = Charset.forName("UTF-8");
    }
    public void na6(oe7 p0,li5 p1,aw1 p2){
       super();
       this.a = new ConcurrentHashMap();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final byte[] a(r45 p0,String p1,String p2,String p3){
       jj5 ojj5 = (p0.c())? r45.d(pu1.a(p0.b())): p0;
       Charset e = na6.e;
       byte[] uobyteArray = oo2.a.b().K(p1, e).K(p2, e).K(p3, e).K(ojj5.e(""), e).B().a();
       na6 ta = this.a;
       if (!Arrays.equals(uobyteArray, ta.get(p0.e("")))) {
          ta.put(p0.e(""), uobyteArray);
       }
       return uobyteArray;
    }
}
