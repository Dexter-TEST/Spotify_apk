package p.on3;
import p.fr0;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;

public final class on3 implements fr0	// class@002154 from classes.dex
{
    public final int a;
    public final FirebaseCrashlytics b;

    public void on3(FirebaseCrashlytics p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       on3 tb = this.b;
       switch (this.a){
           case 0:
             tb.setUserId(p0);
             return;
           case 1:
             tb.log(p0);
             return;
           default:
             tb.recordException(p0);
             return;
       }
    }
}
