package p.w;
import android.view.View$OnClickListener;
import com.spotify.lite.about.AboutActivity;
import p.yz7;
import p.wj;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import p.g28;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.a;
import java.lang.String;
import java.lang.Throwable;
import p.jl;

public final class w implements View$OnClickListener	// class@002af5 from classes.dex
{
    public final AboutActivity a;
    public final yz7 b;
    public final wj c;

    public void w(AboutActivity p0,yz7 p1,wj p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onClick(View p0){
       w tc;
       w tb = this.b;
       w ta = this.a;
       ta.getClass();
       try{
          int i = 1;
          tb.getClass();
          g28 og28 = g28.a();
          if ((tc = this.c) != null) {
             boolean b = true;
             int i1 = (tc.a(og28) != null)? 1: 0;
             if (i1 && tc.h == null) {
                tc.h = b;
                ta.startIntentSenderForResult(tc.a(og28).getIntentSender(), i, null, 0, 0, 0, null);
             }
          }
       }catch(android.content.IntentSender$SendIntentException e10){
          jl.f("Failed to request an update", e10);
       }
       return;
    }
}
