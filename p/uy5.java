package p.uy5;
import p.in2;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;

public final class uy5 extends in2	// class@002947 from classes.dex
{
    public short a;

    public void uy5(){
       super();
    }
    public final ByteBuffer a(){
       ByteBuffer uByteBuffer = ByteBuffer.allocate(2);
       uByteBuffer.putShort(this.a);
       uByteBuffer.rewind();
       return uByteBuffer;
    }
    public final String b(){
       return "roll";
    }
    public final void c(ByteBuffer p0){
       this.a = p0.getShort();
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || uy5.class != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a;
    }
}
