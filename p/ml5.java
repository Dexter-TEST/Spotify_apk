package p.ml5;
import android.os.Parcelable;
import p.g44;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import p.eo5;
import org.json.JSONObject;
import p.co5;

public final class ml5 implements Parcelable	// class@001ebc from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String t;
    public final String v;
    public final Uri w;
    public final Uri x;
    public static final Parcelable$Creator CREATOR;

    static {
       ml5.CREATOR = new g44(26);
    }
    public void ml5(Parcel p0){
       String str1;
       super();
       this.a = p0.readString();
       this.b = p0.readString();
       this.c = p0.readString();
       this.t = p0.readString();
       this.v = p0.readString();
       String str = p0.readString();
       Uri uri = null;
       Uri uri1 = (str == null)? uri: Uri.parse(str);
       this.w = uri1;
       if ((str1 = p0.readString()) != null) {
          uri = Uri.parse(str1);
       }
       this.x = uri;
       return;
    }
    public void ml5(String p0,String p1,String p2,String p3,String p4,Uri p5,Uri p6){
       super();
       eo5.C(p0, "id");
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
    }
    public void ml5(JSONObject p0){
       String str2;
       Uri uri;
       super();
       String str = null;
       this.a = p0.optString("id", str);
       this.b = p0.optString("first_name", str);
       this.c = p0.optString("middle_name", str);
       this.t = p0.optString("last_name", str);
       this.v = p0.optString("name", str);
       String str1 = ((str1 = p0.optString("link_uri", str)) == null)? str: Uri.parse(str1);
       this.w = str1;
       if ((str2 = p0.optString("picture_uri", str)) != null) {
          str = Uri.parse(str2);
       }
       this.x = str;
       return;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       ml5 ta;
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof ml5) {
          return false;
       }
       if ((ta = this.a) != null || (p0.a != null && (!co5.c(ta, p0.a) || ((ta = this.b) != null || (p0.b != null && (!co5.c(ta, p0.b) || ((ta = this.c) != null || (p0.c != null && (!co5.c(ta, p0.c) || ((ta = this.t) != null || (p0.t != null && (!co5.c(ta, p0.t) || ((ta = this.v) != null || (p0.v != null && (!co5.c(ta, p0.v) || ((ta = this.w) != null || (p0.w != null && (!co5.c(ta, p0.w) || ((ta = this.x) != null || (p0.x != null && !co5.c(ta, p0.x))))))))))))))))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       ml5 ta;
       int i = ((ta = this.a) != null)? ta.hashCode(): 0;
       int i1 = 527 + i;
       if ((ta = this.b) != null) {
          i1 = (i1 * 31) + ta.hashCode();
       }
       if ((ta = this.c) != null) {
          i1 = (i1 * 31) + ta.hashCode();
       }
       if ((ta = this.t) != null) {
          i1 = (i1 * 31) + ta.hashCode();
       }
       if ((ta = this.v) != null) {
          i1 = (i1 * 31) + ta.hashCode();
       }
       if ((ta = this.w) != null) {
          i1 = (i1 * 31) + ta.hashCode();
       }
       if ((ta = this.x) != null) {
          i1 = (i1 * 31) + ta.hashCode();
       }
       return i1;
    }
    public final void writeToParcel(Parcel p0,int p1){
       ml5 tw;
       co5.o(p0, "dest");
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeString(this.t);
       p0.writeString(this.v);
       String str = null;
       String str1 = ((tw = this.w) == null)? str: tw.toString();
       p0.writeString(str1);
       if ((tw = this.x) != null) {
          str = tw.toString();
       }
       p0.writeString(str);
       return;
    }
}
