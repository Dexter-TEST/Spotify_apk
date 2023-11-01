package p.xw3;
import p.wf2;
import p.gi3;
import android.animation.ObjectAnimator;
import android.widget.TextView;
import java.lang.Object;
import android.view.View;
import p.jc7;

public final class xw3 extends gi3 implements wf2	// class@002cfe from classes.dex
{
    public final ObjectAnimator a;
    public final long b;
    public final View c;
    public final int t;

    public void xw3(ObjectAnimator p0,long p1,TextView p2,int p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       super(0);
    }
    public final Object invoke(){
       this.a.setDuration(this.b);
       this.c.setVisibility(this.t);
       return jc7.a;
    }
}
