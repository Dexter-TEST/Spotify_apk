package p.t3;
import android.graphics.drawable.LayerDrawable;
import android.security.NetworkSecurityPolicy;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.app.Activity;
import java.lang.String;
import android.app.SharedElementCallback$OnSharedElementsReadyListener;

public abstract class t3	// class@0026f5 from classes.dex
{

    public static int A(LayerDrawable p0,int p1){
       return p0.getLayerInsetStart(p1);
    }
    public static void B(LayerDrawable p0,int p1,int p2){
       p0.setLayerInsetEnd(p1, p2);
    }
    public static int C(LayerDrawable p0,int p1){
       return p0.getLayerInsetEnd(p1);
    }
    public static void D(LayerDrawable p0,int p1,int p2){
       p0.setLayerGravity(p1, p2);
    }
    public static int a(LayerDrawable p0,int p1){
       return p0.getLayerGravity(p1);
    }
    public static NetworkSecurityPolicy b(){
       return NetworkSecurityPolicy.getInstance();
    }
    public static AccessibilityNodeInfo$AccessibilityAction c(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_ON_SCREEN;
    }
    public static void d(Activity p0,String[] p1,int p2){
       p0.requestPermissions(p1, p2);
    }
    public static void e(SharedElementCallback$OnSharedElementsReadyListener p0){
       p0.onSharedElementsReady();
    }
    public static void f(LayerDrawable p0,int p1,int p2){
       p0.setLayerWidth(p1, p2);
    }
    public static boolean g(Activity p0,String p1){
       return p0.shouldShowRequestPermissionRationale(p1);
    }
    public static boolean h(NetworkSecurityPolicy p0){
       return p0.isCleartextTrafficPermitted();
    }
    public static int i(LayerDrawable p0,int p1){
       return p0.getLayerWidth(p1);
    }
    public static AccessibilityNodeInfo$AccessibilityAction j(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_LEFT;
    }
    public static void k(LayerDrawable p0,int p1,int p2){
       p0.setLayerHeight(p1, p2);
    }
    public static int l(LayerDrawable p0,int p1){
       return p0.getLayerHeight(p1);
    }
    public static AccessibilityNodeInfo$AccessibilityAction m(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_DOWN;
    }
    public static void n(LayerDrawable p0,int p1,int p2){
       p0.setLayerInsetLeft(p1, p2);
    }
    public static int o(LayerDrawable p0,int p1){
       return p0.getLayerInsetLeft(p1);
    }
    public static AccessibilityNodeInfo$AccessibilityAction p(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_RIGHT;
    }
    public static void q(LayerDrawable p0,int p1,int p2){
       p0.setLayerInsetRight(p1, p2);
    }
    public static int r(LayerDrawable p0,int p1){
       return p0.getLayerInsetRight(p1);
    }
    public static AccessibilityNodeInfo$AccessibilityAction s(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_CONTEXT_CLICK;
    }
    public static void t(LayerDrawable p0,int p1,int p2){
       p0.setLayerInsetTop(p1, p2);
    }
    public static int u(LayerDrawable p0,int p1){
       return p0.getLayerInsetTop(p1);
    }
    public static AccessibilityNodeInfo$AccessibilityAction v(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_TO_POSITION;
    }
    public static void w(LayerDrawable p0,int p1,int p2){
       p0.setLayerInsetBottom(p1, p2);
    }
    public static int x(LayerDrawable p0,int p1){
       return p0.getLayerInsetBottom(p1);
    }
    public static AccessibilityNodeInfo$AccessibilityAction y(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_UP;
    }
    public static void z(LayerDrawable p0,int p1,int p2){
       p0.setLayerInsetStart(p1, p2);
    }
}
