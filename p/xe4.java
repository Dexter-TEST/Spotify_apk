package p.xe4;
import p.mu3;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.j3;
import p.ht3;
import p.gt3;
import p.et3;
import p.e11;
import java.util.List;
import p.ye7;
import java.util.Collection;
import p.dt3;
import android.os.Bundle;
import java.util.Set;
import p.a3;
import p.yp;
import java.lang.Throwable;
import android.content.Intent;
import android.content.Context;
import p.sz1;
import android.content.pm.PackageManager;
import p.gu3;
import p.h7;
import p.jc7;
import android.os.BaseBundle;
import p.ej4;
import java.util.concurrent.Executor;
import p.jj1;
import java.lang.Runnable;

public abstract class xe4 extends mu3	// class@002c5f from classes.dex
{
    public final j3 c;

    public void xe4(Parcel p0){
       co5.o(p0, "source");
       super(p0);
       this.c = j3.b;
    }
    public void xe4(ht3 p0){
       super(p0);
       this.c = j3.b;
    }
    public final void D(gt3 p0){
       if (p0 != null) {
          this.d().d(p0);
       }else {
          this.d().y();
       }
       return;
    }
    public j3 L(){
       return this.c;
    }
    public final void M(et3 p0,String p1,String p2,String p3){
       String[] stringArray;
       if (p1 != null && co5.c(p1, "logged_out")) {
          e11.z = true;
          this.D(null);
       }else if(stringArray = new String[]{"service_disabled","AndroidAuthKillSwitchException"}){
          this.D(null);
       }else if(stringArray = new String[]{"access_denied","OAuthAccessDeniedException"}){
          this.D(dt3.k(p0, null));
       }else {
          this.D(dt3.m(p0, p1, p2, p3));
       }
       return;
    }
    public final void N(Bundle p0,et3 p1){
       try{
          this.D(dt3.l(p1, dt3.i(p1.b, p0, this.L(), p1.t), dt3.j(p0, p1.F)));
       }catch(p.ny1 e4){
          this.D(dt3.m(p1, null, e4.getMessage(), null));
       }
       return;
    }
    public final boolean O(Intent p0){
       gu3 t;
       if (p0 != null) {
          List list = sz1.a().getPackageManager().queryIntentActivities(p0, 0x10000);
          co5.l(list, "FacebookSdk.getApplicationContext\(\)\n            .packageManager\n            .queryIntentActivities\(intent, PackageManager.MATCH_DEFAULT_ONLY\)");
          if ((list.isEmpty() ^ 1)) {
             ht3 c = this.d().c;
             boolean b = false;
             if (c instanceof gu3) {
             }else {
                c = b;
             }
             if (c) {
                if ((t = c.t) != null) {
                   t.a(p0);
                   b = jc7.a;
                }else {
                   co5.N("launcher");
                   throw b;
                }
             }
             if (b == null) {
                return false;
             }else {
                return 1;
             }
          }
       }
       return false;
    }
    public final boolean q(int p0,int p1,Intent p2){
       Bundle extras;
       String str5;
       Object obj;
       ht3 x = this.d().x;
       if (p2 == null) {
          this.D(dt3.k(x, "Operation canceled"));
       }else {
          String str = "error_description";
          String str1 = "error_message";
          String str2 = "error_type";
          String str3 = "error";
          String str4 = null;
          if (!p1) {
             str5 = ((extras = p2.getExtras()) == null)? str4: extras.getString(str3);
             if (str5 == null) {
                str5 = (extras == null)? str4: extras.getString(str2);
             }
             str2 = (extras == null || (obj = extras.get("error_code")) == null)? str4: obj.toString();
             if (co5.c("CONNECTION_FAILURE", str2)) {
                int i = (extras == null)? str4: extras.getString(str1);
                if (i == null) {
                   if (extras != null) {
                      str4 = extras.getString(str);
                   }
                }else {
                   str4 = i;
                }
                this.D(dt3.m(x, str5, str4, str2));
             }else {
                this.D(dt3.k(x, str5));
             }
          }else if(p1 != -1){
             this.D(dt3.m(x, "Unexpected resultCode from authorization.", str4, str4));
          }else if((extras = p2.getExtras()) == null){
             this.D(dt3.m(x, "Unexpected null from returned authorization data.", str4, str4));
             return true;
          }else if((str5 = extras.getString(str3)) == null){
             str5 = extras.getString(str2);
          }
          if ((obj = extras.get("error_code")) != null) {
             str4 = obj.toString();
          }
          if ((str1 = extras.getString(str1)) == null) {
             str1 = extras.getString(str);
          }
          str = extras.getString("e2e");
          if (!ej4.Z(str)) {
             this.m(str);
          }
          if (str5 == null && (str4 == null && (str1 == null && x != null))) {
             str5 = "code";
             if (extras.containsKey(str5) && !ej4.Z(extras.getString(str5))) {
                sz1.c().execute(new jj1(this, x, extras, 3));
             }else {
                this.N(extras, x);
             }
          }else {
             this.M(x, str5, str1, str4);
          }
       }
       return true;
    }
}
