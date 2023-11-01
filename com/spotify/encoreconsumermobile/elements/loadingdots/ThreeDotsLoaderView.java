package com.spotify.encoreconsumermobile.elements.loadingdots.ThreeDotsLoaderView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.o26;
import p.ay6;
import p.wf2;
import java.lang.CharSequence;
import android.view.View;
import p.bw3;
import android.graphics.drawable.Drawable;

public final class ThreeDotsLoaderView extends AppCompatImageView	// class@000895 from classes.dex
{
    public final ay6 t;

    public void ThreeDotsLoaderView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       this.t = new ay6(new o26(11, this));
       this.setContentDescription(p0.getString(R.string.dot_animation_loading_content_description));
       this.setImageDrawable(this.getDotAnimation());
       this.getDotAnimation().c();
    }
    private final bw3 getDotAnimation(){
       return this.t.getValue();
    }
}
