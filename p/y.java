package p.y;
import p.ik7;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.Object;
import android.view.View;

public final class y implements ik7	// class@002d78 from classes.dex
{
    public boolean a;
    public int b;
    public final ActionBarContextView c;

    public void y(ActionBarContextView p0){
       this.c = p0;
       super();
       this.a = false;
    }
    public final void a(){
       if (this.a != null) {
          return;
       }
       y tc = this.c;
       tc.w = null;
       ActionBarContextView.b(tc, this.b);
       return;
    }
    public final void b(View p0){
       this.a = true;
    }
    public final void c(){
       ActionBarContextView.a(this.c);
       this.a = false;
    }
}
