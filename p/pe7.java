package p.pe7;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Calendar;
import java.lang.Object;
import p.x47;
import java.lang.String;
import java.util.TimeZone;

public abstract class pe7	// class@002249 from classes.dex
{
    public static final AtomicReference a;

    static {
       pe7.a = new AtomicReference();
    }
    public static Calendar a(Calendar p0){
       p0 = pe7.c(p0);
       Calendar uCalendar = pe7.c(null);
       int i = p0.get(1);
       int i1 = p0.get(2);
       uCalendar.set(i, i1, p0.get(5));
       return uCalendar;
    }
    public static Calendar b(){
       x47 ox47 = pe7.a.get();
       Calendar instance = Calendar.getInstance();
       instance.set(11, 0);
       instance.set(12, 0);
       instance.set(13, 0);
       instance.set(14, 0);
       instance.setTimeZone(TimeZone.getTimeZone("UTC"));
       return instance;
    }
    public static Calendar c(Calendar p0){
       Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
       if (p0 == null) {
          instance.clear();
       }else {
          instance.setTimeInMillis(p0.getTimeInMillis());
       }
       return instance;
    }
}
