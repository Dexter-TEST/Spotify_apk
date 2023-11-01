package p.ha5;
import p.b5;
import java.lang.Object;
import p.qy1;
import p.tm5;
import p.lu3;
import p.a3;
import p.az5;
import java.lang.Class;
import p.i3;
import p.yp;
import p.ml5;
import p.vl5;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import java.util.List;
import java.util.Arrays;
import p.co5;
import java.util.Iterator;
import java.util.Collection;
import p.dt3;
import p.ny1;
import p.tp2;
import p.it3;
import p.nh0;
import p.vv7;
import p.et3;
import java.util.Set;
import p.dj0;
import p.sz1;
import java.util.UUID;
import p.bv3;
import p.ku3;
import com.spotify.signup.signup.facebook.FacebookLoginActivity;
import p.i70;
import android.app.Activity;
import p.hu3;
import android.os.Bundle;
import org.json.JSONObject;
import p.ct3;
import p.eo5;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import p.o61;
import android.os.BaseBundle;
import p.dc3;
import p.ja0;
import p.ju3;
import java.lang.Integer;
import java.util.HashMap;
import android.content.Intent;
import android.content.Context;
import com.facebook.FacebookActivity;
import android.os.Parcelable;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import p.ft3;
import java.util.Map;
import p.q97;
import p.rb4;
import p.mp;
import p.vp;
import p.xs3;
import p.bt3;
import p.km3;
import p.ti3;
import p.g15;
import p.a90;
import p.dc1;
import java.util.LinkedHashMap;
import p.vb1;
import java.lang.NullPointerException;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import p.rz;
import p.bb0;
import p.u76;
import androidx.appcompat.widget.SearchView;
import p.iu5;
import android.view.View;
import android.widget.EditText;
import p.xe7;
import p.t7;
import java.lang.Boolean;
import p.t00;
import p.sm;
import p.su3;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.xj0;
import p.gv0;
import p.ne5;
import p.wn6;
import p.tn6;
import p.rn6;
import java.io.File;
import p.l32;
import p.es;
import p.wu;
import p.cy3;
import p.qw3;
import p.r45;
import p.nt0;
import p.ur;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.xy5;
import p.wp3;
import com.spotify.liteappstorage.files.StorageLocationMovingService;
import p.ud4;
import p.an5;
import p.eq3;
import p.al5;
import p.ym5;
import com.spotify.lite.database.room.UserRoomDatabase;
import com.spotify.lite.database.room.TasteOnboardingRoomDatabase;
import com.spotify.lite.database.room.RecentSearchRoomDatabase;
import com.spotify.lite.database.room.RecentPlayRoomDatabase;
import com.spotify.lite.database.room.NetworkRoomDatabase;
import p.xm3;
import p.nm3;
import java.util.ArrayList;
import p.w51;
import p.ab3;
import p.hc;
import com.spotify.liteinstrumentation.instrumentation.events.proto.AndroidClientReport;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.jn3;
import android.os.Build;
import p.ox7;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.Math;
import p.is7;
import p.mc;
import com.spotify.liteinstrumentation.instrumentation.events.proto.AndroidDeviceReport;
import p.z33;
import p.ui7;
import p.fj3;
import p.ia5;
import p.hs3;

public final class ha5 implements b5	// class@001813 from classes.dex
{
    public final int a;
    public final Object b;

