package p.hx3;
import p.yq5;
import p.hz3;
import p.qw3;
import p.mw3;
import java.lang.CharSequence;
import p.av6;
import p.zr5;
import p.gx3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class hx3 extends yq5	// class@0018de from classes.dex
{
    public final hz3 t;

    public void hx3(hz3 p0){
       super();
       this.t = p0;
    }
    public final int d(){
       int i;
       hx3 tt = this.t;
       if (tt.e != null) {
          i = 1;
          if ((av6.p0(tt.a.w.b) ^ i)) {
          label_0016 :
             return i;
          }
       }
       i = 0;
       goto label_0016 ;
    }
    public final void n(zr5 p0,int p1){
       hx3 tt = this.t;
       co5.o(tt, "model");
       gx3 u = p0.u;
       Object[] objArray = new Object[]{tt.a.w.b};
       u.setText(u.getContext().getString(R.string.lyrics_full_screen_provider, objArray));
       u.setTextColor(tt.c);
    }
    public final zr5 o(int p0,RecyclerView p1){
       co5.o(p1, "parent");
       View view = LayoutInflater.from(p1.getContext()).inflate(R.layout.lyrics_footer_decoration, p1, false);
       co5.j(view, "null cannot be cast to non-null type android.widget.TextView");
       return new gx3(view);
    }
}
