package com.spotify.litesettings.settings.OfflineSettingsActivity;
import p.w53;
import androidx.appcompat.app.a;
import p.fn0;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;
import android.os.Bundle;
import android.app.Activity;
import p.eo5;
import androidx.fragment.app.k;
import android.view.View;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import java.lang.CharSequence;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import androidx.recyclerview.widget.RecyclerView;
import p.xk6;
import p.ci4;
import java.lang.Object;
import p.qx1;
import java.lang.String;
import android.content.Context;
import p.yq5;
import p.kz6;
import p.ry7;
import p.mg1;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import p.ew0;

public class OfflineSettingsActivity extends a implements w53	// class@000964 from classes.dex
{
    public we6 Q;
    public ew0 R;
    public final fn0 S;
    public static final int T;

    public void OfflineSettingsActivity(){
       super();
       this.S = new fn0();
    }
    public final vk7 b(){
       return wk7.M;
    }
    public final v55 h(){
       return x55.a0;
    }
    public final void onCreate(Bundle p0){
       eo5.q(this);
       super.onCreate(p0);
       this.setContentView(R.layout.activity_offline_settings);
       GlueToolbarLayout glueToolbarL = this.findViewById(R.id.toolbar);
       GlueToolbar glueToolbar = GlueToolbars.createGlueToolbar(glueToolbarL);
       glueToolbar.setTitle(this.getTitle());
       ImageView imageView = this.getLayoutInflater().inflate(R.layout.up_button, glueToolbarL, false);
       glueToolbar.addView(ToolbarSide.START, imageView, R.id.action_close);
       RecyclerView recyclerView = this.findViewById(R.id.recycler_view);
       recyclerView.setAdapter(new xk6(new ci4(4, this), new qx1(this, 1, recyclerView), this.getString(R.string.settings_offline_cellular_switch_title), this.getString(R.string.settings_offline_cellular_switch_description)));
       OfflineSettingsActivity tS = this.S;
       tS.c(ry7.e(imageView).subscribe(new mg1(6, this)));
       tS.c(this.R.c().subscribe());
    }
    public final void onDestroy(){
       super.onDestroy();
       this.S.dispose();
    }
}
