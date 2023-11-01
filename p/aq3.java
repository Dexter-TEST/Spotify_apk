package p.aq3;
import android.view.MenuItem;
import java.lang.CharSequence;
import android.app.job.JobInfo$Builder;
import android.telephony.TelephonyManager;
import android.widget.TextView;
import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import java.util.UUID;
import java.nio.file.attribute.FileTime;
import java.lang.String;
import android.os.UserHandle;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import java.lang.invoke.MethodHandle;
import java.lang.Object;
import android.text.TextPaint;
import java.lang.invoke.MethodHandles$Lookup;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.invoke.MethodHandles;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class aq3	// class@000fd2 from classes.dex
{

    public static MenuItem A(MenuItem p0,char p1,int p2){
       return p0.setAlphabeticShortcut(p1, p2);
    }
    public static MenuItem B(MenuItem p0,CharSequence p1){
       return p0.setTooltipText(p1);
    }
    public static CharSequence C(MenuItem p0){
       return p0.getTooltipText();
    }
    public static void D(JobInfo$Builder p0,boolean p1){
       p0.setRequiresStorageNotLow(p1);
    }
    public static int a(TelephonyManager p0,int p1){
       return p0.getSimState(p1);
    }
    public static int b(MenuItem p0){
       return p0.getNumericModifiers();
    }
    public static int c(TextView p0){
       return p0.getAutoSizeTextType();
    }
    public static long d(StorageStats p0){
       return p0.getAppBytes();
    }
    public static long e(StorageStatsManager p0,UUID p1){
       return p0.getFreeBytes(p1);
    }
    public static long f(FileTime p0){
       return p0.toMillis();
    }
    public static StorageStats g(StorageStatsManager p0,UUID p1,String p2,UserHandle p3){
       return p0.queryStatsForPackage(p1, p2, p3);
    }
    public static ColorStateList h(MenuItem p0){
       return p0.getIconTintList();
    }
    public static PorterDuff$Mode i(MenuItem p0){
       return p0.getIconTintMode();
    }
    public static MenuItem j(MenuItem p0,char p1,char p2,int p3,int p4){
       return p0.setShortcut(p1, p2, p3, p4);
    }
    public static MenuItem k(MenuItem p0,char p1,int p2){
       return p0.setNumericShortcut(p1, p2);
    }
    public static MenuItem l(MenuItem p0,ColorStateList p1){
       return p0.setIconTintList(p1);
    }
    public static MenuItem m(MenuItem p0,PorterDuff$Mode p1){
       return p0.setIconTintMode(p1);
    }
    public static MenuItem n(MenuItem p0,CharSequence p1){
       return p0.setContentDescription(p1);
    }
    public static CharSequence o(MenuItem p0){
       return p0.getContentDescription();
    }
    public static Object p(MethodHandle p0,Object[] p1){
       return p0.invokeWithArguments(p1);
    }
    public static String q(TextPaint p0){
       return p0.getFontVariationSettings();
    }
    public static MethodHandle r(MethodHandle p0,Object p1){
       return p0.bindTo(p1);
    }
    public static MethodHandle s(MethodHandles$Lookup p0,Method p1,Class p2){
       return p0.unreflectSpecial(p1, p2);
    }
    public static MethodHandles$Lookup t(){
       return MethodHandles.lookup();
    }
    public static Path u(String p0,String[] p1){
       return Paths.get(p0, p1);
    }
    public static void v(JobInfo$Builder p0,boolean p1){
       p0.setRequiresBatteryNotLow(p1);
    }
    public static void w(TextView p0,int p1){
       p0.setAutoSizeTextTypeWithDefaults(p1);
    }
    public static int[] x(TextView p0){
       return p0.getAutoSizeTextAvailableSizes();
    }
    public static int y(MenuItem p0){
       return p0.getAlphabeticModifiers();
    }
    public static int z(TextView p0){
       return p0.getAutoSizeMaxTextSize();
    }
}
