package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment$2;
import android.webkit.WebViewClient;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment;
import android.webkit.WebView;
import java.lang.String;

class InAppMessagingDisplayFragment$2 extends WebViewClient	// class@000a30 from classes.dex
{
    final InAppMessagingDisplayFragment this$0;

    public void InAppMessagingDisplayFragment$2(InAppMessagingDisplayFragment p0){
       this.this$0 = p0;
       super();
    }
    public void onPageFinished(WebView p0,String p1){
       super.onPageFinished(p0, p1);
       InAppMessagingDisplayFragment.access$000(this.this$0).loadUrl("javascript:\(function\(\) { var script=document.createElement\(\'script\'\);  script.setAttribute\(\'type\',\'text/javascript\'\);  script.setAttribute\(\'src\', \'automation/quicksilverCardAutomationInterface.js\'\); document.body.appendChild\(script\); }\)\(\);");
       InAppMessagingDisplayFragment.access$202(this.this$0, true);
    }
}
