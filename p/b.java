package p.b;
import p.ks6;
import android.os.Parcelable;
import java.lang.String;
import com.spotify.login.signupapi.services.model.CallingCode;
import java.util.List;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public abstract class b implements ks6, Parcelable	// class@001082 from classes.dex
{
    public final String a;
    public final CallingCode b;
    public final List c;

    public void b(String p0,CallingCode p1,List p2){
       super();
       this.a = p0;
       this.b = p1;
       if (p2 == null) {
          throw new NullPointerException("Null callingCodes");
       }
       this.c = p2;
       return;
    }
    public final boolean a(){
       return false;
    }
    public final boolean b(){
       boolean b = (!this.c.isEmpty() && (this.b != null && !TextUtils.isEmpty(this.a)))? true: false;
       return b;
    }
    public final boolean equals(Object p0){
       b ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof b) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_001c :
             if ((ta = this.b) == null) {
                if (p0.b != null) {
                label_0038 :
                   b = false;
                label_0039 :
                   return b;
                }
             }else if(ta.equals(p0.b)){
             }
             if (this.c.equals(p0.c)) {
                goto label_0039 ;
             }else {
                goto label_0038 ;
             }
          }else {
             goto label_0038 ;
          }
       }else if(ta.equals(p0.a)){
          goto label_001c ;
       }else {
          goto label_0038 ;
       }
    }
    public final int hashCode(){
       b ta;
       b tb;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       i1 = (i1 ^ 0xf4243) * 0xf4243;
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       return (((i ^ i1) * 0xf4243) ^ this.c.hashCode());
    }
    public final String toString(){
       return "CallingCodePhoneNumberModel{phoneNumber="+this.a+", callingCode="+this.b+", callingCodes="+this.c+"}";
    }
}
