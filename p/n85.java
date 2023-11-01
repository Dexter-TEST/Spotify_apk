package p.n85;
import p.f6;
import p.lb0;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;

public final class n85 extends ConstraintLayout implements f6, lb0	// class@001f8a from classes.dex
{
    public boolean H;
    public boolean I;
    public static final int[] J;
    public static final int[] K;

    static {
       int[] ointArray = new int[]{0x10100a2};
       n85.J = ointArray;
       int[] ointArray1 = new int[]{-16842910};
       n85.K = ointArray1;
    }
    public void n85(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public final int[] onCreateDrawableState(int p0){
       int[] ointArray = super.onCreateDrawableState((p0 + 2));
       if (this.H != null) {
          View.mergeDrawableStates(ointArray, n85.J);
       }
       if (this.I != null) {
          int i = 0;
          while (i < ointArray.length) {
             if (ointArray[i] == 0x101009e) {
                ointArray[i] = -16842910;
             }
             i = i + 1;
          }
          View.mergeDrawableStates(ointArray, n85.K);
       }
       return ointArray;
    }
    public void setActive(boolean p0){
       this.H = p0;
       this.refreshDrawableState();
    }
    public void setAppearsDisabled(boolean p0){
       this.I = p0;
       this.refreshDrawableState();
    }
}
