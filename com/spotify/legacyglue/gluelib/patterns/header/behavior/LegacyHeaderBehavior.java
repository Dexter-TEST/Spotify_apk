package com.spotify.legacyglue.gluelib.patterns.header.behavior.LegacyHeaderBehavior;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.HeaderBehavior;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.Object;
import p.tp2;
import com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;
import p.o67;
import java.lang.Math;

public class LegacyHeaderBehavior extends HeaderBehavior	// class@0008f8 from classes.dex
{
    public float m;

    public void LegacyHeaderBehavior(){
       super();
       this.m = 0xbf800000;
    }
    public void LegacyHeaderBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       this.m = 0xbf800000;
    }
    public final void C(View p0,CoordinatorLayout p1){
       tp2.v(p0);
       if (p1.T != null) {
       }else {
          super.C(null, p1);
       }
       return;
    }
    public final void F(CoordinatorLayout p0,float p1){
       if (p0.getToolbarUpdater() == null) {
          return;
       }
       float f = Math.max(0, ((p1 * 4.00f) - 0x3f800000)) / 3.00f;
       if ((Math.abs((this.m - f)) - 0x3c23d70a) < 0) {
          return;
       }
       this.m = f;
       throw null;
    }
    public final boolean h(CoordinatorLayout p0,View p1,int p2){
       tp2.t(p1);
       throw false;
    }
    public final boolean i(CoordinatorLayout p0,View p1,int p2,int p3,int p4){
       tp2.t(p1);
       throw false;
    }
    public final boolean z(View p0,CoordinatorLayout p1){
       tp2.v(p0);
       boolean b = (p1.T == null && super.z(null, p1))? true: false;
       return b;
    }
}
