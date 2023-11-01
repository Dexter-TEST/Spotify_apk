package p.b75;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.ArrayList;
import org.json.JSONArray;
import p.q95;

public final class b75	// class@00106c from classes.dex
{
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;

    public void b75(JSONObject p0){
       JSONArray jSONArray;
       int i;
       super();
       String str = p0.getString("name");
       co5.l(str, "component.getString\(PARAMETER_NAME_KEY\)");
       this.a = str;
       str = p0.optString("value");
       co5.l(str, "component.optString\(PARAMETER_VALUE_KEY\)");
       this.b = str;
       str = p0.optString("path_type", "absolute");
       co5.l(str, "component.optString\(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE\)");
       this.d = str;
       ArrayList uArrayList = new ArrayList();
       if ((jSONArray = p0.optJSONArray("path")) != null && (i = jSONArray.length()) > 0) {
          int i1 = 0;
          while (true) {
             int i2 = i1 + 1;
             JSONObject jSONObject = jSONArray.getJSONObject(i1);
             co5.l(jSONObject, "jsonPathArray.getJSONObject\(i\)");
             uArrayList.add(new q95(jSONObject));
             if (i2 < i) {
                i1 = i2;
             }
          }
       }
       this.c = uArrayList;
       return;
    }
}
