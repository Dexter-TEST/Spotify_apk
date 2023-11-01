package p.v22;
import p.w22;
import java.lang.String;
import java.lang.reflect.Field;
import java.util.Locale;

public final class v22 extends w22	// class@002969 from classes.dex
{

    public void v22(){
       super("LOWER_CASE_WITH_DOTS", 5);
    }
    public final String a(Field p0){
       return w22.b(p0.getName(), ".").toLowerCase(Locale.ENGLISH);
    }
}
