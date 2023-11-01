package com.spotify.messaging.criticalmessaging.criticalmessagingview.internal.encorecomponents.webview.CriticalMessageWebViewActivity;
import p.ip6;
import android.os.Bundle;
import androidx.appcompat.app.a;
import p.ae2;
import androidx.fragment.app.k;
import java.lang.String;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import p.t01;
import android.content.Intent;
import android.app.Activity;
import com.spotify.messaging.criticalmessaging.criticalmessagingview.models.ViewType;
import java.lang.Object;
import p.co5;
import android.os.BaseBundle;
import java.lang.Class;
import androidx.fragment.app.a;

public final class CriticalMessageWebViewActivity extends ip6	// class@000a22 from classes.dex
{

    public void CriticalMessageWebViewActivity(){
       super();
    }
    public final void onCreate(Bundle p0){
       String stringExtra;
       String stringExtra2;
       String str3;
       String stringExtra3;
       String str4;
       String str5;
       t01 str3;
       super.onCreate(p0);
       this.setContentView(R.layout.critical_message_webview_activity);
       String str = "CRITICAL_MESSAGE_WEBVIEW_FRAGMENT_TAG";
       int i = (this.y().D(str) != null)? 1: 0;
       if (!i) {
          if ((stringExtra = this.getIntent().getStringExtra("CRITICAL_MESSAGE_WEBVIEW_URI_KEY")) != null) {
             String stringExtra1 = this.getIntent().getStringExtra("CRITICAL_MESSAGE_WEBVIEW_DISMISS_URI_SUFFIX_KEY");
             String str1 = "";
             if (stringExtra1 == null) {
                stringExtra1 = str1;
             }
             long l = 0;
             long longExtra = this.getIntent().getLongExtra("CRITICAL_MESSAGE_METADATA_ID_KEY", l);
             if ((stringExtra2 = this.getIntent().getStringExtra("CRITICAL_MESSAGE_METADATA_UUID_KEY")) == null) {
                stringExtra2 = str1;
             }
             String str2 = "CRITICAL_MESSAGE_METADATA_END_TIMESTAMP_KEY";
             l = this.getIntent().getLongExtra(str2, l);
             str3 = "CRITICAL_MESSAGE_METADATA_IMPRESSION_URL_KEY";
             if ((stringExtra3 = this.getIntent().getStringExtra(str3)) == null) {
                stringExtra3 = str1;
                str4 = stringExtra3;
             }else {
                str4 = str1;
             }
             str5 = str;
             str = "CRITICAL_MESSAGE_METADATA_DISPLAY_REASON_KEY";
             str1 = this.getIntent().getStringExtra(str);
             String str6 = str;
             if (str1 == null) {
                str1 = str4;
             }
             String str7 = str1;
             str1 = "CRITICAL_MESSAGE_METADATA_PAGE_URI_KEY";
             String str8 = ((str = this.getIntent().getStringExtra(str1)) == null)? str4: str;
             String str9 = str1;
             str1 = "CRITICAL_MESSAGE_METADATA_TRANSACTIONAL_KEY";
             String str10 = str3;
             boolean b = this.getIntent().getBooleanExtra(str1, false);
             str = "CRITICAL_MESSAGE_METADATA_REQUEST_ID_KEY";
             if ((str3 = this.getIntent().getStringExtra(str)) != null) {
                str4 = str3;
             }
             this.getIntent().getBooleanExtra("CRITICAL_MESSAGE_METADATA_CONTROL_KEY", false);
             co5.o(ViewType.WEB_VIEW, "type");
             str3 = new t01();
             Bundle uBundle = new Bundle();
             uBundle.putString("CRITICAL_MESSAGE_WEBVIEW_URI_KEY", stringExtra);
             uBundle.putString("CRITICAL_MESSAGE_WEBVIEW_DISMISS_URI_SUFFIX_KEY", stringExtra1);
             uBundle.putLong("CRITICAL_MESSAGE_METADATA_ID_KEY", longExtra);
             uBundle.putString("CRITICAL_MESSAGE_METADATA_UUID_KEY", stringExtra2);
             uBundle.putLong(str2, l);
             uBundle.putString(str10, stringExtra3);
             uBundle.putString(str6, str7);
             uBundle.putString(str9, str8);
             uBundle.putBoolean(str1, b);
             uBundle.putString(str, str4);
             str3.setArguments(uBundle);
          }else {
             str5 = str;
             str3 = null;
          }
          if (str3 != null) {
             ae2 uoae2 = this.y();
             uoae2.getClass();
             a uoa = new a(uoae2);
             uoa.g(R.id.critical_message_webview, str3, str5, 1);
             uoa.e(false);
          }
       }
       return;
    }
}
