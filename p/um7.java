package p.um7;
import android.webkit.WebViewClient;
import com.spotify.lite.about.WebViewActivity;
import android.widget.ProgressBar;
import java.lang.String;
import android.webkit.WebView;
import android.view.View;
import p.te5;
import java.lang.CharSequence;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import android.graphics.Bitmap;

public final class um7 extends WebViewClient	// class@0028de from classes.dex
{
    public final View a;
    public final String b;
    public final WebViewActivity c;

    public void um7(WebViewActivity p0,ProgressBar p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public final void onPageFinished(WebView p0,String p1){
       this.a.setVisibility(8);
       String title = p0.getTitle();
       if (te5.a(this.b)) {
          this.c.R.setTitle(title);
       }
       return;
    }
    public final void onPageStarted(WebView p0,String p1,Bitmap p2){
       this.a.setVisibility(0);
    }
}
