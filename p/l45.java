package p.l45;
import android.content.DialogInterface$OnDismissListener;
import p.o45;
import java.lang.Object;
import android.content.DialogInterface;
import p.n45;

public final class l45 implements DialogInterface$OnDismissListener	// class@001ce1 from classes.dex
{
    public final o45 a;

    public void l45(o45 p0){
       this.a = p0;
    }
    public final void onDismiss(DialogInterface p0){
       this.a.C().e();
    }
}
