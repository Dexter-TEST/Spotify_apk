package p.qf;
import java.lang.Object;
import android.os.LocaleList;
import android.app.LocaleManager;

public abstract class qf	// class@002393 from classes.dex
{

    public static LocaleList a(Object p0){
       return p0.getApplicationLocales();
    }
    public static void b(Object p0,LocaleList p1){
       p0.setApplicationLocales(p1);
    }
}
