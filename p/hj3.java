package p.hj3;
import p.cr0;
import java.lang.String;
import java.util.regex.Pattern;
import android.content.Context;
import java.lang.Object;
import p.co5;
import p.av6;
import java.lang.CharSequence;
import java.util.regex.Matcher;

public final class hj3	// class@001862 from classes.dex
{
    public final String a;
    public final int b;
    public static final Pattern c;

    static {
       cr0 uocr0 = new cr0(0, 0);
       hj3.c = Pattern.compile("https?://\(www\\.\)?spotify\\.com.*");
    }
    public void hj3(Context p0,String p1){
       String str;
       Matcher matcher;
       co5.o(p0, "context");
       co5.o(p1, "url");
       super();
       boolean b = false;
       Pattern c = hj3.c;
       if (av6.D0(p1, "com.spotify.mobile.android.tos:spotify:internal:signup:tos", b)) {
          str = p0.getString(R.string.terms_and_conditions_url);
          co5.l(str, "context.getString\(R.stri…terms_and_conditions_url\)");
          matcher = c.matcher(p1);
          if (matcher.find()) {
             str = matcher.group();
             co5.l(str, "matcher.group\(\)");
          }
          this.a = str;
          co5.l(p0.getText(R.string.terms_and_conditions_title_terms_and_conditions), "context.getText\(R.string…tle_terms_and_conditions\)");
          this.b = 4;
       }else if(av6.D0(p1, "com.spotify.mobile.android.tos:spotify:internal:signup:policy", b)){
          str = p0.getString(R.string.terms_and_conditions_privacy_policy_url);
          co5.l(str, "context.getString\(R.stri…tions_privacy_policy_url\)");
          matcher = c.matcher(p1);
          if (matcher.find()) {
             str = matcher.group();
             co5.l(str, "matcher.group\(\)");
          }
          this.a = str;
          co5.l(p0.getText(R.string.terms_and_conditions_title_privacy_policy), "context.getText\(R.string…ons_title_privacy_policy\)");
          this.b = 1;
       }else if(av6.D0(p1, "com.spotify.mobile.android.tos:spotify:internal:signup:thirdparty", b)){
          p1 = p0.getString(R.string.agreement_third_party_provision);
          co5.l(p1, "context.getString\(R.stri…nt_third_party_provision\)");
          this.a = p1;
          co5.l(p0.getText(R.string.korean_agreement_third_party_title), "context.getText\(R.string…eement_third_party_title\)");
          this.b = 2;
       }else if(av6.D0(p1, "com.spotify.mobile.android.tos:spotify:internal:signup:personal", b)){
          p1 = p0.getString(R.string.agreement_collection_personal_information);
          co5.l(p1, "context.getString\(R.stri…ion_personal_information\)");
          this.a = p1;
          co5.l(p0.getText(R.string.korean_agreement_collection_personal_information_title), "context.getText\(R.string…rsonal_information_title\)");
          this.b = 3;
       }else {
          p1 = p0.getString(R.string.terms_and_conditions_url);
          co5.l(p1, "context.getString\(R.stri…terms_and_conditions_url\)");
          this.a = p1;
          co5.l(p0.getText(R.string.terms_and_conditions_title_terms_and_conditions), "context.getText\(R.string…tle_terms_and_conditions\)");
          this.b = 4;
       }
       return;
    }
}
