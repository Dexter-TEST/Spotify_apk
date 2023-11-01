package p.ff3;
import p.zf7;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.lang.String;
import java.util.TimeZone;
import java.text.DateFormat;
import java.lang.Object;
import java.util.Date;
import p.ag7;
import p.vg3;
import android.util.JsonWriter;

public final class ff3 implements zf7	// class@0015b7 from classes.dex
{
    public static final SimpleDateFormat a;

    static {
       SimpleDateFormat simpleDateFo = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'", Locale.US);
       ff3.a = simpleDateFo;
       simpleDateFo.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
    public void ff3(){
       super();
    }
    public final void a(Object p0,Object p1){
       p1.e();
       p1.b.value(ff3.a.format(p0));
    }
}
