package p.iq3;
import p.uo2;
import android.view.View;
import android.widget.TextView;
import java.lang.Object;
import p.zk2;
import p.eo5;

public final class iq3 implements uo2	// class@0019e4 from classes.dex
{
    public final View a;

    public void iq3(View p0,TextView p1,TextView p2){
       super();
       this.a = p0;
       eo5.P(this);
    }
    public final int b(){
       return (this.a.getMeasuredWidth() / 2);
    }
    public final boolean c(){
       return true;
    }
    public final int f(){
       return (this.a.getMeasuredHeight() / 2);
    }
    public final View getView(){
       return this.a;
    }
}
