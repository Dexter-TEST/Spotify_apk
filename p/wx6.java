package p.wx6;
import p.in2;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import java.lang.StringBuilder;
import p.tp2;

public final class wx6 extends in2	// class@002bc8 from classes.dex
{
    public int a;
    public int b;

    public void wx6(){
       super();
    }
    public final ByteBuffer a(){
       ByteBuffer uByteBuffer = ByteBuffer.allocate(1);
       uByteBuffer.put((byte)((this.b + (this.a << 6)) & 0x00ff));
       return uByteBuffer.rewind();
    }
    public final String b(){
       return "sync";
    }
    public final void c(ByteBuffer p0){
       byte b;
       if ((b = p0.get()) < 0) {
          b = b + 256;
       }
       this.a = (b & 0x00c0) >> 6;
       this.b = b & 0x3f;
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || wx6.class != p0.getClass()) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((this.a * 31) + this.b);
    }
    public final String toString(){
       return tp2.n("SyncSampleEntry{reserved="+this.a+", nalUnitType=", this.b, '}');
    }
}
