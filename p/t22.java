package p.t22;
import p.w22;
import java.lang.String;
import java.lang.reflect.Field;
import java.util.Locale;

public final class t22 extends w22	// class@0026e6 from classes.dex
{

    public void t22(){
       super("LOWER_CASE_WITH_UNDERSCORES", 3);
    }
    public final String a(Field p0){
       return w22.b(p0.getName(), "_").toLowerCase(Locale.ENGLISH);
    }
}
