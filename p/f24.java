package p.f24;
import p.n3;
import java.lang.Object;
import android.view.View;
import p.y3;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View$AccessibilityDelegate;
import p.k24;
import java.lang.String;
import androidx.fragment.app.Fragment;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;

public final class f24 extends n3	// class@001545 from classes.dex
{
    public final int d;
    public final Object e;

    public void f24(int p0,Object p1){
       this.d = p0;
       this.e = p1;
       super();
    }
    public final void d(View p0,y3 p1){
       AccessibilityNodeInfo$CollectionInfo uCollectionI = null;
       y3 a = p1.a;
       n3 ta = this.a;
       switch (this.d){
           case 0:
           case 1:
             ta.onInitializeAccessibilityNodeInfo(p0, a);
             f24 te = this.e;
             String str = (!te.A.getVisibility())? te.getString(R.string.mtrl_picker_toggle_to_year_selection): te.getString(R.string.mtrl_picker_toggle_to_day_selection);
             p1.h(str);
             return;
             break;
           default:
             ta.onInitializeAccessibilityNodeInfo(p0, a);
             a.setCollectionInfo(uCollectionI);
             return;
       }
       ta.onInitializeAccessibilityNodeInfo(p0, a);
       a.setCollectionInfo(uCollectionI);
       return;
    }
}
