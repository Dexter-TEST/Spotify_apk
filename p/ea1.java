package p.ea1;
import androidx.fragment.app.f;
import p.mj7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.String;
import java.lang.StringBuilder;
import p.eo5;
import p.sz1;
import p.ny1;
import p.qo5;
import java.util.Date;
import java.util.List;
import p.j3;
import p.a3;
import java.util.Collection;
import p.ht3;
import p.mu3;
import p.gt3;
import p.ft3;
import p.et3;
import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.app.Activity;
import java.lang.Object;
import p.co5;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;
import p.jm7;
import android.view.View$OnClickListener;
import android.text.Spanned;
import android.text.Html;
import java.lang.CharSequence;
import java.lang.NullPointerException;
import p.ma1;
import p.ca1;
import p.dt3;
import java.lang.Throwable;
import java.lang.Long;
import android.os.Bundle;
import android.os.BaseBundle;
import p.tm2;
import p.e3;
import p.om2;
import p.az5;
import p.fs2;
import p.um2;
import p.z91;
import p.fa1;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p.am0;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import java.util.concurrent.ScheduledFuture;
import java.util.EnumMap;
import p.sl1;
import java.lang.Class;
import java.lang.Integer;
import p.yy6;
import p.lx;
import java.util.Map;
import p.v10;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p.h22;
import p.f22;
import p.km6;
import java.util.AbstractCollection;
import java.util.HashMap;
import android.net.nsd.NsdServiceInfo;
import android.content.Context;
import android.net.nsd.NsdManager;
import p.la1;
import android.net.nsd.NsdManager$RegistrationListener;
import p.dc3;
import p.me7;
import p.bj;
import java.lang.Iterable;
import android.text.TextUtils;
import p.ej4;
import android.os.Build;
import org.json.JSONObject;
import com.facebook.FacebookActivity;
import p.gu3;
import android.os.Parcelable;
import android.os.AsyncTask;
import java.util.concurrent.Future;
import android.content.DialogInterface;
import p.da1;

public class ea1 extends f	// class@001449 from classes.dex
{
    public View H;
    public TextView I;
    public TextView J;
    public fa1 K;
    public final AtomicBoolean L;
    public um2 M;
    public ScheduledFuture N;
    public ca1 O;
    public boolean P;
    public boolean Q;
    public et3 R;
    public static final int S;

