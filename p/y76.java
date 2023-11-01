package p.y76;
import p.zr5;
import android.view.View;
import p.r61;
import p.q77;
import p.ng2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.widget.ImageView;
import android.widget.TextView;

public final class y76 extends zr5	// class@002d65 from classes.dex
{
    public final TextView A;
    public final TextView B;
    public final View u;
    public final r61 v;
    public final q77 w;
    public final ng2 x;
    public final ng2 y;
    public final ImageView z;

    public void y76(View p0,r61 p1,q77 p2,ng2 p3,ng2 p4){
       co5.o(p1, "imageLoader");
       co5.o(p2, "circleTransformation");
       super(p0);
       this.u = p0;
       this.v = p1;
       this.w = p2;
       this.x = p3;
       this.y = p4;
       this.z = p0.findViewById(0x1020006);
       this.A = p0.findViewById(0x1020014);
       this.B = p0.findViewById(0x1020015);
    }
}
