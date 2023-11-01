package com.spotify.legacyglue.textview.CheckableTextView;
import android.widget.Checkable;
import com.google.android.material.textview.MaterialTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import p.bc2;
import android.view.View;

public class CheckableTextView extends MaterialTextView implements Checkable	// class@000904 from classes.dex
{
    public boolean y;
    public static final int[] z;

    static {
       int[] ointArray = new int[]{0x10100a0};
       CheckableTextView.z = ointArray;
    }
    public void CheckableTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       bc2.a(this, p0);
    }
    public final boolean isChecked(){
       return this.y;
    }
    public final int[] onCreateDrawableState(int p0){
       p0++;
       int[] ointArray = super.onCreateDrawableState(p0);
       if (this.isChecked()) {
          View.mergeDrawableStates(ointArray, CheckableTextView.z);
       }
       return ointArray;
    }
    public void setChecked(boolean p0){
       this.y = p0;
       this.refreshDrawableState();
    }
    public final void toggle(){
       this.setChecked((this.y ^ 0x01));
    }
}
