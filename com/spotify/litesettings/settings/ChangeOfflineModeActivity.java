package com.spotify.litesettings.settings.ChangeOfflineModeActivity;
import p.w53;
import p.yd0;
import androidx.appcompat.app.a;
import p.fn0;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;
import android.os.Bundle;
import androidx.fragment.app.k;
import android.app.Activity;
import android.view.View;
import p.n6;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import java.lang.CharSequence;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import p.kz6;
import p.ry7;
import p.mg1;
import java.lang.Object;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;

public class ChangeOfflineModeActivity extends a implements w53, yd0	// class@000960 from classes.dex
{
    public final fn0 Q;
    public static final int R;

    public void ChangeOfflineModeActivity(){
       super();
       this.Q = new fn0();
    }
    public final vk7 b(){
       return wk7.N;
    }
    public final v55 h(){
       return x55.b0;
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.setContentView(R.layout.activity_offline_mode);
       GlueToolbarLayout glueToolbarL = n6.f(this, R.id.toolbar);
       GlueToolbar glueToolbar = GlueToolbars.createGlueToolbar(glueToolbarL);
       glueToolbar.setTitle(this.getTitle());
       View view = this.getLayoutInflater().inflate(R.layout.up_button, glueToolbarL, false);
       glueToolbar.addView(ToolbarSide.START, view, R.id.action_close);
       this.Q.c(ry7.e(view).subscribe(new mg1(4, this)));
    }
    public final void onDestroy(){
       super.onDestroy();
       this.Q.e();
    }
}
