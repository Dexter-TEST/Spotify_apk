package p.jy6;
import android.view.View;
import android.graphics.fonts.FontStyle;
import android.view.WindowInsets;
import android.graphics.Insets;
import android.view.View$AccessibilityDelegate;
import android.view.WindowInsets$Builder;
import java.util.List;
import java.lang.String;
import android.os.Trace;
import android.app.Service;
import android.app.Notification;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.view.ViewGroup;

public abstract class jy6	// class@001b6e from classes.dex
{

    public static float a(View p0){
       return p0.getTransitionAlpha();
    }
    public static int b(FontStyle p0){
       return p0.getWeight();
    }
    public static Insets c(WindowInsets p0){
       return p0.getSystemGestureInsets();
    }
    public static View$AccessibilityDelegate d(View p0){
       return p0.getAccessibilityDelegate();
    }
    public static WindowInsets e(WindowInsets$Builder p0){
       return p0.build();
    }
    public static WindowInsets f(WindowInsets p0,int p1,int p2,int p3,int p4){
       return p0.inset(p1, p2, p3, p4);
    }
    public static List g(View p0){
       return p0.getSystemGestureExclusionRects();
    }
    public static void h(int p0,String p1){
       Trace.endAsyncSection(p1, p0);
    }
    public static void i(Service p0,int p1,Notification p2,int p3){
       p0.startForeground(p1, p2, p3);
    }
    public static void j(View p0,float p1){
       p0.setTransitionAlpha(p1);
    }
    public static void k(View p0,int p1){
       p0.setTransitionVisibility(p1);
    }
    public static void l(View p0,int p1,int p2,int p3,int p4){
       p0.setLeftTopRightBottom(p1, p2, p3, p4);
    }
    public static void m(View p0,Context p1,int[] p2,AttributeSet p3,TypedArray p4,int p5,int p6){
       p0.saveAttributeDataForStyleable(p1, p2, p3, p4, p5, p6);
    }
    public static void n(View p0,Matrix p1){
       p0.transformMatrixToLocal(p1);
    }
    public static void o(View p0,List p1){
       p0.setSystemGestureExclusionRects(p1);
    }
    public static void p(ViewGroup p0,boolean p1){
       p0.suppressLayout(p1);
    }
    public static void q(WindowInsets$Builder p0,Insets p1){
       p0.setSystemWindowInsets(p1);
    }
    public static boolean r(){
       return Trace.isEnabled();
    }
    public static int s(FontStyle p0){
       return p0.getSlant();
    }
    public static Insets t(WindowInsets p0){
       return p0.getTappableElementInsets();
    }
    public static void u(int p0,String p1){
       Trace.beginAsyncSection(p1, p0);
    }
    public static void v(View p0,Matrix p1){
       p0.transformMatrixToGlobal(p1);
    }
    public static void w(WindowInsets$Builder p0,Insets p1){
       p0.setStableInsets(p1);
    }
    public static Insets x(WindowInsets p0){
       return p0.getMandatorySystemGestureInsets();
    }
}
