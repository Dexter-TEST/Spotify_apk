package p.q95;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class q95	// class@00235a from classes.dex
{
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public void q95(JSONObject p0){
       super();
       String str = p0.getString("class_name");
       co5.l(str, "component.getString\(PATH_CLASS_NAME_KEY\)");
       this.a = str;
       this.b = p0.optInt("index", -1);
       this.c = p0.optInt("id");
       str = p0.optString("text");
       co5.l(str, "component.optString\(PATH_TEXT_KEY\)");
       this.d = str;
       str = p0.optString("tag");
       co5.l(str, "component.optString\(PATH_TAG_KEY\)");
       this.e = str;
       str = p0.optString("description");
       co5.l(str, "component.optString\(PATH_DESCRIPTION_KEY\)");
       this.f = str;
       str = p0.optString("hint");
       co5.l(str, "component.optString\(PATH_HINT_KEY\)");
       this.g = str;
       this.h = p0.optInt("match_bitmask");
    }
}
