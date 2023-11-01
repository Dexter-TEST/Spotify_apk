package p.to4;
import java.io.Serializable;
import p.ko4;
import p.ro4;
import p.t91;
import p.he3;
import java.lang.Class;
import java.lang.Object;
import p.if3;
import p.eg3;
import java.lang.String;
import java.lang.IllegalArgumentException;
import p.a71;
import p.qg3;
import p.u91;
import p.b71;
import p.v91;
import java.lang.Throwable;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.StringBuilder;

public final class to4 extends ko4 implements Serializable	// class@0027ae from classes.dex
{
    public final b71 a;
    public final w57 b;
    public final he3 c;
    public final if3 t;
    public final Object v;
    public final ConcurrentHashMap w;

    public void to4(ro4 p0,t91 p1,he3 p2){
       super();
       p0.getClass();
       this.a = null;
       p0.getClass();
       this.w = null;
       p0.getClass();
       this.c = p2;
       this.v = null;
       p1.t();
       this.t = this.f(p2);
       this.b = null;
    }
    public void to4(to4 p0,t91 p1,he3 p2,if3 p3,Object p4){
       super();
       this.a = p0.a;
       this.w = p0.w;
       p0.getClass();
       this.c = p2;
       this.t = p3;
       this.v = p4;
       p1.t();
       this.b = p0.b;
    }
    public final Object a(eg3 p0,Class p1){
       this.b(p0, "p");
       throw null;
    }
    public final void b(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       Object[] objArray = new Object[]{p1};
       throw new IllegalArgumentException(String.format("argument \"%s\" is null", objArray));
    }
    public final Object c(eg3 p0){
       to4 ta = this.a;
       ta.getClass();
       a71 uoa71 = new a71(ta, null, p0);
       qg3 oqg3 = this.e(p0, uoa71);
       to4 tv = this.v;
       to4 tc = this.c;
       if (oqg3 == qg3.H) {
          if (tv == null) {
             this.d(uoa71).getNullValue(uoa71);
          }
       }else if(oqg3 != qg3.A && oqg3 != qg3.y){
          uoa71.I(p0, tc, this.d(uoa71), tv);
       }
       throw null;
    }
    public final if3 d(a71 p0){
       to4 tt;
       to4 tc;
       if3 oif3;
       if ((tt = this.t) != null) {
          return tt;
       }
       if ((tc = this.c) != null) {
          to4 tw = this.w;
          if ((oif3 = tw.get(tc)) != null) {
             return oif3;
          }
          if ((oif3 = p0.m(tc)) != null) {
             tw.put(tc, oif3);
             return oif3;
          }else {
             p0.h(tc, "Cannot find a deserializer for type "+tc);
             throw null;
          }
       }else {
          p0.h(null, "No value type configured for ObjectReader");
          throw null;
       }
    }
    public final qg3 e(eg3 p0,a71 p1){
       throw null;
    }
    public final if3 f(he3 p0){
       if (p0 == null) {
          return null;
       }
       throw null;
    }
}
