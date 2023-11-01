package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment$InAppMessagingDisplayFragmentAutomationDelegate;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.lang.CharSequence;
import android.webkit.WebView;
import p.e83;
import android.webkit.ValueCallback;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterface;

public class InAppMessagingDisplayFragment$InAppMessagingDisplayFragmentAutomationDelegate	// class@000a32 from classes.dex
{
    protected final HashMap mWebviewStrings;
    final InAppMessagingDisplayFragment this$0;
    private static final String DEFAULT_QUICKSILVER_STRING = "[]";
    private static final String QUICKSILVER_TITLE_PROVIDER = "getTitleText\(\)";

    public void InAppMessagingDisplayFragment$InAppMessagingDisplayFragmentAutomationDelegate(InAppMessagingDisplayFragment p0){
       this.this$0 = p0;
       super();
       this.mWebviewStrings = new HashMap();
    }
    public static void a(InAppMessagingDisplayFragment$InAppMessagingDisplayFragmentAutomationDelegate p0,String p1,String p2){
       p0.lambda$callJavascriptAutomationInterface$0(p1, p2);
    }
    private String getWebviewString(String p0){
       this.callJavascriptAutomationInterface(p0);
       if ((p0 = this.mWebviewStrings.get(p0)) != null && !"null".equals(p0)) {
          return p0;
       }
       return "[]";
    }
    private void lambda$callJavascriptAutomationInterface$0(String p0,String p1){
       this.mWebviewStrings.put(p0, p1.replace("\"", ""));
    }
    public void callJavascriptAutomationInterface(String p0){
       InAppMessagingDisplayFragment.access$000(this.this$0).evaluateJavascript(p0, new e83(this, p0));
    }
    public String getHtmlContent(){
       return InAppMessagingDisplayFragment.access$300(this.this$0);
    }
    public String getTitle(){
       return this.getWebviewString("getTitleText\(\)");
    }
    public void triggerClickAction(String p0){
       this.this$0.mJavascriptInterface.call(p0);
    }
}
