package p.w27;
import android.content.Context;
import java.lang.String;
import android.view.View;
import android.widget.TextView;
import android.content.res.ColorStateList;
import android.view.Window$Callback;
import android.view.ActionMode$Callback;
import android.view.ActionMode;
import android.view.WindowInsets;
import java.lang.Object;
import android.os.UserManager;
import java.lang.Class;
import android.graphics.PorterDuff$Mode;
import android.view.SearchEvent;

public abstract class w27	// class@002ab5 from classes.dex
{

    public static int a(Context p0,String p1){
       return p0.checkSelfPermission(p1);
    }
    public static int b(View p0){
       return p0.getScrollIndicators();
    }
    public static ColorStateList c(TextView p0){
       return p0.getCompoundDrawableTintList();
    }
    public static ActionMode d(Window$Callback p0,ActionMode$Callback p1,int p2){
       return p0.onWindowStartingActionMode(p1, p2);
    }
    public static WindowInsets e(View p0){
       return p0.getRootWindowInsets();
    }
    public static Object f(Context p0){
       return p0.getSystemService(UserManager.class);
    }
    public static void g(View p0,int p1){
       p0.setScrollIndicators(p1);
    }
    public static void h(View p0,int p1,int p2){
       p0.setScrollIndicators(p1, p2);
    }
    public static void i(TextView p0,int p1){
       p0.setHyphenationFrequency(p1);
    }
    public static void j(TextView p0,ColorStateList p1){
       p0.setCompoundDrawableTintList(p1);
    }
    public static void k(TextView p0,PorterDuff$Mode p1){
       p0.setCompoundDrawableTintMode(p1);
    }
    public static boolean l(Window$Callback p0,SearchEvent p1){
       return p0.onSearchRequested(p1);
    }
    public static void m(TextView p0,int p1){
       p0.setBreakStrategy(p1);
    }
}
