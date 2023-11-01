package p.fi2;
import android.view.View$OnClickListener;
import com.spotify.signup.signup.view.GenderView;
import p.hr0;
import java.lang.Object;
import android.view.View;
import p.ei2;
import android.widget.Button;

public final class fi2 implements View$OnClickListener	// class@0015d1 from classes.dex
{
    public final int a;
    public final GenderView b;
    public final hr0 c;

    public void fi2(GenderView p0,hr0 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       View[] viewArray;
       fi2 tc = this.c;
       int i = 2;
       int i1 = 1;
       int i2 = 0;
       int i3 = 4;
       fi2 tb = this.b;
       switch (this.a){
           case 0:
             viewArray = new View[i3];
             viewArray[i2] = tb.b;
             viewArray[i1] = tb.c;
             viewArray[i] = tb.v;
             viewArray[3] = tb.t;
             tb.a(tc, tb.a, ei2.c, viewArray);
             return;
           case 1:
             viewArray = new View[i3];
             viewArray[i2] = tb.a;
             viewArray[i1] = tb.c;
             viewArray[i] = tb.v;
             viewArray[3] = tb.t;
             tb.a(tc, tb.b, ei2.b, viewArray);
             return;
           case 2:
             viewArray = new View[i3];
             viewArray[i2] = tb.a;
             viewArray[i1] = tb.b;
             viewArray[i] = tb.v;
             viewArray[3] = tb.t;
             tb.a(tc, tb.c, ei2.t, viewArray);
             return;
           case 3:
             viewArray = new View[i3];
             viewArray[i2] = tb.a;
             viewArray[i1] = tb.b;
             viewArray[i] = tb.c;
             viewArray[3] = tb.t;
             tb.a(tc, tb.v, ei2.v, viewArray);
             return;
           default:
             viewArray = new View[i3];
             viewArray[i2] = tb.a;
             viewArray[i1] = tb.b;
             viewArray[i] = tb.c;
             viewArray[3] = tb.v;
             tb.a(tc, tb.t, ei2.w, viewArray);
             return;
       }
    }
}
