package p.bq;
import android.os.Parcelable;
import p.g44;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.eo5;
import android.util.Base64;
import p.oe0;
import java.nio.charset.Charset;
import org.json.JSONObject;
import java.lang.IllegalArgumentException;
import p.tp2;

public final class bq implements Parcelable	// class@00111a from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public static final Parcelable$Creator CREATOR;

    static {
       bq.CREATOR = new g44(23);
    }
    public void bq(Parcel p0){
       co5.o(p0, "parcel");
       super();
       String str = p0.readString();
       eo5.C(str, "alg");
       this.a = str;
       str = p0.readString();
       eo5.C(str, "typ");
       this.b = str;
       String str1 = p0.readString();
       eo5.C(str1, "kid");
       this.c = str1;
    }
    public void bq(String p0){
       String str = "typ";
       String str1 = "alg";
       co5.o(p0, "encodedHeaderString");
       super();
       eo5.A(p0, "encodedHeaderString");
       int i = 0;
       byte[] uobyteArray = Base64.decode(p0, i);
       co5.l(uobyteArray, "decodedBytes");
       Charset a = oe0.a;
       try{
          String str2 = new String(uobyteArray, a);
          JSONObject jSONObject = new JSONObject(str2);
          str2 = jSONObject.optString(str1);
          co5.l(str2, str1);
          int i1 = 1;
          a = (str2.length() > 0)? 1: 0;
          str2 = (a && co5.c(str2, "RS256"))? 1: 0;
          String str3 = jSONObject.optString("kid");
          co5.l(str3, "jsonObj.optString\(\"kid\"\)");
          str3 = (str3.length() > 0)? 1: 0;
          String str4 = jSONObject.optString(str);
          co5.l(str4, "jsonObj.optString\(\"typ\"\)");
          str4 = (str4.length() > 0)? 1: 0;
          if (!str2 || (!str3 || !str4)) {
             i1 = 0;
          }
       }catch(org.json.JSONException e0){
       }
       if (i1) {
          byte[] uobyteArray1 = Base64.decode(p0, i);
          co5.l(uobyteArray1, "decodedBytes");
          String i2 = new String(uobyteArray1, oe0.a);
          JSONObject jSONObject1 = new JSONObject(i2);
          str1 = jSONObject1.getString(str1);
          co5.l(str1, "jsonObj.getString\(\"alg\"\)");
          this.a = str1;
          str = jSONObject1.getString(e0);
          co5.l(str, "jsonObj.getString\(\"typ\"\)");
          this.b = str;
          jSONObject1 = jSONObject1.getString("kid");
          co5.l(jSONObject1, "jsonObj.getString\(\"kid\"\)");
          this.c = jSONObject1;
          return;
       }else {
          throw new IllegalArgumentException("Invalid Header".toString());
       }
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof bq) {
          return false;
       }
       if (!co5.c(this.a, p0.a) || (!co5.c(this.b, p0.b) || !co5.c(this.c, p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.c.hashCode() + tp2.g(this.b, tp2.g(this.a, 527, 31), 31));
    }
    public final String toString(){
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("alg", this.a);
       jSONObject.put("typ", this.b);
       jSONObject.put("kid", this.c);
       String str = jSONObject.toString();
       co5.l(str, "headerJsonObject.toString\(\)");
       return str;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeString(this.c);
    }
}
