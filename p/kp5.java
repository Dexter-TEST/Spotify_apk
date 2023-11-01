package p.kp5;
import p.pn;
import java.net.Socket;
import p.lp5;
import p.zr2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.lang.Throwable;
import p.mo1;
import p.tr2;
import java.lang.System;
import p.q07;
import p.i07;
import p.r07;
import java.lang.AssertionError;
import p.xe7;
import p.i15;
import java.util.logging.Level;
import java.lang.StringBuilder;
import java.util.logging.Logger;

public final class kp5 extends pn	// class@000287 from classes2.dex
{
    public final int k;
    public final Object l;

    public void kp5(Socket p0){
       this.k = 2;
       super();
       this.l = p0;
    }
    public void kp5(lp5 p0){
       this.k = 0;
       this.l = p0;
       super();
    }
    public void kp5(zr2 p0){
       this.k = 1;
       co5.o(p0, "this$0");
       this.l = p0;
       super();
    }
    public final InterruptedIOException j(IOException p0){
       SocketTimeoutException socketTimeou;
       switch (this.k){
           case 1:
             socketTimeou = new SocketTimeoutException("timeout");
             if (p0 != null) {
                socketTimeou.initCause(p0);
             }
             break;
           case 2:
             socketTimeou = new SocketTimeoutException("timeout");
             if (p0 != null) {
                socketTimeou.initCause(p0);
             }
             return socketTimeou;
             break;
           default:
             return super.j(p0);
       }
       return socketTimeou;
    }
    public final void k(){
       switch (this.k){
           case 0:
           case 1:
             this.l.e(mo1.x);
             zr2 b = this.l.b;
             _monitor_enter(b);
             tr2 f = b.F;
             if ((b.G - f) < 0) {
                _monitor_exit(b);
             }else {
                b.F = f + 1;
                b.H = System.nanoTime() + (long)0x3b9aca00;
                _monitor_exit(b);
                b.z.c(new q07(1, b, co5.K(" ping", b.t)), 0);
             }
             return;
             break;
           default:
             String str = "Failed to close timed out socket ";
             kp5 tl = this.l;
             try{
                tl.close();
             }catch(java.lang.Exception e2){
                i15.a.log(Level.WARNING, str+tl, e2);
             }catch(java.lang.AssertionError e2){
                if (!xe7.C(e2)) {
                   throw e2;
                }
                i15.a.log(Level.WARNING, str+tl, e2);
             }
             return;
       }
       this.l.cancel();
       return;
    }
    public final void l(){
       if (!this.i()) {
          return;
       }
       throw this.j(null);
    }
}
