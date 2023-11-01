package p.m3;
import android.view.View$AccessibilityDelegate;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import android.os.Bundle;

public abstract class m3	// class@001e1d from classes.dex
{

    public static AccessibilityNodeProvider a(View$AccessibilityDelegate p0,View p1){
       return p0.getAccessibilityNodeProvider(p1);
    }
    public static boolean b(View$AccessibilityDelegate p0,View p1,int p2,Bundle p3){
       return p0.performAccessibilityAction(p1, p2, p3);
    }
}
