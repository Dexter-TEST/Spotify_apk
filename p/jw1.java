package p.jw1;
import p.wc2;
import p.l67;
import p.el6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.e70;
import java.net.ProtocolException;
import java.lang.StringBuilder;
import java.io.IOException;
import java.lang.IllegalStateException;

public final class jw1 extends wc2	// class@00026d from classes2.dex
{
    public final long b;
    public boolean c;
    public long t;
    public boolean v;
    public final l67 w;

    public void jw1(l67 p0,el6 p1,long p2){
       co5.o(p0, "this$0");
       co5.o(p1, "delegate");
       this.w = p0;
       super(p1);
       this.b = p2;
    }
    public final void I(e70 p0,long p1){
       co5.o(p0, "source");
       if (!((this.v ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       jw1 tb = this.b;
       if ((tb - -1) && ((this.t + p1) - tb) > 0) {
          throw new ProtocolException("expected "+tb+" bytes but received "+(this.t + p1));
       }
       try{
          super.I(p0, p1);
          this.t = this.t + p1;
          return;
       }catch(java.io.IOException e6){
          throw this.b(e6);
       }
    }
    public final IOException b(IOException p0){
       if (this.c != null) {
          return p0;
       }
       this.c = true;
       return this.w.a(false, true, p0);
    }
    public final void close(){
       if (this.v != null) {
          return;
       }
       this.v = true;
       jw1 tb = this.b;
       if ((tb - -1) && (this.t - tb)) {
          throw new ProtocolException("unexpected end of stream");
       }
       try{
          super.close();
          this.b(null);
          return;
       }catch(java.io.IOException e0){
          throw this.b(e0);
       }
    }
    public final void flush(){
       try{
          super.flush();
          return;
       }catch(java.io.IOException e0){
          throw this.b(e0);
       }
    }
}
