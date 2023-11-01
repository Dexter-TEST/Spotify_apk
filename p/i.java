package p.i;
import p.nd5;
import p.b;
import p.g;
import p.t10;
import p.e;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import java.lang.String;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public abstract class i extends nd5	// class@001951 from classes.dex
{
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final b a;
    public final g b;
    public final t10 c;
    public final e t;
    public final ConfigurationResponse v;
    public final String w;
    public final int x;
    public final boolean y;
    public final boolean z;

    public void i(b p0,g p1,t10 p2,e p3,ConfigurationResponse p4,String p5,int p6,boolean p7,boolean p8,boolean p9,boolean p10,boolean p11){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null callingCodePhoneNumber");
       }
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null oneTimePass");
       }
       this.b = p1;
       if (p2 == null) {
          throw new NullPointerException("Null birthday");
       }
       this.c = p2;
       if (p3 == null) {
          throw new NullPointerException("Null gender");
       }
       this.t = p3;
       if (p4 == null) {
          throw new NullPointerException("Null signupConfiguration");
       }
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = p7;
       this.z = p8;
       this.A = p9;
       this.B = p10;
       this.C = p11;
       return;
    }
    public final boolean equals(Object p0){
       i tw;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof nd5) {
          return false;
       }
       if (this.a.equals(p0.a) && (this.b.equals(p0.b) && (this.c.equals(p0.c) && (this.t.equals(p0.t) && this.v.equals(p0.v))))) {
          i w = p0.w;
          if ((tw = this.w) == null) {
             if (w != null) {
             label_0073 :
                b = false;
             label_0074 :
                return b;
             }
          }else if(tw.equals(w)){
          }
          if (this.x == p0.x && (this.y == p0.y && (this.z == p0.z && (this.A == p0.A && (this.B == p0.B && this.C == p0.C))))) {
             goto label_0074 ;
          }else {
             goto label_0073 ;
          }
       }else {
          goto label_0073 ;
       }
    }
    public final int hashCode(){
       i tw;
       int i = 0xf4243;
       int i1 = (((((((((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i) ^ this.c.hashCode()) * i) ^ this.t.hashCode()) * i) ^ this.v.hashCode()) * i;
       int i2 = ((tw = this.w) == null)? 0: tw.hashCode();
       i1 = (((i1 ^ i2) * i) ^ this.x) * i;
       int i3 = 1237;
       i2 = (this.y != null)? 1231: 1237;
       i1 = (i1 ^ i2) * i;
       i2 = (this.z != null)? 1231: 1237;
       i1 = (i1 ^ i2) * i;
       i2 = (this.A != null)? 1231: 1237;
       i1 = (i1 ^ i2) * i;
       i2 = (this.B != null)? 1231: 1237;
       i1 = (i1 ^ i2) * i;
       if (this.C != null) {
          i3 = 1231;
       }
       return (i1 ^ i3);
    }
    public final String toString(){
       return en6.q("PhoneNumberSignupModel{callingCodePhoneNumber="+this.a+", oneTimePass="+this.b+", birthday="+this.c+", gender="+this.t+", signupConfiguration="+this.v+", accessToken="+this.w+", currentStepIndex="+this.x+", signingUp="+this.y+", acceptedLicenses="+this.z+", hintRequested="+this.A+", loginFlow="+this.B+", isOffline=", this.C, "}");
    }
}
