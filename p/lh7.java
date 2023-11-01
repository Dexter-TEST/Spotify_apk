package p.lh7;
import android.view.View;
import android.view.PointerIcon;
import android.view.Window$Callback;
import java.util.List;
import android.view.Menu;
import android.content.ClipData;
import android.view.View$DragShadowBuilder;
import java.lang.Object;

public abstract class lh7	// class@001d57 from classes.dex
{

    public static void a(View p0){
       p0.cancelDragAndDrop();
    }
    public static void b(View p0,PointerIcon p1){
       p0.setPointerIcon(p1);
    }
    public static void c(Window$Callback p0,List p1,Menu p2,int p3){
       p0.onProvideKeyboardShortcuts(p1, p2, p3);
    }
    public static boolean d(View p0,ClipData p1,View$DragShadowBuilder p2,Object p3,int p4){
       return p0.startDragAndDrop(p1, p2, p3, p4);
    }
    public static void e(View p0){
       p0.dispatchFinishTemporaryDetach();
    }
}
