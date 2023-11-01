package p.pe0;
import java.lang.String;
import java.nio.charset.Charset;

public abstract class pe0	// class@002243 from classes.dex
{
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;

    static {
       pe0.a = Charset.forName("US-ASCII");
       Charset.forName("ISO-8859-1");
       pe0.b = Charset.forName("UTF-8");
       Charset.forName("UTF-16BE");
       Charset.forName("UTF-16LE");
       pe0.c = Charset.forName("UTF-16");
    }
}
