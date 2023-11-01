package p.zk7;
import android.view.View$OnAttachStateChangeListener;
import java.lang.Object;
import android.view.View;
import p.wh7;
import p.hh7;

public final class zk7 implements View$OnAttachStateChangeListener	// class@002f17 from classes.dex
{

    public void zk7(){
       super();
    }
    public final void onViewAttachedToWindow(View p0){
       p0.removeOnAttachStateChangeListener(this);
       hh7.c(p0);
    }
    public final void onViewDetachedFromWindow(View p0){
    }
}
