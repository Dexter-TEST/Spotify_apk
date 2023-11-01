package p.vr3;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.lang.String;
import java.util.Date;
import java.lang.Object;
import java.lang.StringBuilder;
import java.text.DateFormat;
import java.lang.Throwable;
import android.util.Log;

public final class vr3	// class@002a4d from classes.dex
{
    public char a;
    public String b;
    public String c;
    public Throwable d;
    public long e;
    public long f;
    public static final SimpleDateFormat g;
    public static final Date h;

    static {
       vr3.g = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
       vr3.h = new Date();
    }
    public void vr3(){
       super();
    }
    public final String toString(){
       Date h = vr3.h;
       h.setTime(this.e);
       SimpleDateFormat g = vr3.g;
       _monitor_enter(g);
       _monitor_exit(g);
       StringBuilder str = new StringBuilder(256)+this.a+9+g.format(h)+9+this.b+9+this.c;
       if (this.d != null) {
          str = str+' '+Log.getStackTraceString(this.d);
       }
       return str;
    }
}
