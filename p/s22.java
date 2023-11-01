package p.s22;
import p.w22;
import java.lang.String;
import java.lang.reflect.Field;

public final class s22 extends w22	// class@0025a4 from classes.dex
{

    public void s22(){
       super("UPPER_CAMEL_CASE_WITH_SPACES", 2);
    }
    public final String a(Field p0){
       return w22.c(w22.b(p0.getName(), " "));
    }
}
