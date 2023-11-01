package p.vo2;
import p.uo2;
import android.view.View;
import java.lang.Object;
import android.widget.TextView;
import p.do5;
import java.lang.CharSequence;

public class vo2 implements uo2	// class@002a33 from classes.dex
{
    public final int a;
    public final View b;
    public final TextView c;

    public void vo2(View p0,int p1){
       this.a = p1;
       int i = 1;
       if (p1 != i) {
          super();
          this.b = p0;
          TextView textView = p0.findViewById(0x1020014);
          this.c = textView;
          TextView[] textViewArra = new TextView[i];
          textViewArra[0] = textView;
          do5.z0(textViewArra);
          do5.y0(textViewArra);
          do5.x0(p0);
          return;
       }else {
          super();
          this.b = p0;
          this.c = p0.findViewById(R.id.title);
          return;
       }
    }
    public int b(){
       vo2 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return (tb.getMeasuredWidth() / 2);
       }
       return (tb.getMeasuredWidth() / 2);
    }
    public boolean c(){
       switch (this.a){
           case 0:
           default:
             return true;
       }
       return false;
    }
    public int f(){
       vo2 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return (tb.getHeight() / 2);
       }
       return (tb.getHeight() / 2);
    }
    public final View getView(){
       return this.b;
    }
    public final void setTitle(CharSequence p0){
       vo2 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tc.setText(p0);
             return;
       }
       tc.setText(p0);
       return;
    }
}
