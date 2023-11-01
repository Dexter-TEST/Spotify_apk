package p.z3;
import android.view.accessibility.AccessibilityNodeProvider;
import p.u44;
import android.view.accessibility.AccessibilityNodeInfo;
import p.y3;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import java.lang.Object;
import android.os.Bundle;

public abstract class z3 extends AccessibilityNodeProvider	// class@002e81 from classes.dex
{
    public final u44 a;

    public void z3(u44 p0){
       super();
       this.a = p0;
    }
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int p0){
       y3 oy3;
       if ((oy3 = this.a.v(p0)) == null) {
          return null;
       }
       return oy3.a;
    }
    public final List findAccessibilityNodeInfosByText(String p0,int p1){
       this.a.getClass();
       return null;
    }
    public final boolean performAction(int p0,int p1,Bundle p2){
       return this.a.D(p0, p1, p2);
    }
}
