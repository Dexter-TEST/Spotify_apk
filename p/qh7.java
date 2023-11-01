package p.qh7;
import android.view.View;
import android.view.View$AccessibilityDelegate;
import p.jy6;
import java.util.List;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.TypedArray;

public abstract class qh7	// class@0023a4 from classes.dex
{

    public static View$AccessibilityDelegate a(View p0){
       return jy6.d(p0);
    }
    public static List b(View p0){
       return jy6.g(p0);
    }
    public static void c(View p0,Context p1,int[] p2,AttributeSet p3,TypedArray p4,int p5,int p6){
       jy6.m(p0, p1, p2, p3, p4, p5, p6);
    }
    public static void d(View p0,List p1){
       jy6.o(p0, p1);
    }
}
