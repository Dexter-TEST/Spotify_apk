package p.kx;
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

public final class kx extends zr5	// class@001ca3 from classes.dex
{
    public final View u;
    public final ng2 v;
    public final ng2 w;
    public final r61 x;
    public final TextView y;

    public void kx(View p0,ng2 p1,ng2 p2,r61 p3){
       co5.o(p3, "imageLoader");
       super(p0);
       this.u = p0;
       this.v = p1;
       this.w = p2;
       this.x = p3;
       View view = p0.findViewById(R.id.title);
       co5.l(view, "view.findViewById\(R.id.title\)");
       this.y = view;
       ImageView imageView = p0.findViewById(R.id.checkmark);
       xe7.Z(p0, R.animator.picker_item_animator);
       co5.l(imageView, "checkMark");
       xe7.Z(imageView, R.animator.checkmark_animator);
    }
}
