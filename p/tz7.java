package p.tz7;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import p.uz7;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class tz7 implements FilenameFilter	// class@002814 from classes.dex
{
    public static final tz7 a;

    static {
       tz7.a = new tz7();
    }
    public void tz7(){
       super();
    }
    public final boolean accept(File p0,String p1){
       return uz7.a.matcher(p1).matches();
    }
}
