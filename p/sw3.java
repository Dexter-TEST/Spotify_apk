package p.sw3;
import android.view.View$OnClickListener;
import p.tw3;
import p.lw3;
import java.lang.Object;
import android.view.View;
import java.lang.Long;
import java.lang.Integer;
import p.ng2;

public final class sw3 implements View$OnClickListener	// class@0026b0 from classes.dex
{
    public final tw3 a;
    public final lw3 b;
    public final int c;

    public void sw3(tw3 p0,lw3 p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onClick(View p0){
       this.a.w.b(Long.valueOf(this.b.a), Integer.valueOf(this.c));
    }
}
