package p.nn;
import p.el6;
import java.io.OutputStream;
import p.b57;
import java.lang.Object;
import p.kp5;
import p.e70;
import java.lang.String;
import p.co5;
import p.u96;
import p.pn;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.Math;
import p.x96;
import java.lang.StringBuilder;

public final class nn implements el6	// class@0002d1 from classes2.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void nn(OutputStream p0,b57 p1){
       this.a = 1;
       super();
       this.b = p0;
       this.c = p1;
    }
    public void nn(kp5 p0,nn p1){
       this.a = 0;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void I(e70 p0,long p1){
       e70 a;
       nn onn;
       nn tc = this.c;
       nn tb = this.b;
       String str = "source";
       switch (this.a){
           case 0:
             break;
           default:
             co5.o(p0, str);
             co5.p(p0.b, 0, p1);
             while ((p1) > 0) {
                tc.f();
                a = p0.a;
                co5.i(a);
                int i1 = a.c - a.b;
                int i2 = (int)Math.min(p1, (long)i1);
                tb.write(a.a, a.b, i2);
                i1 = a.b + i2;
                a.b = i1;
                long l1 = (long)i2;
                p1 = p1 - l1;
                long l2 = p0.b - l1;
                p0.b = l2;
                if (i1 == a.c) {
                   p0.a = a.a();
                   x96.a(a);
                }
             }
             return;
       }
       co5.o(p0, str);
       co5.p(p0.b, 0, p1);
       while (true) {
          if ((p1) <= 0) {
             return;
          }
          a = p0.a;
          co5.i(a);
          long l = 0;
          while ((l - 0x10000) < 0) {
             int i = a.c - a.b;
             l = l + (long)i;
             if ((l - p1) >= 0) {
                l = p1;
                break ;
             }else {
                a = a.f;
                co5.i(a);
             }
          }
          onn = tb;
          nn onn1 = tc;
          try{
             onn.h();
             onn1.I(p0, l);
             if (!onn.i()) {
                p1 = p1 - l;
             }else {
             }
          }catch(java.io.IOException e13){
             if (onn.i()) {
                InterruptedIOException interruptedI = onn.j(e13);
             }
             throw e13;
          }
       }
       throw onn.j(null);
    }
    public final void close(){
       nn tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.close();
             return;
       }
       nn tc = this.c;
       try{
          tb.h();
          tc.close();
          if (!tb.i()) {
             return;
          }
          throw tb.j(null);
       }catch(java.io.IOException e0){
          if (tb.i()) {
             InterruptedIOException interruptedI = tb.j(e0);
          }
          throw e0;
       }
    }
    public final b57 e(){
       switch (this.a){
           case 0:
           default:
             return this.c;
       }
       return this.b;
    }
    public final void flush(){
       nn tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.flush();
             return;
       }
       nn tc = this.c;
       try{
          tb.h();
          tc.flush();
          if (!tb.i()) {
             return;
          }
          throw tb.j(null);
       }catch(java.io.IOException e0){
          if (tb.i()) {
             InterruptedIOException interruptedI = tb.j(e0);
          }
          throw e0;
       }
    }
    public final String toString(){
       switch (this.a){
           case 0:
           default:
             return "sink\("+this.b+')';
       }
       return "AsyncTimeout.sink\("+this.c+')';
    }
}
