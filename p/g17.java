package p.g17;
import p.in2;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import java.lang.StringBuilder;
import p.kg4;

public final class g17 extends in2	// class@001680 from classes.dex
{
    public boolean a;

    public void g17(){
       super();
    }
    public final ByteBuffer a(){
       ByteBuffer uByteBuffer = ByteBuffer.allocate(1);
       int i = (this.a != null)? 128: 0;
       uByteBuffer.put((byte)i);
       uByteBuffer.rewind();
       return uByteBuffer;
    }
    public final String b(){
       return "tele";
    }
    public final void c(ByteBuffer p0){
       boolean b = (((p0.get() & 128)) == 128)? true: false;
       this.a = b;
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || g17.class != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((this.a * 31) + 0);
    }
    public final String toString(){
       return kg4.p("TemporalLevelEntry{levelIndependentlyDecodable=", this.a, '}');
    }
}
