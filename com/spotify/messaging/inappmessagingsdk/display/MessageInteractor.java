package com.spotify.messaging.inappmessagingsdk.display.MessageInteractor;
import p.u73;
import p.w87;
import java.util.Map;
import p.c6;
import p.r73;
import p.l83;
import p.zg0;
import java.lang.Object;
import p.ic;
import java.lang.Class;
import java.lang.System;
import java.lang.String;
import java.lang.Integer;
import p.jc7;
import com.spotify.messaging.inappmessagingsdk.display.c;
import p.s73;
import p.co5;
import p.s90;
import p.t73;
import p.uf;
import p.ca0;
import p.v73;
import com.spotify.messages.InAppMessageBackendRequestErrorEvent;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.ActionType;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingActionCallback;
import p.n5;
import org.json.JSONObject;
import p.m83;
import android.content.Context;
import android.content.Intent;
import p.xj0;
import android.net.Uri;
import p.jg0;
import p.xe7;
import p.a83;
import com.spotify.messages.InAppMessageInteractionEvent;
import java.lang.Enum;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import p.x73;
import com.spotify.messages.InAppMessageDiscardedEvent;
import p.k83;
import p.y73;
import com.spotify.messages.InAppMessageDismissEvent;
import p.z73;
import com.spotify.messages.InAppMessageImpressionEvent;
import p.b83;
import com.spotify.messages.InAppMessagePresentationPerformanceEvent;
import android.os.Bundle;

class MessageInteractor	// class@000a44 from classes.dex
{
    private final Map mActionHandlerMap;
    private final c6 mActionStateInitializer;
    private final l83 mClientLogger;
    private final zg0 mClock;
    boolean mHasLoggedImpression;
    private final r73 mImpressionApi;
    private final u73 mMessage;
    private final long mStartLoadTime;
    private final w87 mTrigger;
    static final String HAS_LOGGED_IMPRESSION_EXTRA = "has_logged_impression";

