package p.ht3;
import android.os.Parcelable;
import p.dj2;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.mu3;
import java.lang.ClassLoader;
import java.lang.Class;
import java.util.ArrayList;
import p.et3;
import java.util.HashMap;
import p.ej4;
import java.util.Map;
import java.util.LinkedHashMap;
import p.q14;
import java.lang.NullPointerException;
import androidx.fragment.app.Fragment;
import p.ny1;
import java.lang.StringBuilder;
import androidx.fragment.app.k;
import android.content.Context;
import p.gt3;
import p.dt3;
import p.ft3;
import p.up0;
import p.gu3;
import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import p.a3;
import p.az5;
import p.yp;
import java.lang.Throwable;
import p.hu3;
import p.sz1;
import android.os.BaseBundle;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.AbstractMap;
import org.json.JSONObject;
import p.dc3;
import com.facebook.CustomTabMainActivity;
import p.ih3;
import p.bn7;

public final class ht3 implements Parcelable	// class@0018ba from classes.dex
{
    public hu3 A;
    public int B;
    public int C;
    public mu3[] a;
    public int b;
    public Fragment c;
    public up0 t;
    public fu3 v;
    public boolean w;
    public et3 x;
    public Map y;
    public final LinkedHashMap z;
    public static final Parcelable$Creator CREATOR;

