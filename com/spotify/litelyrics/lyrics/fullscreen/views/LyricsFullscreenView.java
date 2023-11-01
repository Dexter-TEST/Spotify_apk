package com.spotify.litelyrics.lyrics.fullscreen.views.LyricsFullscreenView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.view.View;
import android.view.ViewGroup;
import p.dx3;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.animation.ArgbEvaluator;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import android.animation.TypeEvaluator;
import android.animation.ObjectAnimator;
import android.animation.Animator;

public class LyricsFullscreenView extends ConstraintLayout	// class@00093a from classes.dex
{
    public dx3 H;
    public ObjectAnimator I;
    public int J;

    public void LyricsFullscreenView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       this.J = 0xff000000;
    }
    public final WindowInsets onApplyWindowInsets(WindowInsets p0){
       this.setPadding(p0.getSystemWindowInsetLeft(), 0, p0.getSystemWindowInsetRight(), p0.getSystemWindowInsetBottom());
       return p0.consumeSystemWindowInsets();
    }
    public final void onFinishInflate(){
       super.onFinishInflate();
       dx3 uodx3 = this.findViewById(R.id.lyrics_view);
       this.H = uodx3;
       uodx3.setVerticalFadingEdgeEnabled(true);
       uodx3.setFadingEdgeLength(150);
       this.H.setKeepScreenOn(true);
    }
    public final void p(int p0){
       LyricsFullscreenView tI;
       Drawable background = this.getBackground();
       LyricsFullscreenView tJ = this.J;
       if (background instanceof ColorDrawable) {
          tJ = background.getColor();
       }
       Object[] objArray = new Object[]{Integer.valueOf(tJ),Integer.valueOf(p0)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofObject(this, "backgroundColor", new ArgbEvaluator(), objArray);
       this.J = p0;
       if ((tI = this.I) != null) {
          tI.cancel();
       }
       objectAnimat.setDuration(1000);
       objectAnimat.start();
       this.I = objectAnimat;
       return;
    }
}
