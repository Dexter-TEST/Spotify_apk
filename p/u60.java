package p.u60;
import p.zk2;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;
import p.et0;
import android.widget.Button;

public final class u60 implements zk2	// class@00284c from classes.dex
{
    public final View a;
    public final Button b;

    public void u60(ViewGroup p0){
       super();
       View view = et0.n(p0, R.layout.browse_button, p0, false);
       this.a = view;
       this.b = view.findViewById(R.id.button);
    }
    public final View getView(){
       return this.a;
    }
}
