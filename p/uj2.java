package p.uj2;
import android.view.View$OnClickListener;
import p.kf6;
import java.lang.Object;
import android.view.View;
import p.t63;
import android.content.DialogInterface$OnClickListener;
import p.lj2;
import android.content.DialogInterface;
import android.app.Dialog;

public final class uj2 implements View$OnClickListener	// class@0028be from classes.dex
{
    public final int a;
    public final kf6 b;

    public void uj2(kf6 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       kf6 b;
       t63 c;
       uj2 tb = this.b;
       switch (this.a){
           case 0:
             b = tb.b;
             if ((c = b.c) != null) {
                c.onClick(b.b, -1);
             }
             break;
           default:
             b = tb.b;
             if ((c = b.t) != null) {
                c.onClick(b.b, -2);
             }
             b.b.dismiss();
             return;
       }
       b.b.dismiss();
       return;
    }
}
