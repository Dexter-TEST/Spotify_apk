package p.c4;
import android.view.accessibility.AccessibilityRecord;

public abstract class c4	// class@001198 from classes.dex
{

    public static int a(AccessibilityRecord p0){
       return p0.getMaxScrollX();
    }
    public static int b(AccessibilityRecord p0){
       return p0.getMaxScrollY();
    }
    public static void c(AccessibilityRecord p0,int p1){
       p0.setMaxScrollX(p1);
    }
    public static void d(AccessibilityRecord p0,int p1){
       p0.setMaxScrollY(p1);
    }
}
