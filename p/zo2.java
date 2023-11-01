package p.zo2;
import p.xo2;
import p.wo2;
import android.view.View;
import android.widget.TextView;
import p.do5;
import java.lang.String;
import java.lang.CharSequence;

public final class zo2 extends wo2 implements xo2	// class@002f36 from classes.dex
{
    public final TextView w;
    public final TextView x;

    public void zo2(View p0){
       super(p0);
       TextView textView = p0.findViewById(0x1020015);
       this.w = textView;
       textView.setVisibility(0);
       TextView textView1 = p0.findViewById(R.id.metadata);
       this.x = textView1;
       textView1.setVisibility(0);
       TextView[] textViewArra = new TextView[]{textView};
       do5.z0(textViewArra);
       do5.y0(textViewArra);
       do5.x0(p0);
    }
    public final void g(String p0){
       this.w.setText(p0);
    }
}
