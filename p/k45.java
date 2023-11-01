package p.k45;
import android.content.DialogInterface$OnClickListener;
import p.o45;
import java.lang.Object;
import android.content.DialogInterface;
import p.n45;

public final class k45 implements DialogInterface$OnClickListener	// class@001ba5 from classes.dex
{
    public final int a;
    public final o45 b;

    public void k45(o45 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       n45 on45;
       k45 tb = this.b;
       switch (this.a){
           case 0:
           default:
             on45 = tb.C();
             on45.e();
             on45.i();
             return;
       }
       on45 = tb.C();
       on45.e();
       on45.c();
       return;
    }
}
