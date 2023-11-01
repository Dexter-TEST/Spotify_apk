package p.sx;
import p.rx;
import java.lang.String;
import java.lang.StringBuilder;

public abstract class sx	// class@0026be from classes.dex
{
    public static final rx a;
    public static final rx b;
    public static final rx c;
    public static final rx d;

    static {
       rx v6 = new rx("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", 1, 61, 76);
       sx.a = v6;
       v6 = new rx(v6, "MIME-NO-LINEFEEDS", 1, 61, Integer.MAX_VALUE);
       sx.b = v9;
       v6 = new rx(v6, "PEM", true, '=', 64);
       sx.c = v7;
       String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
       str.setCharAt(str.indexOf("+"), '-');
       str.setCharAt(str.indexOf("/"), '_');
       rx v1 = new rx("MODIFIED-FOR-URL", str, false, 0, Integer.MAX_VALUE);
       sx.d = v1;
    }
}
