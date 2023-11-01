package p.ip0;
import p.kf0;
import p.hp0;
import java.lang.Object;
import java.util.Arrays;
import p.k57;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;
import p.fv1;
import java.util.Collection;
import java.lang.Iterable;
import p.dj0;
import javax.net.ssl.SSLSocket;
import p.jf4;
import java.util.Comparator;
import p.we7;
import p.gg1;
import java.lang.StringBuilder;
import java.util.Objects;
import p.kg4;

public final class ip0	// class@0019d8 from classes.dex
{
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;
    public static final ip0 e;
    public static final ip0 f;

    static {
       kf0[] okf0Array = new kf0[9];
       kf0 r = kf0.r;
       okf0Array[0] = r;
       kf0 s = kf0.s;
       okf0Array[1] = s;
       kf0 t = kf0.t;
       okf0Array[2] = t;
       kf0 l = kf0.l;
       okf0Array[3] = l;
       kf0 n = kf0.n;
       okf0Array[4] = n;
       kf0 m = kf0.m;
       okf0Array[5] = m;
       kf0 o = kf0.o;
       okf0Array[6] = o;
       kf0 q = kf0.q;
       okf0Array[7] = q;
       kf0 p = kf0.p;
       okf0Array[8] = p;
       kf0[] okf0Array1 = new kf0[16];
       okf0Array1[0] = r;
       okf0Array1[1] = s;
       okf0Array1[2] = t;
       okf0Array1[3] = l;
       okf0Array1[4] = n;
       okf0Array1[5] = m;
       okf0Array1[6] = o;
       okf0Array1[7] = q;
       okf0Array1[8] = p;
       okf0Array1[9] = kf0.j;
       okf0Array1[10] = kf0.k;
       okf0Array1[11] = kf0.h;
       okf0Array1[12] = kf0.i;
       okf0Array1[13] = kf0.f;
       okf0Array1[14] = kf0.g;
       okf0Array1[15] = kf0.e;
       hp0 r1 = new hp0();
       r1.c(Arrays.copyOf(okf0Array, 9));
       k57[] ok57Array = new k57[2];
       k57 b = k57.b;
       ok57Array[0] = b;
       k57 c = k57.c;
       ok57Array[1] = c;
       r1.f(ok57Array);
       r1.d();
       r1.a();
       hp0 ok57Array1 = new hp0();
       ok57Array1.c(Arrays.copyOf(okf0Array1, 16));
       k57[] ok57Array2 = new k57[]{b,c};
       ok57Array1.f(ok57Array2);
       ok57Array1.d();
       ip0.e = ok57Array1.a();
       ok57Array1 = new hp0();
       ok57Array1.c(Arrays.copyOf(okf0Array1, 16));
       k57[] ok57Array3 = new k57[]{b,c,k57.t,k57.v};
       ok57Array1.f(ok57Array3);
       ok57Array1.d();
       ok57Array1.a();
       ip0.f = new ip0(0, 0, null, null);
    }
    public void ip0(boolean p0,boolean p1,String[] p2,String[] p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final List a(){
       ip0 tc;
       List list;
       if ((tc = this.c) == null) {
          list = null;
       }else {
          ArrayList uArrayList = new ArrayList(tc.length);
          int len = tc.length;
          for (int i = 0; i < len; i = i + 1) {
             uArrayList.add(kf0.b.u(tc[i]));
          }
          list = dj0.B0(uArrayList);
       }
       return list;
    }
    public final boolean b(SSLSocket p0){
       ip0 td;
       if (this.a == null) {
          return false;
       }
       if ((td = this.d) != null && !we7.j(td, p0.getEnabledProtocols(), jf4.a)) {
          return false;
       }
       if ((td = this.c) != null && !we7.j(td, p0.getEnabledCipherSuites(), kf0.c)) {
          return false;
       }
       return true;
    }
    public final List c(){
       ip0 td;
       List list;
       if ((td = this.d) == null) {
          list = null;
       }else {
          ArrayList uArrayList = new ArrayList(td.length);
          int len = td.length;
          for (int i = 0; i < len; i = i + 1) {
             uArrayList.add(gg1.A(td[i]));
          }
          list = dj0.B0(uArrayList);
       }
       return list;
    }
    public final boolean equals(Object p0){
       ip0 ta;
       if (!p0 instanceof ip0) {
          return false;
       }
       if (p0 == this) {
          return true;
       }
       if ((ta = this.a) != p0.a) {
          return false;
       }
       if (ta != null) {
          if (!Arrays.equals(this.c, p0.c)) {
             return false;
          }else if(!Arrays.equals(this.d, p0.d)){
             return false;
          }else if(this.b != p0.b){
             return false;
          }
       }
       return true;
    }
    public final int hashCode(){
       ip0 tc;
       int i2;
       if (this.a != null) {
          int i = 0;
          int i1 = ((tc = this.c) == null)? 0: Arrays.hashCode(tc);
          i2 = (527 + i1) * 31;
          if ((tc = this.d) != null) {
             i = Arrays.hashCode(tc);
          }
          i2 = ((i2 + i) * 31) + (this.b ^ 0x01);
       }else {
          i2 = 17;
       }
       return i2;
    }
    public final String toString(){
       if (this.a == null) {
          return "ConnectionSpec\(\)";
       }
       return kg4.p("ConnectionSpec\(cipherSuites="+Objects.toString(this.a(), "[all enabled]")+", tlsVersions="+Objects.toString(this.c(), "[all enabled]")+", supportsTlsExtensions=", this.b, ')');
    }
}
