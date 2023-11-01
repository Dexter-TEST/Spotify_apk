package com.spotify.messaging.premiummessaging.view.PremiumMessagingActivity;
import p.ip6;
import java.lang.String;
import p.co5;
import android.os.Bundle;
import androidx.appcompat.app.a;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import p.sp6;
import android.content.res.Resources;
import p.lp6;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import p.rf;
import p.jg;
import android.app.Activity;
import p.ip7;
import p.do5;
import p.f67;
import p.dg;
import android.content.Intent;
import java.util.ArrayList;
import p.dj5;
import android.os.BaseBundle;
import java.util.Collection;
import androidx.fragment.app.Fragment;
import p.ae2;
import androidx.fragment.app.k;
import java.lang.Class;
import java.lang.Object;
import androidx.fragment.app.a;
import androidx.fragment.app.o;
import java.lang.IllegalStateException;

public class PremiumMessagingActivity extends ip6	// class@000a5b from classes.dex
{

    public void PremiumMessagingActivity(){
       super();
    }
    public final boolean B(){
       co5.N("premiumMessagingLogger");
       throw false;
    }
    public final void onBackPressed(){
       co5.N("premiumMessagingLogger");
       throw null;
    }
    public final void onCreate(Bundle p0){
       String stringExtra;
       String stringExtra1;
       ArrayList stringArrayL;
       jg a;
       super.onCreate(p0);
       this.setContentView(R.layout.activity_premium_messaging);
       Toolbar toolbar = this.findViewById(R.id.toolbar);
       toolbar.setNavigationIcon(new lp6(this, sp6.q0, (float)this.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size)));
       toolbar.setTitle("");
       jg ojg = this.A();
       if (!ojg.A instanceof Activity) {
       }else {
          ojg.C();
          jg f = ojg.F;
          if (!f instanceof ip7) {
             lw6 olw6 = null;
             ojg.G = olw6;
             if (f != null) {
                f.R();
             }
             ojg.F = olw6;
             a = ojg.A;
             CharSequence title = (a instanceof Activity)? a.getTitle(): ojg.H;
             f67 f1 = new f67(toolbar, title, ojg.D);
             ojg.F = f1;
             ojg.D.b = f1.H;
             toolbar.setBackInvokedCallbackEnabled(true);
             ojg.b();
          }else {
             throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
          }
       }
       String str = "URL_TO_LOAD";
       this.getIntent().getStringExtra(str);
       if ((stringExtra = this.getIntent().getStringExtra(str)) != null && ((stringExtra1 = this.getIntent().getStringExtra("MESSAGE_ID")) != null && ((stringArrayL = this.getIntent().getStringArrayListExtra("DISMISS_URI_SUFFIX")) != null && p0 == null))) {
          dj5 uodj5 = new dj5();
          Bundle uBundle = new Bundle();
          uBundle.putString(str, stringExtra);
          uBundle.putString("MESSAGE_ID", stringExtra1);
          uBundle.putStringArrayList("DISMISS_URI_SUFFIX", new ArrayList(stringArrayL));
          uodj5.setArguments(uBundle);
          ae2 uoae2 = this.y();
          uoae2.getClass();
          a uoa = new a(uoae2);
          uoa.k(R.id.fragment_container, uodj5, "Premium Messaging Fragment");
          uoa.e(false);
       }
       return;
    }
}
