package p.a64;
import p.m51;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.nio.channels.WritableByteChannel;
import p.ox7;
import java.nio.Buffer;
import java.lang.Math;

public final class a64 implements m51	// class@000f20 from classes.dex
{
    public final ByteBuffer a;

    public void a64(ByteBuffer p0){
       super();
       this.a = p0;
    }
    public final void close(){
    }
    public final long j(long p0,long p1,WritableByteChannel p2){
       return (long)p2.write(this.a.position(ox7.z(p0)).slice().limit(ox7.z(p1)));
    }
    public final long position(){
       return (long)this.a.position();
    }
    public final void position(long p0){
       this.a.position(ox7.z(p0));
    }
    public final int read(ByteBuffer p0){
       a64 ta = this.a;
       if (!ta.remaining() && p0.remaining()) {
          return -1;
       }
       int i = Math.min(p0.remaining(), ta.remaining());
       if (p0.hasArray()) {
          p0.put(ta.array(), ta.position(), i);
          ta.position((ta.position() + i));
       }else {
          byte[] uobyteArray = new byte[i];
          ta.get(uobyteArray);
          p0.put(uobyteArray);
       }
       return i;
    }
    public final ByteBuffer t(long p0,long p1){
       a64 ta = this.a;
       ta.position(ox7.z(p0));
       ByteBuffer uByteBuffer = ta.slice();
       uByteBuffer.limit(ox7.z(p1));
       ta.position(ta.position());
       return uByteBuffer;
    }
}
