package p.l11;
import java.lang.String;
import android.os.LocaleList;
import p.v3;
import java.util.Locale;
import p.k11;

public abstract class l11	// class@001cc1 from classes.dex
{

    public static String a(){
       LocaleList localeList = v3.f();
       String str = (v3.b(localeList) > 0)? k11.q(localeList).toLanguageTag(): null;
       return str;
    }
}
