package com.spotify.litesignup.signup.TermsAndConditionsActivity;
import androidx.appcompat.app.a;
import android.os.Bundle;
import androidx.fragment.app.k;
import android.content.Intent;
import android.app.Activity;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.hj3;
import android.content.Context;
import p.m11;
import java.lang.Integer;
import p.zq7;
import p.li5;
import android.net.Uri;

public class TermsAndConditionsActivity extends a	// class@000971 from classes.dex
{

    public void TermsAndConditionsActivity(){
       super();
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       String dataString = this.getIntent().getDataString();
       if (!TextUtils.isEmpty(dataString)) {
          m11 om11 = new m11();
          om11.b.a = Integer.valueOf(0xff000000);
          om11.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
          om11.a().h(this, Uri.parse(new hj3(this, dataString).a));
       }
       this.finish();
       return;
    }
}
