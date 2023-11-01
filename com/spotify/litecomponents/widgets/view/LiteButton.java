package com.spotify.litecomponents.widgets.view.LiteButton;
import p.lb0;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.view.View;

public class LiteButton extends StateListAnimatorButton implements lb0	// class@000927 from classes.dex
{
    public boolean w;
    public static final int[] x;

    static {
       int[] ointArray = new int[]{-16842910};
       LiteButton.x = ointArray;
    }
    public void LiteButton(Context p0,int p1){
       super(p0, null, p1);
    }
    public void LiteButton(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public final int[] onCreateDrawableState(int p0){
       p0++;
       int[] ointArray = super.onCreateDrawableState(p0);
       if (this.w != null) {
          int i = 0;
          while (i < ointArray.length) {
             if (ointArray[i] == 0x101009e) {
                ointArray[i] = -16842910;
             }
             i = i + 1;
          }
          View.mergeDrawableStates(ointArray, LiteButton.x);
       }
       return ointArray;
    }
    public void setAppearsDisabled(boolean p0){
       this.w = p0;
       this.refreshDrawableState();
    }
}
