package p.wa1;
import android.content.DialogInterface$OnCancelListener;
import androidx.fragment.app.f;
import java.lang.Object;
import android.content.DialogInterface;

public final class wa1 implements DialogInterface$OnCancelListener	// class@002af7 from classes.dex
{
    public final f a;

    public void wa1(f p0){
       this.a = p0;
       super();
    }
    public final void onCancel(DialogInterface p0){
       f c;
       wa1 ta = this.a;
       if ((c = ta.C) != null) {
          ta.onCancel(c);
       }
       return;
    }
}
