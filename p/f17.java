package p.f17;
import p.in2;
import java.nio.ByteBuffer;
import p.vv7;
import java.nio.Buffer;
import java.lang.String;
import p.do5;
import java.lang.RuntimeException;
import java.lang.Object;
import java.lang.Class;
import java.lang.StringBuilder;
import p.tp2;

public final class f17 extends in2	// class@00153e from classes.dex
{
    public int a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public void f17(){
       super();
    }
    public final ByteBuffer a(){
       ByteBuffer uByteBuffer = ByteBuffer.allocate(20);
       uByteBuffer.put((byte)(this.a & 0x00ff));
       int i = this.b << 6;
       long l = 32;
       int i1 = (this.c != null)? 32: 0;
       uByteBuffer.put((byte)(((i + i1) + this.d) & 0x00ff));
       uByteBuffer.putInt((int)this.e);
       long l1 = this.f & 0xffffffffffff;
       vv7.e0(uByteBuffer, (int)(l1 >> l));
       uByteBuffer.putInt((int)(l1 & 0xffffffff));
       uByteBuffer.put((byte)(this.g & 0x00ff));
       vv7.e0(uByteBuffer, this.h);
       vv7.e0(uByteBuffer, this.i);
       uByteBuffer.put((byte)(this.j & 0x00ff));
       vv7.e0(uByteBuffer, this.k);
       return uByteBuffer.rewind();
    }
    public final String b(){
       return "tscl";
    }
    public final void c(ByteBuffer p0){
       int b;
       if ((b = p0.get()) < 0) {
          b = b + 256;
       }
       this.a = b;
       if ((b = p0.get()) < 0) {
          b = b + 256;
       }
       this.b = (b & 0x00c0) >> 6;
       boolean b1 = (((b & 0x20)) > 0)? true: false;
       this.c = b1;
       this.d = b & 0x1f;
       this.e = do5.k0(p0);
       long l = (long)do5.i0(p0) << 32;
       if ((l) >= 0) {
          this.f = do5.k0(p0) + l;
          if ((b = p0.get()) < 0) {
             b = b + 256;
          }
          this.g = b;
          this.h = do5.i0(p0);
          this.i = do5.i0(p0);
          if ((b = p0.get()) < 0) {
             b = b + 256;
          }
          this.j = b;
          this.k = do5.i0(p0);
          return;
       }else {
          throw new RuntimeException("I don\'t know how to deal with UInt64! long is not sufficient and I don\'t want to use BigInt");
       }
    }
    public final int d(){
       return 20;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || f17.class != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.i != p0.i) {
          return false;
       }
       if (this.k != p0.k) {
          return false;
       }
       if (this.j != p0.j) {
          return false;
       }
       if (this.h != p0.h) {
          return false;
       }
       if (this.f - p0.f) {
          return false;
       }
       if (this.g != p0.g) {
          return false;
       }
       if (this.e - p0.e) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       f17 te = this.e;
       te = this.f;
       return ((((((((((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + (int)(te ^ (te >> 32))) * 31) + (int)(te ^ (te >> 32))) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k);
    }
    public final String toString(){
       return tp2.n("TemporalLayerSampleGroup{temporalLayerId="+this.a+", tlprofile_space="+this.b+", tltier_flag="+this.c+", tlprofile_idc="+this.d+", tlprofile_compatibility_flags="+this.e+", tlconstraint_indicator_flags="+this.f+", tllevel_idc="+this.g+", tlMaxBitRate="+this.h+", tlAvgBitRate="+this.i+", tlConstantFrameRate="+this.j+", tlAvgFrameRate=", this.k, '}');
    }
}
