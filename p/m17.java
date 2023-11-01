package p.m17;
import android.content.DialogInterface$OnCancelListener;
import p.o17;
import p.i17;
import java.lang.Object;
import android.content.DialogInterface;

public final class m17 implements DialogInterface$OnCancelListener	// class@001e09 from classes.dex
{
    public final o17 a;
    public final i17 b;

    public void m17(o17 p0,i17 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onCancel(DialogInterface p0){
       o17.a(this.a, this.b);
    }
}
