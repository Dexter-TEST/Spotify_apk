package p.td7;
import java.lang.String;
import java.util.regex.Pattern;
import android.net.Uri;
import java.lang.Object;
import java.lang.CharSequence;
import android.net.Uri$Builder;
import p.aq6;
import p.yp6;
import java.lang.Class;

public abstract class td7	// class@00274f from classes.dex
{
    public static final Pattern a;

    static {
       td7.a = Pattern.compile("\\?");
    }
    public static String a(String p0){
       aq6 uoaq6;
       Uri uri = Uri.parse(p0);
       if (uri.isOpaque() && "spotify".equals(uri.getScheme())) {
          return td7.a.split(p0, 0)[0];
       }
       p0 = uri.buildUpon().fragment(null).clearQuery().toString();
       if ((uoaq6 = td7.d(p0)) != null) {
          p0 = uoaq6.toString();
       }
       return p0;
    }
    public static String b(String p0){
       aq6 uoaq6;
       if ((uoaq6 = td7.d(p0)) == null) {
          return p0;
       }
       return td7.c(uoaq6).toString();
    }
    public static aq6 c(aq6 p0){
       if (p0.b == yp6.A) {
          p0 = p0.t;
          p0.getClass();
          p0 = new aq6(yp6.B, p0, null);
       }
       return p0;
    }
    public static aq6 d(String p0){
       if (p0 == null) {
          return null;
       }
       if (p0.endsWith("open.spotify.com/")) {
          return new aq6(yp6.J0, null, null);
       }
       try{
          return new aq6(p0);
       }catch(p.cq6 e0){
          return e0;
       }
    }
}
