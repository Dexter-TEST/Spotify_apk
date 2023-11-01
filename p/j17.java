package p.j17;
import android.content.DialogInterface$OnClickListener;
import java.lang.Object;
import android.content.DialogInterface;
import p.i17;
import p.wf2;

public final class j17 implements DialogInterface$OnClickListener	// class@001a4a from classes.dex
{
    public final int a;
    public final Object b;

    public void j17(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       j17 tb = this.b;
       switch (this.a){
           case 0:
             tb.a();
             return;
           case 1:
             tb.b();
             return;
           default:
             tb.invoke();
             return;
       }
    }
}
