package p.hh7;
import android.view.View;
import android.view.WindowInsets;

public abstract class hh7	// class@001854 from classes.dex
{

    public static WindowInsets a(View p0,WindowInsets p1){
       return p0.dispatchApplyWindowInsets(p1);
    }
    public static WindowInsets b(View p0,WindowInsets p1){
       return p0.onApplyWindowInsets(p1);
    }
    public static void c(View p0){
       p0.requestApplyInsets();
    }
}
