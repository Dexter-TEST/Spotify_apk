package p.l55;
import android.text.PrecomputedText$Params;
import android.view.ViewConfiguration;
import android.graphics.Picture;
import android.graphics.Bitmap;
import android.app.job.JobParameters;
import android.net.Network;
import android.widget.TextView;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.WindowInsets;
import android.view.DisplayCutout;
import android.view.View;
import java.lang.CharSequence;
import android.app.job.JobInfo$Builder;
import android.net.NetworkRequest;
import android.view.View$OnUnhandledKeyEventListener;
import p.oh7;
import android.content.pm.SigningInfo;
import android.content.pm.Signature;
import android.icu.text.DecimalFormatSymbols;
import java.lang.String;

public abstract class l55	// class@001ce9 from classes.dex
{

    public static int a(PrecomputedText$Params p0){
       return p0.getBreakStrategy();
    }
    public static int b(ViewConfiguration p0){
       return p0.getScaledHoverSlop();
    }
    public static Bitmap c(Picture p0){
       return Bitmap.createBitmap(p0);
    }
    public static Network d(JobParameters p0){
       return p0.getNetwork();
    }
    public static PrecomputedText$Params e(TextView p0){
       return p0.getTextMetricsParams();
    }
    public static TextDirectionHeuristic f(PrecomputedText$Params p0){
       return p0.getTextDirection();
    }
    public static TextPaint g(PrecomputedText$Params p0){
       return p0.getTextPaint();
    }
    public static DisplayCutout h(WindowInsets p0){
       return p0.getDisplayCutout();
    }
    public static View i(View p0,int p1){
       return p0.requireViewById(p1);
    }
    public static WindowInsets j(WindowInsets p0){
       return p0.consumeDisplayCutout();
    }
    public static CharSequence k(View p0){
       return p0.getAccessibilityPaneTitle();
    }
    public static void l(JobInfo$Builder p0){
       p0.setImportantWhileForeground(true);
    }
    public static void m(JobInfo$Builder p0,NetworkRequest p1){
       p0.setRequiredNetwork(p1);
    }
    public static void n(View p0,View$OnUnhandledKeyEventListener p1){
       p0.removeOnUnhandledKeyEventListener(p1);
    }
    public static void o(View p0,CharSequence p1){
       p0.setAccessibilityPaneTitle(p1);
    }
    public static void p(View p0,oh7 p1){
       p0.addOnUnhandledKeyEventListener(p1);
    }
    public static void q(View p0,boolean p1){
       p0.setScreenReaderFocusable(p1);
    }
    public static void r(TextView p0,int p1){
       p0.setFirstBaselineToTopHeight(p1);
    }
    public static boolean s(View p0){
       return p0.isScreenReaderFocusable();
    }
    public static boolean t(ViewConfiguration p0){
       return p0.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
    public static Signature[] u(SigningInfo p0){
       return p0.getSigningCertificateHistory();
    }
    public static String[] v(DecimalFormatSymbols p0){
       return p0.getDigitStrings();
    }
    public static int w(PrecomputedText$Params p0){
       return p0.getHyphenationFrequency();
    }
    public static void x(View p0,boolean p1){
       p0.setAccessibilityHeading(p1);
    }
    public static boolean y(View p0){
       return p0.isAccessibilityHeading();
    }
}
