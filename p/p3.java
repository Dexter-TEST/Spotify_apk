package p.p3;
import android.widget.TextView;
import java.lang.String;
import android.media.AudioManager;
import android.media.AudioFocusRequest;
import android.app.usage.StorageStats;
import android.graphics.Bitmap$Config;
import android.content.res.Configuration;
import android.app.usage.StorageStatsManager;
import java.util.UUID;
import android.content.Context;
import android.content.Intent;
import android.content.ComponentName;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Handler;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextClassificationManager;
import java.util.Base64$Encoder;
import java.util.Base64;
import android.os.storage.StorageManager;
import java.io.File;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import p.fw3;
import p.fg;
import android.graphics.ColorSpace;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.CharSequence;

public abstract class p3	// class@0021e7 from classes.dex
{

    public static boolean A(TextView p0,String p1){
       return p0.setFontVariationSettings(p1);
    }
    public static int B(AudioManager p0,AudioFocusRequest p1){
       return p0.requestAudioFocus(p1);
    }
    public static long C(StorageStats p0){
       return p0.getCacheBytes();
    }
    public static Bitmap$Config D(){
       return Bitmap$Config.HARDWARE;
    }
    public static int a(Configuration p0){
       return p0.colorMode;
    }
    public static int b(AudioManager p0,AudioFocusRequest p1){
       return p0.abandonAudioFocusRequest(p1);
    }
    public static int c(TextView p0){
       return p0.getAutoSizeStepGranularity();
    }
    public static long d(StorageStats p0){
       return p0.getDataBytes();
    }
    public static long e(StorageStatsManager p0,UUID p1){
       return p0.getTotalBytes(p1);
    }
    public static ComponentName f(Context p0,Intent p1){
       return p0.startForegroundService(p1);
    }
    public static Intent g(Context p0,BroadcastReceiver p1,IntentFilter p2,String p3,Handler p4,int p5){
       return p0.registerReceiver(p1, p2, p3, p4, p5);
    }
    public static Bitmap$Config h(){
       return Bitmap$Config.RGBA_F16;
    }
    public static Bitmap$Config i(BitmapFactory$Options p0){
       return p0.outConfig;
    }
    public static Icon j(Bitmap p0){
       return Icon.createWithAdaptiveBitmap(p0);
    }
    public static AccessibilityNodeInfo$AccessibilityAction k(){
       return AccessibilityNodeInfo$AccessibilityAction.ACTION_MOVE_WINDOW;
    }
    public static TextClassifier l(){
       return TextClassifier.NO_OP;
    }
    public static TextClassifier m(TextClassificationManager p0){
       return p0.getTextClassifier();
    }
    public static String n(Base64$Encoder p0,byte[] p1){
       return p0.encodeToString(p1);
    }
    public static Base64$Encoder o(){
       return Base64.getEncoder();
    }
    public static UUID p(StorageManager p0,File p1){
       return p0.getUuidForPath(p1);
    }
    public static void q(Animator$AnimatorListener p0,Animator p1,boolean p2){
       p0.onAnimationEnd(p1, p2);
    }
    public static void r(Animator$AnimatorListener p0,fw3 p1,boolean p2){
       p0.onAnimationStart(p1, p2);
    }
    public static void s(Context p0,fg p1,IntentFilter p2,int p3){
       p0.registerReceiver(p1, p2, p3);
    }
    public static void t(Configuration p0,int p1){
       p0.colorMode = p1;
    }
    public static void u(BitmapFactory$Options p0,ColorSpace p1){
       p0.inPreferredColorSpace = p1;
    }
    public static void v(AccessibilityNodeInfo p0,String p1){
       p0.setHintText(p1);
    }
    public static void w(AccessibilityNodeInfo p0,boolean p1){
       p0.setShowingHintText(p1);
    }
    public static void x(TextView p0,int p1,int p2,int p3,int p4){
       p0.setAutoSizeTextTypeUniformWithConfiguration(p1, p2, p3, p4);
    }
    public static void y(TextView p0,int[] p1,int p2){
       p0.setAutoSizeTextTypeUniformWithPresetSizes(p1, p2);
    }
    public static boolean z(AccessibilityNodeInfo p0){
       return p0.isShowingHintText();
    }
}
