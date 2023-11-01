package p.fj2;
import p.mu3;
import p.dj2;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ht3;
import p.et3;
import p.cj2;
import androidx.fragment.app.k;
import android.content.Context;
import p.sz1;
import p.df4;
import android.content.Intent;
import android.content.ServiceConnection;
import java.lang.Boolean;
import p.fu3;
import p.gu3;
import android.view.View;
import p.zh0;
import android.os.Bundle;
import p.a3;
import p.dt3;
import android.os.BaseBundle;
import p.yp;
import p.ny1;
import java.lang.Throwable;
import p.gt3;

public final class fj2 extends mu3	// class@0015d9 from classes.dex
{
    public cj2 c;
    public final String t;
    public static final Parcelable$Creator CREATOR;

    static {
       fj2.CREATOR = new dj2(0);
    }
    public void fj2(Parcel p0){
       co5.o(p0, "source");
       super(p0);
       this.t = "get_token";
    }
    public void fj2(ht3 p0){
       super(p0);
       this.t = "get_token";
    }
    public final int C(et3 p0){
       k ok;
       boolean b;
       ht3 v;
       fj2 tc;
       gu3 v1;
       Intent intent;
       if ((ok = this.d().e()) == null) {
          ok = sz1.a();
       }
       cj2 uocj2 = new cj2(ok, p0);
       this.c = uocj2;
       _monitor_enter(uocj2);
       if (uocj2.d != null) {
          _monitor_exit(uocj2);
       }else if(df4.e(uocj2.i) == -1){
          _monitor_exit(uocj2);
       }else if((intent = df4.c(uocj2.a)) == null){
          b = false;
       }else {
          uocj2.d = true;
          uocj2.a.bindService(intent, uocj2, 1);
          b = true;
       }
       _monitor_exit(uocj2);
    label_003f :
       if (co5.c(Boolean.valueOf(b), Boolean.FALSE)) {
          return 0;
       }else if((v = this.d().v) == null){
          if ((v1 = v.a.v) != null) {
             v1.setVisibility(0);
          }else {
             co5.N("progressBar");
             throw 0;
          }
       }
       zh0 ozh0 = new zh0(this, 2, p0);
       if ((tc = this.c) != null) {
          tc.c = ozh0;
       }
       return 1;
       b = false;
       goto label_003f ;
    }
    public final void D(Bundle p0,et3 p1){
       int i;
       String str;
       gt3 ogt3;
       yp oyp;
       co5.o(p1, "request");
       co5.o(p0, "result");
       try{
          i = 0;
          a3 uoa3 = dt3.h(p0, p1.t);
          et3 f = p1.F;
          if ((str = p0.getString("com.facebook.platform.extra.ID_TOKEN")) != null) {
             int i1 = 1;
             int i2 = (!str.length())? 1: 0;
             if (!i2 && f != null) {
                if (f.length()) {
                   i1 = 0;
                }
                if (!i1) {
                   try{
                      oyp = new yp(str, f);
                   label_0047 :
                      ogt3 = dt3.l(p1, uoa3, oyp);
                   }catch(java.lang.Exception e7){
                      throw new ny1(e7.getMessage());
                   }
                }
             }
          }
          oyp = i;
          goto label_0047 ;
       }catch(p.ny1 e7){
          ogt3 = dt3.m(this.d().x, i, e7.getMessage(), i);
       }
       this.d().d(ogt3);
       return;
    }
    public final void b(){
       fj2 tc;
       if ((tc = this.c) == null) {
       }else {
          tc.d = false;
          tc.c = null;
          this.c = null;
       }
       return;
    }
    public final int describeContents(){
       return 0;
    }
    public final String e(){
       return this.t;
    }
}
