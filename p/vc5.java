package p.vc5;
import p.yf2;
import java.lang.Object;
import p.li5;
import p.uj5;
import java.lang.String;
import p.te5;
import p.qj5;
import p.ox7;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Observable;
import p.ws3;
import p.wj5;
import java.util.concurrent.TimeUnit;
import com.spotify.messaging.inappmessagingsdk.networking.a;
import p.bx5;
import java.lang.Class;
import p.cr0;
import p.fx5;
import com.spotify.messaging.inappmessagingsdk.proto.Triggers$TriggerResponseV1;
import java.util.ArrayList;
import p.bc3;
import java.util.Iterator;
import java.util.List;
import com.spotify.messaging.inappmessagingsdk.proto.Triggers$TriggerV1;
import p.w87;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import java.util.Locale;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;
import java.util.Collections;
import com.spotify.liteui.login.LoginActivity;
import p.f;
import p.ja3;
import java.lang.Runnable;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.vg1;
import java.lang.Throwable;
import p.ws1;
import p.do5;
import p.ah1;
import p.xg1;
import p.gh1;
import p.hh1;
import p.dh1;
import p.wg1;
import p.e61;
import p.aq6;
import java.lang.Enum;
import p.d61;
import p.b90;
import p.d90;
import p.sd5;
import p.ga4;
import p.yh1;
import io.reactivex.rxjava3.core.Flowable;
import p.l94;
import p.x33;
import p.cv2;
import p.vk7;
import p.tk7;
import p.zh0;
import p.f43;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.bo1;
import p.so3;
import com.spotify.litesignup.phonesignup.view.OneTimePassView;
import java.lang.CharSequence;
import com.spotify.litesignup.phonesignup.view.OtpInputView;
import p.r45;
import p.ub5;
import p.sa5;
import p.xc5;
import p.yc5;
import p.qg2;
import io.reactivex.rxjava3.core.ObservableSource;
import p.qf6;
import p.tb5;
import p.tf6;
import p.co5;
import com.spotify.login.signupapi.services.model.SignupRequest;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupRequestBody;
import p.rh6;
import p.uf;
import io.reactivex.rxjava3.core.SingleTransformer;
import p.ab0;
import p.hd5;
import p.za5;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import p.pd5;
import p.up0;
import p.w24;
import p.nt6;
import android.content.Context;
import p.k34;
import io.reactivex.rxjava3.core.MaybeSource;
import p.ks3;
import p.x34;
import p.mb;
import p.lb;
import java.util.Objects;
import p.c34;
import p.bi5;
import p.j83;
import java.lang.Boolean;
import p.co3;
import p.tn6;
import p.ko1;

public final class vc5 implements yf2	// class@0029c7 from classes.dex
{
    public final int a;
    public final Object b;

    public void vc5(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object apply(Object p0){
       Observable observable;
       d61 uod61;
       List list;
       vc5 ovc5 = this;
       int i = 9;
       int i1 = 8;
       int i2 = 7;
       int i3 = 10;
       int i4 = 2;
       int i5 = 13;
       int i6 = 1;
       int i7 = 0;
       vc5 b = ovc5.b;
       switch (ovc5.a){
           case 0:
             b.getClass();
             mb g = co5.g;
             lb f = co5.f;
             x34 v1 = new x34(new k34(new w24(i7, new up0(i5, b)), new nt6(b, i4), i7), g, g, new ks3(i6, "Error retrieving SMS automatically"), f, f, f);
             ir2 k = co5.k;
             Objects.requireNonNull(k, "predicate is null");
             return new c34(v1, k, i6);
           case 1:
             tb5 h = p0.H;
             b.getClass();
             co5.o(h, "request");
             tf6 c = b.c;
             co5.o(c, "key");
             SignupRequest signupReques = h.withKey(c);
             if ((c = b.b) != null && c.length()) {
                i6 = 0;
             }
             if (!i6) {
                signupReques = signupReques.withCreationPoint(c);
             }
             co5.j(signupReques, "null cannot be cast to non-null type com.spotify.login.signupapi.services.model.IdentifierTokenSignupRequestBody");
             return b.a.c(signupReques).compose(new uf()).map(new ab0(i5)).map(new ab0(14));
             break;
           case 2:
             return p0.a(new xc5(i2), new yc5(b), new xc5(i1), new xc5(i), new xc5(i3));
           case 3:
             return r45.a(b.a.getOtp());
           case 4:
             return b.y.a(p0);
           case 5:
             x33 t = b.t;
             t.getClass();
             return d90.a(new zh0(t, i2, b.b().a)).compose(t.v);
           case 6:
             return b.a(p0.F).x().map(new l94(i4));
           case 7:
             wg1 owg1 = p0;
             wg1 f1 = owg1.F;
             b.getClass();
             if ((i5 = f1.b.ordinal()) != i6) {
                if (i5 != 3) {
                   if (i5 != 5) {
                      if (i5 != i && i5 != i3) {
                         observable = Observable.empty();
                      label_0187 :
                         return observable.distinctUntilChanged().map(new sd5(24)).onErrorReturn(new vc5(i1, owg1));
                      }else {
                         uod61 = new d61(b, f1, i4);
                      }
                   }else {
                      uod61 = new d61(b, f1, 3);
                   }
                }else {
                   uod61 = new d61(b, f1, i7);
                }
             }else {
                uod61 = new d61(b, f1, i6);
             }
             observable = d90.a(uod61);
             goto label_0187 ;
             break;
           case 8:
             return new ws1(b, p0);
           case 9:
             return new ws1(b, p0);
           case 10:
             return new ws1(b, p0);
           case 11:
             return new ws1(b, p0);
           case 12:
             return new ws1(b, p0);
           case 13:
             return new ws1(b, p0);
           case 14:
             return new ws1(b, p0);
           case 15:
             b.getClass();
             return Completable.j(new ja3(b, i5, p0));
           case 16:
             bx5 uobx5 = p0;
             b.getClass();
             if (uobx5.a() && (uobx5 = uobx5.b) != null) {
                Triggers$TriggerResponseV1 triggerRespo = Triggers$TriggerResponseV1.h(uobx5.b());
                b.b.getClass();
                list = new ArrayList(triggerRespo.f());
                Iterator iterator = triggerRespo.g().iterator();
                while (iterator.hasNext()) {
                   Triggers$TriggerV1 triggerV1 = iterator.next();
                   String str = triggerV1.g();
                   list.add(new w87(str, TriggerType.valueOf(triggerV1.h()), FormatType.valueOf(triggerV1.f().toUpperCase(Locale.US))));
                }
             }else {
                list = Collections.emptyList();
             }
             return list;
             break;
           case 17:
             uj5 ouj5 = p0;
             uj5 f2 = ouj5.F;
             uj5 g1 = ouj5.G;
             if (te5.a(g1)) {
                g1 = "spotify:home";
             }
             uj5 h1 = ouj5.H;
             li5 oli5 = b.b;
             String str1 = (ouj5.I != null)? "quicksilverdev": "quicksilver";
             return oli5.a(g1, "application/protobuf", str1, ox7.j(), f2.toString(), g1, h1, true).toObservable().flatMap(new ws3(b, f2, g1, i3)).map(new wj5(ouj5, i7)).timeout(15, TimeUnit.SECONDS).onErrorReturn(new wj5(ouj5, i6));
             break;
           default:
             j83 g2 = b.g;
             return g2.d.r(g2.i);
       }
    }
}
