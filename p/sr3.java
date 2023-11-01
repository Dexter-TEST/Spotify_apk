package p.sr3;
import p.yy6;
import p.xy6;
import android.content.Context;
import p.u44;
import java.lang.String;
import java.lang.Object;
import p.s32;
import p.xj0;
import android.util.Log;
import p.tp2;
import java.io.File;
import java.lang.Class;
import p.a70;
import p.un5;

public final class sr3	// class@002684 from classes.dex
{
    public final Context a;
    public final u44 b;
    public s32 c;
    public static final yy6 d;

    static {
       sr3.d = new yy6(null);
    }
    public void sr3(Context p0,u44 p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = sr3.d;
       this.a(p2);
    }
    public final void a(String p0){
       this.c.a();
       this.c = sr3.d;
       if (p0 == null) {
          return;
       }
       if (!xj0.j0(this.a, "com.crashlytics.CollectCustomLogs")) {
          Log.isLoggable("FirebaseCrashlytics", 3);
          return;
       }else {
          p0 = tp2.m("crashlytics-userlog-", p0, ".temp");
          sr3 tb = this.b;
          tb.getClass();
          File uFile = new File(tb.b.b(), "log-files");
          if (!uFile.exists()) {
             uFile.mkdirs();
          }
          this.c = new un5(new File(uFile, p0));
          return;
       }
    }
}
