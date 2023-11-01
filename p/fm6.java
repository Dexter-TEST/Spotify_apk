package p.fm6;
import p.n25;
import p.f25;
import p.hm6;
import java.lang.Object;
import java.lang.Exception;
import java.lang.String;
import p.co5;
import p.uv5;
import p.p01;
import p.im6;
import p.an5;
import p.ve;
import com.google.android.gms.common.api.Status;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p.jl;
import p.kb3;
import android.content.IntentSender;
import android.app.PendingIntent;
import p.lb3;
import p.h7;
import com.spotify.base.java.logging.Logger;
import p.ab3;
import p.k01;
import p.cv7;
import com.google.android.gms.auth.api.credentials.Credential;

public final class fm6 implements n25, f25	// class@0015f8 from classes.dex
{
    public final hm6 a;
    public final int b;

    public void fm6(hm6 p0){
       this.a = p0;
       this.b = 2;
       super();
    }
    public void c(Exception p0){
       hm6 c;
       Status b;
       co5.o(p0, "exception");
       p01 a = p01.a;
       fm6 ta = this.a;
       if (!p0 instanceof uv5) {
          if ((c = ta.c) != null) {
             c.a();
          }
          ta.e.onNext(a);
          return;
       }else if(this.b == 1){
          ta.e.onNext(a);
          return;
       }else {
          ve a1 = p0.a;
          if ((b = a1.b) != 4) {
             if (b != 6) {
                jl.q("Unhandled smartlock resolution: "+a1.b, p0);
                if ((c = ta.c) != null) {
                   c.a();
                }
                ta.e.onNext(a);
             }else {
                try{
                   IntentSender intentSender = p0.a.t.getIntentSender();
                   co5.l(intentSender, "exception.resolution.intentSender");
                   ta.i.a(new kb3(intentSender).d());
                }catch(android.content.IntentSender$SendIntentException e6){
                   jl.q("Failed to start smartlock request credentials resolution", e6);
                   if ((c = ta.c) != null) {
                      c.a();
                   }
                   ta.e.onNext(a);
                }catch(java.lang.IllegalStateException e6){
                   Object[] objArray = new Object[0];
                   Logger.c(e6, "Activity for result is no longer registered", objArray);
                   if ((c = ta.c) != null) {
                      c.a();
                   }
                   ta.e.onNext(a);
                }
             }
          }else if((c = ta.c) != null){
             c.a.d("load", "sign_in_required");
          }
          ta.e.onNext(a);
          return;
       }
    }
    public void onSuccess(Object p0){
       this.a.b(p0.a.b, this.b);
    }
}
