package p.y45;
import android.content.DialogInterface$OnClickListener;
import java.lang.Runnable;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.AssertionError;

public final class y45 implements DialogInterface$OnClickListener	// class@002d49 from classes.dex
{
    public final Runnable a;
    public final Runnable b;

    public void y45(Runnable p0){
       this.a = p0;
       this.b = null;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       y45 tb;
       if (p1 != -2) {
          if (p1 == -1) {
             this.a.run();
          }else {
             throw new AssertionError("unsupported button");
          }
       }else if((tb = this.b) != null){
          tb.run();
       }
       return;
    }
}
