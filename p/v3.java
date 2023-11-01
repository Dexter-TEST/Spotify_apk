package p.v3;
import java.lang.Object;
import android.os.LocaleList;
import android.widget.Toolbar;
import android.media.AudioTrack;
import android.content.Context;
import android.media.AudioRouting;
import android.media.AudioDeviceInfo;
import android.content.res.Configuration;
import java.lang.String;
import android.view.PointerIcon;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import p.ho;
import p.jo;
import java.util.function.Function;
import android.app.Activity;
import android.view.DragEvent;
import android.view.DragAndDropPermissions;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.os.Handler;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.concurrent.CompletableFuture;
import java.lang.Throwable;
import p.bs2;
import android.security.NetworkSecurityPolicy;

public abstract class v3	// class@002978 from classes.dex
{

    public static boolean A(Object p0,LocaleList p1){
       return p1.equals(p0);
    }
    public static int B(Toolbar p0){
       return p0.getTitleMarginEnd();
    }
    public static int C(Toolbar p0){
       return p0.getTitleMarginTop();
    }
    public static int D(Toolbar p0){
       return p0.getTitleMarginBottom();
    }
    public static int a(AudioTrack p0){
       return p0.getUnderrunCount();
    }
    public static int b(LocaleList p0){
       return p0.size();
    }
    public static int c(Toolbar p0){
       return p0.getTitleMarginStart();
    }
    public static Context d(Context p0){
       return p0.createDeviceProtectedStorageContext();
    }
    public static AudioDeviceInfo e(AudioRouting p0){
       return p0.getRoutedDevice();
    }
    public static LocaleList f(){
       return LocaleList.getAdjustedDefault();
    }
    public static LocaleList g(Configuration p0){
       return p0.getLocales();
    }
    public static LocaleList h(String p0){
       return LocaleList.forLanguageTags(p0);
    }
    public static PointerIcon i(Context p0){
       return PointerIcon.getSystemIcon(p0, 1002);
    }
    public static AccessibilityNodeInfo$AccessibilityAction j(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_SET_PROGRESS;
    }
    public static File k(Context p0){
       return p0.getDataDir();
    }
    public static Object l(ConcurrentHashMap p0,ho p1,jo p2){
       return p0.computeIfAbsent(p1, p2);
    }
    public static String m(LocaleList p0){
       return p0.toLanguageTags();
    }
    public static void n(Activity p0,DragEvent p1){
       p0.requestDragAndDropPermissions(p1);
    }
    public static void o(Configuration p0,LocaleList p1){
       p0.setLocales(p1);
    }
    public static void p(AudioTrack p0,AudioRouting$OnRoutingChangedListener p1){
       p0.removeOnRoutingChangedListener(p1);
    }
    public static void q(AudioTrack p0,AudioRouting$OnRoutingChangedListener p1,Handler p2){
       p0.addOnRoutingChangedListener(p1, p2);
    }
    public static void r(LocaleList p0){
       LocaleList.setDefault(p0);
    }
    public static void s(EditText p0,LocaleList p1){
       p0.setImeHintLocales(p1);
    }
    public static void t(SeekBar p0,int p1){
       p0.setProgress(p1, false);
    }
    public static void u(TextView p0,LocaleList p1){
       p0.setTextLocales(p1);
    }
    public static void v(CompletableFuture p0,Object p1){
       p0.complete(p1);
    }
    public static void w(CompletableFuture p0,Throwable p1){
       p0.completeExceptionally(p1);
    }
    public static void x(CompletableFuture p0,bs2 p1){
       p0.completeExceptionally(p1);
    }
    public static boolean y(Context p0){
       return p0.isDeviceProtectedStorage();
    }
    public static boolean z(NetworkSecurityPolicy p0,String p1){
       return p0.isCleartextTrafficPermitted(p1);
    }
}
