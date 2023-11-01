package p.ue2;
import android.transition.Transition$EpicenterCallback;
import android.graphics.Rect;
import android.transition.Transition;

public final class ue2 extends Transition$EpicenterCallback	// class@002894 from classes.dex
{
    public final int a;
    public final Rect b;

    public void ue2(Rect p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Rect onGetEpicenter(Transition p0){
       ue2 tb = this.b;
       switch (this.a){
           case 0:
           default:
             if (tb == null || tb.isEmpty()) {
                tb = null;
             }
             return tb;
       }
       return tb;
    }
}
