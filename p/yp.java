package p.yp;
import android.os.Parcelable;
import p.g44;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.eo5;
import p.bq;
import java.lang.ClassLoader;
import java.lang.Class;
import p.aq;
import java.lang.IllegalStateException;
import java.lang.CharSequence;
import java.util.List;
import p.av6;
import p.tu6;
import java.security.PublicKey;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import org.json.JSONObject;
import p.tp2;

public final class yp implements Parcelable	// class@002e06 from classes.dex
{
    public final String a;
    public final String b;
    public final bq c;
    public final aq t;
    public final String v;
    public static final Parcelable$Creator CREATOR;

    static {
       yp.CREATOR = new g44(21);
    }
    public void yp(Parcel p0){
       Parcelable parcelable;
       co5.o(p0, "parcel");
       super();
       String str = p0.readString();
       eo5.C(str, "token");
       this.a = str;
       str = p0.readString();
       eo5.C(str, "expectedNonce");
       this.b = str;
       if ((parcelable = p0.readParcelable(bq.class.getClassLoader())) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       this.c = parcelable;
       if ((parcelable = p0.readParcelable(aq.class.getClassLoader())) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       this.t = parcelable;
       String str1 = p0.readString();
       eo5.C(str1, "signature");
       this.v = str1;
       return;
    }
    public void yp(String p0,String p1){
       co5.o(p1, "expectedNonce");
       super();
       eo5.A(p0, "token");
       eo5.A(p1, "expectedNonce");
       String[] stringArray = new String[]{"."};
       int i = 0;
       List list = av6.B0(p0, stringArray, i, 6);
       int i1 = 1;
       int i2 = (list.size() == 3)? 1: 0;
       if (i2) {
          String str = list.get(i);
          String str1 = list.get(i1);
          String str2 = list.get(2);
          this.a = p0;
          this.b = p1;
          bq uobq = new bq(str);
          this.c = uobq;
          this.t = new aq(str1, p1);
          try{
             uobq = uobq.c;
             if ((uobq = tu6.w(uobq)) != null) {
                i = tu6.D(tu6.v(uobq), str+'.'+str1, str2);
             }
          }catch(java.security.spec.InvalidKeySpecException e0){
          }catch(java.io.IOException e0){
          }
          if (i) {
             this.v = e0;
             return;
          }else {
             throw new IllegalArgumentException("Invalid Signature".toString());
          }
       }else {
          throw new IllegalArgumentException("Invalid IdToken string".toString());
       }
    }
    public final JSONObject a(){
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("token_string", this.a);
       jSONObject.put("expected_nonce", this.b);
       yp tc = this.c;
       tc.getClass();
       JSONObject jSONObject1 = new JSONObject();
       jSONObject1.put("alg", tc.a);
       jSONObject1.put("typ", tc.b);
       jSONObject1.put("kid", tc.c);
       jSONObject.put("header", jSONObject1);
       jSONObject.put("claims", this.t.a());
       jSONObject.put("signature", this.v);
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
       if (!p0 instanceof yp) {
          return false;
       }
       if (!co5.c(this.a, p0.a) || (!co5.c(this.b, p0.b) || (!co5.c(this.c, p0.c) || (!co5.c(this.t, p0.t) || !co5.c(this.v, p0.v))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.v.hashCode() + ((this.t.hashCode() + ((this.c.hashCode() + tp2.g(this.b, tp2.g(this.a, 527, 31), 31)) * 31)) * 31));
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeParcelable(this.c, p1);
       p0.writeParcelable(this.t, p1);
       p0.writeString(this.v);
    }
}
