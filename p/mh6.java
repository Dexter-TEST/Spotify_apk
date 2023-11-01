package p.mh6;
import p.nh6;
import p.xt;
import p.ys5;
import p.e73;
import com.google.common.collect.c;
import p.d1;
import java.lang.Object;
import p.ks6;
import p.mv;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import p.gg6;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.co5;
import p.tr7;
import java.lang.Boolean;
import p.oy6;
import p.ws;
import p.hu;
import p.a;
import p.e;
import java.lang.String;
import java.util.Calendar;
import p.ei2;
import com.spotify.login.signupapi.services.model.UserData;
import java.lang.Enum;
import com.spotify.login.signupapi.services.model.EmailSignupRequestBody$Gender;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.spotify.login.signupapi.services.model.TermsData;
import com.spotify.login.signupapi.services.model.FacebookSignupRequest;
import p.c;
import com.spotify.login.signupapi.services.model.AppData;
import com.spotify.login.signupapi.services.model.ReferralData;
import p.ig6;
import com.spotify.login.signupapi.services.model.EmailSignupRequestBody;
import p.hg6;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.lang.Integer;

public abstract class mh6	// class@001e99 from classes.dex
{

    public static xt a(nh6 p0){
       mv e;
       ws a;
       hu a1;
       a a2;
       e a3;
       EmailSignupRequestBody$Gender pREFER_NOT_T;
       ig6 oig6;
       tr7 obj = p0;
       int i = 0;
       e73 uoe73 = p0.b().q(i);
       FacebookSignupRequest int i1 = 1;
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
          mv omv = obj;
          i2 = ((e = omv.e) == (p0.b().t - i1))? 1: 0;
          if (i2) {
             if (omv.g == null) {
                mv h = omv.h;
                if (!h.getCanImplicitlyAcceptTermsAndCondition()) {
                   Object[] objArray1 = new Object[i1];
                   objArray1[i] = new gg6(h);
                   return new xt(obj, co5.B(vv7.p(objArray1)));
                }
             }
             obj = new tr7(omv);
             obj.w = Boolean.TRUE;
             mv omv1 = obj.a();
             Object[] objArray = new Object[i1];
             oy6 ooy6 = new oy6(14);
             if ((a = omv.c.a) != null) {
                ooy6.b = a;
                if ((a1 = omv.d.a) != null) {
                   ooy6.c = a1;
                   if ((a2 = omv.a.a) != null) {
                      ooy6.t = a2;
                      if ((a3 = omv.b.a) != null) {
                         ooy6.v = a3;
                         String str = "";
                         if (str.isEmpty()) {
                            oy6 b = ooy6.b;
                            oy6 ooy61 = ooy6.c;
                            oy6 t = ooy6.t;
                            ooy6 = ooy6.v;
                            int i3 = ooy6.ordinal();
                            int i4 = 5;
                            int i5 = 2;
                            if (i3 != i1) {
                               if (i3 != i5) {
                                  if (i3 != 3) {
                                     if (i3 != 4) {
                                        if (i3 == i4) {
                                           pREFER_NOT_T = EmailSignupRequestBody$Gender.PREFER_NOT_TO_SAY;
                                        }else {
                                           throw new IllegalArgumentException("Unrecognized gender model: "+ooy6);
                                        }
                                     }else {
                                        pREFER_NOT_T = EmailSignupRequestBody$Gender.OTHER;
                                     }
                                  }else {
                                     pREFER_NOT_T = EmailSignupRequestBody$Gender.NEUTRAL;
                                  }
                               }else {
                                  pREFER_NOT_T = EmailSignupRequestBody$Gender.FEMALE;
                               }
                            }else {
                               pREFER_NOT_T = EmailSignupRequestBody$Gender.MALE;
                            }
                            UserData v17 = new UserData(pREFER_NOT_T, t.get(i4), (t.get(i5) + 1), t.get(i1), null);
                            TermsData v12 = new TermsData(true, null, null, null, null);
                            if ((omv = omv.j) != null) {
                               i1 = new FacebookSignupRequest(omv.b, omv.a, b, v17, v12, null, null);
                               oig6 = new ig6(i1);
                            }else {
                               EmailSignupRequestBody omv2 = new EmailSignupRequestBody(b, ooy61, ooy61, v17, v12, null, null);
                               oig6 = new hg6(omv);
                            }
                            objArray[i] = oig6;
                            return new xt(omv1, co5.B(vv7.p(objArray)));
                         }else {
                            throw new IllegalStateException("Missing required properties:".concat(str));
                         }
                      }else {
                         throw new NullPointerException("Null gender");
                      }
                   }else {
                      throw new NullPointerException("Null dateOfBirth");
                   }
                }else {
                   throw new NullPointerException("Null password");
                }
             }else {
                throw new NullPointerException("Null email");
             }
          }else {
             obj = new tr7(omv);
             obj.v = Integer.valueOf((e + i1));
             return xt.d(obj.a());
          }
       }
    }
}
