package p.ke7;
import java.lang.Runnable;
import java.lang.Object;
import p.me7;
import p.le7;
import p.h22;
import java.lang.String;
import p.sz1;
import p.f22;
import android.content.Context;
import p.vn;
import p.mj7;
import android.os.Bundle;
import android.os.BaseBundle;
import p.tm2;
import p.a3;
import p.om2;
import p.az5;
import p.xm2;
import org.json.JSONObject;
import java.lang.Boolean;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ke7 implements Runnable	// class@001bfb from classes.dex
{
    public final long a;

    public void ke7(long p0){
       this.a = p0;
    }
    public final void run(){
       f22 uof22;
       xm2 b;
       if (me7.e.a() && ((uof22 = h22.f(sz1.b(), false)) != null && uof22.g != null)) {
          vn ovn = mj7.d(sz1.a());
          a3 uoa3 = null;
          String str = (ovn != null && ovn.a() != null)? ovn.a(): uoa3;
          if (str != null) {
             Bundle uBundle = new Bundle();
             uBundle.putString("advertiser_id", str);
             uBundle.putString("fields", "auto_event_setup_enabled");
             tm2 otm2 = az5.M(uoa3, "app", uoa3);
             otm2.d = uBundle;
             if ((b = otm2.c().b) != null) {
                le7 f = me7.f;
                f.c = Boolean.valueOf(b.optBoolean("auto_event_setup_enabled", false));
                f.d = this.a;
                me7.g(f);
             }
          }
       }
       me7.b.set(false);
       return;
    }
}
