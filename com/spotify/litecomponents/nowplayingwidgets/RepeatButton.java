package com.spotify.litecomponents.nowplayingwidgets.RepeatButton;
import p.ld1;
import android.content.Context;
import android.util.AttributeSet;
import p.sp6;
import android.graphics.drawable.Drawable;
import java.lang.UnsupportedOperationException;
import android.view.View;

public class RepeatButton extends ld1	// class@000923 from classes.dex
{
    public int w;

    public void RepeatButton(Context p0,AttributeSet p1){
       super(sp6.d0, p0, p1);
       this.w = -1;
    }
    public void setImageDrawable(Drawable p0){
       throw new UnsupportedOperationException();
    }
    public void setRepeatMode(int p0){
       if (this.w != p0) {
          if (p0) {
             if (p0 != 1) {
                if (p0 != 2 && p0 != 3) {
                   return;
                }else {
                   this.a(sp6.d0, 1);
                }
             }else {
                this.a(sp6.e0, 1);
             }
          }else {
             this.a(sp6.d0, false);
          }
          this.w = p0;
          this.invalidate();
       }
       return;
    }
}
