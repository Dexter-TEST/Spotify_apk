package p.sf6;
import p.a02;
import p.fv1;
import java.lang.Object;
import java.lang.Class;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptanceAdapter;
import com.spotify.login.signupapi.services.model.MarketingMessagesOptionAdapter;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptanceAdapter;

public final class sf6 implements a02	// class@00261c from classes.dex
{
    public final int a;
    public final fv1 b;

    public void sf6(fv1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object get(){
       sf6 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             return new MarketingMessagesOptionAdapter();
           case 1:
             tb.getClass();
             return new PrivacyPolicyAcceptanceAdapter();
           default:
             tb.getClass();
             return new TermsConditionAcceptanceAdapter();
       }
    }
}
