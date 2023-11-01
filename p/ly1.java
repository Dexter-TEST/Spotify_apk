package p.ly1;
import androidx.fragment.app.f;
import android.os.Bundle;
import p.ny1;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.df4;
import android.content.Intent;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.res.Configuration;
import p.rm7;
import java.lang.NullPointerException;
import java.lang.Integer;
import p.uk;
import android.os.BaseBundle;
import p.ej4;
import p.sz1;
import p.a3;
import p.az5;
import android.content.Context;
import p.ky1;
import p.bv3;
import p.mm7;
import p.kg4;
import p.vz1;
import android.os.Message;
import android.app.Dialog;

public final class ly1 extends f	// class@001de7 from classes.dex
{
    public Dialog H;
    public static final int I;

    public void ly1(){
       super();
    }
    public final void C(Bundle p0,ny1 p1){
       k activity;
       if ((activity = this.getActivity()) == null) {
          return;
       }
       Intent intent = activity.getIntent();
       co5.l(intent, "fragmentActivity.intent");
       Intent intent1 = df4.d(intent, p0, p1);
       int i = (p1 == null)? -1: 0;
       activity.setResult(i, intent1);
       activity.finish();
       return;
    }
    public final void onConfigurationChanged(Configuration p0){
       ly1 tH;
       co5.o(p0, "newConfig");
       super.onConfigurationChanged(p0);
       if (this.H instanceof rm7 && this.isResumed()) {
          if ((tH = this.H) != null) {
             tH.d();
          }else {
             throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
          }
       }
       return;
    }
    public final void onCreate(Bundle p0){
       k activity;
       rm7 v6;
       super.onCreate(p0);
       if (this.H != null) {
       }else if((activity = this.getActivity()) == null){
          Intent intent = activity.getIntent();
          co5.l(intent, "intent");
          int i = 0;
          boolean intExtra = intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i);
          int i1 = 1;
          intExtra = (uk.i0(df4.c, Integer.valueOf(intExtra)) && intExtra >= 0x133529d)? 1: 0;
          intent = (!intExtra)? intent.getExtras(): intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
          intExtra = (intent == null)? 0: intent.getBoolean("is_fallback", i);
          String str = null;
          String str1 = "null cannot be cast to non-null type kotlin.String";
          if (!intExtra) {
             String str2 = (intent == null)? str: intent.getString("action");
             BaseBundle uBaseBundle = (intent == null)? str: intent.getBundle("params");
             if (ej4.Z(str2)) {
                activity.finish();
             }else if(str2 != null){
                a3 uoa3 = az5.D();
                if (!az5.J()) {
                   str = ej4.F(activity);
                }
                if (uBaseBundle == null) {
                   uBaseBundle = new Bundle();
                }
                ky1 oky1 = new ky1(this, i);
                String str3 = "app_id";
                if (uoa3 != null) {
                   uBaseBundle.putString(str3, uoa3.y);
                   uBaseBundle.putString("access_token", uoa3.v);
                }else {
                   uBaseBundle.putString(str3, str);
                }
                rm7.b(activity);
                v6 = new rm7(activity, str2, uBaseBundle, bv3.b, oky1);
             }else {
                throw new NullPointerException(str1);
             }
          }else if(intent == null){
             str = intent.getString("url");
          }
          if (ej4.Z(str)) {
             activity.finish();
          }else {
             Object[] objArray = new Object[i1];
             objArray[i] = sz1.b();
             String str4 = kg4.q(objArray, i1, "fb%s://bridge/", "java.lang.String.format\(format, *args\)");
             if (str != null) {
                rm7.b(activity);
                vz1 ovz1 = new vz1(activity, str, str4);
                ovz1.c = new ky1(this, i1);
             }else {
                throw new NullPointerException(str1);
             }
          }
          this.H = v6;
       }
       return;
    }
    public final void onDestroyView(){
       f tC;
       if ((tC = this.C) != null && this.getRetainInstance()) {
          tC.setDismissMessage(null);
       }
       super.onDestroyView();
       return;
    }
    public final void onResume(){
       super.onResume();
       ly1 tH = this.H;
       if (tH instanceof rm7) {
          if (tH != null) {
             tH.d();
          }else {
             throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
          }
       }
       return;
    }
    public final Dialog x(Bundle p0){
       ly1 tH;
       if ((tH = this.H) == null) {
          this.C(null, null);
          this.y = false;
          return super.x(p0);
       }else if(tH != null){
          return tH;
       }else {
          throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
       }
    }
}
