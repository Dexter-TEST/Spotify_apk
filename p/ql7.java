package p.ql7;
import p.in2;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import java.lang.StringBuilder;
import p.tp2;

public final class ql7 extends in2	// class@0023c8 from classes.dex
{
    public boolean a;
    public short b;

    public void ql7(){
       super();
    }
    public final ByteBuffer a(){
       ByteBuffer uByteBuffer = ByteBuffer.allocate(1);
       int i = (this.a != null)? 128: 0;
       uByteBuffer.put((byte)(i | (this.b & 0x7f)));
       uByteBuffer.rewind();
       return uByteBuffer;
    }
    public final String b(){
       return "rap ";
    }
    public final void c(ByteBuffer p0){
       byte b = p0.get();
       boolean b1 = (((b & 0x0080)) == 128)? true: false;
       this.a = b1;
       this.b = (short)(b & 0x7f);
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || ql7.class != p0.getClass()) {
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
       return tp2.n("VisualRandomAccessEntry{numLeadingSamplesKnown="+this.a+", numLeadingSamples=", this.b, '}');
    }
}
