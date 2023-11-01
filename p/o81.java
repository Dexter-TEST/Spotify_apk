package p.o81;
import android.view.View$OnClickListener;
import p.vf4;
import java.lang.Object;
import android.view.View;
import p.i57;
import p.zf2;
import p.bm1;

public final class o81 implements View$OnClickListener	// class@0020ca from classes.dex
{
    public final int a;
    public final zf2 b;

    public void o81(int p0,vf4 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onClick(View p0){
       o81 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.invoke(bm1.a);
             return;
       }
       tb.invoke(i57.a);
       return;
    }
}
