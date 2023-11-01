package p.w08;
import p.jd;
import java.lang.String;
import p.dx7;
import p.hy7;
import p.ax7;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import p.ux7;
import p.jy7;
import java.util.concurrent.Executor;
import p.em0;
import java.lang.Runnable;

public final class w08	// class@002aa2 from classes.dex
{
    public final dx7 a;
    public final hy7 b;
    public final ax7 c;
    public final hy7 d;
    public static final jd e;

    static {
       w08.e = new jd("AssetPackManager");
    }
    public void w08(dx7 p0,hy7 p1,ax7 p2,hy7 p3){
       super();
       Handler handler = new Handler(Looper.getMainLooper());
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(boolean p0){
       w08 tc = this.c;
       _monitor_enter(tc);
       _monitor_exit(tc);
       tc = (tc.e != null)? 1: 0;
       this.c.c(p0);
       if (p0 && !tc) {
          this.d.c().execute(new em0(19, this));
       }
       return;
    }
}
