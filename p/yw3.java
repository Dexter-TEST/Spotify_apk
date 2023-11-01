package p.yw3;
import p.wf2;
import p.gi3;
import android.widget.LinearLayout;
import java.lang.Object;
import android.view.View;
import p.jc7;

public final class yw3 extends gi3 implements wf2	// class@002e3d from classes.dex
{
    public final View a;
    public final float b;
    public final int c;

    public void yw3(float p0,int p1,LinearLayout p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super(0);
    }
    public final Object invoke(){
       yw3 ta = this.a;
       ta.setPivotY(this.b);
       ta.setVisibility(this.c);
       return jc7.a;
    }
}
