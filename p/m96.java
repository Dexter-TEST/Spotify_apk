package p.m96;
import p.l96;
import android.view.View;
import android.widget.TextView;
import p.do5;

public final class m96 extends l96	// class@001e50 from classes.dex
{
    public final TextView w;

    public void m96(View p0){
       super(p0);
       TextView textView = p0.findViewById(R.id.metadata);
       this.w = textView;
       TextView[] textViewArra = new TextView[]{textView};
       do5.z0(textViewArra);
       do5.y0(textViewArra);
       do5.x0(p0);
    }
}
