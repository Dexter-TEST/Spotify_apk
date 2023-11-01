package p.zj2;
import p.wj2;
import android.view.View;
import java.lang.Object;
import android.widget.TextView;
import p.do5;
import java.lang.CharSequence;

public final class zj2 implements wj2	// class@002f09 from classes.dex
{
    public final View a;
    public final TextView b;
    public final TextView c;

    public void zj2(View p0){
       super();
       this.a = p0;
       this.b = p0.findViewById(0x1020014);
       TextView textView = p0.findViewById(0x1020015);
       this.c = textView;
       TextView[] textViewArra = new TextView[]{textView};
       do5.z0(textViewArra);
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
