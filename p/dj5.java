package p.dj5;
import p.e51;
import java.lang.String;
import p.co5;
import android.view.View;
import android.os.Bundle;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import android.webkit.WebView;
import android.os.BaseBundle;
import p.ek3;

public final class dj5 extends e51	// class@00135b from classes.dex
{
    public WebView a;

    public void dj5(){
       super(0);
    }
    public final void onDestroy(){
       co5.N("premiumMessagingFragmentView");
       throw null;
    }
    public final void onViewCreated(View p0,Bundle p1){
       Bundle arguments;
       co5.o(p0, "view");
       super.onViewCreated(p0, p1);
       p0 = p0.findViewById(R.id.webview);
       co5.l(p0, "view.findViewById\(R.id.webview\)");
       this.a = p0;
       if ((arguments = this.getArguments()) == null || (arguments.getString("URL_TO_LOAD") == null || ((arguments = this.getArguments()) == null || arguments.getString("MESSAGE_ID") == null))) {
          return;
       }
       co5.l(this.getViewLifecycleOwner(), "viewLifecycleOwner");
       if (this.a == null) {
          co5.N("webView");
          throw null;
       }else {
          co5.N("viewModel");
          throw null;
       }
    }
}
