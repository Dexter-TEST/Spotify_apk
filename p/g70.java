package p.g70;
import p.nn6;
import java.nio.channels.ReadableByteChannel;
import java.lang.String;
import p.j80;
import p.f70;
import p.t45;
import p.e70;
import java.nio.charset.Charset;
import p.y70;
import p.hp5;

public interface abstract g70 implements nn6, ReadableByteChannel	// class@000207 from classes2.dex
{

    String B();
    byte[] D();
    int E();
    boolean F();
    long H(j80 p0);
    long L(f70 p0);
    long N();
    String O(long p0);
    int U(t45 p0);
    void V(long p0);
    boolean a(long p0);
    long b0();
    e70 c();
    String c0(Charset p0);
    y70 e0();
    boolean l(long p0,j80 p1);
    long p(j80 p0);
    hp5 peek();
    j80 q(long p0);
    int read(byte[] p0);
    byte readByte();
    int readInt();
    short readShort();
    void skip(long p0);
}
