package p.zz5;
import p.yz5;
import p.a06;
import p.o85;
import android.view.View;
import android.widget.ImageView;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;

public class zz5 extends a06 implements yz5	// class@002f98 from classes.dex
{
    public final ImageView v;

    public void zz5(o85 p0){
       super(p0);
       ImageView imageView = p0.findViewById(0x1020006);
       this.v = imageView;
       mj5 omj5 = oj5.c(p0.findViewById(R.id.row_view));
       View[] viewArray = new View[]{this.c,this.t};
       Collections.addAll(omj5.c, viewArray);
       viewArray = new View[]{imageView};
       Collections.addAll(omj5.d, viewArray);
       omj5.a();
    }
    public final ImageView getImageView(){
       return this.v;
    }
}
