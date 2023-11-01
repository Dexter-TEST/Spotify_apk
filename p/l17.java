package p.l17;
import android.content.DialogInterface$OnCancelListener;
import p.i17;
import java.lang.Object;
import android.content.DialogInterface;

public final class l17 implements DialogInterface$OnCancelListener	// class@001cc7 from classes.dex
{
    public final i17 a;

    public void l17(i17 p0){
       this.a = p0;
       super();
    }
    public final void onCancel(DialogInterface p0){
       this.a.c();
    }
}
