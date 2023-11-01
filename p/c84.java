package p.c84;
import java.lang.String;
import java.nio.charset.Charset;
import java.io.File;
import java.lang.Object;
import p.oe7;
import org.json.JSONObject;
import p.kg4;

public final class c84	// class@0011b8 from classes.dex
{
    public final File a;
    public static final Charset b;

    static {
       c84.b = Charset.forName("UTF-8");
    }
    public void c84(File p0){
       super();
       this.a = p0;
    }
    public static oe7 b(String p0){
       JSONObject jSONObject = new JSONObject(p0);
       oe7 ooe7 = new oe7(6);
       String str = null;
       if (!jSONObject.isNull("userId")) {
          str = jSONObject.optString("userId", str);
       }
       ooe7.a = oe7.m(str);
       return ooe7;
    }
    public final File a(String p0){
       return new File(this.a, kg4.l(p0, "user.meta"));
    }
}
