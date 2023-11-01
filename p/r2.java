package p.r2;
import java.lang.String;
import java.util.regex.Pattern;
import p.yy6;
import java.lang.Object;
import p.xj0;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.IllegalArgumentException;
import java.util.Map;
import p.gs2;
import java.lang.Class;

public abstract class r2	// class@002466 from classes.dex
{
    public final String a;
    public final yy6 b;
    public final int c;
    public static final Pattern t;

    static {
       r2.t = Pattern.compile("http\(s?\)://[^\\/]+", 2);
    }
    public void r2(String p0,String p1,yy6 p2,int p3){
       super();
       if (p1 == null) {
          throw new IllegalArgumentException("url must not be null.");
       }
       if (p2 == null) {
          throw new IllegalArgumentException("requestFactory must not be null.");
       }
       if (!xj0.C0(p0)) {
          p1 = r2.t.matcher(p1).replaceFirst(p0);
       }
       this.a = p1;
       this.b = p2;
       this.c = p3;
       return;
    }
    public final gs2 a(Map p0){
       this.b.getClass();
       gs2 ogs2 = new gs2(this.c, this.a, p0);
       ogs2.b("User-Agent", "Crashlytics Android SDK/17.2.1");
       ogs2.b("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
       return ogs2;
    }
}
