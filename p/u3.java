package p.u3;
import android.graphics.Insets;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.accessibility.AccessibilityManager;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import android.content.res.AssetFileDescriptor;
import java.lang.String;
import android.os.CancellationSignal;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes$Builder;
import android.widget.TextView;
import android.text.TextDirectionHeuristic;
import android.content.Context;
import javax.net.ssl.SSLSocket;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;
import p.tu5;
import android.app.Notification$Action$Builder;
import android.app.Notification$Builder;
import android.app.Notification$BubbleMetadata;
import android.content.res.Resources$Theme;
import android.widget.AutoCompleteTextView;
import android.widget.PopupWindow;
import android.graphics.Rect;
import javax.net.ssl.SSLParameters;
import android.net.ssl.SSLSockets;

public abstract class u3	// class@002839 from classes.dex
{

    public static int A(Insets p0){
       return p0.right;
    }
    public static AccessibilityNodeInfo$AccessibilityAction B(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_LEFT;
    }
    public static int C(Insets p0){
       return p0.bottom;
    }
    public static AccessibilityNodeInfo$AccessibilityAction D(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_RIGHT;
    }
    public static int a(Insets p0){
       return p0.left;
    }
    public static int b(AccessibilityManager p0,int p1,int p2){
       return p0.getRecommendedTimeoutMillis(p1, p2);
    }
    public static AssetFileDescriptor c(ContentResolver p0,Uri p1,Bundle p2){
       return p0.openTypedAssetFile(p1, "image/*", p2, null);
    }
    public static Insets d(int p0,int p1,int p2,int p3){
       return Insets.of(p0, p1, p2, p3);
    }
    public static Insets e(Drawable p0){
       return p0.getOpticalInsets();
    }
    public static AudioAttributes$Builder f(AudioAttributes$Builder p0){
       return p0.setAllowedCapturePolicy(2);
    }
    public static TextDirectionHeuristic g(TextView p0){
       return p0.getTextDirectionHeuristic();
    }
    public static AccessibilityNodeInfo$AccessibilityAction h(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_UP;
    }
    public static String i(Context p0){
       return p0.getOpPackageName();
    }
    public static String j(SSLSocket p0){
       return p0.getApplicationProtocol();
    }
    public static void k(Activity p0,Application$ActivityLifecycleCallbacks p1){
       p0.registerActivityLifecycleCallbacks(p1);
    }
    public static void l(Activity p0,tu5 p1){
       p0.registerActivityLifecycleCallbacks(p1);
    }
    public static void m(Notification$Action$Builder p0,boolean p1){
       p0.setContextual(p1);
    }
    public static void n(Notification$Builder p0){
       p0.setBubbleMetadata(null);
    }
    public static void o(Notification$Builder p0,boolean p1){
       p0.setAllowSystemGeneratedContextualActions(p1);
    }
    public static void p(Resources$Theme p0){
       p0.rebase();
    }
    public static void q(AutoCompleteTextView p0){
       p0.refreshAutoCompleteResults();
    }
    public static void r(PopupWindow p0,Rect p1){
       p0.setEpicenterBounds(p1);
    }
    public static void s(PopupWindow p0,boolean p1){
       p0.setIsClippedToScreen(p1);
    }
    public static void t(SSLParameters p0,String[] p1){
       p0.setApplicationProtocols(p1);
    }
    public static void u(SSLSocket p0){
       SSLSockets.setUseSessionTickets(p0, true);
    }
    public static boolean v(TextView p0){
       return p0.isHorizontallyScrollable();
    }
    public static boolean w(SSLSocket p0){
       return SSLSockets.isSupportedSocket(p0);
    }
    public static int x(Insets p0){
       return p0.top;
    }
    public static AccessibilityNodeInfo$AccessibilityAction y(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_DOWN;
    }
    public static void z(PopupWindow p0,boolean p1){
       p0.setTouchModal(p1);
    }
}
