package p.v;
import p.ir0;
import com.spotify.lite.about.AboutActivity;
import java.lang.Object;
import p.jc7;
import java.lang.Class;
import android.content.Intent;
import java.lang.String;
import android.net.Uri;
import android.content.Context;
import android.app.Activity;
import com.spotify.lite.about.WebViewActivity;

public final class v implements ir0	// class@0029af from classes.dex
{
    public final int a;
    public final AboutActivity b;

    public void v(AboutActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       String str = "android.intent.action.VIEW";
       v tb = this.b;
       switch (this.a){
           case 0:
             tb.finish();
             return;
           case 1:
             tb.getClass();
             tb.startActivity(new Intent(str, AboutActivity.W));
             return;
           case 2:
             tb.getClass();
             tb.startActivity(new Intent(str, AboutActivity.V));
             return;
           default:
             tb.getClass();
             tb.startActivity(new Intent(tb, WebViewActivity.class).setData(AboutActivity.X).putExtra("android.intent.extra.TITLE", tb.getString(R.string.settings_about_open_source_libraries)));
             return;
       }
    }
}
