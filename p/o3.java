package p.o3;
import android.view.accessibility.AccessibilityEvent;

public abstract class o3	// class@0020a4 from classes.dex
{

    public static int a(AccessibilityEvent p0){
       return p0.getContentChangeTypes();
    }
    public static void b(AccessibilityEvent p0,int p1){
       p0.setContentChangeTypes(p1);
    }
}
