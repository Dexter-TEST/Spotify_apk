package p.cv3;
import p.b5;
import p.gv3;
import java.lang.Object;
import com.spotify.liteui.login.LoginActivity;
import android.widget.Toast;
import java.lang.String;
import android.content.Context;
import java.lang.CharSequence;
import java.lang.Class;
import android.net.Uri;
import android.content.Intent;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import android.app.Activity;

public final class cv3 implements b5	// class@001284 from classes.dex
{
    public final int a;
    public final gv3 b;

    public void cv3(gv3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       LoginActivity u;
       Toast toast;
       int i = 1;
       cv3 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             try{
                tb.getClass();
                tb.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/password-reset/?nolink=1")));
             }catch(java.lang.Exception e0){
                Object[] objArray = new Object[0];
                Logger.c(e0, "Unable to open password reset link", objArray);
             }
             return;
             break;
           case 2:
             if ((u = tb.U) != null) {
                u.cancel();
             }
             toast = Toast.makeText(tb, tb.getString(R.string.connection_state_no_connection), i);
             tb.U = toast;
             toast.show();
             return;
             break;
           default:
             if ((u = tb.U) != null) {
                u.cancel();
             }
             toast = Toast.makeText(tb, tb.getString(R.string.generic_error_message), i);
             tb.U = toast;
             toast.show();
             return;
       }
       tb.finish();
       return;
    }
}
