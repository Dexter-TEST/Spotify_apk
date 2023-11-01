package p.uy6;
import android.content.Context;
import java.lang.Object;
import p.c60;
import p.x45;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.ContentResolver;
import android.provider.Settings$Secure;
import p.ji5;
import java.util.UUID;
import java.lang.Class;

public final class uy6	// class@002948 from classes.dex
{
    public final String a;
    public final boolean b;

    public void uy6(Context p0){
       super();
       this.b = true;
       String str = "bnc_no_value";
       this.a = str;
       int i = true ^ TextUtils.isEmpty(c60.c().a.b);
       String str1 = (p0 != null && !i)? Settings$Secure.getString(p0.getContentResolver(), "android_id"): null;
       if (str1 == null) {
          str1 = ji5.g(p0).p("bnc_randomly_generated_uuid");
          if (TextUtils.isEmpty(str1) || str1.equals(str)) {
             str1 = UUID.randomUUID().toString();
             ji5.g(p0).w("bnc_randomly_generated_uuid", str1);
          }
          this.b = false;
       }
       this.a = str1;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null) {
          return false;
       }
       if (uy6.class != p0.getClass()) {
          return false;
       }
       if (!this.a.equals(p0.a) || this.b != p0.b) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       uy6 ta;
       int i = (this.b + 1) * 31;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       return (i + i1);
    }
}
