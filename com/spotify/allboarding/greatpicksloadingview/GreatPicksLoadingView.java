package com.spotify.allboarding.greatpicksloadingview.GreatPicksLoadingView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.view.View;
import p.wh7;
import com.spotify.encoreconsumermobile.elements.loadingdots.ThreeDotsLoaderView;
import com.spotify.allboarding.uiusecases.contentstack.ContentStackView;
import com.spotify.encoremobile.facepile.FacePileView;
import android.widget.TextView;

public final class GreatPicksLoadingView extends ConstraintLayout	// class@000514 from classes.dex
{
    public final ThreeDotsLoaderView H;
    public final ContentStackView I;
    public final FacePileView J;
    public final TextView K;
    public final TextView L;
    public final AnimatorSet M;

    public void GreatPicksLoadingView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       this.M = new AnimatorSet();
       View.inflate(p0, R.layout.great_picks_loading_view, this);
       View view = wh7.m(this, R.id.dot_animation);
       co5.l(view, "requireViewById\(this, R.id.dot_animation\)");
       this.H = view;
       view = wh7.m(this, R.id.content_stack_view);
       co5.l(view, "requireViewById\(this, R.id.content_stack_view\)");
       this.I = view;
       view = wh7.m(this, R.id.great_picks_facepile);
       co5.l(view, "requireViewById\(this, R.id.great_picks_facepile\)");
       this.J = view;
       view = wh7.m(this, R.id.placeholder_text);
       co5.l(view, "requireViewById<TextView…s, R.id.placeholder_text\)");
       this.K = view;
       view = wh7.m(this, R.id.remote_loading_text);
       co5.l(view, "requireViewById<TextView…R.id.remote_loading_text\)");
       this.L = view;
    }
    public final void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.M.cancel();
    }
}
