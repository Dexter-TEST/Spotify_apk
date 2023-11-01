package p.f70;
import p.el6;
import java.nio.channels.WritableByteChannel;
import p.nn6;
import java.lang.String;
import p.e70;
import p.j80;

public interface abstract f70 implements el6, WritableByteChannel	// class@0001eb from classes2.dex
{

    long A(nn6 p0);
    f70 K();
    f70 W(String p0);
    f70 X(long p0);
    e70 c();
    void flush();
    f70 k(String p0,int p1,int p2);
    f70 m(long p0);
    f70 v(j80 p0);
    f70 write(byte[] p0);
    f70 write(byte[] p0,int p1,int p2);
    f70 writeByte(int p0);
    f70 writeInt(int p0);
    f70 writeShort(int p0);
}
