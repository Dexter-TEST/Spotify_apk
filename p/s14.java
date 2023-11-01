package p.s14;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Object;

public final class s14 extends InputStream	// class@00259c from classes.dex
{
    public final InputStream a;
    public long b;
    public long c;
    public long t;
    public long v;
    public boolean w;
    public final int x;

    public void s14(InputStream p0){
       BufferedInputStream uBufferedInp;
       super();
       this.v = -1;
       this.w = true;
       this.x = -1;
       if (!p0.markSupported()) {
          uBufferedInp = new BufferedInputStream(p0, 4096);
       }
       this.a = uBufferedInp;
       this.x = 1024;
       return;
    }
    public final int available(){
       return this.a.available();
    }
    public final void b(long p0){
       if ((this.b - this.t) > 0 || (p0 - this.c) < 0) {
          throw new IOException("Cannot reset");
       }
       this.a.reset();
       this.x(this.c, p0);
       this.b = p0;
       return;
    }
    public final void close(){
       this.a.close();
    }
    public final void f(long p0){
       try{
          s14 tb = this.b;
          s14 ta = this.a;
          if ((this.c - tb) < 0 && (tb - this.t) <= 0) {
             ta.reset();
             ta.mark((int)(p0 - this.c));
             this.x(this.c, this.b);
          }else {
             this.c = tb;
             ta.mark((int)(p0 - tb));
          }
          this.t = p0;
          return;
       }catch(java.io.IOException e7){
          throw new IllegalStateException("Unable to mark: "+e7);
       }
    }
    public final void mark(int p0){
       long l = this.b + (long)p0;
       if ((this.t - l) < 0) {
          this.f(l);
       }
       this.v = this.b;
       return;
    }
    public final boolean markSupported(){
       return this.a.markSupported();
    }
    public final int read(){
       int i;
       if (this.w == null) {
          s14 tt = this.t;
          if (((this.b + 1) - tt) > 0) {
             this.f((tt + (long)this.x));
          }
       }
       if ((i = this.a.read()) != -1) {
          this.b = this.b + 1;
       }
       return i;
    }
    public final int read(byte[] p0){
       int i;
       if (this.w == null) {
          s14 tb = this.b;
          if ((((long)p0.length + tb) - this.t) > 0) {
             this.f(((tb + (long)p0.length) + (long)this.x));
          }
       }
       if ((i = this.a.read(p0)) != -1) {
          this.b = this.b + (long)i;
       }
       return i;
    }
    public final int read(byte[] p0,int p1,int p2){
       int i;
       if (this.w == null) {
          s14 tb = this.b;
          long l = (long)p2;
          if (((tb + l) - this.t) > 0) {
             this.f(((tb + l) + (long)this.x));
          }
       }
       if ((i = this.a.read(p0, p1, p2)) != -1) {
          this.b = this.b + (long)i;
       }
       return i;
    }
    public final void reset(){
       this.b(this.v);
    }
    public final long skip(long p0){
       if (this.w == null) {
          s14 tb = this.b;
          if (((tb + p0) - this.t) > 0) {
             this.f(((tb + p0) + (long)this.x));
          }
       }
       p0 = this.a.skip(p0);
       this.b = this.b + p0;
       return p0;
    }
    public final void x(long p0,long p1){
       while ((p0 - p1) < 0) {
          long l = p1 - p0;
          long l1 = this.a.skip(l);
          if (!(l1)) {
             if (this.read() == -1) {
                break ;
             }else {
                l1 = 1;
             }
          }
          p0 = p0 + l1;
       }
       return;
    }
}
