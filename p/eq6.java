package p.eq6;
import android.webkit.WebChromeClient;
import p.vm7;
import p.uv1;
import p.n91;
import android.webkit.WebView;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import java.lang.String;
import android.webkit.JsResult;
import android.content.Context;
import android.view.View;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.AlertDialog$Builder;
import java.lang.CharSequence;
import p.fm7;
import android.content.DialogInterface$OnClickListener;
import p.gm7;
import android.content.DialogInterface$OnCancelListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient$FileChooserParams;
import android.net.Uri;
import android.content.Intent;

public final class eq6 extends WebChromeClient	// class@0014dc from classes.dex
{
    public final vm7 a;
    public final uv1 b;
    public final n91 c;

    public void eq6(vm7 p0,vm7 p1){
       super();
       this.a = p0;
       this.b = new uv1(22, 0);
       this.c = new n91(p1);
    }
    public final void onCloseWindow(WebView p0){
       k activity;
       if ((activity = this.a.a.getActivity()) != null) {
          activity.finish();
       }
       return;
    }
    public final boolean onJsConfirm(WebView p0,String p1,String p2,JsResult p3){
       uv1 b;
       eq6 tb = this.b;
       Context context = p0.getContext();
       if ((b = tb.b) != null) {
          b.cancel();
          tb.b = null;
       }
       tb.b = new AlertDialog$Builder(context).setMessage(p2).setPositiveButton(0x104000a, new fm7(tb, p3, 0)).setNegativeButton(0x1040000, new fm7(tb, p3, 1)).setOnCancelListener(new gm7(tb, p3)).show();
       return 1;
    }
    public final boolean onShowFileChooser(WebView p0,ValueCallback p1,WebChromeClient$FileChooserParams p2){
       eq6 tc = this.c;
       tc.c(null);
       try{
          tc.c = p1;
          tc.b.a.startActivityForResult(p2.createIntent(), 1780);
       }catch(android.content.ActivityNotFoundException e0){
          tc.c(e0);
       }
       return true;
    }
}
