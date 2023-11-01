package p.eh;
import android.os.PowerManager;
import java.lang.String;
import android.app.AppOpsManager;
import android.widget.TextView;
import android.text.StaticLayout$Builder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.widget.ThemedSpinnerAdapter;
import android.content.res.Resources$Theme;
import android.widget.CompoundButton;
import android.media.AudioTrack;
import android.text.Layout$Alignment;
import java.lang.CharSequence;
import android.text.TextPaint;
import android.text.StaticLayout;
import java.lang.Object;
import java.lang.Class;
import android.media.AudioTrack$OnRoutingChangedListener;
import android.os.Handler;
import android.text.TextDirectionHeuristic;

public abstract class eh	// class@00148d from classes.dex
{

    public static boolean A(PowerManager p0,String p1){
       return p0.isIgnoringBatteryOptimizations(p1);
    }
    public static int B(AppOpsManager p0,String p1,String p2){
       return p0.noteProxyOp(p1, p2);
    }
    public static int C(TextView p0){
       return p0.getHyphenationFrequency();
    }
    public static StaticLayout$Builder D(StaticLayout$Builder p0,int p1){
       return p0.setHyphenationFrequency(p1);
    }
    public static int a(AppOpsManager p0,String p1,String p2){
       return p0.noteProxyOpNoThrow(p1, p2);
    }
    public static int b(Context p0,int p1){
       return p0.getColor(p1);
    }
    public static int c(Drawable p0){
       return p0.getLayoutDirection();
    }
    public static int d(AudioDeviceInfo p0){
       return p0.getType();
    }
    public static int e(TextView p0){
       return p0.getBreakStrategy();
    }
    public static Resources$Theme f(ThemedSpinnerAdapter p0){
       return p0.getDropDownViewTheme();
    }
    public static Drawable g(CompoundButton p0){
       return p0.getButtonDrawable();
    }
    public static AudioDeviceInfo h(AudioTrack p0){
       return p0.getRoutedDevice();
    }
    public static StaticLayout$Builder i(StaticLayout$Builder p0,float p1,float p2){
       return p0.setLineSpacing(p1, p2);
    }
    public static StaticLayout$Builder j(StaticLayout$Builder p0,int p1){
       return p0.setBreakStrategy(p1);
    }
    public static StaticLayout$Builder k(StaticLayout$Builder p0,Layout$Alignment p1){
       return p0.setAlignment(p1);
    }
    public static StaticLayout$Builder l(StaticLayout$Builder p0,boolean p1){
       return p0.setIncludePad(p1);
    }
    public static StaticLayout$Builder m(CharSequence p0,int p1,TextPaint p2,int p3){
       return StaticLayout$Builder.obtain(p0, 0, p1, p2, p3);
    }
    public static StaticLayout n(StaticLayout$Builder p0){
       return p0.build();
    }
    public static CharSequence o(AudioDeviceInfo p0){
       return p0.getProductName();
    }
    public static Object p(Context p0){
       return p0.getSystemService(AppOpsManager.class);
    }
    public static Object q(Context p0,Class p1){
       return p0.getSystemService(p1);
    }
    public static String r(Context p0,Class p1){
       return p0.getSystemServiceName(p1);
    }
    public static String s(String p0){
       return AppOpsManager.permissionToOp(p0);
    }
    public static void t(AudioTrack p0,AudioTrack$OnRoutingChangedListener p1){
       p0.removeOnRoutingChangedListener(p1);
    }
    public static void u(AudioTrack p0,AudioTrack$OnRoutingChangedListener p1,Handler p2){
       p0.addOnRoutingChangedListener(p1, p2);
    }
    public static void v(StaticLayout$Builder p0,int p1){
       p0.setMaxLines(p1);
    }
    public static void w(StaticLayout$Builder p0,TextDirectionHeuristic p1){
       p0.setTextDirection(p1);
    }
    public static void x(ThemedSpinnerAdapter p0,Resources$Theme p1){
       p0.setDropDownViewTheme(p1);
    }
    public static boolean y(Drawable p0,int p1){
       return p0.setLayoutDirection(p1);
    }
    public static boolean z(PowerManager p0){
       return p0.isDeviceIdleMode();
    }
}
