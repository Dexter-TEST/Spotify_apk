package com.spotify.litesettings.settings.InAppMessagingDebugActivity;
import androidx.appcompat.app.a;
import p.fn0;
import android.os.Bundle;
import android.app.Activity;
import p.eo5;
import androidx.fragment.app.k;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import p.co3;
import p.tn6;
import io.reactivex.rxjava3.core.Observable;
import p.ko1;
import p.c83;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;

public class InAppMessagingDebugActivity extends a	// class@000963 from classes.dex
{
    public w12 Q;
    public final fn0 R;
    public static final int S;

    public void InAppMessagingDebugActivity(){
       super();
       this.R = new fn0();
    }
    public final void onCreate(Bundle p0){
       eo5.q(this);
       super.onCreate(p0);
       this.setContentView(R.layout.activity_in_app_messaging_debug);
       InAppMessagingDebugActivity tQ = this.Q;
       tQ = this.R;
       tQ.c(tQ.d.r(tQ.i).subscribe(new c83(this, this.findViewById(R.id.dev_enabled_switch), 0)));
       InAppMessagingDebugActivity tQ1 = this.Q;
       tQ.c(tQ1.e.r(tQ1.i).subscribe(new c83(this, this.findViewById(R.id.preview_enabled_switch), 1)));
    }
    public final void onDestroy(){
       super.onDestroy();
       this.R.e();
    }
}
