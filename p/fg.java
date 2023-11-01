package p.fg;
import android.content.BroadcastReceiver;
import java.lang.Object;
import p.lc1;
import p.ux7;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import p.co5;
import p.s60;
import io.reactivex.rxjava3.core.Observer;
import com.facebook.CustomTabMainActivity;
import java.lang.Class;
import com.facebook.CustomTabActivity;
import android.app.Activity;
import p.q60;
import p.gg;
import android.os.Message;
import android.os.Handler;
import p.lf7;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class fg extends BroadcastReceiver	// class@0015c5 from classes.dex
{
    public final int a;
    public final Object b;

    public void fg(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void fg(lc1 p0){
       this.a = 6;
       super();
       this.b = p0;
    }
    public void fg(ux7 p0){
       this.a = 4;
       this.b = p0;
       super();
    }
    public final void onReceive(Context p0,Intent p1){
       Intent intent;
       String w;
       lc1 h;
       String str = "intent";
       fg tb = this.b;
       switch (this.a){
           case 0:
             tb.g();
             return;
           case 1:
             co5.o(p0, "context");
             co5.o(p1, str);
             tb.g(p1);
             return;
           case 2:
             co5.o(p0, "context");
             co5.o(p1, str);
             tb.finish();
             return;
           case 3:
             co5.o(p0, "context");
             co5.o(p1, str);
             intent = new Intent(tb, CustomTabMainActivity.class);
             intent.setAction(CustomTabMainActivity.y);
             w = CustomTabMainActivity.w;
             intent.putExtra(w, p1.getStringExtra(w));
             intent.addFlags(0x24000000);
             tb.startActivity(intent);
             return;
           case 4:
             tb.a(p0, p1);
             return;
           case 5:
             co5.o(p0, "context");
             co5.o(p1, str);
             tb.b.onNext(p1);
             return;
           default:
             if (p1 != null) {
                w = p1.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(w)) {
                   String str1 = "state";
                   if (p1.hasExtra(str1)) {
                      h = tb.h;
                      h.sendMessage(h.obtainMessage(10, p1.getBooleanExtra(str1, false), false));
                   }
                }else if("android.net.conn.CONNECTIVITY_CHANGE".equals(w)){
                   h = tb.h;
                   h.sendMessage(h.obtainMessage(9, p0.getSystemService("connectivity").getActiveNetworkInfo()));
                }
             }
             return;
       }
    }
}
