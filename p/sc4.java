package p.sc4;
import p.zg0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.concurrent.TimeUnit;
import p.ic;
import java.lang.Class;
import android.os.SystemClock;

public final class sc4	// class@002600 from classes.dex
{
    public final zg0 a;

    public void sc4(zg0 p0){
       co5.o(p0, "clock");
       super();
       this.a = p0;
    }
    public final long a(){
       this.a.getClass();
       return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }
}
