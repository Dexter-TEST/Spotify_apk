package p.gp5;
import p.f70;
import p.el6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.e70;
import p.nn6;
import java.lang.IllegalStateException;
import p.b57;
import java.lang.StringBuilder;
import p.j80;
import java.nio.ByteBuffer;
import java.lang.Class;

public final class gp5 implements f70	// class@000215 from classes2.dex
{
    public final el6 a;
    public final e70 b;
    public boolean c;

    public void gp5(el6 p0){
       co5.o(p0, "sink");
       super();
       this.a = p0;
       this.b = new e70();
    }
    public final long A(nn6 p0){
       co5.o(p0, "source");
       long l = 0;
       while (true) {
          long l1 = p0.o(this.b, 8192);
          if (l1 - -1) {
             l = l + l1;
             this.K();
          }else {
             break ;
          }
       }
       return l;
    }
    public final void I(e70 p0,long p1){
       co5.o(p0, "source");
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.I(p0, p1);
       this.K();
       return;
    }
    public final f70 K(){
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       gp5 tb = this.b;
       long l = tb.T();
       if ((l) > 0) {
          this.a.I(tb, l);
       }
       return this;
    }
    public final f70 W(String p0){
       co5.o(p0, "string");
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.B0(p0);
       this.K();
       return this;
    }
    public final f70 X(long p0){
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.w0(p0);
       this.K();
       return this;
    }
    public final void b(int p0){
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.y0((((p0 & 0x00ff) << 24) | ((((0xff000000 & p0) >> 24) | ((0xff0000 & p0) >> 8)) | ((0xff00 & p0) << 8))));
       this.K();
       return;
    }
    public final e70 c(){
       return this.b;
    }
    public final void close(){
       gp5 ta = this.a;
       if (this.c == null) {
          gp5 tb = this.b;
          e70 b = tb.b;
          if ((b) > 0) {
             ta.I(tb, b);
          }
          void ovoid = null;
          ta.close();
          this.c = true;
          if (ovoid) {
             throw ovoid;
          }
       }
       return;
    }
    public final b57 e(){
       return this.a.e();
    }
    public final void flush(){
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       gp5 tb = this.b;
       e70 b = tb.b;
       gp5 ta = this.a;
       if ((b) > 0) {
          ta.I(tb, b);
       }
       ta.flush();
       return;
    }
    public final boolean isOpen(){
       return (this.c ^ 0x01);
    }
    public final f70 k(String p0,int p1,int p2){
       co5.o(p0, "string");
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.C0(p0, p1, p2);
       this.K();
       return this;
    }
    public final f70 m(long p0){
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.x0(p0);
       this.K();
       return this;
    }
    public final String toString(){
       return "buffer\("+this.a+')';
    }
    public final f70 v(j80 p0){
       co5.o(p0, "byteString");
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.u0(p0);
       this.K();
       return this;
    }
    public final int write(ByteBuffer p0){
       co5.o(p0, "source");
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       this.K();
       return this.b.write(p0);
    }
    public final f70 write(byte[] p0){
       co5.o(p0, "source");
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       gp5 tb = this.b;
       tb.getClass();
       tb.write(p0, 0, p0.length);
       this.K();
       return this;
    }
    public final f70 write(byte[] p0,int p1,int p2){
       co5.o(p0, "source");
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.write(p0, p1, p2);
       this.K();
       return this;
    }
    public final f70 writeByte(int p0){
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.v0(p0);
       this.K();
       return this;
    }
    public final f70 writeInt(int p0){
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.y0(p0);
       this.K();
       return this;
    }
    public final f70 writeShort(int p0){
       if (!((this.c ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.z0(p0);
       this.K();
       return this;
    }
}
