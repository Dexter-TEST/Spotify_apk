package p.lh5;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import p.uu2;
import java.lang.Object;
import p.wh7;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import p.jm7;
import android.view.View$OnClickListener;
import android.content.res.Resources;
import java.lang.String;
import android.text.Layout;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.ja3;
import java.lang.Runnable;

public final class lh5 implements View$OnLayoutChangeListener	// class@001d55 from classes.dex
{
    public final TextView a;
    public final TextView b;
    public final uu2 c;
    public final int d;
    public final TextUtils$TruncateAt e;
    public ju2 f;

    public void lh5(View p0,uu2 p1){
       super();
       TextView textView = wh7.m(p0, R.id.description);
       this.a = textView;
       TextView textView1 = wh7.m(p0, R.id.button);
       this.b = textView1;
       this.d = textView.getMaxLines();
       this.e = textView.getEllipsize();
       this.c = p1;
       p0.addOnLayoutChangeListener(this);
       textView1.setOnClickListener(new jm7(6, this));
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       String str;
       Layout layout;
       if (this.f != null && ((p4 - p2)) != (p8 - p6)) {
          lh5 ta = this.a;
          p4 = 0;
          lh5 tb = this.b;
          if (ta.getMaxLines() != this.d) {
             str = p0.getResources().getString(R.string.podcast_description_show_less);
          }else if(ta != null && (ta.getMaxLines() != -1 && ((layout = ta.getLayout()) != null && (p2 = layout.getLineCount()) > 0))){
             p3 = 1;
             if (layout.getEllipsisCount((p2 - p3)) > 0) {
             label_0042 :
                if (p3) {
                   str = p0.getResources().getString(R.string.podcast_description_show_more);
                }else {
                   str = tb.getText();
                   p4 = 8;
                }
             }
          }
          p3 = 0;
          goto label_0042 ;
          if (tb.getVisibility() != p4 || !TextUtils.equals(str, tb.getText())) {
             tb.setVisibility(p4);
             p0.post(new ja3(this, 12, str));
          }
       }
       return;
    }
}
