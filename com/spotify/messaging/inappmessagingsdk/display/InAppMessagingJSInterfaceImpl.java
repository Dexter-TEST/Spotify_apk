package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterfaceImpl;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterface;
import java.lang.Object;
import com.spotify.messaging.inappmessagingsdk.display.MessageInteractor;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingActionCallback;
import com.spotify.messaging.inappmessagingsdk.display.TouchBoundaryFrameLayout;
import java.lang.String;
import p.co5;
import p.k83;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterfaceImpl$documentReady$1;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter$Callback;
import java.lang.CharSequence;
import com.spotify.messaging.inappmessagingsdk.display.TouchBoundary;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterfaceImpl$documentReady$3;
import java.util.Set;

public final class InAppMessagingJSInterfaceImpl implements InAppMessagingJSInterface	// class@000a3f from classes.dex
{
    private InAppMessagingActionCallback _actionCallback;
    private MessageInteractor _messageInteractor;
    private InAppMessagingPresenter _presenter;
    private TouchBoundaryFrameLayout _touchBoundaryContainer;
    private final float density;

    public void InAppMessagingJSInterfaceImpl(float p0){
       super();
       this.density = p0;
    }
    public static final MessageInteractor access$get_messageInteractor$p(InAppMessagingJSInterfaceImpl p0){
       return p0._messageInteractor;
    }
    public void bannerHeight(int p0){
       InAppMessagingJSInterfaceImpl t_presenter;
       if ((t_presenter = this._presenter) != null) {
          t_presenter.containerHeight(p0);
       }
       return;
    }
    public void bind(InAppMessagingPresenter p0,MessageInteractor p1,InAppMessagingActionCallback p2,TouchBoundaryFrameLayout p3){
       co5.o(p0, "presenter");
       co5.o(p1, "messageInteractor");
       co5.o(p2, "actionCallback");
       co5.o(p3, "touchBoundaryContainer");
       this._presenter = p0;
       this._messageInteractor = p1;
       this._actionCallback = p2;
       this._touchBoundaryContainer = p3;
    }
    public void call(String p0){
       InAppMessagingJSInterfaceImpl t_actionCall;
       InAppMessagingJSInterfaceImpl t_messageInt;
       InAppMessagingJSInterfaceImpl t_messageInt1;
       co5.o(p0, "actionId");
       if ((t_actionCall = this._actionCallback) != null && (t_messageInt = this._messageInteractor) != null) {
          t_messageInt.actionClicked(p0, "{}", t_actionCall);
       }
       t_actionCall = this._messageInteractor;
       t_messageInt = 0;
       if (t_actionCall != null && t_actionCall.shouldDismiss(p0) == true) {
          t_messageInt = 1;
       }
       if (t_messageInt) {
          if ((t_messageInt1 = this._messageInteractor) != null) {
             t_messageInt1.logDismiss(k83.a);
          }
          if ((t_messageInt1 = this._presenter) != null) {
             t_messageInt1.dismiss();
          }
       }
       return;
    }
    public void callV2(String p0,String p1,boolean p2){
       InAppMessagingJSInterfaceImpl t_actionCall;
       InAppMessagingJSInterfaceImpl t_messageInt;
       InAppMessagingJSInterfaceImpl t_messageInt1;
       co5.o(p0, "actionId");
       co5.o(p1, "actionData");
       if ((t_actionCall = this._actionCallback) != null && (t_messageInt = this._messageInteractor) != null) {
          t_messageInt.actionClicked(p0, p1, t_actionCall);
       }
       if (p2) {
          if ((t_messageInt1 = this._messageInteractor) != null) {
             t_messageInt1.logDismiss(k83.a);
          }
          if ((t_messageInt1 = this._presenter) != null) {
             t_messageInt1.dismiss();
          }
       }
       return;
    }
    public void documentReady(){
       InAppMessagingJSInterfaceImpl t_presenter;
       InAppMessagingJSInterfaceImpl t_messageInt;
       if ((t_presenter = this._presenter) != null) {
          t_presenter.present(new InAppMessagingJSInterfaceImpl$documentReady$1(this));
       }
       if ((t_presenter = this._touchBoundaryContainer) != null) {
          t_presenter.consumeAllTouches();
       }
       if ((t_presenter = this._actionCallback) != null && (t_messageInt = this._messageInteractor) != null) {
          t_messageInt.initializeActionStates(t_presenter);
       }
       return;
    }
    public void documentReady(String p0){
       InAppMessagingJSInterfaceImpl t_messageInt;
       int i;
       try{
          if (p0 != null && p0.length()) {
             InAppMessagingJSInterfaceImpl t_touchBound = 0;
          label_000e :
             if (!i && (p0.length() > 2 && (t_touchBound = this._touchBoundaryContainer) != null)) {
                t_touchBound.registerTouchBoundries(TouchBoundaryFrameLayout.getTouchBoundariesFromString(p0, this.density));
             }
             if ((t_messageInt = this._presenter) != null) {
                t_messageInt.present(new InAppMessagingJSInterfaceImpl$documentReady$3(this));
             }
             if ((t_messageInt = this._actionCallback) != null && (t_touchBound = this._messageInteractor) != null) {
                t_touchBound.initializeActionStates(t_messageInt);
             }
          }else {
             i = 1;
             goto label_000e ;
          }
       }catch(org.json.JSONException e0){
          if ((t_messageInt = this._messageInteractor) != null) {
             t_messageInt.logDiscard(co5.H("ERROR_PARSING_TOUCH_BOUNDARIES"));
          }
          if ((t_messageInt = this._presenter) != null) {
             t_messageInt.dismiss();
          }
       }
       return;
    }
    public void noteHeight(int p0){
       InAppMessagingJSInterfaceImpl t_presenter;
       if ((t_presenter = this._presenter) != null) {
          t_presenter.containerHeight(p0);
       }
       return;
    }
    public void unbind(){
       this._presenter = null;
       this._messageInteractor = null;
       this._actionCallback = null;
       this._touchBoundaryContainer = null;
    }
}
