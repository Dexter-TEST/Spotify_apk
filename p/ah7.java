package p.ah7;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnAttachStateChangeListener;
import java.lang.Object;
import java.util.WeakHashMap;
import android.os.Build$VERSION;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.view.View;
import java.lang.Boolean;
import p.wh7;
import android.view.ViewTreeObserver;

public final class ah7 implements ViewTreeObserver$OnGlobalLayoutListener, View$OnAttachStateChangeListener	// class@000f85 from classes.dex
{
    public final WeakHashMap a;

    public void ah7(){
       super();
       this.a = new WeakHashMap();
    }
    public final void onGlobalLayout(){
       if (Build$VERSION.SDK_INT < 28) {
          ah7 ta = this.a;
          Iterator iterator = ta.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             View key = uEntry.getKey();
             int b = uEntry.getValue().booleanValue();
             boolean b1 = (key.isShown() && !key.getWindowVisibility())? true: false;
             if (b != b1) {
                b = (b1)? 16: 32;
                wh7.g(key, b);
                ta.put(key, Boolean.valueOf(b1));
             }
          }
       }
       return;
    }
    public final void onViewAttachedToWindow(View p0){
       p0.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
    public final void onViewDetachedFromWindow(View p0){
    }
}
