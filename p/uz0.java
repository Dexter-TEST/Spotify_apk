package p.uz0;
import java.lang.Object;
import java.lang.String;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import p.co5;

public final class uz0	// class@00294b from classes.dex
{

    public void uz0(){
       super();
    }
    public static void a(String p0){
       FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
       co5.l(instance, "getInstance\(\)");
       instance.log(p0);
    }
}
