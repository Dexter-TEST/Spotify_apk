package p.ip6;
import p.ao2;
import p.ck3;
import p.px3;
import p.sc;
import java.lang.String;
import p.co5;
import android.os.Bundle;
import android.app.Activity;
import p.eo5;
import java.lang.ClassLoader;
import android.content.Context;
import android.view.KeyEvent;
import java.lang.Object;
import android.content.Intent;
import androidx.activity.a;

public abstract class ip6 extends ck3 implements ao2	// class@0019de from classes.dex
{

    public void ip6(){
       super();
       px3 opx3 = new px3();
    }
    public final sc d(){
       co5.N("androidInjector");
       throw null;
    }
    public void onCreate(Bundle p0){
       eo5.q(this);
       super.onCreate(p0);
       if (p0 != null) {
          p0.setClassLoader(this.getClassLoader());
       }
       this.setVolumeControlStream(3);
       return;
    }
    public final boolean onKeyDown(int p0,KeyEvent p1){
       co5.o(p1, "event");
       co5.N("spotifyDaggerActivityPluginPoint");
       throw false;
    }
    public final void onNewIntent(Intent p0){
       super.onNewIntent(p0);
       if (p0 != null) {
          p0.setExtrasClassLoader(this.getClassLoader());
       }
       return;
    }
    public final void onResume(){
       super.onResume();
       co5.N("appLifecycleServiceAdapter");
       throw null;
    }
}
