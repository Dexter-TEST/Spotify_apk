package p.pd5;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;

public abstract class pd5	// class@00223f from classes.dex
{
    public static final Pattern a;

    static {
       pd5.a = Pattern.compile("\\d+");
    }
    public static String a(int p0,String p1){
       if (p1 != null && (p0 && p1.length() >= p0)) {
          Matcher matcher = pd5.a.matcher(p1);
          while (matcher.find()) {
             String str = matcher.group();
             if (str.length() == p0) {
                return str;
             }
          }
       }
       return null;
    }
}