    static {
       mj7 omj7 = new mj7(23, 0);
    }
    public void ea1(){
       super();
       this.L = new AtomicBoolean();
    }
    public static String D(){
       String e;
       StringBuilder str = sz1.b()+'|';
       eo5.Q();
       if ((e = sz1.e) != null) {
          return str+e;
       }
       throw new ny1("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }
    public final void C(String p0,qo5 p1,String p2,Date p3,Date p4){
       ea1 k;
       f c;
       ea1 uoea1 = this;
       qo5 oqo5 = p1;
       if ((k = uoea1.K) == null) {
       }else {
          a3 v16 = new a3(p2, sz1.b(), p0, oqo5.a, oqo5.b, oqo5.c, j3.w, p3, null, p4);
          gt3 oqo51 = new gt3(k.d().x, ft3.b, v16, null, null);
          k.d().d(oqo5);
       }
       if ((c = uoea1.C) != null) {
          c.dismiss();
       }
       return;
    }
    public final View E(boolean p0){
       LayoutInflater layoutInflat = this.requireActivity().getLayoutInflater();
       co5.l(layoutInflat, "requireActivity\(\).layoutInflater");
       int i = (p0)? 0x7f0d0049: 0x7f0d0047;
       View view = layoutInflat.inflate(i, null);
       co5.l(view, "inflater.inflate\(getLayoutResId\(isSmartLogin\), null\)");
       View view1 = view.findViewById(R.id.progress_bar);
       co5.l(view1, "view.findViewById\(R.id.progress_bar\)");
       this.H = view1;
       view1 = view.findViewById(R.id.confirmation_code);
       String str = "null cannot be cast to non-null type android.widget.TextView";
       if (view1 != null) {
          this.I = view1;
          if ((view1 = view.findViewById(R.id.cancel_button)) != null) {
             view1.setOnClickListener(new jm7(1, this));
             if ((view1 = view.findViewById(R.id.com_facebook_device_auth_instructions)) != null) {
                this.J = view1;
                view1.setText(Html.fromHtml(this.getString(R.string.com_facebook_device_auth_instructions)));
                return view;
             }else {
                throw new NullPointerException(str);
             }
          }else {
             throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
          }
       }else {
          throw new NullPointerException(str);
       }
    }
    public final void F(){
       ea1 tO;
       f tC;
       if (!this.L.compareAndSet(false, true)) {
          return;
       }
       if ((tO = this.O) != null) {
          ma1.a(tO.b);
       }
       if ((tO = this.K) != null) {
          tO.d().d(dt3.k(tO.d().x, "User canceled log in."));
       }
       if ((tC = this.C) != null) {
          tC.dismiss();
       }
       return;
    }
    public final void G(ny1 p0){
       ea1 tO;
       f tC;
       if (!this.L.compareAndSet(false, true)) {
          return;
       }
       if ((tO = this.O) != null) {
          ma1.a(tO.b);
       }
       if ((tO = this.K) != null) {
          tO.d().d(dt3.m(tO.d().x, null, p0.getMessage(), null));
       }
       if ((tC = this.C) != null) {
          tC.dismiss();
       }
       return;
    }
    public final void H(String p0,long p1,Long p2){
       Bundle uBundle = new Bundle();
       uBundle.putString("fields", "id,permissions,name");
       long l = 1000;
       int i = 0;
       int i1 = 0;
       Date uDate = (p1 - i1)? new Date(((p1 * l) + new Date().getTime())): i;
       if (p2 == null || ((p2.longValue() - i1) && p2 != null)) {
          i = new Date((p2.longValue() * l));
       }
       a3 l1 = new a3(p0, sz1.b(), "0", null, null, null, null, uDate, null, i);
       e3 v2 = new e3(this, p0, uDate, i, 2);
       tm2 otm2 = az5.M(l, "me", v2);
       otm2.k(fs2.a);
       otm2.d = uBundle;
       otm2.d();
       return;
    }
    public final void I(){
       ea1 tO;
       ea1 tO1;
       if ((tO = this.O) == null) {
       }else {
          tO.v = new Date().getTime();
       }
       Bundle uBundle = new Bundle();
       String str = ((tO1 = this.O) == null)? null: tO1.c;
       uBundle.putString("code", str);
       uBundle.putString("access_token", ea1.D());
       this.M = az5.O("device/login_status", uBundle, new z91(this, 0)).d();
       return;
    }
    public final void J(){
       ScheduledThreadPoolExecutor v;
       ea1 tO = this.O;
       void ovoid = null;
       Long longx = (tO == null)? ovoid: Long.valueOf(tO.t);
       if (longx != null) {
          mj7 t = fa1.t;
          _monitor_enter(t);
          if (fa1.v == null) {
             fa1.v = new ScheduledThreadPoolExecutor(1);
          }
          if ((v = fa1.v) != null) {
             _monitor_exit(t);
             this.N = v.schedule(new am0(16, this), longx.longValue(), TimeUnit.SECONDS);
          }else {
             co5.N("backgroundExecutor");
             throw ovoid;
          }
       }
       return;
    }
    public final void K(ca1 p0){
       Bitmap uBitmap;
       ea1 tJ;
       ea1 tH;
       dc3 uodc3;
       v10 systemServic;
       int i3;
       this.O = p0;
       ea1 tI = this.I;
       String str = "confirmationCode";
       if (tI != null) {
          tI.setText(p0.b);
          ca1 a = p0.a;
          EnumMap uEnumMap = new EnumMap(sl1.class);
          uEnumMap.put(sl1.w, Integer.valueOf(2));
          try{
             tI = 0;
             v10 ov10 = new yy6(18).e(a, lx.A, 200, 200, uEnumMap);
             v10 b = ov10.b;
             v10 a1 = ov10.a;
             int[] ointArray = new int[(b * a1)];
             if (b > null) {
                int i = 0;
                while (true) {
                   int i1 = i + 1;
                   int i2 = i * a1;
                   if (a1 > null) {
                      i3 = 0;
                      while (true) {
                         int i4 = i3 + 1;
                         int i5 = i2 + i3;
                         if (ov10.a(i3, i)) {
                            i3 = 0xff000000;
                         label_0055 :
                            ointArray[i5] = i3;
                            if (i4 >= a1) {
                            }else {
                               i3 = i4;
                            }
                         }else {
                            i3 = -1;
                            goto label_0055 ;
                         }
                      }
                   }else if(i1 >= b){
                   label_0061 :
                      uBitmap = Bitmap.createBitmap(a1, b, Bitmap$Config.ARGB_8888);
                      i1 = 0;
                      i3 = 0;
                      Bitmap uBitmap1 = uBitmap;
                      try{
                         systemServic = a1;
                         uBitmap1.setPixels(ointArray, i1, systemServic, i3, 0, a1, b);
                      }catch(p.fs7 e0){
                      }
                   }else {
                      i = i1;
                   }
                }
             }else {
                goto label_0061 ;
             }
             BitmapDrawable uBitmapDrawa = new BitmapDrawable(this.getResources(), uBitmap);
             if ((tJ = this.J) != null) {
                tJ.setCompoundDrawablesWithIntrinsicBounds(null, uBitmapDrawa, null, null);
                if ((tJ = this.I) != null) {
                   tJ.setVisibility(e0);
                   if ((tH = this.H) != null) {
                      tH.setVisibility(8);
                      if (this.Q == null) {
                         ca1 b1 = p0.b;
                         f22 uof22 = ((uof22 = h22.b(sz1.b())) != null && uof22.c.contains(km6.c))? 1: 0;
                         if (uof22) {
                            HashMap a2 = ma1.a;
                            if (!a2.containsKey(b1)) {
                               String str1 = "15.0.1".replace('.', '|');
                               co5.l(str1, "this as java.lang.String…replace\(oldChar, newChar\)");
                               str1 = "fbsdk_"+co5.K(str1, "android-")+'_'+b1;
                               NsdServiceInfo nsdServiceIn = new NsdServiceInfo();
                               nsdServiceIn.setServiceType("_fb._tcp.");
                               nsdServiceIn.setServiceName(str1);
                               nsdServiceIn.setPort(80);
                               if ((systemServic = sz1.a().getSystemService("servicediscovery")) != null) {
                                  la1 ola1 = new la1(str1, b1);
                                  a2.put(b1, ola1);
                                  systemServic.registerService(nsdServiceIn, 1, ola1);
                               }else {
                                  throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                               }
                            }
                            b1 = 1;
                         }else {
                            uodc3 = 0;
                         }
                         if (b1) {
                            uodc3 = new dc3(this.getContext());
                            if (me7.a()) {
                               uodc3.a.b("fb_smart_login_service", null);
                            }
                         }
                      }
                      if ((p0.v) && (((new Date().getTime() - p0.v) - (p0.t * 1000))) < 0) {
                         tI = 1;
                      }
                      if (e0) {
                         this.J();
                      }else {
                         this.I();
                      }
                      return;
                   }else {
                      co5.N("progressBar");
                      throw null;
                   }
                }else {
                   co5.N(str);
                   throw null;
                }
             }else {
                co5.N("instructions");
                throw null;
             }
          }catch(p.fs7 e0){
             uBitmap = null;
          }
       }else {
          co5.N(str);
          throw null;
       }
    }
    public final void L(et3 p0){
       this.R = p0;
       Bundle uBundle = new Bundle();
       uBundle.putString("scope", TextUtils.join(",", p0.b));
       et3 x = p0.x;
       if (!ej4.Z(x)) {
          uBundle.putString("redirect_uri", x);
       }
       p0 = p0.z;
       if (!ej4.Z(p0)) {
          uBundle.putString("target_user_id", p0);
       }
       uBundle.putString("access_token", ea1.D());
       HashMap hashMap = new HashMap();
       String dEVICE = Build.DEVICE;
       co5.l(dEVICE, "DEVICE");
       hashMap.put("device", dEVICE);
       dEVICE = Build.MODEL;
       co5.l(dEVICE, "MODEL");
       hashMap.put("model", dEVICE);
       String str = new JSONObject(hashMap).toString();
       co5.l(str, "JSONObject\(deviceInfo as Map<*, *>\).toString\(\)");
       uBundle.putString("device_info", str);
       az5.O("device/login", uBundle, new z91(this, 1)).d();
       return;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       FacebookActivity p;
       ca1 parcelable;
       co5.o(p0, "inflater");
       View view = super.onCreateView(p0, p1, p2);
       fa1 uofa1 = ((p = this.requireActivity().P) == null)? null: p.u().j();
       this.K = uofa1;
       if (p2 != null && (parcelable = p2.getParcelable("request_state")) != null) {
          this.K(parcelable);
       }
       return view;
    }
    public final void onDestroyView(){
       ea1 tM;
       this.P = true;
       this.L.set(true);
       super.onDestroyView();
       if ((tM = this.M) == null) {
       }else {
          tM.cancel(true);
       }
       if ((tM = this.N) != null) {
          tM.cancel(true);
       }
       return;
    }
    public final void onDismiss(DialogInterface p0){
       co5.o(p0, "dialog");
       super.onDismiss(p0);
       if (this.P == null) {
          this.F();
       }
       return;
    }
    public final void onSaveInstanceState(Bundle p0){
       co5.o(p0, "outState");
       super.onSaveInstanceState(p0);
       if (this.O != null) {
          p0.putParcelable("request_state", this.O);
       }
       return;
    }
    public final Dialog x(Bundle p0){
       da1 uoda1 = new da1(this, this.requireActivity());
       f22 uof22 = h22.b(sz1.b());
       boolean b = true;
       uof22 = (uof22 != null && uof22.c.contains(km6.c))? 1: 0;
       if (!uof22 || this.Q != null) {
          b = false;
       }
       uoda1.setContentView(this.E(b));
       return uoda1;
    }
}
