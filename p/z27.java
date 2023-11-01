package p.z27;
import android.view.ViewConfiguration;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import java.util.Collection;
import java.lang.String;
import android.view.Window$Callback;
import android.view.autofill.AutofillManager;
import android.graphics.fonts.FontVariationAxis;

public abstract class z27	// class@002e77 from classes.dex
{

    public static float a(ViewConfiguration p0){
       return p0.getScaledVerticalScrollFactor();
    }
    public static int b(View p0){
       return p0.getImportantForAutofill();
    }
    public static int c(TextView p0){
       return p0.getAutoSizeMinTextSize();
    }
    public static View d(View p0,View p1,int p2){
       return p0.keyboardNavigationClusterSearch(p1, p2);
    }
    public static void e(View p0,int p1){
       p0.setNextClusterForwardId(p1);
    }
    public static void f(View p0,CharSequence p1){
       p0.setTooltipText(p1);
    }
    public static void g(View p0,Collection p1,int p2){
       p0.addKeyboardNavigationClusters(p1, p2);
    }
    public static void h(View p0,boolean p1){
       p0.setKeyboardNavigationCluster(p1);
    }
    public static void i(View p0,String[] p1){
       p0.setAutofillHints(p1);
    }
    public static void j(Window$Callback p0,boolean p1){
       p0.onPointerCaptureChanged(p1);
    }
    public static boolean k(View p0){
       return p0.restoreDefaultFocus();
    }
    public static boolean l(AutofillManager p0){
       return p0.isAutofillSupported();
    }
    public static FontVariationAxis[] m(String p0){
       return FontVariationAxis.fromFontVariationSettings(p0);
    }
    public static float n(ViewConfiguration p0){
       return p0.getScaledHorizontalScrollFactor();
    }
    public static int o(View p0){
       return p0.getNextClusterForwardId();
    }
    public static void p(View p0,int p1){
       p0.setImportantForAutofill(p1);
    }
    public static void q(View p0,boolean p1){
       p0.setFocusedByDefault(p1);
    }
    public static boolean r(View p0){
       return p0.isImportantForAutofill();
    }
    public static boolean s(AutofillManager p0){
       return p0.isEnabled();
    }
    public static boolean t(View p0){
       return p0.isFocusedByDefault();
    }
    public static boolean u(View p0){
       return p0.hasExplicitFocusable();
    }
    public static boolean v(View p0){
       return p0.isKeyboardNavigationCluster();
    }
}
