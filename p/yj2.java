package p.yj2;
import p.xj2;
import android.view.View;
import java.lang.Object;
import android.widget.TextView;
import android.widget.Button;
import p.do5;
import java.lang.CharSequence;

public final class yj2 implements xj2	// class@002dcb from classes.dex
{
    public final View a;
    public final TextView b;
    public final TextView c;
    public final Button t;

    public void yj2(View p0){
       super();
       this.a = p0;
       TextView textView = p0.findViewById(0x1020014);
       this.b = textView;
       TextView textView1 = p0.findViewById(0x1020015);
       this.c = textView1;
       this.t = p0.findViewById(R.id.empty_view_button);
       TextView[] textViewArra = new TextView[]{textView};
       do5.z0(textViewArra);
       do5.y0(textViewArra);
       TextView[] textViewArra1 = new TextView[]{textView1};
       do5.z0(textViewArra1);
       do5.y0(textViewArra1);
       do5.x0(p0);
    }
    public final View getView(){
       return this.a;
    }
    public final void setSubtitle(CharSequence p0){
       this.c.setText(p0);
    }
    public final void setTitle(CharSequence p0){
       this.b.setText(p0);
    }
}
