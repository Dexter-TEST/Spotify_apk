package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment;
import androidx.fragment.app.Fragment;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment$InAppMessagingDisplayFragmentAutomationDelegate;
import android.webkit.WebView;
import p.u73;
import p.w87;
import java.lang.String;
import java.nio.charset.Charset;
import android.util.Base64;
import android.view.View;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment$2;
import android.webkit.WebViewClient;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.WebSettings;
import android.view.View$AccessibilityDelegate;
import java.lang.Object;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment$1;
import com.spotify.messaging.inappmessagingsdk.display.TouchBoundaryFrameLayout;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter;
import com.spotify.messaging.inappmessagingsdk.display.MessageInteractor;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingActionCallback;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterface;
import java.util.Set;
import p.k83;
import android.content.Context;
import p.ej4;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Collections;
import android.os.Handler;
import android.os.Looper;
import p.oo3;
import java.lang.Runnable;

public class InAppMessagingDisplayFragment extends Fragment	// class@000a33 from classes.dex
{
    private final InAppMessagingDisplayFragment$InAppMessagingDisplayFragmentAutomationDelegate mAutoDelegate;
    private View mContainerView;
    private boolean mHasAutomationHooks;
    private String mHtmlContent;
    u73 mInAppMessage;
    InAppMessagingJSInterface mJavascriptInterface;
    MessageInteractor mMessageInteractor;
    InAppMessagingPresenter mPresenter;
    w87 mTrigger;
    private WebView mWebView;
    private static final String CHAR_SET = "UTF-8";
    private static final String ENCODING = "base64";
    public static final String MESSAGE_EXTRA = "message_extra";
    private static final String MIME_TYPE = "text/html; charset=utf-8";
    public static final String TRIGGER_EXTRA = "trigger_extra";

    public void InAppMessagingDisplayFragment(){
       super();
       this.mAutoDelegate = new InAppMessagingDisplayFragment$InAppMessagingDisplayFragmentAutomationDelegate(this);
    }
    public static WebView access$000(InAppMessagingDisplayFragment p0){
       return p0.mWebView;
    }
    public static InAppMessagingDisplayFragment access$100(u73 p0,w87 p1){
       return InAppMessagingDisplayFragment.newInstance(p0, p1);
    }
    public static boolean access$202(InAppMessagingDisplayFragment p0,boolean p1){
       p0.mHasAutomationHooks = p1;
       return p1;
    }
    public static String access$300(InAppMessagingDisplayFragment p0){
       return p0.mHtmlContent;
    }
    private static String getEncodedString(String p0){
       return Base64.encodeToString(p0.getBytes(Charset.forName("UTF-8")), 0);
    }
    private void lambda$setVisible$0(boolean p0){
       InAppMessagingDisplayFragment tmContainerV;
       if ((tmContainerV = this.mContainerView) != null) {
          int i = (p0)? 0: 8;
          tmContainerV.setVisibility(i);
       }
       return;
    }
    private void loadWebViewContentWithAutomationHooks(){
       this.mWebView.setWebViewClient(new InAppMessagingDisplayFragment$2(this));
       this.mWebView.loadDataWithBaseURL("file:///android_asset/", this.mHtmlContent, "text/html", "UTF-8", null);
    }
    private static InAppMessagingDisplayFragment newInstance(u73 p0,w87 p1){
       InAppMessagingDisplayFragment inAppMessagi = new InAppMessagingDisplayFragment();
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("message_extra", p0);
       uBundle.putParcelable("trigger_extra", p1);
       inAppMessagi.setArguments(uBundle);
       return inAppMessagi;
    }
    private void setUpWebView(){
       this.mWebView.setBackgroundColor(0);
       this.mWebView.getSettings().setTextZoom(100);
       this.mWebView.setHorizontalScrollBarEnabled(0);
       this.mWebView.setVerticalScrollBarEnabled(0);
       this.mWebView.setWebViewClient(new WebViewClient());
       this.mWebView.getSettings().setJavaScriptEnabled(true);
       this.mWebView.setAccessibilityDelegate(new View$AccessibilityDelegate());
       this.mWebView.addJavascriptInterface(this.mJavascriptInterface, "Android");
       this.mJavascriptInterface.bind(this.mPresenter, this.mMessageInteractor, new InAppMessagingDisplayFragment$1(this), this.mContainerView);
       u73 a = this.mInAppMessage.a;
       this.mHtmlContent = a;
       this.mWebView.loadData(InAppMessagingDisplayFragment.getEncodedString(a), "text/html; charset=utf-8", "base64");
    }
    public static void u(InAppMessagingDisplayFragment p0,boolean p1){
       p0.lambda$setVisible$0(p1);
    }
    public InAppMessagingDisplayFragment$InAppMessagingDisplayFragmentAutomationDelegate createAutomationDelegate(){
       if (this.mHasAutomationHooks == null) {
          this.loadWebViewContentWithAutomationHooks();
       }
       return this.mAutoDelegate;
    }
    public void discardMessage(Set p0){
       this.mMessageInteractor.logDiscard(p0);
       this.mJavascriptInterface.unbind();
    }
    public void dismissMessage(k83 p0){
       this.mMessageInteractor.logDismiss(p0);
       this.mMessageInteractor.cleanup();
       this.mJavascriptInterface.unbind();
    }
    public String getMessageId(){
       InAppMessagingDisplayFragment tmInAppMessa;
       if ((tmInAppMessa = this.mInAppMessage) != null) {
          return tmInAppMessa.t;
       }
       return null;
    }
    public w87 getTrigger(){
       return this.mTrigger;
    }
    public void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       if (p0 != null) {
          this.mMessageInteractor.restoreInstanceState(p0);
          this.mInAppMessage = p0.getParcelable("message_extra");
          this.mTrigger = p0.getParcelable("trigger_extra");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i = 0x7f0d00ce;
       try{
          View view = p0.inflate(i, p1, false);
          this.mContainerView = view;
          this.mWebView = view.findViewById(R.id.iam_webview);
          this.setUpWebView();
          return this.mContainerView;
       }catch(java.lang.Exception e0){
          this.discardMessage(Collections.singleton("WEBVIEW_INFLATION_ERROR"));
          return null;
       }
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.mJavascriptInterface.unbind();
    }
    public void onSaveInstanceState(Bundle p0){
       this.mMessageInteractor.saveInstanceState(p0);
       p0.putParcelable("message_extra", this.mInAppMessage);
       p0.putParcelable("trigger_extra", this.mTrigger);
    }
    public void setVisible(boolean p0){
       new Handler(Looper.getMainLooper()).post(new oo3(1, this, p0));
    }
}
