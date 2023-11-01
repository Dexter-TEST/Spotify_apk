package p.m90;
import p.uc4;
import java.util.Calendar;
import p.pe7;
import p.o90;
import java.lang.Object;
import p.s51;
import java.lang.Long;

public final class m90	// class@001e4a from classes.dex
{
    public final long a;
    public final long b;
    public Long c;
    public final n90 d;
    public static final long e;
    public static final long f;

    static {
       Calendar uCalendar = pe7.c(null);
       uCalendar.setTimeInMillis(uc4.a(1900, 0).w);
       m90.e = pe7.a(uCalendar).getTimeInMillis();
       Calendar uCalendar1 = pe7.c(null);
       uCalendar1.setTimeInMillis(uc4.a(2100, 11).w);
       m90.f = pe7.a(uCalendar1).getTimeInMillis();
    }
    public void m90(o90 p0){
       super();
       this.a = m90.e;
       this.b = m90.f;
       this.d = new s51(Long.MIN_VALUE);
       this.a = p0.a.w;
       this.b = p0.b.w;
       this.c = Long.valueOf(p0.t.w);
       this.d = p0.c;
    }
}
