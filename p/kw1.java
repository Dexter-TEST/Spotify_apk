package p.kw1;
import p.xc2;
import p.l67;
import p.nn6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.io.IOException;
import p.i70;
import p.lp5;
import java.lang.Class;
import p.e70;
import java.net.ProtocolException;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;

public final class kw1 extends xc2	// class@00028e from classes2.dex
{
    public final long b;
    public long c;
    public boolean t;
    public boolean v;
    public boolean w;
    public final l67 x;

    public void kw1(l67 p0,nn6 p1,long p2){
       co5.o(p1, "delegate");
       this.x = p0;
       super(p1);
       this.b = p2;
       this.t = true;
       if (!(p2)) {
          this.b(null);
       }
       return;
    }
    public final IOException b(IOException p0){
       if (this.v != null) {
          return p0;
       }
       this.v = true;
       kw1 tx = this.x;
       if (p0 == null && this.t != null) {
          this.t = false;
          tx.c.getClass();
          co5.o(tx.b, "call");
       }
       return tx.a(true, false, p0);
    }
    public final void close(){
       if (this.w != null) {
          return;
       }
       this.w = true;
       try{
          super.close();
          this.b(null);
          return;
       }catch(java.io.IOException e0){
          throw this.b(e0);
       }
    }
    public final long o(e70 p0,long p1){
       String str = "expected ";
       co5.o(p0, "sink");
       if (!((this.w ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       try{
          long l = this.a.o(p0, p1);
          if (this.t != null) {
             this.t = false;
             kw1 tx = this.x;
             tx.c.getClass();
             co5.o(tx.b, "call");
          }
          IOException iOException = null;
          long l1 = -1;
          if (!(l - l1)) {
             this.b(iOException);
             return l1;
          }else {
             long l2 = this.c + l;
             kw1 tb = this.b;
             if ((tb - l1) && (l2 - tb) > 0) {
                throw new ProtocolException(str+tb+" bytes but received "+l2);
             }else {
                this.c = l2;
                if (!(l2 - tb)) {
                   this.b(iOException);
                }
                return l;
             }
          }
       }catch(java.io.IOException e9){
          throw this.b(e9);
       }
    }
}
