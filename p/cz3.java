package p.cz3;
import android.view.View$OnClickListener;
import p.dz3;
import p.vu5;
import java.lang.Object;
import android.view.View;
import p.xy3;
import p.sy3;
import p.ty3;

public final class cz3 implements View$OnClickListener	// class@0012a8 from classes.dex
{
    public final dz3 a;
    public final vu5 b;

    public void cz3(dz3 p0,vu5 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onClick(View p0){
       this.a.C().e(new sy3(this.b));
    }
}
