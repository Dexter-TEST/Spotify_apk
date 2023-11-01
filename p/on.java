package p.on;
import p.nn6;
import java.io.InputStream;
import p.b57;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.kp5;
import p.pn;
import java.io.IOException;
import java.io.InterruptedIOException;
import p.e70;
import p.u96;
import java.lang.Math;
import p.x96;
import java.lang.AssertionError;
import p.xe7;
import java.lang.Throwable;
import p.kg4;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class on implements nn6	// class@0002e6 from classes2.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void on(InputStream p0,b57 p1){
       this.a = 1;
       co5.o(p0, "input");
       super();
       this.b = p0;
       this.c = p1;
    }
    public void on(kp5 p0,on p1){
       this.a = 0;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void close(){
       on tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.close();
             return;
       }
       on tc = this.c;
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
    public final long o(e70 p0,long p1){
       long l1;
       int i2;
       on tc = this.c;
       on tb = this.b;
       String str = "sink";
       switch (this.a){
           case 0:
             co5.o(p0, str);
             try{
                tb.h();
                long l = tc.o(p0, p1);
                if (!tb.i()) {
                   return l;
                }else {
                   throw tb.j(null);
                }
             }catch(java.io.IOException e6){
                if (tb.i()) {
                   InterruptedIOException interruptedI = tb.j(e6);
                }
                throw e6;
             }
             break;
           default:
             try{
                co5.o(p0, str);
                l1 = 0;
                if (v0 = p1 - l1) {
                   int i = 1;
                   int i1 = (v0 >= 0)? 1: 0;
                   if (i1) {
                      tc.f();
                      u96 ou96 = p0.t0(i);
                      if ((i2 = tb.read(ou96.a, ou96.c, (int)Math.min(p1, (long)(ou96.c - 8192)))) == -1) {
                         if (ou96.b == ou96.c) {
                            p0.a = ou96.a();
                            x96.a(ou96);
                         }
                         l1 = -1;
                      }else {
                         ou96.c = ou96.c + i2;
                         l1 = (long)i2;
                         p0.b = p0.b + l1;
                      }
                   }else {
                      throw new IllegalArgumentException(kg4.k("byteCount < 0: ", p1).toString());
                   }
                }
             }catch(java.lang.AssertionError e6){
                if (xe7.C(e6)) {
                   throw new IOException(e6);
                }else {
                   throw e6;
                }
             }
       }
       return l1;
    }
    public final String toString(){
       switch (this.a){
           case 0:
           default:
             return "source\("+this.b+')';
       }
       return "AsyncTimeout.source\("+this.c+')';
    }
}
