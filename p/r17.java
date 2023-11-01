package p.r17;
import java.lang.String;
import java.util.regex.Pattern;

public abstract class r17	// class@00245b from classes.dex
{
    public static final Pattern a;
    public static final Pattern b;

    static {
       r17.a = Pattern.compile("spotify:");
       r17.b = Pattern.compile("<a href=\(\"[^\"]*\"\)[^<]*</a>");
    }
}
