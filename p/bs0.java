package p.bs0;
import android.view.View$OnClickListener;
import p.es0;
import java.lang.Object;
import android.view.View;
import p.wf2;

public final class bs0 implements View$OnClickListener	// class@001123 from classes.dex
{
    public final int a;
    public final es0 b;

    public void bs0(es0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       bs0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.g.invoke();
             return;
       }
       tb.f.invoke();
       return;
    }
}
