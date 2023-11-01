package p.xm2;
import p.tm2;
import java.net.HttpURLConnection;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Object;
import p.co5;
import org.json.JSONArray;
import p.oz1;
import java.util.Locale;
import java.lang.Integer;
import java.util.Arrays;
import java.lang.StringBuilder;
import p.en6;

public final class xm2	// class@002ca5 from classes.dex
{
    public final HttpURLConnection a;
    public final JSONObject b;
    public final oz1 c;
    public final JSONObject d;
    public static final int e;

    public void xm2(tm2 p0,HttpURLConnection p1,String p2,JSONObject p3){
       co5.o(p0, "request");
       co5.o(p2, "rawResponse");
       super(p0, p1, p3, null, null);
    }
    public void xm2(tm2 p0,HttpURLConnection p1,JSONObject p2,JSONArray p3,oz1 p4){
       co5.o(p0, "request");
       super();
       this.a = p1;
       this.b = p2;
       this.c = p4;
       this.d = p2;
    }
    public void xm2(tm2 p0,HttpURLConnection p1,oz1 p2){
       co5.o(p0, "request");
       super(p0, p1, null, null, p2);
    }
    public final String toString(){
       xm2 ta;
       String str1;
       try{
          Locale uS = Locale.US;
          String str = "%d";
          int i = 1;
          Object[] objArray = new Object[i];
          int i1 = ((ta = this.a) == null)? 200: ta.getResponseCode();
          objArray[0] = Integer.valueOf(i1);
          str1 = String.format(uS, str, Arrays.copyOf(objArray, i));
          co5.l(str1, "java.lang.String.format\(locale, format, *args\)");
       }catch(java.io.IOException e0){
          str1 = "unknown";
       }
       str1 = en6.t("{Response:  responseCode: ", str1, ", graphObject: ")+this.b+", error: "+this.c+"}";
       co5.l(str1, "StringBuilder\(\)\n        .append\(\"{Response: \"\)\n        .append\(\" responseCode: \"\)\n        .append\(responseCode\)\n        .append\(\", graphObject: \"\)\n        .append\(graphObject\)\n        .append\(\", error: \"\)\n        .append\(error\)\n        .append\(\"}\"\)\n        .toString\(\)");
       return str1;
    }
}
