package p.vz5;
import p.e06;
import p.wz5;
import p.o85;
import android.view.View;
import android.widget.ImageView;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;

public final class vz5 extends wz5 implements e06	// class@002a97 from classes.dex
{
    public final ImageView t;

    public void vz5(o85 p0){
       super(p0);
       ImageView imageView = p0.findViewById(0x1020006);
       this.t = imageView;
       mj5 omj5 = oj5.c(p0.findViewById(R.id.row_view));
       View[] viewArray = new View[]{this.c};
       Collections.addAll(omj5.c, viewArray);
       View[] viewArray1 = new View[]{imageView};
       Collections.addAll(omj5.d, viewArray1);
       omj5.a();
    }
    public final ImageView getImageView(){
       return this.t;
    }
}
