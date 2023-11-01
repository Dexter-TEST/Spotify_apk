package p.dg7;
import p.zk2;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.widget.TextView;

public final class dg7 implements zk2	// class@001343 from classes.dex
{
    public final View a;
    public final TextView b;
    public final TextView c;

    public void dg7(View p0){
       View view;
       co5.o(p0, "view");
       super();
       this.a = p0;
       view = p0.findViewById(0x1020014);
       co5.l(view, "view.findViewById\(android.R.id.text1\)");
       this.b = view;
       p0 = p0.findViewById(R.id.value_row_value);
       co5.l(p0, "view.findViewById\(R.id.value_row_value\)");
       this.c = p0;
    }
    public final View getView(){
       return this.a;
    }
}
