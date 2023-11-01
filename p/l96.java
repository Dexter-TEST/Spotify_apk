package p.l96;
import p.k96;
import android.view.View;
import java.lang.Object;
import android.widget.TextView;
import p.lp6;
import android.content.Context;
import p.sp6;
import android.content.res.Resources;
import p.xj0;
import p.jp6;
import android.graphics.drawable.Drawable;
import p.do5;
import p.ap5;
import java.lang.String;
import p.ox7;
import android.text.SpannableString;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import p.rp6;

public class l96 implements k96	// class@001d0e from classes.dex
{
    public final View a;
    public final TextView b;
    public CharSequence c;
    public final lp6 t;
    public boolean v;

    public void l96(View p0){
       super();
       this.a = p0;
       TextView textView = p0.findViewById(0x1020014);
       this.b = textView;
       lp6 olp6 = new lp6(textView.getContext(), sp6.G, (textView.getTextSize() / 2.00f));
       this.t = olp6;
       lp6 l = olp6.l;
       l.a = xj0.e0(6.00f, textView.getResources());
       l.b = 0;
       l.c = 0;
       l.t = 0;
       olp6.m = l;
       olp6.invalidateSelf();
       olp6.setBounds(0, 0, olp6.getIntrinsicWidth(), olp6.getIntrinsicHeight());
       TextView[] textViewArra = new TextView[]{textView};
       do5.z0(textViewArra);
       do5.y0(textViewArra);
       do5.x0(p0);
       if (textView.isDuplicateParentStateEnabled()) {
          ap5.n(p0);
       }else {
          ap5.n(textView);
       }
       return;
    }
    public final void a(){
       SpannableString spannableStr;
       l96 tb = this.b;
       if (this.v != null) {
          l96 tc = this.c;
          l96 tt = this.t;
          String str = tt.a();
          int i = xj0.e0(6.00f, tb.getResources());
          lp6 l = tt.l;
          if (ox7.x(this.a.getContext())) {
             l.a = 0;
             l.b = 0;
             l.c = i;
             l.t = 0;
             tt.m = l;
             tt.invalidateSelf();
             spannableStr = new SpannableString(str+tc);
             spannableStr.setSpan(new rp6(tt), 0, 1, 18);
          }else {
             l.a = i;
             l.b = 0;
             l.c = 0;
             l.t = 0;
             tt.m = l;
             tt.invalidateSelf();
             spannableStr = new SpannableString(tc+str);
             rp6 orp6 = new rp6(tt);
             spannableStr.setSpan(orp6, tc.length(), (tc.length() + 1), 18);
          }
          tb.setText(spannableStr);
       }else {
          tb.setText(this.c);
       }
       return;
    }
    public final View getView(){
       return this.a;
    }
}
