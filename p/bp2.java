package p.bp2;
import p.cp2;
import android.view.View;
import android.widget.TextView;
import p.do5;

public final class bp2 extends cp2	// class@00110b from classes.dex
{
    public final TextView v;

    public void bp2(View p0){
       super(p0);
       TextView textView = p0.findViewById(R.id.metadata);
       this.v = textView;
       TextView[] textViewArra = new TextView[]{textView};
       do5.z0(textViewArra);
       do5.y0(textViewArra);
       do5.x0(p0);
    }
}
