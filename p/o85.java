package p.o85;
import p.f6;
import p.lb0;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public final class o85 extends FrameLayout implements f6, lb0	// class@0020ce from classes.dex
{
    public boolean a;
    public boolean b;
    public static final int[] c;
    public static final int[] t;

    static {
       int[] ointArray = new int[]{0x10100a2};
       o85.c = ointArray;
       int[] ointArray1 = new int[]{-16842910};
       o85.t = ointArray1;
    }
    public void o85(Context p0){
       super(p0, null, 0);
    }
    public void o85(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public final int[] onCreateDrawableState(int p0){
       int[] ointArray = super.onCreateDrawableState((p0 + 2));
       if (this.a != null) {
          View.mergeDrawableStates(ointArray, o85.c);
       }
       if (this.b != null) {
          int i = 0;
          while (i < ointArray.length) {
             if (ointArray[i] == 0x101009e) {
                ointArray[i] = -16842910;
             }
             i = i + 1;
          }
          View.mergeDrawableStates(ointArray, o85.t);
       }
       return ointArray;
    }
    public void setActive(boolean p0){
       this.a = p0;
       this.refreshDrawableState();
    }
    public void setAppearsDisabled(boolean p0){
       this.b = p0;
       this.refreshDrawableState();
    }
}
