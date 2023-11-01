package p.vw3;
import p.wf2;
import p.gi3;
import android.view.View;
import java.lang.Object;
import p.jc7;

public final class vw3 extends gi3 implements wf2	// class@002a7a from classes.dex
{
    public final View a;
    public final int b;

    public void vw3(View p0,int p1){
       this.a = p0;
       this.b = p1;
       super(0);
    }
    public final Object invoke(){
       this.a.setVisibility(this.b);
       return jc7.a;
    }
}
