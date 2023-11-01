package p.jf7;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;

public final class jf7	// class@001ac9 from classes.dex
{
    public static final long a;
    public static final Pattern b;

    static {
       jf7.a = TimeUnit.HOURS.toSeconds(1);
       jf7.b = Pattern.compile("\\AA[\\w-]{38}\\z");
    }
    public void jf7(){
       super();
    }
}