    public void MessageInteractor(u73 p0,w87 p1,Map p2,c6 p3,r73 p4,l83 p5,zg0 p6){
       super();
       this.mActionStateInitializer = p3;
       this.mActionHandlerMap = p2;
       this.mClientLogger = p5;
       this.mClock = p6;
       p6.getClass();
       this.mStartLoadTime = System.currentTimeMillis();
       this.mTrigger = p1;
       this.mMessage = p0;
       this.mImpressionApi = p4;
    }
    public static jc7 a(MessageInteractor p0,String p1,Integer p2,String p3){
       return p0.lambda$dispatchImpression$0(p1, p2, p3);
    }
    public static jc7 b(MessageInteractor p0,String p1,Integer p2,String p3){
       return p0.lambda$dispatchInteraction$1(p1, p2, p3);
    }
    private void dispatchImpression(String p0){
       MessageInteractor tmImpression = this.mImpressionApi;
       tmImpression.getClass();
       co5.o(p0, "impressionUrl");
       tmImpression.a.a(p0).x(new uf(3, new c(this, p0, 1)));
    }
    private void dispatchInteraction(String p0){
       MessageInteractor tmImpression = this.mImpressionApi;
       tmImpression.getClass();
       co5.o(p0, "impressionUrl");
       tmImpression.a.a(p0).x(new uf(3, new c(this, p0, 0)));
    }
    private jc7 lambda$dispatchImpression$0(String p0,Integer p1,String p2){
       MessageInteractor tmClientLogg = this.mClientLogger;
       tmClientLogg.getClass();
       v73 ov73 = InAppMessageBackendRequestErrorEvent.j();
       ov73.f("impression_url");
       ov73.e(p1.intValue());
       ov73.d(p0);
       ov73.c(p2);
       tmClientLogg.a.a(ov73.build());
       return jc7.a;
    }
    private jc7 lambda$dispatchInteraction$1(String p0,Integer p1,String p2){
       MessageInteractor tmClientLogg = this.mClientLogger;
       tmClientLogg.getClass();
       v73 ov73 = InAppMessageBackendRequestErrorEvent.j();
       ov73.f("interaction_url");
       ov73.e(p1.intValue());
       ov73.d(p0);
       ov73.c(p2);
       tmClientLogg.a.a(ov73.build());
       return jc7.a;
    }
    private void performAction(ActionType p0,String p1,String p2,String p3,InAppMessagingActionCallback p4){
       JSONObject jSONObject;
       n5 on5 = this.mActionHandlerMap.get(p0);
       try{
          jSONObject = new JSONObject(p3);
       }catch(org.json.JSONException e0){
          jSONObject = new JSONObject();
       }
       if (on5 != null) {
          m83 b = on5.b;
          switch (on5.a){
              case 0:
                b.startActivity(xj0.s(b, p1).addFlags(0x10000000));
                break;
              case 1:
                b.startActivity(xj0.s(b, p1).addFlags(0x10000000));
                break;
              default:
                b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/premium/?checkout=false")).addFlags(0x10000000));
          }
       }
       return;
    }
    public void actionClicked(String p0,String p1,InAppMessagingActionCallback p2){
       jg0 ojg0;
       if ((ojg0 = this.mMessage.b.get(p0)) == null) {
          return;
       }
       this.dispatchInteraction(xe7.J(ojg0.c));
       MessageInteractor tmClientLogg = this.mClientLogger;
       tmClientLogg.getClass();
       a83 uoa83 = InAppMessageInteractionEvent.h();
       uoa83.d(xe7.J(this.mMessage.v));
       uoa83.c(ojg0.a.name());
       tmClientLogg.a.a(uoa83.build());
       this.performAction(ojg0.a, ojg0.b, p0, p1, p2);
       return;
    }
    public void cleanup(){
       this.mActionStateInitializer.getClass();
    }
    public void initializeActionStates(InAppMessagingActionCallback p0){
       Iterator iterator = this.mMessage.b.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue().a == ActionType.TOGGLE_SAVE_ENTITY) {
             String key = uEntry.getKey();
             this.mActionStateInitializer.getClass();
          }
       }
       return;
    }
    public void logDiscard(Set p0){
       MessageInteractor tmClientLogg = this.mClientLogger;
       String str = xe7.J(this.mMessage.t);
       String str1 = xe7.J(this.mMessage.v);
       u73 w = this.mMessage.w;
       MessageInteractor tmTrigger = this.mTrigger;
       w87 a = tmTrigger.a;
       tmClientLogg.getClass();
       StringBuilder str2 = "";
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str3 = iterator.next();
          if (str2.length()) {
             str2 = str2.append(", ");
          }
          str2 = str2.append(str3);
       }
       x73 ox73 = InAppMessageDiscardedEvent.l();
       ox73.c(str);
       ox73.h(str1);
       ox73.e(str2);
       ox73.d(w.toString());
       ox73.f(a);
       ox73.g(tmTrigger.b.toString());
       tmClientLogg.a.a(ox73.build());
       return;
    }
    public void logDismiss(k83 p0){
       MessageInteractor tmClientLogg = this.mClientLogger;
       this.mClock.getClass();
       tmClientLogg.getClass();
       y73 oy73 = InAppMessageDismissEvent.j();
       oy73.d(xe7.J(this.mMessage.t));
       oy73.f(xe7.J(this.mMessage.v));
       oy73.e(p0.toString());
       oy73.c(System.currentTimeMillis());
       tmClientLogg.a.a(oy73.build());
    }
    public void onImpression(){
       if (this.mHasLoggedImpression != null) {
          return;
       }
       this.dispatchImpression(xe7.J(this.mMessage.c));
       MessageInteractor tmClientLogg = this.mClientLogger;
       tmClientLogg.getClass();
       z73 oz73 = InAppMessageImpressionEvent.h();
       oz73.d(xe7.J(this.mMessage.v));
       oz73.c(this.mMessage.w.toString());
       tmClientLogg.a.a(oz73.build());
       tmClientLogg = this.mClientLogger;
       this.mClock.getClass();
       tmClientLogg.getClass();
       b83 uob83 = InAppMessagePresentationPerformanceEvent.i();
       uob83.c(xe7.J(this.mMessage.t));
       uob83.d(String.valueOf((System.currentTimeMillis() - this.mStartLoadTime)));
       uob83.e(this.mMessage.w.toString());
       tmClientLogg.a.a(uob83.build());
       this.mHasLoggedImpression = true;
       return;
    }
    public void restoreInstanceState(Bundle p0){
       this.mHasLoggedImpression = p0.getBoolean("has_logged_impression", false);
    }
    public void saveInstanceState(Bundle p0){
       p0.putBoolean("has_logged_impression", this.mHasLoggedImpression);
    }
    public boolean shouldDismiss(String p0){
       jg0 ojg0;
       if ((ojg0 = this.mMessage.b.get(p0)) != null) {
          return ojg0.t;
       }
       return true;
    }
}