    public void ha5(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    private final void a(){
       nh0 a;
       String str;
       String str2;
       hu3 ohu3;
       hu3 c2;
       et3 c4;
       ha5 b = this.b;
       lu3 olu3 = b.a.get();
       a3 uoa3 = null;
       boolean b1 = true;
       boolean b2 = false;
       if (az5.D() != null) {
          olu3.getClass();
          i3.f.F().c(uoa3, b1);
          az5.U(uoa3);
          vl5.d.G().a(uoa3, b1);
          SharedPreferences$Editor uEditor = olu3.a.edit();
          uEditor.putBoolean("express_login_allowed", b2);
          uEditor.apply();
       }
       qy1 c = b.c;
       String[] stringArray = new String[]{"public_profile"};
       List list = Arrays.asList(stringArray);
       olu3.getClass();
       co5.o(c, "activity");
       if (list != null) {
          Iterator iterator = list.iterator();
          do {
             if (iterator.hasNext()) {
             }
             str2 = iterator.next();
          } while (!dt3.p(str2));
          throw new ny1(tp2.m("Cannot pass a publish or manage permission \(", str2, "\) to a request for read authorization"));
       }
       it3 oit3 = new it3(list);
       it3 c1 = oit3.c;
       try{
          a = nh0.a;
          str = vv7.u(c1);
       }catch(p.ny1 e0){
          a = nh0.b;
       }
       String str1 = str;
       nh0 onh0 = a;
       str2 = UUID.randomUUID().toString();
       co5.l(str2, "randomUUID\(\).toString\(\)");
       et3 str3 = new et3(dj0.F0(oit3.a), sz1.b(), str2, olu3.b, oit3.b, oit3.c, str1, onh0);
       str.w = az5.J();
       str.A = uoa3;
       str.B = b2;
       str.D = b2;
       str.E = b2;
       ku3 oku3 = new ku3(e0);
       if ((ohu3 = i70.B.p(e0)) != null) {
          String str4 = (str.D != null)? "foa_mobile_login_start": "fb_mobile_login_start";
          Bundle uBundle = dt3.f(str2);
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("login_behavior", ct3.x.toString());
             eo5.Q();
             jSONObject.put("request_code", (sz1.h + b2));
             jSONObject.put("permissions", TextUtils.join(",", str.b));
             jSONObject.put("default_audience", o61.c.toString());
             jSONObject.put("isReauthorize", str.w);
             if ((c2 = ohu3.c) != null) {
                jSONObject.put("facebookVersion", c2);
             }
             if ((c4 = str.C) != null) {
                jSONObject.put("target_app", c4.a);
             }
             uBundle.putString("6_extras", jSONObject.toString());
             e0.b.a(uBundle, str4);
          }catch(org.json.JSONException e0){
          }
       }
       mj7 b3 = ja0.b;
       eo5.Q();
       int i = sz1.h + b2;
       ju3 oju3 = new ju3(olu3);
       _monitor_enter(b3);
       HashMap c3 = ja0.c;
       if (c3.containsKey(Integer.valueOf(i))) {
          _monitor_exit(b3);
       }else {
          c3.put(Integer.valueOf(i), oju3);
          _monitor_exit(b3);
       }
       Intent intent = new Intent();
       intent.setClass(sz1.a(), FacebookActivity.class);
       intent.setAction(str.a.toString());
       Bundle uBundle1 = new Bundle();
       uBundle1.putParcelable("request", str);
       intent.putExtra("com.facebook.LoginFragment:Request", uBundle1);
       i = (sz1.a().getPackageManager().resolveActivity(intent, b2) != null)? 1: 0;
       if (!i) {
          b1 = false;
       }else {
          try{
             eo5.Q();
             oku3.a.startActivityForResult(intent, (sz1.h + b2));
          }catch(android.content.ActivityNotFoundException e0){
          }
       }
       if (b1) {
          return;
       }else {
          ny1 ony1 = new ny1("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
          lu3.a(oku3.a, ft3.t, null, ony1, false, str);
          throw ony1;
       }
    }
    public final void run(){
       ha5 b;
       es i6;
       nt0 ont0;
       PhoneNumberSignupActivity g0;
       g15 b3;
       Object[] objArray;
       q97 a4;
       ha5 oha5 = this;
       int i = 3;
       int i1 = 1;
       int i2 = 0;
       switch (oha5.a){
           case 0:
             oha5.b.a.a("Periodic scheduler completed.");
             return;
           case 1:
             b = oha5.b;
             i1 = (b.b.k == i)? 1: 0;
             if (!i1) {
                b.b.e();
             }
             return;
             break;
           case 2:
             b = oha5.b;
             b.getClass();
             String mANUFACTURER = Build.MANUFACTURER;
             String dISPLAY = Build.DISPLAY;
             int i3 = ox7.m();
             int i4 = ox7.g();
             jn3 a = b.a;
             long l = ox7.r(a);
             DisplayMetrics displayMetri = a.getResources().getDisplayMetrics();
             float f = (float)Math.sqrt((double)((((float)displayMetri.heightPixels / displayMetri.ydpi) * ((float)displayMetri.heightPixels / displayMetri.ydpi)) + (((float)displayMetri.widthPixels / displayMetri.xdpi) * ((float)displayMetri.widthPixels / displayMetri.xdpi))));
             DisplayMetrics widthPixels = a.getResources().getDisplayMetrics().widthPixels;
             DisplayMetrics heightPixels = a.getResources().getDisplayMetrics().heightPixels;
             int i5 = is7.n(a);
             String[] sUPPORTED_AB = Build.SUPPORTED_ABIS;
             if (sUPPORTED_AB.length > 0) {
                object oobject = sUPPORTED_AB[i2];
                oobject.getClass();
                switch (oobject.hashCode()){
                    case 0xcff4a627:
                      if (oobject.equals("x86_64")) {
                         i = 0;
                      }
                      break;
                    case 0x1c976:
                      if (oobject.equals("x86")) {
                         i = 1;
                      }
                      break;
                    case 0x8ab4d72:
                      if (oobject.equals("armeabi-v7a")) {
                         i = 2;
                      }
                      break;
                    case 0x5553f3ec:
                      if (oobject.equals("arm64-v8a")) {
                      }
                      break;
                    default:
                      i = -1;
                }
                switch (i){
                    case 0:
                      i1 = 5;
                      break;
                    case 1:
                      i1 = 2;
                      break;
                    case 2:
                      i1 = 1;
                      break;
                    case 3:
                      i1 = 4;
                      break;
                    default:
                   label_02d0 :
                      i1 = 0;
                }
             }else {
                goto label_02d0 ;
             }
             jn3 b1 = b.b;
             b1.getClass();
             mc omc = AndroidDeviceReport.q();
             omc.g(mANUFACTURER);
             omc.f(dISPLAY);
             omc.j((long)i3);
             omc.h((long)i4);
             omc.i(l);
             omc.l(f);
             omc.m((long)widthPixels);
             omc.k((long)heightPixels);
             omc.e((long)i5);
             omc.d((long)i2);
             omc.c((long)i1);
             b1.a.a(omc.build());
             return;
             break;
           case 3:
             b = oha5.b;
             xm3 a1 = b.a;
             xm3 b2 = b.b;
             b2.getClass();
             hc ohc = AndroidClientReport.i();
             ohc.e(a1.a.getApplicationContext().getPackageName());
             ohc.c(w51.G(a1.c.split(":")));
             ohc.d(xe7.J(a1.b));
             b2.a.a(ohc.build());
             return;
           case 4:
             oha5.b.d();
             return;
           case 5:
             oha5.b.d();
             return;
           case 6:
             oha5.b.d();
             return;
           case 7:
             oha5.b.d();
             return;
           case 8:
             oha5.b.d();
             return;
           case 9:
             oha5.b.a.onNext(Boolean.TRUE);
             return;
           case 10:
             oha5.b.a.onNext(Boolean.TRUE);
             return;
           case 11:
             oha5.b.a.onNext(ud4.d);
             return;
           case 12:
             oha5.b.a();
             return;
           case 13:
             wn6 own6 = oha5.b.a.edit();
             own6.d(wp3.s);
             own6.d(wp3.w);
             own6.d(wp3.t);
             own6.d(wp3.u);
             own6.d(wp3.v);
             own6.d(wp3.z);
             own6.d(wp3.A);
             own6.d(wp3.C);
             own6.d(wp3.D);
             own6.d(wp3.E);
             own6.d(wp3.F);
             own6.d(wp3.B);
             own6.d(wp3.G);
             own6.d(wp3.H);
             own6.f();
             return;
           case 14:
             oha5.b.d();
             return;
           case 15:
             b = oha5.b;
             if ((i6 = b.i) != null) {
                es e = b.e;
                es h = b.h;
                ur a2 = ((ont0 = i6.g.f()) != null)? ont0.a: "";
                e.a(h, a2, b.i.h.f(), i1);
             }
             return;
             break;
           case 16:
             b = oha5.b;
             wn6 own61 = b.b.edit();
             own61.d(ne5.d);
             own61.f();
             b.c.getClass();
             l32.b(new File(b.a.getFilesDir(), "pinned"));
             return;
           case 17:
             oha5.b.a();
             return;
           case 18:
             b = oha5.b;
             if (b.getActivity() != null) {
                b.startActivity(xj0.r(b.getActivity()));
             }
             return;
             break;
           case 19:
             oha5.b.A.clearFocus();
             return;
           case 20:
             oha5.b.J.onNext(Boolean.FALSE);
             return;
           case 21:
             b = oha5.b;
             b.t.setEnabled(i1);
             b.t.selectAll();
             xe7.a0(b.t);
             return;
           case 22:
             oha5.b.z.clearFocus();
             return;
           case 23:
             oha5.b.a();
             return;
           case 24:
             if ((g0 = oha5.b.g0) != null) {
                g0.a(i);
             }
             return;
             break;
           case 25:
             if ((b3 = oha5.b.l.get().B) != null) {
                a90 a3 = b3.a;
                _monitor_enter(a3);
                a3.J();
                Collection uCollection = a3.B.values();
                co5.l(uCollection, "lruEntries.values");
                vb1[] ovb1Array = new vb1[i2];
                if ((objArray = uCollection.toArray(ovb1Array)) != null) {
                   i1 = objArray.length;
                   int i7 = 0;
                   while (i7 < i1) {
                      object oobject1 = objArray[i7];
                      i7 = i7 + 1;
                      co5.l(oobject1, "entry");
                      a3.m0(oobject1);
                   }
                   a3.H = i2;
                   _monitor_exit(a3);
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
             }
             return;
             break;
           case 26:
             oha5.b.b.a.a();
             return;
           case 27:
             b = oha5.b;
             if ((a4 = b.a) != null) {
                a4.dispose();
                b.a = null;
             }
             return;
             break;
           default:
             this.a();
             return;
       }
    }
}
