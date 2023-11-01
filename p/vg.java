package p.vg;
import android.widget.PopupWindow;
import android.content.Context;
import android.util.AttributeSet;
import p.ej4;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import p.eb3;
import android.view.View;

public final class vg extends PopupWindow	// class@0029f1 from classes.dex
{

    public void vg(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, ej4.V, p2, p3);
       p2 = 2;
       if (typedArray.hasValue(p2)) {
          ej4.M0(this, typedArray.getBoolean(p2, false));
       }
       Drawable uDrawable = (typedArray.hasValue(false) && (p2 = typedArray.getResourceId(false, false)))? eb3.m(p0, p2): typedArray.getDrawable(false);
       this.setBackgroundDrawable(uDrawable);
       typedArray.recycle();
       return;
    }
    public final void showAsDropDown(View p0,int p1,int p2){
       super.showAsDropDown(p0, p1, p2);
    }
    public final void showAsDropDown(View p0,int p1,int p2,int p3){
       super.showAsDropDown(p0, p1, p2, p3);
    }
    public final void update(View p0,int p1,int p2,int p3,int p4){
       super.update(p0, p1, p2, p3, p4);
    }
}
