package p.ur2;
import p.lw1;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import p.we7;
import p.g15;
import p.np5;
import p.yp5;
import p.tr2;
import p.co5;
import p.sm5;
import p.bv5;
import p.el6;
import p.xr2;
import p.zr2;
import p.mo1;
import p.cx5;
import p.nn6;
import p.es2;
import java.util.ArrayList;
import p.mp2;
import p.ro2;
import p.j80;
import p.ps2;
import java.lang.StringBuilder;
import java.util.Locale;
import java.lang.Class;
import java.lang.Integer;
import java.util.Map;
import p.as2;
import java.util.concurrent.TimeUnit;
import p.b57;
import java.io.IOException;
import p.gp0;
import p.ax5;
import p.pn;
import java.util.ArrayDeque;
import p.kp5;
import p.zr6;
import p.gg1;
import java.lang.CharSequence;
import p.av6;
import java.lang.NullPointerException;
import java.net.ProtocolException;
import p.ou6;

public final class ur2 implements lw1	// class@000372 from classes2.dex
{
    public final np5 a;
    public final yp5 b;
    public final tr2 c;
    public zr2 d;
    public final sm5 e;
    public boolean f;
    public static final List g;
    public static final List h;

    static {
       String[] stringArray = new String[]{"connection","host","keep-alive","proxy-connection","te","transfer-encoding","encoding","upgrade",":method",":path",":scheme",":authority"};
       ur2.g = we7.l(stringArray);
       stringArray = new String[]{"connection","host","keep-alive","proxy-connection","te","transfer-encoding","encoding","upgrade"};
       ur2.h = we7.l(stringArray);
    }
    public void ur2(g15 p0,np5 p1,yp5 p2,tr2 p3){
       co5.o(p1, "connection");
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       sm5 w = sm5.w;
       if (p0.K.contains(w)) {
       }else {
          w = sm5.v;
       }
       this.e = w;
       return;
    }
    public final el6 a(bv5 p0,long p1){
       ur2 td = this.d;
       co5.i(td);
       return td.g();
    }
    public final void b(){
       ur2 td = this.d;
       co5.i(td);
       td.g().close();
    }
    public final void c(){
       this.c.flush();
    }
    public final void cancel(){
       ur2 td;
       this.f = true;
       if ((td = this.d) == null) {
       }else {
          td.e(mo1.x);
       }
       return;
    }
    public final nn6 d(cx5 p0){
       ur2 td = this.d;
       co5.i(td);
       return td.i;
    }
    public final long e(cx5 p0){
       long l = (!es2.a(p0))? 0: we7.k(p0);
       return l;
    }
    public final void f(bv5 p0){
       String str1;
       String str2;
       ur2 d;
       ur2 our2 = this;
       bv5 uobv5 = p0;
       if (our2.d != null) {
          return;
       }
       int i = 0;
       int i1 = (uobv5.d != null)? 1: 0;
       bv5 c = uobv5.c;
       ArrayList uArrayList = new ArrayList(((c.a.length / 2) + 4));
       uArrayList.add(new ro2(ro2.f, uobv5.b));
       j80 g = ro2.g;
       bv5 a = uobv5.a;
       co5.o(a, "url");
       String str = a.b();
       if ((str1 = a.d()) != null) {
          str = str+'?'+str1;
       }
       uArrayList.add(new ro2(g, str));
       if ((str2 = uobv5.c.a("Host")) != null) {
          uArrayList.add(new ro2(ro2.i, str2));
       }
       uArrayList.add(new ro2(ro2.h, a.a));
       int i2 = c.a.length / 2;
       int i3 = 0;
       while (i3 < i2) {
          int i4 = i3 + 1;
          Locale uS = Locale.US;
          co5.l(uS, "US");
          str = c.c(i3).toLowerCase(uS);
          co5.l(str, "this as java.lang.String\).toLowerCase\(locale\)");
          if (!ur2.g.contains(str) || (co5.c(str, "te") || !co5.c(c.g(i3), "trailers"))) {
             uArrayList.add(new ro2(str, c.g(i3)));
          }
          i3 = i4;
       }
       ur2 c1 = our2.c;
       c1.getClass();
       i2 = i1 ^ 0x01;
       tr2 p = c1.P;
       _monitor_enter(p);
       _monitor_enter(c1);
       if (c1.w > 0x3fffffff) {
          c1.T(mo1.w);
       }
       if (c1.x == null) {
          tr2 w = c1.w;
          c1.w = w + 2;
          zr2 str3 = new zr2(w, c1, i2, false, null);
          if (!i1 || ((c1.M - c1.N) >= 0 || (str.e - str.f) >= 0)) {
             i = 1;
          }
          if (str.i()) {
             c1.c.put(Integer.valueOf(w), str);
          }
          _monitor_exit(c1);
          c1.P.J(w, uArrayList, i2);
          _monitor_exit(p);
          if (i) {
             c1.P.flush();
          }
          our2.d = str;
          if (our2.f == null) {
             d = our2.d;
             co5.i(d);
             TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
             d.k.g((long)our2.b.g, mILLISECONDS);
             d = our2.d;
             co5.i(d);
             d.l.g((long)our2.b.h, mILLISECONDS);
             return;
          }else {
             d = our2.d;
             co5.i(d);
             d.e(mo1.x);
             throw new IOException("Canceled");
          }
       }else {
          throw new gp0();
       }
    }
    public final ax5 g(boolean p0){
       Object[] objArray;
       zr2 n;
       ur2 td = this.d;
       co5.i(td);
       _monitor_enter(td);
       td.k.h();
       while (td.g.isEmpty() && td.m == null) {
          td.l();
       }
       td.k.l();
       if ((td.g.isEmpty() ^ 0x01)) {
          ax5 obj = td.g.removeFirst();
          co5.l(obj, "headersQueue.removeFirst\(\)");
          _monitor_exit(td);
          td = this.e;
          co5.o(td, "protocol");
          ArrayList uArrayList = new ArrayList(20);
          int i = obj.a.length / 2;
          ax5 uoax5 = null;
          zr6 ozr6 = uoax5;
          int i1 = 0;
          while (i1 < i) {
             int i2 = i1 + 1;
             String str = obj.c(i1);
             String str1 = obj.g(i1);
             if (co5.c(str, ":status")) {
                ozr6 = gg1.Q(co5.K(str1, "HTTP/1.1 "));
             }else if(!ur2.h.contains(str)){
                co5.o(str, "name");
                co5.o(str1, "value");
                uArrayList.add(str);
                uArrayList.add(av6.K0(str1).toString());
             }
             i1 = i2;
          }
          if (ozr6 != null) {
             obj = new ax5();
             obj.b = td;
             obj.c = ozr6.b;
             zr6 c = ozr6.c;
             co5.o(c, "message");
             obj.d = c;
             String[] stringArray = new String[0];
             if ((objArray = uArrayList.toArray(stringArray)) != null) {
                obj.c(new mp2(objArray));
                if (!p0 || obj.c != 100) {
                   uoax5 = obj;
                }
                return uoax5;
             }else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
             }
          }else {
             throw new ProtocolException("Expected \':status\' header not present");
          }
       }else if((n = td.n) == null){
          zr2 m = td.m;
          co5.i(m);
          n = new ou6(m);
       }
       throw n;
    }
    public final np5 h(){
       return this.a;
    }
}
