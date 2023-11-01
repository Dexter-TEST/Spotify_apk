package p.ww3;
import p.wf2;
import p.gi3;
import android.widget.LinearLayout;
import java.lang.Object;
import android.view.View;
import p.jc7;

public final class ww3 extends gi3 implements wf2	// class@002bbc from classes.dex
{
    public final View a;
    public final float b;

    public void ww3(LinearLayout p0,float p1){
       this.a = p0;
       this.b = p1;
       super(0);
    }
    public final Object invoke(){
       this.a.setPivotY(this.b);
       return jc7.a;
    }
}
