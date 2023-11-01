package p.jh6;
import p.yf2;
import java.lang.Object;
import com.spotify.storage.esperanto.proto.EsStorage$Stats;
import java.util.Base64$Encoder;
import p.p3;
import java.lang.String;
import java.lang.RuntimeException;
import p.tp2;
import java.lang.Throwable;
import com.google.protobuf.Empty;
import p.py1;
import p.cz1;
import p.dz1;
import p.c;
import p.ez1;
import java.lang.Boolean;
import p.fz1;
import io.reactivex.rxjava3.core.Observable;
import p.op;
import p.rt3;
import p.gz1;
import p.xp;
import p.hz1;
import p.xm2;
import org.json.JSONObject;
import p.te5;
import p.fh5;
import p.jj5;
import p.gt;
import p.r45;
import java.lang.Class;
import java.io.IOException;
import p.sg6;
import p.kg6;
import p.wg6;
import com.spotify.login.signupapi.services.model.FacebookSignupResponse;
import com.spotify.login.signupapi.services.model.FacebookSignupResponse$Status;
import p.qj2;
import p.zf2;
import p.zg6;
import p.og6;
import com.spotify.login.signupapi.services.model.EmailSignupResponse;
import com.spotify.login.signupapi.services.model.EmailSignupResponse$Status;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import p.m10;
import p.mg6;
import p.p10;
import p.vg6;
import p.qg6;
import p.ji1;
import p.ng6;

public final class jh6 implements yf2	// class@001ada from classes.dex
{
    public final int a;

    public void jh6(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       xm2 b;
       jj5 ojj5;
       gt ogt;
       switch (this.a){
           case 0:
             return new ng6(p0);
           case 1:
             return new qg6(p0.a);
           case 2:
             return Observable.just(new mg6(new m10(p0.getMinimumAge())), new vg6(p0));
           case 3:
             return p0.getStatus().map(new qj2(9), new qj2(10), new qj2(11));
           case 4:
             return new og6(p0.a);
           case 5:
             return p0.getStatus().map(new qj2(7), new qj2(8));
           case 6:
             p0 = (p0 instanceof IOException)? new sg6(): new wg6(kg6.b, null);
             return p0;
             break;
           case 7:
             if ((b = p0.b) != null && !te5.a(b.optString("id"))) {
                p0 = new fh5();
                ojj5 = new jj5(b);
                p0.c = ojj5;
                ogt = new gt(p0.b, ojj5);
             }else {
                fh5 b1 = new fh5();
                p0 = p0.c;
                p0.getClass();
                ojj5 = new jj5(p0);
                b1.b = ojj5;
                ogt = new gt(ojj5, b1.c);
             }
             return ogt;
             break;
           case 8:
             return new hz1(p0.a);
           case 9:
             boolean b2 = (p0 instanceof op && p0.a == rt3.x)? true: false;
             return new gz1(b2);
             break;
           case 10:
             return Observable.just(Boolean.FALSE);
           case 11:
             return new fz1();
           case 12:
             return new ez1(p0);
           case 13:
             p0 = (p0 instanceof py1)? new cz1(): new dz1();
             return p0;
             break;
           case 14:
             try{
                return Empty.g(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 15:
             try{
                return EsStorage$Stats.g(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.storage.esperanto.proto.EsStorage.Stats: \'", p3.n(p3.o(), p0), v2), e0);
             }
             break;
           default:
             try{
                return Empty.g(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
       }
    }
}
