package com.spotify.legacyglue.viewgroup.HeaderListItemImageView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.view.View;
import java.lang.Math;
import android.view.View$MeasureSpec;
import android.graphics.Bitmap;
import android.net.Uri;
import java.lang.Object;

public final class HeaderListItemImageView extends AppCompatImageView	// class@000906 from classes.dex
{

    public void HeaderListItemImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       int i = 0;
       int i1 = (this.getDrawable() != null)? 1: 0;
       if (!i1) {
          i = 8;
       }
       this.setVisibility(i);
       return;
    }
    public final void onMeasure(int p0,int p1){
       p0 = Math.min(View.getDefaultSize(this.getSuggestedMinimumWidth(), p0), View.getDefaultSize(this.getSuggestedMinimumHeight(), p1));
       int i = View$MeasureSpec.makeMeasureSpec(p0, 0x40000000);
       super.onMeasure(i, View$MeasureSpec.makeMeasureSpec(p0, 0x40000000));
    }
    public void setImageBitmap(Bitmap p0){
       int i = 0;
       int i1 = (p0 != null)? 1: 0;
       if (!i1) {
          i = 8;
       }
       this.setVisibility(i);
       super.setImageBitmap(p0);
       return;
    }
    public void setImageDrawable(Drawable p0){
       int i = 0;
       int i1 = (p0 != null)? 1: 0;
       if (!i1) {
          i = 8;
       }
       this.setVisibility(i);
       super.setImageDrawable(p0);
       return;
    }
    public void setImageResource(int p0){
       int i = 0;
       int i1 = (p0)? 1: 0;
       if (!i1) {
          i = 8;
       }
       this.setVisibility(i);
       super.setImageResource(p0);
       return;
    }
    public void setImageURI(Uri p0){
       int i = 0;
       int i1 = (p0 != null && !p0.equals(Uri.EMPTY))? 1: 0;
       if (!i1) {
          i = 8;
       }
       this.setVisibility(i);
       super.setImageURI(p0);
       return;
    }
}