    static {
       ht3.CREATOR = new dj2(3);
    }
    public void ht3(Parcel p0){
       Parcelable[] parcelableAr;
       object oobject;
       Object[] objArray;
       HashMap hashMap;
       HashMap hashMap1;
       co5.o(p0, "source");
       super();
       this.b = -1;
       if ((parcelableAr = p0.readParcelableArray(mu3.class.getClassLoader())) == null) {
          parcelableAr = new Parcelable[0];
       }
       ArrayList uArrayList = new ArrayList();
       int len = parcelableAr.length;
       int i = 0;
       while (true) {
          oobject = null;
          if (i < len) {
             object oobject1 = parcelableAr[i];
             if (oobject1 instanceof mu3) {
                oobject = oobject1;
             }
             if (oobject != null) {
                oobject.b = this;
             }
             if (oobject != null) {
                uArrayList.add(oobject);
             }
             i = i + 1;
          }else {
             break ;
          }
       }
       mu3[] omu3Array = new mu3[0];
       if ((objArray = uArrayList.toArray(omu3Array)) != null) {
          this.a = objArray;
          this.b = p0.readInt();
          this.x = p0.readParcelable(et3.class.getClassLoader());
          LinkedHashMap linkedHashMa = ((hashMap = ej4.H0(p0)) == null)? oobject: q14.t0(hashMap);
          this.y = linkedHashMa;
          if ((hashMap1 = ej4.H0(p0)) != null) {
             oobject = q14.t0(hashMap1);
          }
          this.z = oobject;
          return;
       }else {
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
       }
    }
    public void ht3(Fragment p0){
       co5.o(p0, "fragment");
       super();
       this.b = -1;
       if (this.c != null) {
          throw new ny1("Can\'t set fragment once it is already set.");
       }
       this.c = p0;
       return;
    }
    public final void a(String p0,String p1,boolean p2){
       ht3 ty;
       if ((ty = this.y) == null) {
          ty = new HashMap();
       }
       if (this.y == null) {
          this.y = ty;
       }
       if (ty.containsKey(p0) && p2) {
          p1 = ty.get(p0)+','+p1;
       }
       ty.put(p0, p1);
       return;
    }
    public final boolean b(){
       int i;
       boolean b = true;
       if (this.w != null) {
          return b;
       }
       k ok = ((ok = this.e()) == null)? -1: ok.checkCallingOrSelfPermission("android.permission.INTERNET");
       if (ok) {
          String str = ((ok = this.e()) == null)? null: ok.getString(R.string.com_facebook_internet_permission_error_title);
          String str1 = (ok == null)? null: ok.getString(R.string.com_facebook_internet_permission_error_message);
          this.c(dt3.m(this.x, str, str1, null));
          return false;
       }else {
          this.w = b;
          return b;
       }
    }
    public final void c(gt3 p0){
       ht3 ty;
       ht3 tt;
       co5.o(p0, "outcome");
       mu3 omu3 = this.j();
       gt3 a = p0.a;
       if (omu3 != null) {
          this.q(omu3.e(), a.a, p0.t, p0.v, omu3.a);
       }
       if ((ty = this.y) != null) {
          p0.x = ty;
       }
       if ((ty = this.z) != null) {
          p0.y = ty;
       }
       mu3[] omu3Array = null;
       this.a = omu3Array;
       int i = -1;
       this.b = i;
       this.x = omu3Array;
       this.y = omu3Array;
       this.B = 0;
       this.C = 0;
       if ((tt = this.t) != null) {
          up0 b = tt.b;
          co5.o(b, "this$0");
          b.b = omu3Array;
          if (a == ft3.c) {
             i = 0;
          }
          Bundle omu3Array1 = new Bundle();
          omu3Array1.putParcelable("com.facebook.LoginFragment:Result", p0);
          Intent intent = new Intent();
          intent.putExtras(omu3Array1);
          k activity = b.getActivity();
          if (b.isAdded() && activity != null) {
             activity.setResult(i, intent);
             activity.finish();
          }
       }
       return;
    }
    public final void d(gt3 p0){
       gt3 b;
       a3 uoa3;
       co5.o(p0, "outcome");
       if ((b = p0.b) != null && az5.J()) {
          try{
             p0 = ((uoa3 = az5.D()) != null && co5.c(uoa3.z, b.z))? dt3.l(this.x, b, p0.c): dt3.m(this.x, "User logged in as different Facebook user.", null, null);
             this.c(p0);
          }catch(java.lang.Exception e5){
             this.c(dt3.m(this.x, "Caught exception", e5.getMessage(), null));
          }
       }else {
          this.c(p0);
       }
       return;
    }
    public final int describeContents(){
       return 0;
    }
    public final k e(){
       ht3 tc;
       k ok = ((tc = this.c) == null)? null: tc.getActivity();
       return ok;
    }
    public final mu3 j(){
       ht3 ta;
       ht3 tb = this.b;
       mu3 omu3 = null;
       if (tb >= null && (ta = this.a) != null) {
          omu3 = ta[tb];
       }
       return omu3;
    }
    public final hu3 m(){
       ht3 tA;
       ht3 tx;
       k ok;
       ht3 tx1;
       if ((tA = this.A) != null) {
          et3 uoet3 = ((tx = this.x) == null)? null: tx.t;
          if (co5.c(tA.a, uoet3)) {
          label_0030 :
             return tA;
          }
       }
       if ((ok = this.e()) == null) {
          ok = sz1.a();
       }
       String str = ((tx1 = this.x) == null)? sz1.b(): tx1.t;
       tA = new hu3(ok, str);
       this.A = tA;
       goto label_0030 ;
    }
    public final void q(String p0,String p1,String p2,String p3,HashMap p4){
       ht3 tx = this.x;
       String str = "fb_mobile_login_method_complete";
       if (tx == null) {
          this.m().a(str, p0);
       }else {
          hu3 ohu3 = this.m();
          if (tx.D != null) {
             str = "foa_mobile_login_method_complete";
          }
          Bundle uBundle = dt3.f(tx.v);
          if (p1 != null) {
             uBundle.putString("2_result", p1);
          }
          if (p2 != null) {
             uBundle.putString("5_error_message", p2);
          }
          if (p3 != null) {
             uBundle.putString("4_error_code", p3);
          }
          if (p4 != null && ((p4.isEmpty() ^ 1))) {
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             Iterator iterator = p4.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                int i = (uEntry.getKey() != null)? 1: 0;
                if (i) {
                   linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
                }
             }
             uBundle.putString("6_extras", new JSONObject(linkedHashMa).toString());
          }
          uBundle.putString("3_method", p0);
          ohu3.b.a(uBundle, str);
       }
       return;
    }
    public final void u(int p0,int p1,Intent p2){
       mu3 omu3;
       this.B = this.B + 1;
       if (this.x != null) {
          if (p2 != null && p2.getBooleanExtra(CustomTabMainActivity.z, false)) {
             this.y();
             return;
          }else if((omu3 = this.j()) != null && (!omu3 instanceof ih3 && (p2 == null && this.B < this.C))){
             omu3.q(p0, p1, p2);
          }
       }
       return;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       p0.writeParcelableArray(this.a, p1);
       p0.writeInt(this.b);
       p0.writeParcelable(this.x, p1);
       ej4.Q0(p0, this.y);
       ej4.Q0(p0, this.z);
    }
    public final void y(){
       mu3 omu3;
       ht3 tx;
       hu3 ohu3;
       String str1;
       Bundle uBundle;
       if ((omu3 = this.j()) != null) {
          this.q(omu3.e(), "skipped", null, null, omu3.a);
       }
       ht3 ta = this.a;
       while (true) {
          if (ta != null) {
             ht3 tb = this.b;
             int i = 1;
             int i1 = ta.length - i;
             if (tb < i1) {
                tb++;
                this.b = tb;
                String mu3 tb1 = this.j();
                i1 = false;
                if (tb1 != null) {
                   if (tb1 instanceof bn7 && !this.b()) {
                      this.a("no_internet_permission", "1", i1);
                   }else if((tx = this.x) == null){
                      int i2 = tb1.C(tx);
                      this.B = i1;
                      String str = "3_method";
                      et3 v = tx.v;
                      if (i2 > 0) {
                         ohu3 = this.m();
                         tb1 = tb1.e();
                         str1 = (tx.D != null)? "foa_mobile_login_method_start": "fb_mobile_login_method_start";
                         uBundle = dt3.f(v);
                         uBundle.putString(str, tb1);
                         ohu3.b.a(uBundle, str1);
                         this.C = i2;
                      }else {
                         ohu3 = this.m();
                         String str2 = tb1.e();
                         str1 = (tx.D != null)? "foa_mobile_login_method_not_tried": "fb_mobile_login_method_not_tried";
                         uBundle = dt3.f(v);
                         uBundle.putString(str, str2);
                         ohu3.b.a(uBundle, str1);
                         this.a("not_tried", tb1.e(), i);
                      }
                      if (i2 <= 0) {
                         i = 0;
                      }
                      i1 = i;
                   }
                }
                if (i1) {
                   return;
                }
                continue ;
             }
          }
          if ((ta = this.x) != null) {
             this.c(dt3.m(ta, "Login attempt failed.", null, null));
             break ;
          }
          break ;
       }
       return;
    }
}
