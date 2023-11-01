package p.cc3;
import java.lang.String;
import java.nio.charset.Charset;
import java.nio.ByteBuffer;
import p.ph0;
import p.sh0;

public abstract class cc3	// class@0011dc from classes.dex
{
    public static final Charset a;
    public static final byte[] b;

    static {
       Charset.forName("US-ASCII");
       cc3.a = Charset.forName("UTF-8");
       Charset.forName("ISO-8859-1");
       byte[] uobyteArray = new byte[0];
       cc3.b = uobyteArray;
       ByteBuffer.wrap(uobyteArray);
       sh0.f(uobyteArray, 0, 0, 0);
    }
    public static int a(long p0){
       return (int)(p0 ^ (p0 >> 32));
    }
}
