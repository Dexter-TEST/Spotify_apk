package p.az3;
import p.xz4;
import p.dz3;
import java.lang.Object;
import p.vy3;
import java.lang.String;
import p.co5;
import android.view.ViewGroup;
import java.util.Iterator;
import java.lang.Iterable;
import p.vu5;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import p.cz3;
import android.view.View$OnClickListener;

public final class az3 implements xz4	// class@001020 from classes.dex
{
    public final dz3 a;

    public void az3(dz3 p0){
       this.a = p0;
       super();
    }
    public final void b(Object p0){
       dz3 m;
       co5.l(p0, "it");
       az3 ta = this.a;
       if ((m = ta.M) != null) {
          m.removeAllViews();
          p0 = p0.a.iterator();
          while (true) {
             if (!p0.hasNext()) {
                return;
             }
             vu5 ovu5 = p0.next();
             View view = LayoutInflater.from(ta.getContext()).inflate(R.layout.lyrics_fullscreen_report_element, null);
             co5.j(view, "null cannot be cast to non-null type android.widget.TextView");
             view.setText(ovu5.b);
             view.setOnClickListener(new cz3(ta, ovu5));
             if ((m = ta.M) != null) {
                m.addView(view);
             }else {
                break ;
             }
          }
          co5.N("reportOptionsContainer");
          throw null;
       }else {
          co5.N("reportOptionsContainer");
          throw null;
       }
    }
}
