package p.ff6;
import p.zr5;
import android.view.View;
import p.ng2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.widget.TextView;
import p.xe7;

public final class ff6 extends zr5	// class@0015ba from classes.dex
{
    public final View u;
    public final ng2 v;
    public final ng2 w;
    public final TextView x;

    public void ff6(View p0,ng2 p1,ng2 p2){
       super(p0);
       this.u = p0;
       this.v = p1;
       this.w = p2;
       View view = p0.findViewById(R.id.title);
       co5.l(view, "view.findViewById\(R.id.title\)");
       this.x = view;
       xe7.Z(p0, R.animator.more_picker_item_animator);
    }
}
