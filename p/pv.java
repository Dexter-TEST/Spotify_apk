package p.pv;
import java.lang.Object;
import p.c0;
import p.d;
import java.lang.Boolean;
import p.e;
import p.ht;
import java.lang.String;
import p.c;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import java.lang.IllegalStateException;
import p.kt;
import p.ei2;
import p.kg4;
import p.qv;
import p.r45;

public final class pv	// class@0022df from classes.dex
{
    public Serializable a;
    public Object b;
    public Object c;
    public Serializable d;
    public Serializable e;

    public void pv(int p0){
       if (p0 != 1) {
          if (p0 != 2) {
             super();
             c0 a = c0.a;
             this.a = a;
             this.b = a;
             this.c = a;
             this.d = a;
             this.e = a;
             return;
          }else {
             super();
             return;
          }
       }else {
          super();
          return;
       }
    }
    public void pv(d p0){
       super();
       this.a = Boolean.valueOf(p0.a);
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.t;
       this.e = Boolean.valueOf(p0.v);
    }
    public void pv(e p0){
       super();
       this.a = p0.a;
       this.b = Boolean.valueOf(p0.b);
       this.c = Boolean.valueOf(p0.c);
       this.d = Boolean.valueOf(p0.t);
       this.e = Boolean.valueOf(p0.v);
    }
    public final ht a(){
       String str = (this.a == null)? " facebookLoginRequested": "";
       if (this.e == null) {
          str = str.concat(" signedUp");
       }
       if (str.isEmpty()) {
          ht str1 = new ht(this.a.booleanValue(), this.b, this.c, this.d, this.e.booleanValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final kt b(){
       String str = (this.a == null)? " gender": "";
       if (this.b == null) {
          str = str.concat(" allGendersEnabled");
       }
       if (this.c == null) {
          str = kg4.l(str, " otherGenderEnabled");
       }
       if (this.d == null) {
          str = kg4.l(str, " preferNotToSayGenderEnabled");
       }
       if (this.e == null) {
          str = kg4.l(str, " fetchingConfigurationInForeground");
       }
       if (str.isEmpty()) {
          kt str1 = new kt(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final qv c(){
       qv v6 = new qv(this.a, this.b, this.c, this.d, this.e);
       return v6;
    }
}
