package p.md5;
import p.nd5;
import p.xt;
import p.i;
import java.lang.Object;
import p.jb5;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.ys5;
import p.e73;
import com.google.common.collect.c;
import p.d1;
import p.ks6;
import p.g;
import java.lang.String;
import p.na5;
import p.ad6;
import p.es;
import p.eu;
import p.nu;
import p.ub5;
import p.co5;
import p.a;
import p.e;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import p.mb5;
import com.spotify.login.signupapi.services.model.UserData;
import java.lang.Enum;
import com.spotify.login.signupapi.services.model.EmailSignupRequestBody$Gender;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.util.Calendar;
import java.lang.Boolean;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupRequestBody;
import p.ra5;
import com.spotify.login.signupapi.services.model.TermsData;
import com.spotify.login.signupapi.services.model.AppData;
import com.spotify.login.signupapi.services.model.ReferralData;
import p.tb5;
import p.jl;
import java.lang.Integer;
import p.u25;
import p.bb5;
import p.d35;
import p.a35;
import p.za5;
import p.b;
import com.spotify.login.signupapi.services.model.CallingCode;
import java.lang.Class;
import p.db5;
import p.v35;
import p.io2;

public abstract class md5	// class@001e74 from classes.dex
{

    public static xt a(nd5 p0){
       g c;
       g a;
       xt oxt;
       EmailSignupRequestBody$Gender nEUTRAL;
       Object[] objArray2;
       Object[] obj = p0;
       int i = 0;
       int i1 = 1;
       if (obj.C != null) {
          obj = new Object[i1];
          obj[i] = new jb5();
          return xt.a(vv7.p(obj));
       }else {
          e73 uoe73 = p0.b().q(i);
          int i2 = 1;
          while (uoe73.hasNext()) {
             ks6 oks6 = uoe73.next();
             i2 = (i2 && oks6.b())? 1: 0;
             if (oks6 == p0.a()) {
                break ;
             }
          }
          if (!i2) {
             return xt.e();
          }else {
             i oi = obj;
             if (p0.a() == oi.a) {
                return md5.b(p0);
             }else {
                i b = oi.b;
                if (p0.a() == b) {
                   if ((c = b.c) != null && ((a = b.a) != null && a.length() == c.d)) {
                      ad6 uoad6 = new ad6(oi);
                      es oi1 = new es(b);
                      oi1.e(i1);
                      uoad6.f(oi1.b());
                      Object[] objArray = new Object[i1];
                      objArray[i] = new ub5(c, a);
                      oxt = new xt(uoad6.a(), co5.B(vv7.p(objArray)));
                   }else {
                      oxt = xt.e();
                   }
                   return oxt;
                }else if(oi.x == (p0.b().t - i1)){
                   oxt = 1;
                }else {
                   objArray2 = 0;
                }
                if (oxt) {
                   a ad6 a1 = oi.c.a;
                   e a2 = oi.t.a;
                   g t = b.t;
                   if (a1 != null && (a2 != null && t != null)) {
                      if (oi.z == null) {
                         i v = oi.v;
                         if (!v.getCanImplicitlyAcceptTermsAndCondition()) {
                            objArray2 = new Object[i1];
                            objArray2[i] = new mb5(v);
                            return new xt(obj, co5.B(vv7.p(objArray2)));
                         }
                      }
                      int i3 = a2.ordinal();
                      int i4 = 2;
                      if (i3 != i1) {
                         if (i3 != i4) {
                            if (i3 == 3) {
                               nEUTRAL = EmailSignupRequestBody$Gender.NEUTRAL;
                            }else {
                               throw new RuntimeException("Unrecognized gender model: "+a2);
                            }
                         }else {
                            nEUTRAL = EmailSignupRequestBody$Gender.FEMALE;
                         }
                      }else {
                         nEUTRAL = EmailSignupRequestBody$Gender.MALE;
                      }
                      UserData TermsData obj1 = new UserData(nEUTRAL, a1.get(5), (a1.get(i4) + 1), a1.get(i1), null);
                      a1 = new ad6(oi);
                      a1.h = Boolean.TRUE;
                      Object[] objArray1 = new Object[i1];
                      obj1 = new TermsData(true, null, null, null, null);
                      IdentifierTokenSignupRequestBody v11 = new IdentifierTokenSignupRequestBody(t.a, obj, obj1, null, null, null);
                      objArray1[i] = new tb5(v11);
                      return new xt(a1.a(), co5.B(vv7.p(objArray1)));
                   }else {
                      jl.d("Invalid state for last step, \""+obj+'"');
                      return xt.e();
                   }
                }else {
                   ad6 obj2 = new ad6(oi);
                   obj2.g = Integer.valueOf((oi.x + i1));
                   return xt.d(obj2.a());
                }
             }
          }
       }
    }
    public static xt b(nd5 p0){
       i oi;
       i b;
       Object[] objArray;
       b a;
       int i = 0;
       int i1 = 1;
       if (md5.d(p0)) {
          oi = p0;
          b = oi.b;
          if (b.t != null) {
             return xt.d(md5.c(p0, oi.c));
          }else {
             objArray = new Object[]{new bb5(new u25()),new bb5(new a35()),new za5()};
             return new xt(md5.c(p0, b), co5.B(vv7.p(objArray)));
          }
       }else {
          oi = p0;
          b = oi.a;
          b b1 = b.b;
          String str = null;
          String str1 = (b1 == null)? str: b1.getCountryCode();
          if (b1 != null) {
             str = b1.getCallingCode();
          }
          if (str1 != null && (str != null && (a = b.a) != null)) {
             ad6 uoad6 = new ad6(oi);
             oi = oi.b;
             oi.getClass();
             es uoes = new es(oi);
             uoes.e(i1);
             uoad6.f(uoes.b());
             objArray = new Object[i1];
             objArray[i] = new db5(str1, str, a);
             return new xt(uoad6.a(), co5.B(vv7.p(objArray)));
          }else {
             jl.d("Invalid state for OTP input, \""+p0+'"');
             return xt.e();
          }
       }
    }
    public static nu c(nd5 p0,ks6 p1){
       Object obj = p0;
       obj.getClass();
       ad6 uoad6 = new ad6(obj);
       uoad6.g = Integer.valueOf(p0.b().indexOf(p1));
       return uoad6.a();
    }
    public static boolean d(nd5 p0){
       i a = p0.a;
       b b = a.b;
       boolean b1 = false;
       if (b == null) {
          return b1;
       }
       g b2 = p0.b.b;
       if (io2.j(b2.c, a.a) && io2.j(b2.b, b.getCallingCode())) {
          b1 = true;
       }
       return b1;
    }
}
