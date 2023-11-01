package p.h26;
import java.nio.ByteBuffer;
import java.lang.Object;
import p.do5;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class h26	// class@0017cb from classes.dex
{
    public final byte a;
    public final byte b;
    public final byte c;
    public final byte d;
    public final byte e;
    public final byte f;
    public final boolean g;
    public final int h;

    public void h26(ByteBuffer p0){
       super();
       long l = do5.k0(p0);
       this.a = (byte)(int)((-268435456 & l) >> 28);
       this.b = (byte)(int)((0xc000000 & l) >> 26);
       this.c = (byte)(int)((0x3000000 & l) >> 24);
       this.d = (byte)(int)((0xc00000 & l) >> 22);
       this.e = (byte)(int)((0x300000 & l) >> 20);
       this.f = (byte)(int)((0xe0000 & l) >> 17);
       boolean b = ((((0x10000 & l) >> 16)) > 0)? true: false;
       this.g = b;
       this.h = (int)(l & 0xffff);
       return;
    }
    public final void a(ByteBuffer p0){
       p0.putInt((int)(((((((((long)(this.a << 28) | 0) | (long)(this.b << 26)) | (long)(this.c << 24)) | (long)(this.d << 22)) | (long)(this.e << 20)) | (long)(this.f << 17)) | (long)(this.g << 16)) | (long)this.h));
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || h26.class != p0.getClass()) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.h != p0.h) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.g != p0.g) {
          return false;
       }
       if (this.f != p0.f) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h);
    }
    public final String toString(){
       return tp2.n("SampleFlags{reserved="+this.a+", isLeading="+this.b+", depOn="+this.c+", isDepOn="+this.d+", hasRedundancy="+this.e+", padValue="+this.f+", isDiffSample="+this.g+", degradPrio=", this.h, '}');
    }
}
