package p.s3;
import android.view.WindowInsets$Type;
import android.app.ApplicationExitInfo;
import android.view.WindowInsets;
import android.graphics.Insets;
import android.net.Uri;
import android.graphics.drawable.Icon;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.View;
import java.lang.CharSequence;
import android.app.ActivityManager;
import java.util.List;
import java.lang.String;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

public abstract class s3	// class@0025b3 from classes.dex
{

    public static int a(){
       return WindowInsets$Type.statusBars();
    }
    public static int b(ApplicationExitInfo p0){
       return p0.getReason();
    }
    public static long c(ApplicationExitInfo p0){
       return p0.getTimestamp();
    }
    public static Insets d(WindowInsets p0,int p1){
       return p0.getInsets(p1);
    }
    public static Icon e(Uri p0){
       return Icon.createWithAdaptiveBitmapContentUri(p0);
    }
    public static WindowInsets f(){
       return WindowInsets.CONSUMED;
    }
    public static AccessibilityNodeInfo$AccessibilityAction g(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_PRESS_AND_HOLD;
    }
    public static CharSequence h(View p0){
       return p0.getStateDescription();
    }
    public static List i(ActivityManager p0){
       return p0.getHistoricalProcessExitReasons(null, 0, 0);
    }
    public static void j(View p0,CharSequence p1){
       p0.setStateDescription(p1);
    }
    public static void k(AccessibilityNodeInfo p0,CharSequence p1){
       p0.setStateDescription(p1);
    }
    public static void l(EditorInfo p0,CharSequence p1){
       p0.setInitialSurroundingSubText(p1, 0);
    }
    public static int m(){
       return WindowInsets$Type.navigationBars();
    }
    public static AccessibilityNodeInfo$AccessibilityAction n(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_IME_ENTER;
    }
    public static int o(){
       return WindowInsets$Type.captionBar();
    }
    public static int p(){
       return WindowInsets$Type.ime();
    }
    public static int q(){
       return WindowInsets$Type.systemGestures();
    }
    public static int r(){
       return WindowInsets$Type.mandatorySystemGestures();
    }
    public static int s(){
       return WindowInsets$Type.tappableElement();
    }
    public static int t(){
       return WindowInsets$Type.displayCutout();
    }
}
