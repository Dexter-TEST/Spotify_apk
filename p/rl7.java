package p.rl7;
import p.m51;
import java.lang.Object;
import java.nio.channels.WritableByteChannel;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import p.ox7;

public final class rl7 implements m51	// class@002511 from classes.dex
{
    public final long a;
    public final m51 b;

    public void rl7(long p0,m51 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void close(){
       this.b.close();
    }
    public final long j(long p0,long p1,WritableByteChannel p2){
       return this.b.j(p0, p1, p2);
    }
    public final long position(){
       return this.b.position();
    }
    public final void position(long p0){
       this.b.position(p0);
    }
    public final int read(ByteBuffer p0){
       rl7 tb = this.b;
       rl7 ta = this.a;
       if (!(ta - tb.position())) {
          return -1;
       }
       if (((long)p0.remaining() - (ta - tb.position())) <= 0) {
          return tb.read(p0);
       }
       ByteBuffer uByteBuffer = ByteBuffer.allocate(ox7.z((ta - tb.position())));
       tb.read(uByteBuffer);
       p0.put(uByteBuffer.rewind());
       return uByteBuffer.capacity();
    }
    public final ByteBuffer t(long p0,long p1){
       return this.b.t(p0, p1);
    }
}
