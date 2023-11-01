package p.ch;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public abstract class ch	// class@00120d from classes.dex
{

    public static void a(ViewTreeObserver p0,ViewTreeObserver$OnGlobalLayoutListener p1){
       p0.removeOnGlobalLayoutListener(p1);
    }
}
