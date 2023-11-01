package p.yr0;
import android.os.Parcelable;
import p.v74;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import android.os.Parcel;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.en6;
import java.io.Serializable;
import java.lang.Double;
import p.w01;
import p.kg4;
import java.lang.Integer;
import java.util.Collection;
import java.util.Map;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.Iterator;
import java.util.Set;
import java.lang.Throwable;
import java.lang.Enum;

public final class yr0 implements Parcelable	// class@002e0f from classes.dex
{
    public final String A;
    public final Double B;
    public final Double C;
    public final Integer D;
    public final Double E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final String J;
    public final Double K;
    public final Double L;
    public final ArrayList M;
    public final HashMap N;
    public final int a;
    public final Double b;
    public final Double c;
    public final w01 t;
    public final String v;
    public final String w;
    public final String x;
    public final int y;
    public final int z;
    public static final Parcelable$Creator CREATOR;

    static {
       yr0.CREATOR = new v74(12);
    }
    public void yr0(){
       super();
       this.M = new ArrayList();
       this.N = new HashMap();
    }
    public void yr0(Parcel p0){
       int i2;
       object oobject;
       super();
       String str = p0.readString();
       int i = 0;
       if (!TextUtils.isEmpty(str)) {
          int[] ointArray = en6._values$1();
          int len = ointArray.length;
          int i1 = 0;
          while (true) {
             if (i1 < len) {
                i2 = ointArray[i1];
                if (en6.w(i2).equalsIgnoreCase(str)) {
                label_0027 :
                   this.a = i2;
                   this.b = p0.readSerializable();
                   this.c = p0.readSerializable();
                   str = p0.readString();
                   if (!TextUtils.isEmpty(str)) {
                      w01[] ow01Array = w01.values();
                      len = ow01Array.length;
                      i1 = 0;
                      while (true) {
                         if (i1 < len) {
                            oobject = ow01Array[i1];
                            if (oobject.a.equals(str)) {
                            label_005a :
                               this.t = oobject;
                               this.v = p0.readString();
                               this.w = p0.readString();
                               this.x = p0.readString();
                               str = p0.readString();
                               if (!TextUtils.isEmpty(str)) {
                                  ointArray = kg4._values();
                                  len = ointArray.length;
                                  i1 = 0;
                                  while (true) {
                                     if (i1 < len) {
                                        i2 = ointArray[i1];
                                        if (kg4.d(i2).equalsIgnoreCase(str)) {
                                        label_0091 :
                                           this.y = i2;
                                           str = p0.readString();
                                           if (!TextUtils.isEmpty(str)) {
                                              ointArray = en6._values$2();
                                              len = ointArray.length;
                                              i1 = 0;
                                              while (i1 < len) {
                                                 i2 = ointArray[i1];
                                                 if (en6.z(i2).equalsIgnoreCase(str)) {
                                                    i = i2;
                                                    break ;
                                                 }
                                                 i1 = i1 + 1;
                                              }
                                           }
                                           break ;
                                        }else {
                                           i1 = i1 + 1;
                                        }
                                     }
                                  }
                                  this.z = i;
                                  this.A = p0.readString();
                                  this.B = p0.readSerializable();
                                  this.C = p0.readSerializable();
                                  this.D = p0.readSerializable();
                                  this.E = p0.readSerializable();
                                  this.F = p0.readString();
                                  this.G = p0.readString();
                                  this.H = p0.readString();
                                  this.I = p0.readString();
                                  this.J = p0.readString();
                                  this.K = p0.readSerializable();
                                  this.L = p0.readSerializable();
                                  this.M.addAll(p0.readSerializable());
                                  this.N.putAll(p0.readSerializable());
                                  return;
                               }
                               i2 = 0;
                               goto label_0091 ;
                            }else {
                               i1 = i1 + 1;
                            }
                         }
                      }
                   }
                   oobject = null;
                   goto label_005a ;
                }else {
                   i1 = i1 + 1;
                }
             }
          }
       }
       i2 = 0;
       goto label_0027 ;
    }
    public final JSONObject a(){
       JSONObject jSONObject;
       yr0 ta;
       yr0 tJ = this.J;
       yr0 tI = this.I;
       yr0 tH = this.H;
       yr0 tG = this.G;
       yr0 tF = this.F;
       yr0 tA = this.A;
       yr0 tx = this.x;
       yr0 tw = this.w;
       yr0 tv = this.v;
       try{
          jSONObject = new JSONObject();
          if ((ta = this.a) != null) {
             jSONObject.put("$content_schema", en6.w(ta));
          label_0028 :
             if ((ta = this.b) != null) {
                jSONObject.put("$quantity", ta);
             }
             if ((ta = this.c) != null) {
                jSONObject.put("$price", ta);
             }
             if ((ta = this.t) != null) {
                jSONObject.put("$currency", ta.a);
             }
             if (!TextUtils.isEmpty(tv)) {
                jSONObject.put("$sku", tv);
             }
             if (!TextUtils.isEmpty(tw)) {
                jSONObject.put("$product_name", tw);
             }
             if (!TextUtils.isEmpty(tx)) {
                jSONObject.put("$product_brand", tx);
             }
             if ((tx = this.y) != null) {
                jSONObject.put("$product_category", kg4.d(tx));
             }
             if ((tx = this.z) != null) {
                jSONObject.put("$condition", en6.z(tx));
             }
             if (!TextUtils.isEmpty(tA)) {
                jSONObject.put("$product_variant", tA);
             }
             if ((tA = this.B) != null) {
                jSONObject.put("$rating", tA);
             }
             if ((tA = this.C) != null) {
                jSONObject.put("$rating_average", tA);
             }
             if ((tA = this.D) != null) {
                jSONObject.put("$rating_count", tA);
             }
             if ((tA = this.E) != null) {
                jSONObject.put("$rating_max", tA);
             }
             if (!TextUtils.isEmpty(tF)) {
                jSONObject.put("$address_street", tF);
             }
             if (!TextUtils.isEmpty(tG)) {
                jSONObject.put("$address_city", tG);
             }
             if (!TextUtils.isEmpty(tH)) {
                jSONObject.put("$address_region", tH);
             }
             if (!TextUtils.isEmpty(tI)) {
                jSONObject.put("$address_country", tI);
             }
             if (!TextUtils.isEmpty(tJ)) {
                jSONObject.put("$address_postal_code", tJ);
             }
             if ((tJ = this.K) != null) {
                jSONObject.put("$latitude", tJ);
             }
             if ((tJ = this.L) != null) {
                jSONObject.put("$longitude", tJ);
             }
             tJ = this.M;
             if (tJ.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("$image_captions", jSONArray);
                Iterator iterator = tJ.iterator();
                while (iterator.hasNext()) {
                   jSONArray.put(iterator.next());
                }
             }
             tJ = this.N;
             if (tJ.size() > 0) {
                Iterator iterator1 = tJ.keySet().iterator();
                while (iterator1.hasNext()) {
                   String str = iterator1.next();
                   jSONObject.put(str, tJ.get(str));
                }
             }
          }else {
             goto label_0028 ;
          }
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
       }
       return jSONObject;
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       yr0 ta;
       String str = "";
       String str1 = ((ta = this.a) != null)? en6.w(ta): str;
       p0.writeString(str1);
       p0.writeSerializable(this.b);
       p0.writeSerializable(this.c);
       str1 = ((ta = this.t) != null)? ta.name(): str;
       p0.writeString(str1);
       p0.writeString(this.v);
       p0.writeString(this.w);
       p0.writeString(this.x);
       str1 = ((ta = this.y) != null)? kg4.d(ta): str;
       p0.writeString(str1);
       if ((ta = this.z) != null) {
          str = en6.z(ta);
       }
       p0.writeString(str);
       p0.writeString(this.A);
       p0.writeSerializable(this.B);
       p0.writeSerializable(this.C);
       p0.writeSerializable(this.D);
       p0.writeSerializable(this.E);
       p0.writeString(this.F);
       p0.writeString(this.G);
       p0.writeString(this.H);
       p0.writeString(this.I);
       p0.writeString(this.J);
       p0.writeSerializable(this.K);
       p0.writeSerializable(this.L);
       p0.writeSerializable(this.M);
       p0.writeSerializable(this.N);
       return;
    }
}
