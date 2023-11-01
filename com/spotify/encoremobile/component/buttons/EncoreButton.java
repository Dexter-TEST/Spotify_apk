package com.spotify.encoremobile.component.buttons.EncoreButton;
import com.google.android.material.button.MaterialButton;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.widget.TextView;
import p.ry7;
import android.view.View;
import p.do5;
import android.content.res.TypedArray;
import android.content.res.Resources;
import java.util.ArrayList;
import java.lang.Integer;
import p.dj0;
import android.os.Parcelable;
import p.zl1;
import p.b0;
import p.b24;
import p.jf;

public class EncoreButton extends MaterialButton	// class@000898 from classes.dex
{
    public boolean J;
    public boolean K;

    public void EncoreButton(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0x7f030213);
       ry7.b(this, p1, R.attr.encoreButtonStyle);
       p0 = this.getContext();
       co5.l(p0, "context");
       int i = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, do5.A, R.attr.encoreButtonStyle, i);
       co5.l(typedArray, "context.obtainStyledAttr…efStyleAttr, defStyleRes\)");
       typedArray.recycle();
       this.setIconActive(typedArray.getBoolean(i, i));
       Resources resources = this.getResources();
       co5.l(resources, "resources");
       if (this.getIconSize() <= (int)resources.getDimension(R.dimen.encore_graphic_size_decorative_smaller)) {
          i = true;
       }
       this.setShouldUseSmallGlyph(i);
       return;
    }
    private final void setShouldUseSmallGlyph(boolean p0){
       if (p0 != this.K) {
          this.refreshDrawableState();
       }
       this.K = p0;
       return;
    }
    public final int[] onCreateDrawableState(int p0){
       ArrayList uArrayList = new ArrayList();
       if (this.J != null) {
          uArrayList.add(Integer.valueOf(R.attr.state_icon_active));
       }
       if (this.K != null) {
          uArrayList.add(Integer.valueOf(R.attr.state_small_glyph));
       }
       int[] ointArray = ((uArrayList.isEmpty() ^ 0x01))? View.mergeDrawableStates(super.onCreateDrawableState((uArrayList.size() + p0)), dj0.A0(uArrayList)): super.onCreateDrawableState(p0);
       return ointArray;
    }
    public final void onRestoreInstanceState(Parcelable p0){
       if (p0 instanceof zl1) {
          super.onRestoreInstanceState(p0.a);
          this.setIconActive(p0.c);
       }else {
          super.onRestoreInstanceState(p0);
       }
       return;
    }
    public final Parcelable onSaveInstanceState(){
       zl1 ozl1 = new zl1(super.onSaveInstanceState());
       ozl1.c = this.J;
       return ozl1;
    }
    public final void setIconActive(boolean p0){
       if (p0 != this.J) {
          this.J = p0;
          this.refreshDrawableState();
       }
       return;
    }
    public final void setTextAppearance(Context p0,int p1){
       co5.o(p0, "context");
       super.setTextAppearance(p0, p1);
       ry7.a(this, p1);
    }
}
