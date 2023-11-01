package p.wk6;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.Object;
import android.view.View;

public final class wk6 implements View$OnClickListener	// class@002b56 from classes.dex
{
    public final int a;
    public final SwitchCompat b;

    public void wk6(SwitchCompat p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       wk6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.toggle();
             return;
       }
       tb.toggle();
       return;
    }
}
