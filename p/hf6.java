package p.hf6;
import p.zr5;
import android.view.View;
import p.ng2;
import p.r61;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.widget.TextView;
import android.widget.ImageView;
import p.xe7;

public final class hf6 extends zr5	// class@001841 from classes.dex
{
    public final ImageView A;
    public final View u;
    public final ng2 v;
    public final ng2 w;
    public final r61 x;
    public final TextView y;
    public final TextView z;

    public void hf6(View p0,ng2 p1,ng2 p2,r61 p3){
       co5.o(p3, "imageLoader");
       super(p0);
       this.u = p0;
       this.v = p1;
       this.w = p2;
       this.x = p3;
       View view = p0.findViewById(R.id.title);
       co5.l(view, "view.findViewById\(R.id.title\)");
       this.y = view;
       view = p0.findViewById(R.id.subtitle);
       co5.l(view, "view.findViewById\(R.id.subtitle\)");
       this.z = view;
       this.A = p0.findViewById(R.id.image);
       ImageView imageView = p0.findViewById(R.id.checkmark);
       xe7.Z(p0, R.animator.picker_item_animator);
       co5.l(imageView, "checkMark");
       xe7.Z(imageView, R.animator.checkmark_animator);
    }
}
