package p.rj1;
import android.text.InputFilter;
import android.widget.TextView;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.Spanned;
import android.view.View;
import p.hj1;
import p.qj1;
import p.fj1;

public final class rj1 implements InputFilter	// class@0024f9 from classes.dex
{
    public final TextView a;
    public qj1 b;

    public void rj1(TextView p0){
       super();
       this.a = p0;
    }
    public final CharSequence filter(CharSequence p0,int p1,int p2,Spanned p3,int p4,int p5){
       int i;
       rj1 ta = this.a;
       if (ta.isInEditMode()) {
          return p0;
       }
       if (i = hj1.a().b()) {
          int i1 = 1;
          if (i != i1) {
             if (i != 3) {
                return p0;
             }
          }else if(!p5 && (!p4 && (!p3.length() && p0 == ta.getText()))){
             i1 = 0;
          }
          if (i1 && p0 != null) {
             if (p1 || p2 != p0.length()) {
                p0 = p0.subSequence(p1, p2);
             }
             p0 = hj1.a().f(0, p0.length(), p0);
          }
          return p0;
       }
       hj1 ohj1 = hj1.a();
       if (this.b == null) {
          this.b = new qj1(ta, this);
       }
       ohj1.g(this.b);
       return p0;
    }
}
