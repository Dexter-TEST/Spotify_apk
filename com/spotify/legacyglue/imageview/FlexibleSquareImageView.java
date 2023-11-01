package com.spotify.legacyglue.imageview.FlexibleSquareImageView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import p.b17;
import android.content.res.TypedArray;
import p.ap5;
import android.view.View$MeasureSpec;
import android.view.View;
import java.lang.Math;

public class FlexibleSquareImageView extends AppCompatImageView	// class@0008ff from classes.dex
{
    public final float t;

    public void FlexibleSquareImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, b17.w, 0, 0);
       ap5.e(typedArray.hasValue(0));
       this.t = typedArray.getFraction(0, 1, 1, 0x3f800000);
       typedArray.recycle();
    }
    public final void onMeasure(int p0,int p1){
       this.setMeasuredDimension((int)Math.max(((float)View$MeasureSpec.getSize(p0) * this.t), (float)this.getSuggestedMinimumWidth()), (int)Math.max(((float)View$MeasureSpec.getSize(p0) * this.t), (float)this.getSuggestedMinimumWidth()));
    }
}
