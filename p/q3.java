package p.q3;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.DisplayCutout;
import android.graphics.drawable.Icon;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Looper;
import android.os.Handler;
import android.app.Activity;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import java.lang.String;
import android.app.Application;
import android.media.AudioDeviceInfo;
import java.util.List;
import android.app.Notification$Action$Builder;
import java.lang.CharSequence;
import android.content.pm.PackageManager;
import android.content.pm.SigningInfo;
import android.content.pm.Signature;

public abstract class q3	// class@002328 from classes.dex
{

    public static void A(AccessibilityNodeInfo p0,boolean p1){
       p0.setHeading(p1);
    }
    public static int B(DisplayCutout p0){
       return p0.getSafeInsetLeft();
    }
    public static int C(DisplayCutout p0){
       return p0.getSafeInsetTop();
    }
    public static int D(DisplayCutout p0){
       return p0.getSafeInsetRight();
    }
    public static int a(Icon p0){
       return p0.getResId();
    }
    public static int b(MediaSessionManager$RemoteUserInfo p0){
       return p0.getPid();
    }
    public static int c(DisplayCutout p0){
       return p0.hashCode();
    }
    public static long d(PackageInfo p0){
       return p0.getLongVersionCode();
    }
    public static Typeface e(Typeface p0,int p1,boolean p2){
       return Typeface.create(p0, p1, p2);
    }
    public static MediaSessionManager$RemoteUserInfo f(MediaSession p0){
       return p0.getCurrentControllerInfo();
    }
    public static Uri g(Icon p0){
       return p0.getUri();
    }
    public static Handler h(Looper p0){
       return Handler.createAsync(p0);
    }
    public static View i(Activity p0,int p1){
       return p0.requireViewById(p1);
    }
    public static AccessibilityNodeInfo$AccessibilityAction j(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_TOOLTIP;
    }
    public static String k(){
       return Application.getProcessName();
    }
    public static String l(Icon p0){
       return p0.getResPackage();
    }
    public static String m(AudioDeviceInfo p0){
       return p0.getAddress();
    }
    public static String n(MediaSessionManager$RemoteUserInfo p0){
       return p0.getPackageName();
    }
    public static List o(DisplayCutout p0){
       return p0.getBoundingRects();
    }
    public static void p(Notification$Action$Builder p0,int p1){
       p0.setSemanticAction(p1);
    }
    public static void q(View p0){
       p0.setAccessibilityHeading(true);
    }
    public static void r(AccessibilityNodeInfo p0,CharSequence p1){
       p0.setPaneTitle(p1);
    }
    public static void s(AccessibilityNodeInfo p0,boolean p1){
       p0.setScreenReaderFocusable(p1);
    }
    public static boolean t(PackageManager p0,String p1,byte[] p2,int p3){
       return p0.hasSigningCertificate(p1, p2, p3);
    }
    public static boolean u(SigningInfo p0){
       return p0.hasMultipleSigners();
    }
    public static Signature[] v(SigningInfo p0){
       return p0.getApkContentsSigners();
    }
    public static int w(Icon p0){
       return p0.getType();
    }
    public static int x(MediaSessionManager$RemoteUserInfo p0){
       return p0.getUid();
    }
    public static int y(DisplayCutout p0){
       return p0.getSafeInsetBottom();
    }
    public static AccessibilityNodeInfo$AccessibilityAction z(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_HIDE_TOOLTIP;
    }
}
