package p.er2;
import p.lw1;
import p.g15;
import p.np5;
import p.g70;
import p.f70;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.op2;
import p.bv5;
import p.el6;
import p.mp2;
import p.av6;
import p.zq2;
import java.lang.Integer;
import java.lang.IllegalStateException;
import p.cr2;
import java.net.Socket;
import p.we7;
import p.cx5;
import p.nn6;
import p.es2;
import p.br2;
import p.ar2;
import p.ps2;
import p.dr2;
import p.mz5;
import java.net.Proxy$Type;
import java.net.Proxy;
import java.lang.StringBuilder;
import p.ax5;
import p.zr6;
import p.gg1;
import p.y7;
import p.os2;
import java.io.IOException;
import java.lang.Throwable;

public final class er2 implements lw1	// class@0001e0 from classes2.dex
{
    public final g15 a;
    public final np5 b;
    public final g70 c;
    public final f70 d;
    public int e;
    public final op2 f;
    public mp2 g;

    public void er2(g15 p0,np5 p1,g70 p2,f70 p3){
       co5.o(p1, "connection");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.f = new op2(p2);
    }
    public final el6 a(bv5 p0,long p1){
       er2 te;
       zq2 ozq2;
       boolean b = true;
       if (av6.i0("chunked", p0.c.a("Transfer-Encoding"), b)) {
          if ((te = this.e) != b) {
             b = false;
          }
          if (b) {
             this.e = 2;
             ozq2 = new zq2(this);
          }else {
             throw new IllegalStateException(co5.K(Integer.valueOf(te), "state: ").toString());
          }
       }else if(p1 - -1){
          if ((te = this.e) != b) {
             b = false;
          }
          if (b) {
             this.e = 2;
             ozq2 = new cr2(this);
          }else {
             throw new IllegalStateException(co5.K(Integer.valueOf(te), "state: ").toString());
          }
       }else {
          throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
       }
       return ozq2;
    }
    public final void b(){
       this.d.flush();
    }
    public final void c(){
       this.d.flush();
    }
    public final void cancel(){
       np5 c;
       if ((c = this.b.c) == null) {
       }else {
          we7.e(c);
       }
       return;
    }
    public final nn6 d(cx5 p0){
       br2 uobr2;
       er2 te;
       er2 te1;
       if (!es2.a(p0)) {
          uobr2 = this.i(0);
       }else {
          boolean b = true;
          if (av6.i0("chunked", cx5.f(p0, "Transfer-Encoding"), b)) {
             bv5 a = p0.a.a;
             if ((te = this.e) != 4) {
                b = false;
             }
             if (b) {
                this.e = 5;
                uobr2 = new ar2(this, a);
             }else {
                throw new IllegalStateException(co5.K(Integer.valueOf(te), "state: ").toString());
             }
          }else {
             long l = we7.k(p0);
             if (l - -1) {
                uobr2 = this.i(l);
             }else if((te1 = this.e) == 4){
                b = false;
             }
             if (b) {
                this.e = 5;
                this.b.l();
                uobr2 = new dr2(this);
             }else {
                throw new IllegalStateException(co5.K(Integer.valueOf(te1), "state: ").toString());
             }
          }
       }
       return uobr2;
    }
    public final long e(cx5 p0){
       long l;
       if (!es2.a(p0)) {
          l = 0;
       }else if(av6.i0("chunked", cx5.f(p0, "Transfer-Encoding"), true)){
          l = -1;
       }else {
          l = we7.k(p0);
       }
       return l;
    }
    public final void f(bv5 p0){
       String str1;
       String str2;
       Proxy$Type type = this.b.b.b.type();
       co5.l(type, "connection.route\(\).proxy.type\(\)");
       StringBuilder str = p0.b+' ';
       bv5 a = p0.a;
       type = (a.j == null && type == Proxy$Type.HTTP)? 1: 0;
       if (type) {
          str = str+a;
       }else {
          str1 = a.b();
          if ((str2 = a.d()) != null) {
             str1 = str1+'?'+str2;
          }
          str = str+str1;
       }
       str1 = str+" HTTP/1.1";
       co5.l(str1, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       this.j(p0.c, str1);
       return;
    }
    public final ax5 g(boolean p0){
       zr6 b;
       er2 tf = this.f;
       er2 te = this.e;
       int i = 1;
       if (te != i && te != 3) {
          b = 0;
       }
       if (i) {
          try{
             String str = tf.a.O(tf.b);
             tf.b = tf.b - (long)str.length();
             zr6 ozr6 = gg1.Q(str);
             b = ozr6.b;
             ax5 uoax5 = new ax5();
             zr6 a = ozr6.a;
             co5.o(a, "protocol");
             uoax5.b = a;
             uoax5.c = b;
             ozr6 = ozr6.c;
             co5.o(ozr6, "message");
             uoax5.d = ozr6;
             uoax5.c(tf.a());
             if (p0 && b == 100) {
                uoax5 = null;
             }else if(b == 100){
                this.e = 3;
             }else {
                this.e = 4;
             }
             return uoax5;
          }catch(java.io.EOFException e12){
             os2 oos2 = this.b.b.a.i.g("/...");
             co5.i(oos2);
             oos2.b = gg1.i("", 0, 0, " \"\':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
             oos2.c = gg1.i("", 0, 0, " \"\':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
             throw new IOException(co5.K(oos2.b().i, "unexpected end of stream on "), e12);
          }
       }else {
          throw new IllegalStateException(co5.K(Integer.valueOf(te), "state: ").toString());
       }
    }
    public final np5 h(){
       return this.b;
    }
    public final br2 i(long p0){
       er2 te;
       int i = ((te = this.e) == 4)? 1: 0;
       if (i) {
          this.e = 5;
          return new br2(this, p0);
       }else {
          throw new IllegalStateException(co5.K(Integer.valueOf(te), "state: ").toString());
       }
    }
    public final void j(mp2 p0,String p1){
       co5.o(p0, "headers");
       co5.o(p1, "requestLine");
       er2 te = this.e;
       int i = 0;
       int i1 = (te == null)? 1: 0;
       if (i1) {
          te = this.d;
          te.W(p1).W("\r\n");
          int i2 = p0.a.length / 2;
          for (; i < i2; i = i3) {
             int i3 = i + 1;
             te.W(p0.c(i)).W(": ").W(p0.g(i)).W("\r\n");
          }
          te.W("\r\n");
          this.e = 1;
          return;
       }else {
          throw new IllegalStateException(co5.K(Integer.valueOf(te), "state: ").toString());
       }
    }
}
