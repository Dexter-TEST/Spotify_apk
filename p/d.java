package p.d;
import android.os.Parcelable;
import p.c;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public abstract class d implements Parcelable	// class@001308 from classes.dex
{
    public final boolean a;
    public final c b;
    public final ConfigurationResponse c;
    public final String t;
    public final boolean v;

    public void d(boolean p0,c p1,ConfigurationResponse p2,String p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final boolean equals(Object p0){
       d tb;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof d) {
          return false;
       }
       if (this.a == p0.a) {
          d b1 = p0.b;
          if ((tb = this.b) == null) {
             if (b1 != null) {
             label_0045 :
                b = false;
             label_0046 :
                return b;
             }
          }else if(tb.equals(b1)){
          }
          b1 = p0.c;
          if ((tb = this.c) == null) {
             if (b1 != null) {
             }
          }else if(tb.equals(b1)){
          }
          b1 = p0.t;
          if ((tb = this.t) == null) {
             if (b1 != null) {
             }
          }else if(tb.equals(b1)){
          }
          if (this.v == p0.v) {
             goto label_0046 ;
          }else {
             goto label_0045 ;
          }
       }else {
          goto label_0045 ;
       }
    }
    public final int hashCode(){
       d tb;
       int i = 1237;
       int i1 = (this.a != null)? 1231: 1237;
       int i2 = 0xf4243;
       i1 = (i1 ^ i2) * i2;
       int i3 = 0;
       int i4 = ((tb = this.b) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i4) * i2;
       i4 = ((tb = this.c) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i4) * i2;
       if ((tb = this.t) != null) {
          i3 = tb.hashCode();
       }
       i1 = (i1 ^ i3) * i2;
       if (this.v != null) {
          i = 1231;
       }
       return (i ^ i1);
    }
    public final String toString(){
       return en6.q("FacebookLoginModel{facebookLoginRequested="+this.a+", facebookCredentials="+this.b+", signupConfigurationResponse="+this.c+", spotifyToken="+this.t+", signedUp=", this.v, "}");
    }
}
