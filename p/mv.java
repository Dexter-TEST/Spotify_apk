package p.mv;
import p.nh6;
import p.t10;
import p.e;
import p.ws;
import p.hu;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import java.lang.String;
import p.c;
import java.lang.Object;
import java.lang.StringBuilder;

public final class mv extends nh6	// class@001f16 from classes.dex
{
    public final t10 a;
    public final e b;
    public final ws c;
    public final hu d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final ConfigurationResponse h;
    public final String i;
    public final c j;

    public void mv(t10 p0,e p1,ws p2,hu p3,int p4,boolean p5,boolean p6,ConfigurationResponse p7,String p8,c p9){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
    }
    public final boolean equals(Object p0){
       mv ti;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof nh6) {
          return false;
       }
       if (this.a.equals(p0.a) && (this.b.equals(p0.b) && (this.c.equals(p0.c) && (this.d.equals(p0.d) && (this.e == p0.e && (this.f == p0.f && (this.g == p0.g && this.h.equals(p0.h)))))))) {
          mv i = p0.i;
          if ((ti = this.i) == null) {
             if (i != null) {
             label_0070 :
                b = false;
             label_0071 :
                return b;
             }
          }else if(ti.equals(i)){
          }
          p0 = p0.j;
          if ((i = this.j) == null) {
             if (p0 == null) {
                goto label_0071 ;
             }else {
                goto label_0070 ;
             }
          }else if(i.equals(p0)){
             goto label_0071 ;
          }else {
             goto label_0070 ;
          }
       }else {
          goto label_0070 ;
       }
    }
    public final int hashCode(){
       mv ti;
       mv tj;
       int i = 0xf4243;
       int i1 = (((((((((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i) ^ this.c.hashCode()) * i) ^ this.d.hashCode()) * i) ^ this.e) * i;
       int i2 = 1237;
       int i3 = (this.f != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       if (this.g != null) {
          i2 = 1231;
       }
       i1 = (((i1 ^ i2) * i) ^ this.h.hashCode()) * i;
       i2 = 0;
       i3 = ((ti = this.i) == null)? 0: ti.hashCode();
       i1 = (i1 ^ i3) * i;
       if ((tj = this.j) != null) {
          i2 = tj.hashCode();
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return "SignupModel{birthday="+this.a+", gender="+this.b+", email="+this.c+", password="+this.d+", currentStepIndex="+this.e+", signingUp="+this.f+", acceptedLicenses="+this.g+", signupConfiguration="+this.h+", accessToken="+this.i+", facebookCredentials="+this.j+"}";
    }
}
