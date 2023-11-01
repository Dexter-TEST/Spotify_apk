package p.zj7;
import java.lang.Runnable;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import p.k24;
import p.ll2;
import androidx.work.impl.foreground.SystemForegroundService;
import android.app.NotificationManager;
import android.widget.TextView;
import android.view.View;
import java.lang.CharSequence;

public final class zj7 implements Runnable	// class@002f0e from classes.dex
{
    public final int a;
    public final int b;
    public final Object c;

    public void zj7(int p0,int p1,Object p2){
       this.a = p1;
       this.c = p2;
       this.b = p0;
       super();
    }
    public void zj7(RecyclerView p0,int p1){
       this.a = 0;
       super();
       this.b = p1;
       this.c = p0;
    }
    public final void run(){
       int i;
       zj7 tb = this.b;
       zj7 tc = this.c;
       switch (this.a){
           case 0:
             tc.k0(tb);
             return;
           case 1:
             tc.v.cancel(tb);
             return;
           case 2:
             tc.a(tb);
             return;
           case 3:
             tc.y.k0(tb);
             return;
           default:
             if ((i = ((tc.getMeasuredHeight() - tc.getPaddingBottom()) - tc.getPaddingTop()) / tc.getLineHeight()) <= tb) {
                tb = i;
             }
             tc.setMaxLines(tb);
             tc.setText(tc.getText());
             return;
       }
    }
}
