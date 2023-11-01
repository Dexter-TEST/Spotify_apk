package p.xk;
import p.zr5;
import android.view.View;
import p.ng2;
import p.r61;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import android.widget.ImageView;
import p.xe7;
import p.dl;

public final class xk extends zr5	// class@002c99 from classes.dex
{
    public final View u;
    public final ng2 v;
    public final ng2 w;
    public final TextView x;
    public final ArtworkView y;

    public void xk(View p0,ng2 p1,ng2 p2,r61 p3){
       co5.o(p3, "imageLoader");
       super(p0);
       this.u = p0;
       this.v = p1;
       this.w = p2;
       View view = p0.findViewById(R.id.title);
       co5.l(view, "view.findViewById\(R.id.title\)");
       this.x = view;
       ArtworkView uArtworkView = p0.findViewById(R.id.image);
       this.y = uArtworkView;
       ImageView imageView = p0.findViewById(R.id.checkmark);
       xe7.Z(p0, R.animator.picker_item_animator);
       co5.l(imageView, "checkMark");
       xe7.Z(imageView, R.animator.checkmark_animator);
       uArtworkView.setViewContext(new dl(p3));
    }
}
