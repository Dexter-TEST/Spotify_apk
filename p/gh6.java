package p.gh6;
import p.yf2;
import p.qf6;
import java.lang.Object;
import p.hg6;
import p.tf6;
import java.lang.Class;
import java.lang.String;
import p.co5;
import com.spotify.login.signupapi.services.model.SignupRequest;
import com.spotify.login.signupapi.services.model.EmailSignupRequestBody;
import io.reactivex.rxjava3.core.Single;
import p.rh6;
import io.reactivex.rxjava3.core.Observable;
import p.ns4;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.v05;
import p.ir0;
import p.jh6;
import p.jg6;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import com.spotify.login.signupapi.services.model.ConfigurationResponse$Companion;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ig6;
import com.spotify.login.signupapi.services.model.FacebookSignupRequest;

public final class gh6 implements yf2	// class@00170d from classes.dex
{
    public final int a;
    public final qf6 b;

    public void gh6(qf6 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       tf6 c;
       int i = 6;
       int i1 = 1;
       String str = "key";
       gh6 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             p0 = p0.A;
             tb.getClass();
             co5.o(p0, "request");
             c = tb.c;
             co5.o(c, str);
             p0 = p0.withKey(c);
             if ((c = tb.b) != null && c.length()) {
                i1 = 0;
             }
             if (!i1) {
                p0 = p0.withCreationPoint(c);
             }
             co5.j(p0, "null cannot be cast to non-null type com.spotify.login.signupapi.services.model.EmailSignupRequestBody");
             return tb.a.b(p0).toObservable().compose(new ns4(0)).doOnNext(new v05(23)).map(new jh6(3)).onErrorReturn(new jh6(i));
             break;
           default:
             p0 = p0.A;
             tb.getClass();
             co5.o(p0, "request");
             c = tb.c;
             co5.o(c, str);
             p0 = p0.withKey(c);
             if ((c = tb.b) != null && c.length()) {
                i1 = 0;
             }
             if (!i1) {
                p0 = p0.withCreationPoint(c);
             }
             co5.j(p0, "null cannot be cast to non-null type com.spotify.login.signupapi.services.model.FacebookSignupRequest");
             return tb.a.a(p0).toObservable().doOnNext(new v05(24)).compose(new ns4(0)).map(new jh6(5)).onErrorReturn(new jh6(i));
       }
       return tb.a.e(tb.c).toObservable().startWithItem(ConfigurationResponse.Companion.getDefault()).compose(new ns4(0)).doOnNext(new v05(22)).flatMap(new jh6(2)).onErrorResumeWith(Observable.empty());
    }
}
