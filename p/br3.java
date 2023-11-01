package p.br3;
import java.util.Locale;
import p.dr3;
import java.lang.Object;
import android.os.Build$VERSION;
import android.os.LocaleList;
import p.ar3;
import p.er3;
import p.cr3;
import java.lang.String;
import p.zq3;

public final class br3	// class@00111d from classes.dex
{
    public final dr3 a;
    public static final br3 b;

    static {
       Locale[] localeArray = new Locale[0];
       br3.b = br3.a(localeArray);
    }
    public void br3(dr3 p0){
       super();
       this.a = p0;
    }
    public static br3 a(Locale[] p0){
       if (Build$VERSION.SDK_INT >= 24) {
          return new br3(new er3(ar3.a(p0)));
       }
       return new br3(new cr3(p0));
    }
    public static br3 b(String p0){
       if (p0 == null || p0.isEmpty()) {
          return br3.b;
       }
       String[] stringArray = p0.split(",", -1);
       int len = stringArray.length;
       Locale[] localeArray = new Locale[len];
       for (int i = 0; i < len; i = i + 1) {
          localeArray[i] = zq3.a(stringArray[i]);
       }
       return br3.a(localeArray);
    }
    public final Locale c(int p0){
       return this.a.get(p0);
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof br3 && this.a.equals(p0.a))? true: false;
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return this.a.toString();
    }
}
