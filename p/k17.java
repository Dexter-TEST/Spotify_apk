package p.k17;
import android.content.DialogInterface$OnClickListener;
import p.o17;
import p.i17;
import java.lang.Object;
import android.content.DialogInterface;
import p.p17;

public final class k17 implements DialogInterface$OnClickListener	// class@001b8b from classes.dex
{
    public final int a;
    public final o17 b;
    public final i17 c;

    public void k17(o17 p0,i17 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       o17 c;
       k17 tc = this.c;
       k17 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             o17.a(tb, tc);
             return;
       }
       if ((c = tb.c) == null) {
          c = new p17(false, false, false);
       }
       tb.c(c, tc);
       return;
    }
}
