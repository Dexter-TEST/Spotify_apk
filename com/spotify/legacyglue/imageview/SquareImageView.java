package com.spotify.legacyglue.imageview.SquareImageView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import p.b17;
import android.widget.ImageView;

public class SquareImageView extends AppCompatImageView	// class@000900 from classes.dex
{

    public void SquareImageView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public final void onMeasure(int p0,int p1){
       int i = 0;
       int i1 = (View$MeasureSpec.getSize(p0) && this.getLayoutParams().width != -2)? 0: 1;
       if (!View$MeasureSpec.getSize(p1) || this.getLayoutParams().height == -2) {
          i = 1;
       }
       if (i1) {
          p0 = b17.s(View.getDefaultSize(this.getSuggestedMinimumWidth(), p1));
       }else if(i){
          p1 = b17.s(View.getDefaultSize(this.getSuggestedMinimumHeight(), p0));
       }
       super.onMeasure(p0, p1);
       return;
    }
}
