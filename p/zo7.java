package p.zo7;
import p.yq5;
import p.zr5;
import p.yo7;
import p.qo5;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import p.ry7;
import android.widget.LinearLayout;
import java.lang.Object;
import android.content.res.Resources;
import java.lang.String;
import java.lang.NullPointerException;

public final class zo7 extends yq5	// class@002f3b from classes.dex
{
    public final int[] t;
    public final int[] v;

    public void zo7(){
       super();
       this.t = new int[3]{0x7f070597,0x7f070598,0x7f070599};
       this.v = new int[3]{0x7f12041b,0x7f12041c,0x7f12041d};
    }
    public final int d(){
       return this.t.length;
    }
    public final void n(zr5 p0,int p1){
       yo7 u = p0.u;
       u.b.setImageResource(this.t[p1]);
       u.c.setText(this.v[p1]);
    }
    public final zr5 o(int p0,RecyclerView p1){
       ImageView imageView;
       TextView textView;
       View view = LayoutInflater.from(p1.getContext()).inflate(R.layout.item_welcome_pager, p1, false);
       int i = 0x7f0a03f8;
       if ((imageView = ry7.q(view, i)) != null) {
          i = 0x7f0a0612;
          if ((textView = ry7.q(view, i)) != null) {
             return new yo7(new qo5(view, imageView, textView));
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
