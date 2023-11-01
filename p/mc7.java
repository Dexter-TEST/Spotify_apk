package p.mc7;
import p.in2;
import java.lang.String;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.lang.Object;
import java.lang.Class;
import java.lang.StringBuilder;
import p.xe7;

public final class mc7 extends in2	// class@001e6d from classes.dex
{
    public ByteBuffer a;
    public final String b;

    public void mc7(String p0){
       super();
       this.b = p0;
    }
    public final ByteBuffer a(){
       return this.a.duplicate();
    }
    public final String b(){
       return this.b;
    }
    public final void c(ByteBuffer p0){
       this.a = p0.duplicate().rewind();
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || mc7.class != p0.getClass()) {
          return false;
       }
       mc7 ta = this.a;
       p0 = p0.a;
       if (ta != null) {
          if (!ta.equals(p0)) {
          label_0021 :
             return false;
          }
       }else if(p0 != null){
          goto label_0021 ;
       }
       return true;
    }
    public final int hashCode(){
       mc7 ta;
       int i = ((ta = this.a) != null)? ta.hashCode(): 0;
       return i;
    }
    public final String toString(){
       ByteBuffer uByteBuffer = this.a.duplicate();
       uByteBuffer.rewind();
       byte[] uobyteArray = new byte[uByteBuffer.limit()];
       uByteBuffer.get(uobyteArray);
       return "UnknownEntry{content="+xe7.t(uobyteArray, 0)+'}';
    }
}
