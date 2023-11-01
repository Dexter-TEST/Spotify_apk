package com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment$1;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingActionCallback;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment;
import java.lang.Object;
import java.lang.String;
import android.webkit.WebView;
import java.lang.Boolean;
import com.spotify.messaging.inappmessagingsdk.display.a;
import java.lang.Runnable;
import android.view.View;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter;

class InAppMessagingDisplayFragment$1 implements InAppMessagingActionCallback	// class@000a2f from classes.dex
{
    final InAppMessagingDisplayFragment this$0;

    public void InAppMessagingDisplayFragment$1(InAppMessagingDisplayFragment p0){
       this.this$0 = p0;
       super();
    }
    public static void a(InAppMessagingDisplayFragment$1 p0,String p1){
       p0.lambda$actionEvent$0(p1);
    }
    private void lambda$actionEvent$0(String p0){
       InAppMessagingDisplayFragment.access$000(this.this$0).loadUrl(p0);
    }
    public void actionEvent(String p0,String p1,boolean p2){
       if (InAppMessagingDisplayFragment.access$000(this.this$0) != null) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p2),p1};
          InAppMessagingDisplayFragment.access$000(this.this$0).post(new a(this, String.format("javascript:IAM.emitEvent\(\'%s\', { active: %b, ctaId: \'%s\' }\);", objArray)));
       }
       return;
    }
    public void dataParsingError(){
       this.this$0.mPresenter.dismiss();
    }
}
