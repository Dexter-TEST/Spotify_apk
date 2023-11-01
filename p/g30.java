package p.g30;
import android.content.BroadcastReceiver;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.wq3;
import android.content.Intent;
import p.dc3;
import android.os.Bundle;
import java.util.Set;
import android.os.BaseBundle;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import p.sz1;
import p.me7;
import java.lang.Class;
import java.util.UUID;
import p.t6;
import java.lang.Double;
import p.bj;

public final class g30 extends BroadcastReceiver	// class@00168d from classes.dex
{
    public final Context a;
    public static g30 b;

    public void g30(Context p0){
       super();
       p0 = p0.getApplicationContext();
       co5.l(p0, "context.applicationContext");
       this.a = p0;
    }
    public final void finalize(){
       wq3 owq3 = wq3.a(this.a);
       co5.l(owq3, "getInstance\(applicationContext\)");
       owq3.d(this);
    }
    public final void onReceive(Context p0,Intent p1){
       dc3 uodc3 = new dc3(p0);
       Set set = null;
       String str = (p1 == null)? set: p1.getStringExtra("event_name");
       String str1 = co5.K(str, "bf_");
       BaseBundle uBaseBundle = (p1 == null)? set: p1.getBundleExtra("event_args");
       Bundle uBundle = new Bundle();
       if (uBaseBundle != null) {
          set = uBaseBundle.keySet();
       }
       if (set != null) {
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             str = iterator.next();
             co5.l(str, "key");
             Pattern pattern = Pattern.compile("[^0-9a-zA-Z _-]");
             String str2 = "compile\(pattern\)";
             co5.l(pattern, str2);
             String str3 = pattern.matcher(str).replaceAll("-");
             String str4 = "nativePattern.matcher\(in…).replaceAll\(replacement\)";
             co5.l(str3, str4);
             Pattern pattern1 = Pattern.compile("^[ -]*");
             co5.l(pattern1, str2);
             Matcher matcher = pattern1.matcher(str3);
             String str5 = "";
             str3 = matcher.replaceAll(str5);
             co5.l(str3, str4);
             Pattern pattern2 = Pattern.compile("[ -]*$");
             co5.l(pattern2, str2);
             str3 = pattern2.matcher(str3).replaceAll(str5);
             co5.l(str3, str4);
             uBundle.putString(str3, uBaseBundle.get(str));
          }
       }
       if (me7.a()) {
          dc3 a = uodc3.a;
          a.getClass();
          a.a(str1, null, uBundle, false, t6.a());
       }
       return;
    }
}
