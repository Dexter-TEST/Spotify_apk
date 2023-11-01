package p.u22;
import p.w22;
import java.lang.String;
import java.lang.reflect.Field;
import java.util.Locale;

public final class u22 extends w22	// class@00282a from classes.dex
{

    public void u22(){
       super("LOWER_CASE_WITH_DASHES", 4);
    }
    public final String a(Field p0){
       return w22.b(p0.getName(), "-").toLowerCase(Locale.ENGLISH);
    }
}
