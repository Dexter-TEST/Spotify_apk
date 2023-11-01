package p.a3;
import android.os.Parcelable;
import java.util.Date;
import p.j3;
import p.g44;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import java.util.Collections;
import p.eo5;
import java.lang.Enum;
import org.json.JSONObject;
import org.json.JSONArray;
import p.tp2;
import java.lang.StringBuilder;
import p.sz1;
import p.ns3;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;

public final class a3 implements Parcelable	// class@000f0a from classes.dex
{
    public final Date A;
    public final String B;
    public final Date a;
    public final Set b;
    public final Set c;
    public final Set t;
    public final String v;
    public final j3 w;
    public final Date x;
    public final String y;
    public final String z;
    public static final Date C;
    public static final Parcelable$Creator CREATOR;
    public static final Date D;
    public static final j3 E;

    static {
       a3.C = new Date(Long.MAX_VALUE);
       a3.D = new Date();
       a3.E = j3.b;
       a3.CREATOR = new g44(20);
    }
    public void a3(Parcel p0){
       co5.o(p0, "parcel");
       super();
       this.a = new Date(p0.readLong());
       ArrayList uArrayList = new ArrayList();
       p0.readStringList(uArrayList);
       Set set = Collections.unmodifiableSet(new HashSet(uArrayList));
       co5.l(set, "unmodifiableSet\(HashSet\(permissionsList\)\)");
       this.b = set;
       uArrayList.clear();
       p0.readStringList(uArrayList);
       set = Collections.unmodifiableSet(new HashSet(uArrayList));
       co5.l(set, "unmodifiableSet\(HashSet\(permissionsList\)\)");
       this.c = set;
       uArrayList.clear();
       p0.readStringList(uArrayList);
       Set set1 = Collections.unmodifiableSet(new HashSet(uArrayList));
       co5.l(set1, "unmodifiableSet\(HashSet\(permissionsList\)\)");
       this.t = set1;
       String str = p0.readString();
       eo5.C(str, "token");
       this.v = str;
       j3 oj3 = ((str = p0.readString()) != null)? j3.valueOf(str): a3.E;
       this.w = oj3;
       this.x = new Date(p0.readLong());
       str = p0.readString();
       eo5.C(str, "applicationId");
       this.y = str;
       str = p0.readString();
       eo5.C(str, "userId");
       this.z = str;
       this.A = new Date(p0.readLong());
       this.B = p0.readString();
       return;
    }
    public void a3(String p0,String p1,String p2,Collection p3,Collection p4,Collection p5,j3 p6,Date p7,Date p8,Date p9){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, "facebook");
    }
    public void a3(String p0,String p1,String p2,Collection p3,Collection p4,Collection p5,j3 p6,Date p7,Date p8,Date p9,String p10){
       int i;
       co5.o(p0, "accessToken");
       co5.o(p1, "applicationId");
       co5.o(p2, "userId");
       super();
       eo5.A(p0, "accessToken");
       eo5.A(p1, "applicationId");
       eo5.A(p2, "userId");
       Date c = a3.C;
       if (p7 == null) {
          p7 = c;
       }
       this.a = p7;
       HashSet hashSet = (p3 != null)? new HashSet(p3): new HashSet();
       Set set = Collections.unmodifiableSet(hashSet);
       co5.l(set, "unmodifiableSet\(if \(permissions != null\) HashSet\(permissions\) else HashSet\(\)\)");
       this.b = set;
       HashSet hashSet1 = (p4 != null)? new HashSet(p4): new HashSet();
       set = Collections.unmodifiableSet(hashSet1);
       co5.l(set, "unmodifiableSet\(\n            if \(declinedPermissions != null\) HashSet\(declinedPermissions\) else HashSet\(\)\)");
       this.c = set;
       hashSet1 = (p5 != null)? new HashSet(p5): new HashSet();
       set = Collections.unmodifiableSet(hashSet1);
       co5.l(set, "unmodifiableSet\(\n            if \(expiredPermissions != null\) HashSet\(expiredPermissions\) else HashSet\(\)\)");
       this.t = set;
       this.v = p0;
       if (p6 == null) {
          p6 = a3.E;
       }
       if (p10 != null && p10.equals("instagram")) {
          if ((i = p6.ordinal()) != 1) {
             if (i != 4) {
                if (i == 5) {
                   p6 = j3.y;
                }
             }else {
                p6 = j3.z;
             }
          }else {
             p6 = j3.x;
          }
       }
       this.w = p6;
       if (p8 == null) {
          p8 = a3.D;
       }
       this.x = p8;
       this.y = p1;
       this.z = p2;
       if (p9 == null || !(p9.getTime())) {
          p9 = c;
       }
       this.A = p9;
       if (p10 == null) {
          p10 = "facebook";
       }
       this.B = p10;
       return;
    }
    public final JSONObject a(){
       a3 tB;
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("version", 1);
       jSONObject.put("token", this.v);
       jSONObject.put("expires_at", this.a.getTime());
       jSONObject.put("permissions", new JSONArray(this.b));
       jSONObject.put("declined_permissions", new JSONArray(this.c));
       jSONObject.put("expired_permissions", new JSONArray(this.t));
       jSONObject.put("last_refresh", this.x.getTime());
       jSONObject.put("source", this.w.name());
       jSONObject.put("application_id", this.y);
       jSONObject.put("user_id", this.z);
       jSONObject.put("data_access_expiration_time", this.A.getTime());
       if ((tB = this.B) != null) {
          jSONObject.put("graph_domain", tB);
       }
       return jSONObject;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       int i;
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof a3) {
          return false;
       }
       if (co5.c(this.a, p0.a) && (co5.c(this.b, p0.b) && (co5.c(this.c, p0.c) && (co5.c(this.t, p0.t) && (co5.c(this.v, p0.v) && (this.w == p0.w && (co5.c(this.x, p0.x) && (co5.c(this.y, p0.y) && (co5.c(this.z, p0.z) && co5.c(this.A, p0.A)))))))))) {
          a3 tB = this.B;
          p0 = p0.B;
          if (tB == null) {
             i = (p0 == null)? 1: 0;
          }else {
             i = co5.c(tB, p0);
          }
          if (i) {
          label_0080 :
             return b;
          }
       }
       b = false;
       goto label_0080 ;
    }
    public final int hashCode(){
       a3 tB;
       int i = (this.A.hashCode() + tp2.g(this.z, tp2.g(this.y, ((this.x.hashCode() + ((this.w.hashCode() + tp2.g(this.v, ((this.t.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31), 31)) * 31)) * 31), 31), 31)) * 31;
       int i1 = ((tB = this.B) == null)? 0: tB.hashCode();
       return (i + i1);
    }
    public final String toString(){
       sz1.i(ns3.b);
       String str = "{AccessToken token:ACCESS_TOKEN_REMOVED permissions:["+TextUtils.join(", ", this.b)+"]}";
       co5.l(str, "builder.toString\(\)");
       return str;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       p0.writeLong(this.a.getTime());
       p0.writeStringList(new ArrayList(this.b));
       p0.writeStringList(new ArrayList(this.c));
       p0.writeStringList(new ArrayList(this.t));
       p0.writeString(this.v);
       p0.writeString(this.w.name());
       p0.writeLong(this.x.getTime());
       p0.writeString(this.y);
       p0.writeString(this.z);
       p0.writeLong(this.A.getTime());
       p0.writeString(this.B);
    }
}
