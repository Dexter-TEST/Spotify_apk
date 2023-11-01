package p.aq;
import android.os.Parcelable;
import p.g44;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.eo5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import java.util.Collections;
import p.eb3;
import java.lang.ClassLoader;
import java.lang.Class;
import java.util.HashMap;
import java.util.Map;
import p.tu6;
import android.util.Base64;
import p.oe0;
import java.nio.charset.Charset;
import org.json.JSONObject;
import java.net.URL;
import p.sz1;
import java.util.Date;
import p.az5;
import org.json.JSONArray;
import p.ej4;
import java.lang.IllegalArgumentException;
import p.tp2;
import java.util.List;

public final class aq implements Parcelable	// class@000fd7 from classes.dex
{
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final Set E;
    public final String F;
    public final Map G;
    public final Map H;
    public final Map I;
    public final String J;
    public final String K;
    public final String a;
    public final String b;
    public final String c;
    public final String t;
    public final long v;
    public final long w;
    public final String x;
    public final String y;
    public final String z;
    public static final Parcelable$Creator CREATOR;

    static {
       aq.CREATOR = new g44(22);
    }
    public void aq(Parcel p0){
       Map map1;
       Map map2;
       co5.o(p0, "parcel");
       super();
       String str = p0.readString();
       eo5.C(str, "jti");
       this.a = str;
       str = p0.readString();
       eo5.C(str, "iss");
       this.b = str;
       str = p0.readString();
       eo5.C(str, "aud");
       this.c = str;
       str = p0.readString();
       eo5.C(str, "nonce");
       this.t = str;
       this.v = p0.readLong();
       this.w = p0.readLong();
       str = p0.readString();
       eo5.C(str, "sub");
       this.x = str;
       this.y = p0.readString();
       this.z = p0.readString();
       this.A = p0.readString();
       this.B = p0.readString();
       this.C = p0.readString();
       this.D = p0.readString();
       ArrayList uArrayList = p0.createStringArrayList();
       Map map = null;
       Set set = (uArrayList != null)? Collections.unmodifiableSet(new HashSet(uArrayList)): map;
       this.E = set;
       this.F = p0.readString();
       HashMap hashMap = p0.readHashMap(eb3.class.getClassLoader());
       if (!hashMap instanceof HashMap) {
          map1 = map;
       }
       map1 = (hashMap != null)? Collections.unmodifiableMap(hashMap): map;
       this.G = map1;
       tu6 otu6 = tu6.class;
       HashMap hashMap1 = p0.readHashMap(otu6.getClassLoader());
       if (!hashMap1 instanceof HashMap) {
          map2 = map;
       }
       map2 = (hashMap1 != null)? Collections.unmodifiableMap(hashMap1): map;
       this.H = map2;
       hashMap = p0.readHashMap(otu6.getClassLoader());
       if (!hashMap instanceof HashMap) {
          map1 = map;
       }
       if (hashMap != null) {
          map = Collections.unmodifiableMap(hashMap);
       }
       this.I = map;
       this.J = p0.readString();
       this.K = p0.readString();
       return;
    }
    public void aq(String p0,String p1){
       int i1;
       Set set;
       JSONObject jSONObject1;
       int i = this;
       byte[] obj = p0;
       String obj1 = p1;
       co5.o(obj, "encodedClaims");
       co5.o(obj1, "expectedNonce");
       super();
       eo5.A(obj, "encodedClaims");
       obj = Base64.decode(obj, 8);
       co5.l(obj, "decodedBytes");
       String str = new String(obj, oe0.a);
       JSONObject jSONObject = new JSONObject(str);
       str = "jti";
       String str1 = jSONObject.optString(str);
       co5.l(str1, str);
       str1 = (!str1.length())? 1: 0;
       try{
          String str2 = "nonce";
          String str3 = "sub";
          if (!str1) {
             str1 = jSONObject.optString("iss");
             co5.l(str1, "iss");
             int i4 = (!str1.length())? 1: 0;
             if (!i4 && (co5.c(new URL(str1).getHost(), "facebook.com") && !co5.c(new URL(str1).getHost(), "www.facebook.com"))) {
                str1 = jSONObject.optString("aud");
                co5.l(str1, "aud");
                i4 = (!str1.length())? 1: 0;
                if (!i4 && co5.c(str1, sz1.b())) {
                   long l = (long)1000;
                   if (!new Date().after(new Date((jSONObject.optLong("exp") * l))) && !new Date().after(new Date(((jSONObject.optLong("iat") * l) + 0x927c0)))) {
                      str1 = jSONObject.optString(str3);
                      co5.l(str1, str3);
                      HashSet hashSet = (!str1.length())? 1: 0;
                      if (!hashSet) {
                         str1 = jSONObject.optString(str2);
                         co5.l(str1, str2);
                         l = (!str1.length())? 1: 0;
                         if (!l && co5.c(str1, obj1)) {
                            l = 1;
                         label_0107 :
                            if (i1) {
                               obj1 = jSONObject.getString(str);
                               co5.l(obj1, "jsonObj.getString\(JSON_KEY_JIT\)");
                               i.a = obj1;
                               obj1 = jSONObject.getString("iss");
                               co5.l(obj1, "jsonObj.getString\(JSON_KEY_ISS\)");
                               i.b = obj1;
                               obj1 = jSONObject.getString("aud");
                               co5.l(obj1, "jsonObj.getString\(JSON_KEY_AUD\)");
                               i.c = obj1;
                               obj1 = jSONObject.getString(str2);
                               co5.l(obj1, "jsonObj.getString\(JSON_KEY_NONCE\)");
                               i.t = obj1;
                               i.v = jSONObject.getLong("exp");
                               i.w = jSONObject.getLong("iat");
                               obj1 = jSONObject.getString(str3);
                               co5.l(obj1, "jsonObj.getString\(JSON_KEY_SUB\)");
                               i.x = obj1;
                               i.y = az5.I("name", jSONObject);
                               i.z = az5.I("given_name", jSONObject);
                               i.A = az5.I("middle_name", jSONObject);
                               i.B = az5.I("family_name", jSONObject);
                               i.C = az5.I("email", jSONObject);
                               i.D = az5.I("picture", jSONObject);
                               JSONArray jSONArray = jSONObject.optJSONArray("user_friends");
                               Map map = null;
                               if (jSONArray == null) {
                                  set = map;
                               }else {
                                  hashSet = new HashSet();
                                  if ((i1 = jSONArray.length()) > 0) {
                                     int i2 = 0;
                                     while (true) {
                                        int i3 = i2 + 1;
                                        String str4 = jSONArray.getString(i2);
                                        co5.l(str4, "jsonArray.getString\(i\)");
                                        hashSet.add(str4);
                                        if (i3 < i1) {
                                           i2 = i3;
                                        }
                                     }
                                  }
                                  set = Collections.unmodifiableSet(hashSet);
                               }
                               i.E = set;
                               i.F = az5.I("user_birthday", jSONObject);
                               Map map1 = ((jSONObject1 = jSONObject.optJSONObject("user_age_range")) == null)? map: Collections.unmodifiableMap(ej4.r(jSONObject1));
                               i.G = map1;
                               map1 = ((jSONObject1 = jSONObject.optJSONObject("user_hometown")) == null)? map: Collections.unmodifiableMap(ej4.s(jSONObject1));
                               i.H = map1;
                               if ((jSONObject1 = jSONObject.optJSONObject("user_location")) != null) {
                                  map = Collections.unmodifiableMap(ej4.s(jSONObject1));
                               }
                               i.I = map;
                               i.J = az5.I("user_gender", jSONObject);
                               i.K = az5.I("user_link", jSONObject);
                               return;
                            }else {
                               throw new IllegalArgumentException("Invalid claims".toString());
                            }
                         }
                      }
                   }
                }
             }
          }
       }catch(java.net.MalformedURLException e0){
       }
       i1 = 0;
       goto label_0107 ;
    }
    public final JSONObject a(){
       aq tx;
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("jti", this.a);
       jSONObject.put("iss", this.b);
       jSONObject.put("aud", this.c);
       jSONObject.put("nonce", this.t);
       jSONObject.put("exp", this.v);
       jSONObject.put("iat", this.w);
       if ((tx = this.x) != null) {
          jSONObject.put("sub", tx);
       }
       if ((tx = this.y) != null) {
          jSONObject.put("name", tx);
       }
       if ((tx = this.z) != null) {
          jSONObject.put("given_name", tx);
       }
       if ((tx = this.A) != null) {
          jSONObject.put("middle_name", tx);
       }
       if ((tx = this.B) != null) {
          jSONObject.put("family_name", tx);
       }
       if ((tx = this.C) != null) {
          jSONObject.put("email", tx);
       }
       if ((tx = this.D) != null) {
          jSONObject.put("picture", tx);
       }
       if ((tx = this.E) != null) {
          jSONObject.put("user_friends", new JSONArray(tx));
       }
       if ((tx = this.F) != null) {
          jSONObject.put("user_birthday", tx);
       }
       if ((tx = this.G) != null) {
          jSONObject.put("user_age_range", new JSONObject(tx));
       }
       if ((tx = this.H) != null) {
          jSONObject.put("user_hometown", new JSONObject(tx));
       }
       if ((tx = this.I) != null) {
          jSONObject.put("user_location", new JSONObject(tx));
       }
       if ((tx = this.J) != null) {
          jSONObject.put("user_gender", tx);
       }
       if ((tx = this.K) != null) {
          jSONObject.put("user_link", tx);
       }
       return jSONObject;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof aq) {
          return false;
       }
       if (!co5.c(this.a, p0.a) || (!co5.c(this.b, p0.b) || (!co5.c(this.c, p0.c) || (!co5.c(this.t, p0.t) || ((this.v - p0.v) || ((this.w - p0.w) || (!co5.c(this.x, p0.x) || (!co5.c(this.y, p0.y) || (!co5.c(this.z, p0.z) || (!co5.c(this.A, p0.A) || (!co5.c(this.B, p0.B) || (!co5.c(this.C, p0.C) || (!co5.c(this.D, p0.D) || (!co5.c(this.E, p0.E) || (!co5.c(this.F, p0.F) || (!co5.c(this.G, p0.G) || (!co5.c(this.H, p0.H) || (!co5.c(this.I, p0.I) || (!co5.c(this.J, p0.J) || !co5.c(this.K, p0.K)))))))))))))))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       aq ty;
       aq tv = this.v;
       tv = this.w;
       int i = tp2.g(this.x, ((((tp2.g(this.t, tp2.g(this.c, tp2.g(this.b, tp2.g(this.a, 527, 31), 31), 31), 31) + (int)(tv ^ (tv >> 32))) * 31) + (int)(tv ^ (tv >> 32))) * 31), 31);
       int i1 = 0;
       int i2 = ((ty = this.y) == null)? 0: ty.hashCode();
       i = (i + i2) * 31;
       i2 = ((ty = this.z) == null)? 0: ty.hashCode();
       i = (i + i2) * 31;
       i2 = ((ty = this.A) == null)? 0: ty.hashCode();
       i = (i + i2) * 31;
       i2 = ((ty = this.B) == null)? 0: ty.hashCode();
       i = (i + i2) * 31;
       i2 = ((ty = this.C) == null)? 0: ty.hashCode();
       i = (i + i2) * 31;
       i2 = ((ty = this.D) == null)? 0: ty.hashCode();
       i = (i + i2) * 31;
       i2 = ((ty = this.E) == null)? 0: ty.hashCode();
       i = (i + i2) * 31;
       i2 = ((ty = this.F) == null)? 0: ty.hashCode();
       i = (i + i2) * 31;
       i2 = ((ty = this.G) == null)? 0: ty.hashCode();
       i = (i + i2) * 31;
       i2 = ((ty = this.H) == null)? 0: ty.hashCode();
       i = (i + i2) * 31;
       i2 = ((ty = this.I) == null)? 0: ty.hashCode();
       i = (i + i2) * 31;
       i2 = ((ty = this.J) == null)? 0: ty.hashCode();
       i = (i + i2) * 31;
       if ((ty = this.K) != null) {
          i1 = ty.hashCode();
       }
       return (i + i1);
    }
    public final String toString(){
       String str = this.a().toString();
       co5.l(str, "claimsJsonObject.toString\(\)");
       return str;
    }
    public final void writeToParcel(Parcel p0,int p1){
       aq tE;
       co5.o(p0, "dest");
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeString(this.t);
       p0.writeLong(this.v);
       p0.writeLong(this.w);
       p0.writeString(this.x);
       p0.writeString(this.y);
       p0.writeString(this.z);
       p0.writeString(this.A);
       p0.writeString(this.B);
       p0.writeString(this.C);
       p0.writeString(this.D);
       if ((tE = this.E) == null) {
          p0.writeStringList(null);
       }else {
          p0.writeStringList(new ArrayList(tE));
       }
       p0.writeString(this.F);
       p0.writeMap(this.G);
       p0.writeMap(this.H);
       p0.writeMap(this.I);
       p0.writeString(this.J);
       p0.writeString(this.K);
       return;
    }
}
