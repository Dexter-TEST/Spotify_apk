package p.m51;
import java.io.Closeable;
import java.nio.channels.WritableByteChannel;
import java.nio.ByteBuffer;

public interface abstract m51 implements Closeable	// class@001e28 from classes.dex
{

    void close();
    long j(long p0,long p1,WritableByteChannel p2);
    long position();
    void position(long p0);
    int read(ByteBuffer p0);
    ByteBuffer t(long p0,long p1);
}
