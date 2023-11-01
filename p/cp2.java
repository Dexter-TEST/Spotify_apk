package p.cp2;
import p.vo2;
import android.view.View;
import android.widget.TextView;
import p.do5;

public class cp2 extends vo2	// class@00124f from classes.dex
{
    public final TextView t;

    public void cp2(View p0){
       super(p0, 0);
       TextView textView = p0.findViewById(0x1020015);
       this.t = textView;
       TextView[] textViewArra = new TextView[]{textView};
       do5.z0(textViewArra);
       do5.y0(textViewArra);
       do5.x0(p0);
    }
}
