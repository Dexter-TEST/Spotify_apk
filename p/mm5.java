package p.mm5;
import java.util.HashMap;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import p.qi2;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import p.xe7;

public abstract class mm5	// class@001ec4 from classes.dex
{
    public static final HashMap a;

    static {
       mm5.a = new HashMap();
    }
    public void mm5(){
       super();
    }
    public final boolean equals(Object p0){
       throw new RuntimeException("somebody called equals on me but that\'s not supposed to happen.");
    }
    public final String toString(){
       ByteBuffer uByteBuffer = this.b.duplicate();
       uByteBuffer.rewind();
       byte[] uobyteArray = new byte[uByteBuffer.limit()];
       uByteBuffer.get(uobyteArray);
       return "ProtectionSpecificHeader{data="+xe7.t(uobyteArray, 0)+'}';
    }
}
