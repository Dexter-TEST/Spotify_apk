package p.i60;
import android.os.Parcelable;
import p.v74;
import android.os.Parcel;
import java.lang.Object;
import p.yr0;
import java.util.ArrayList;
import java.lang.System;
import java.lang.String;
import p.en6;
import java.io.Serializable;
import java.util.Collection;
import java.lang.ClassLoader;
import java.lang.Class;
import org.json.JSONObject;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONArray;

public final class i60 implements Parcelable	// class@00192f from classes.dex
{
    public final int A;
    public final long B;
    public final String a;
    public final String b;
    public final String c;
    public final String t;
    public final String v;
    public final yr0 w;
    public final int x;
    public final ArrayList y;
    public final long z;
    public static final Parcelable$Creator CREATOR;

    static {
       i60.CREATOR = new v74(11);
    }
    public void i60(Parcel p0){
       ArrayList uArrayList1;
       super();
       this.w = new yr0();
       ArrayList uArrayList = new ArrayList();
       this.y = uArrayList;
       this.a = "";
       this.b = "";
       this.c = "";
       this.t = "";
       this.x = 1;
       this.A = 1;
       this.z = 0;
       this.B = System.currentTimeMillis();
       this.B = p0.readLong();
       this.a = p0.readString();
       this.b = p0.readString();
       this.c = p0.readString();
       this.t = p0.readString();
       this.v = p0.readString();
       this.z = p0.readLong();
       this.x = en6.H(2)[p0.readInt()];
       if ((uArrayList1 = p0.readSerializable()) != null) {
          uArrayList.addAll(uArrayList1);
       }
       this.w = p0.readParcelable(yr0.class.getClassLoader());
       this.A = en6.H(2)[p0.readInt()];
       return;
    }
    public final JSONObject a(){
       i60 tv = this.v;
       i60 tt = this.t;
       i60 tb = this.b;
       i60 ta = this.a;
       i60 tc = this.c;
       try{
          JSONObject jSONObject = new JSONObject();
          JSONObject jSONObject1 = this.w.a();
          Iterator iterator = jSONObject1.keys();
          while (iterator.hasNext()) {
             String str = iterator.next();
             jSONObject.put(str, jSONObject1.get(str));
          }
          if (!TextUtils.isEmpty(tc)) {
             jSONObject.put("$og_title", tc);
          }
          if (!TextUtils.isEmpty(ta)) {
             jSONObject.put("$canonical_identifier", ta);
          }
          if (!TextUtils.isEmpty(tb)) {
             jSONObject.put("$canonical_url", tb);
          }
          tb = this.y;
          if (tb.size() > 0) {
             JSONArray jSONArray = new JSONArray();
             Iterator iterator1 = tb.iterator();
             while (iterator1.hasNext()) {
                jSONArray.put(iterator1.next());
             }
             jSONObject.put("$keywords", jSONArray);
          }
          if (!TextUtils.isEmpty(tt)) {
             jSONObject.put("$og_description", tt);
          }
          if (!TextUtils.isEmpty(tv)) {
             jSONObject.put("$og_image_url", tv);
          }
          tv = this.z;
          if ((tv) > 0) {
             jSONObject.put("$exp_date", tv);
          }
          String str1 = "$publicly_indexable";
          boolean b = false;
          boolean b1 = (this.x == 1)? true: false;
          jSONObject.put(str1, b1);
          str1 = "$locally_indexable";
          if (this.A == 1) {
             b = true;
          }
          jSONObject.put(str1, b);
          jSONObject.put("$creation_timestamp", this.B);
          return jSONObject;
       }catch(org.json.JSONException e0){
       }
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeLong(this.B);
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeString(this.t);
       p0.writeString(this.v);
       p0.writeLong(this.z);
       p0.writeInt(en6.A(this.x));
       p0.writeSerializable(this.y);
       p0.writeParcelable(this.w, p1);
       p0.writeInt(en6.A(this.A));
    }
}
