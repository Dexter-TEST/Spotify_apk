package p.hm7;
import android.content.DialogInterface$OnCancelListener;
import android.view.View$OnCreateContextMenuListener;
import java.lang.Object;
import android.content.DialogInterface;
import p.rm7;
import java.lang.String;
import p.co5;
import p.o45;
import p.n45;

public final class hm7 implements DialogInterface$OnCancelListener	// class@001881 from classes.dex
{
    public final int a;
    public final View$OnCreateContextMenuListener b;

    public void hm7(View$OnCreateContextMenuListener p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onCancel(DialogInterface p0){
       hm7 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.C().e();
             return;
       }
       co5.o(tb, "this$0");
       tb.cancel();
       return;
    }
}
