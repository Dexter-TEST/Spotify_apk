package p.p85;
import p.f6;
import p.lb0;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class p85 extends LinearLayout implements f6, lb0	// class@002211 from classes.dex
{
    public boolean a;
    public boolean b;
    public static final int[] c;
    public static final int[] t;

    static {
       int[] ointArray = new int[]{0x10100a2};
       p85.c = ointArray;
       int[] ointArray1 = new int[]{-16842910};
       p85.t = ointArray1;
    }
    public void p85(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public final int[] onCreateDrawableState(int p0){
       int[] ointArray = super.onCreateDrawableState((p0 + 2));
       if (this.a != null) {
          View.mergeDrawableStates(ointArray, p85.c);
       }
       if (this.b != null) {
          int i = 0;
          while (i < ointArray.length) {
             if (ointArray[i] == 0x101009e) {
                ointArray[i] = -16842910;
             }
             i = i + 1;
          }
          View.mergeDrawableStates(ointArray, p85.t);
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