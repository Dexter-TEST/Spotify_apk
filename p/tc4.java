package p.tc4;
import p.cu1;
import p.dy1;
import p.xl0;
import java.lang.Object;
import java.lang.String;
import p.u65;
import p.et0;
import com.google.protobuf.c;
import p.rc4;
import com.spotify.contexts.MonotonicClock;
import p.g54;
import p.vx5;
import android.content.SharedPreferences;
import p.k30;
import java.lang.Class;
import android.os.SystemClock;
import com.google.protobuf.b;

public final class tc4 implements cu1	// class@002743 from classes.dex
{
    public final dy1 a;
    public final xl0 b;

    public void tc4(dy1 p0,xl0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String a(){
       return "context_monotonic_clock";
    }
    public final u65 b(){
       return et0.a(this);
    }
    public final c c(){
       rc4 orc4 = MonotonicClock.h();
       tc4 tb = this.b;
       _monitor_enter(tb);
       xl0 b = tb.b;
       int i = -1;
       if (b != i) {
          _monitor_exit(tb);
       }else if((b = tb.c.a.c().getInt("monotonic_clock_id", i)) == i){
          tb.t.a();
          tb.c.t(1, "monotonic_clock_id");
          tb.b = 1;
          _monitor_exit(tb);
          b = 1;
       }else if(tb.t.d()){
          b = b + 1;
          tb.c.t(b, "monotonic_clock_id");
       }
       tb.b = b;
       _monitor_exit(tb);
       orc4.c((long)b);
       this.a.getClass();
       orc4.d(SystemClock.elapsedRealtime());
       return orc4.build();
    }
}
