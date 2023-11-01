package p.mw1;
import p.op5;
import p.y7;
import p.lp5;
import p.i70;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.np5;
import p.mz5;
import p.ps2;
import java.net.Socket;
import java.lang.IllegalStateException;
import p.we7;
import java.lang.Class;
import java.util.List;
import p.q52;
import java.util.NoSuchElementException;
import p.oz5;
import p.g15;
import p.hj2;
import java.io.IOException;
import p.ou6;
import p.mo1;
import p.gp0;

public final class mw1	// class@0002c1 from classes2.dex
{
    public final op5 a;
    public final y7 b;
    public final lp5 c;
    public final i70 d;
    public q52 e;
    public oz5 f;
    public int g;
    public int h;
    public int i;
    public mz5 j;

    public void mw1(op5 p0,y7 p1,lp5 p2,i70 p3){
       co5.o(p0, "connectionPool");
       co5.o(p3, "eventListener");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final np5 a(int p0,int p1,int p2,int p3,boolean p4,boolean p5){
       lp5 a;
       Socket socket;
       mw1 e;
       np5 d;
       q52 b2;
       mz5 omz5;
       oz5 ooz5;
       mw1 omw1 = this;
       while (true) {
          if (omw1.c.G != null) {
             throw new IOException("Canceled");
          }
          a = omw1.c.A;
          boolean b = true;
          boolean i = 0;
          List list = null;
          if (a != null) {
             _monitor_enter(a);
             List list1 = (a.j == null && this.b(a.b.a.i))? list: omw1.c.k();
             _monitor_exit(a);
             if (omw1.c.A != null) {
                if (socket == null) {
                   i = 1;
                }
                if (!i) {
                   throw new IllegalStateException("Check failed.".toString());
                }
             }else if(socket == null){
                we7.e(socket);
             }
             omw1.d.getClass();
             co5.o(omw1.c, "call");
          label_0059 :
             omw1.g = i;
             omw1.h = i;
             omw1.i = i;
             if (omw1.a.a(omw1.b, omw1.c, list, i)) {
                a = omw1.c.A;
                co5.i(a);
                omw1.d.getClass();
                co5.o(omw1.c, "call");
             }else if((e = omw1.j) != null){
                omw1.j = list;
             }else if((e = omw1.e) != null && e.a()){
                e = omw1.e;
                co5.i(e);
                if (e.a()) {
                   b2 = e.b;
                   int i1 = b2 + 1;
                   e.b = i1;
                   omz5 = e.a.get(b2);
                }else {
                   throw new NoSuchElementException();
                }
             }else if((e = omw1.f) == null){
                mw1 c = omw1.c;
                ooz5 = new oz5(omw1.b, c.a.U, c, omw1.d);
                omw1.f = ooz5;
             }
             q52 oq52 = ooz5.b();
             omw1.e = oq52;
             b2 = oq52.a;
             if (omw1.c.G == null) {
                if (omw1.a.a(omw1.b, omw1.c, b2, i)) {
                   a = omw1.c.A;
                   co5.i(a);
                   omw1.d.getClass();
                   co5.o(omw1.c, "call");
                }else if(oq52.a()){
                   q52 b3 = oq52.b;
                   int i2 = b3 + 1;
                   oq52.b = i2;
                   omz5 = oq52.a.get(b3);
                label_010b :
                   np5 onp5 = new np5(omw1.a, e);
                   omw1.c.I = onp5;
                   onp5.c(p0, p1, p2, p3, p4, omw1.c, omw1.d);
                   omw1.c.I = list;
                   omw1.c.a.U.a(onp5.b);
                   if (omw1.a.a(omw1.b, omw1.c, list1, b)) {
                      lp5 a1 = omw1.c.A;
                      co5.i(a1);
                      omw1.j = e;
                      d = onp5.d;
                      co5.i(d);
                      we7.e(d);
                      omw1.d.getClass();
                      co5.o(omw1.c, "call");
                      i = p5;
                      a = a1;
                   label_017e :
                      if (a.j(i)) {
                         break ;
                      }else {
                         a.l();
                         if (omw1.j != null) {
                            continue ;
                         }else if((e = omw1.e) == null){
                            e = 1;
                         }else {
                            boolean b1 = e.a();
                         }
                         if (e) {
                            continue ;
                         }else if((e = omw1.f) == null){
                            b = e.a();
                         }
                         if (b) {
                         }else {
                            throw new IOException("exhausted all routes");
                         }
                      }
                   }else {
                      _monitor_enter(onp5);
                      omw1.a.c(onp5);
                      omw1.c.c(onp5);
                      _monitor_exit(onp5);
                      omw1.d.getClass();
                      co5.o(omw1.c, "call");
                      d = onp5;
                   }
                }else {
                   throw new NoSuchElementException();
                }
             }else {
                throw new IOException("Canceled");
             }
             list1 = list;
             goto label_010b ;
          }else {
             goto label_0059 ;
          }
          i = p5;
          goto label_017e ;
       }
       return a;
    }
    public final boolean b(ps2 p0){
       co5.o(p0, "url");
       y7 i = this.b.i;
       boolean b = (p0.e == i.e && co5.c(p0.d, i.d))? true: false;
       return b;
    }
    public final void c(IOException p0){
       co5.o(p0, "e");
       this.j = null;
       if (p0 instanceof ou6 && p0.a == mo1.w) {
          this.g = this.g + 1;
       }else if(p0 instanceof gp0){
          this.h = this.h + 1;
       }else {
          this.i = this.i + 1;
       }
       return;
    }
}
