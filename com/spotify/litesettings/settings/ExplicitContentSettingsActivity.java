package com.spotify.litesettings.settings.ExplicitContentSettingsActivity;
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
import java.lang.StringBuilder;
import android.view.accessibility.AccessibilityManager;
import android.text.SpannableStringBuilder;
import p.yq5;
import p.kz6;
import p.ry7;
import p.mg1;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import p.p54;
import io.reactivex.rxjava3.core.Completable;

public class ExplicitContentSettingsActivity extends a implements w53	// class@000962 from classes.dex
{
    public al5 Q;
    public rf5 R;
    public dl5 S;
    public final fn0 T;
    public static final int U;

    public void ExplicitContentSettingsActivity(){
       super();
       this.T = new fn0();
    }
    public final vk7 b(){
       return wk7.L;
    }
    public final v55 h(){
       return x55.Z;
    }
    public final void onCreate(Bundle p0){
       AccessibilityManager systemServic;
       eo5.q(this);
       super.onCreate(p0);
       this.setContentView(R.layout.activity_explicit_content_settings);
       GlueToolbarLayout glueToolbarL = this.findViewById(R.id.toolbar);
       GlueToolbar glueToolbar = GlueToolbars.createGlueToolbar(glueToolbarL);
       glueToolbar.setTitle(this.getTitle());
       boolean b = false;
       ImageView imageView = this.getLayoutInflater().inflate(R.layout.up_button, glueToolbarL, b);
       glueToolbar.addView(ToolbarSide.START, imageView, R.id.action_close);
       RecyclerView recyclerView = this.findViewById(R.id.recycler_view);
       ci4 uoci4 = new ci4(3, this);
       qx1 oqx1 = new qx1(this, b, recyclerView);
       String str = this.getString(R.string.settings_explicit_content_switch_title);
       Object[] objArray = new Object[]{"<EXPLICIT>"};
       StringBuilder str1 = this.getString(R.string.settings_explicit_content_switch_description)+10+this.getString(R.string.settings_explicit_content_tag_description, objArray);
       int i = str1.indexOf("<EXPLICIT>");
       CharSequence uCharSequenc = str1.subSequence((i + 10), str1.length());
       str1.setLength(b);
       str1 = str1+str1.subSequence(b, i)+uCharSequenc;
       if ((systemServic = this.getSystemService("accessibility")) != null && systemServic.isTouchExplorationEnabled()) {
          b = true;
       }
       String str2 = (b)? "EXPLICIT": "E";
       recyclerView.setAdapter(new xk6(uoci4, oqx1, str, eo5.c(this, str1, str2, i, 2)));
       ExplicitContentSettingsActivity tT = this.T;
       tT.c(ry7.e(imageView).subscribe(new mg1(5, this)));
       tT.c(this.R.h().ignoreElements().subscribe());
       return;
    }
    public final void onDestroy(){
       super.onDestroy();
       this.T.dispose();
    }
}
