package p.xa1;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.f;
import java.lang.Object;
import android.content.DialogInterface;

public final class xa1 implements DialogInterface$OnDismissListener	// class@002c38 from classes.dex
{
    public final f a;

    public void xa1(f p0){
       this.a = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       f c;
       xa1 ta = this.a;
       if ((c = ta.C) != null) {
          ta.onDismiss(c);
       }
       return;
    }
}
