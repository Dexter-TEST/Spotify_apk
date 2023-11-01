package p.c07;
import p.fl3;
import p.a07;
import p.cc1;
import p.cs0;
import p.zr5;
import p.vz6;
import p.kn;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import p.co5;
import p.je5;
import java.lang.Integer;
import p.ng2;
import java.lang.Class;
import android.view.View;
import java.lang.CharSequence;
import android.widget.TextView;
import p.vv7;
import android.content.res.Resources;
import p.f5;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import p.ap5;
import p.zf2;

public final class c07 extends fl3	// class@001171 from classes.dex
{
    public final zf2 v;
    public final ng2 w;
    public static final a07 x;

    static {
       c07.x = new a07(0);
    }
    public void c07(cc1 p0,cs0 p1){
       super(c07.x);
       this.v = p0;
       this.w = p1;
    }
    public final void n(zr5 p0,int p1){
       vz6 v;
       Object[] objArray;
       String str;
       Object obj = this.t.f.get(p1);
       co5.l(obj, "getItem\(position\)");
       if ((v = p0.v) != null) {
          v.b(Integer.valueOf(p0.d()), obj.b);
       }
       je5 a = obj.a;
       co5.o(a, "label");
       vz6 w = p0.w;
       w.getClass();
       w.setSelected(obj.c);
       w.setText(a);
       int i = (w.isSelected())? 0x7f13026b: 0x7f13026a;
       vv7.Q(w, i);
       int i1 = 1;
       if (w.isSelected()) {
          objArray = new Object[i1];
          objArray[0] = a;
          str = w.getResources().getString(R.string.chip_selected_content_description, objArray);
       }else {
          objArray = new Object[i1];
          objArray[0] = a;
          str = w.getResources().getString(R.string.chip_unselected_content_description, objArray);
       }
       w.setContentDescription(str);
       w.setOnClickListener(new f5(3, p0, obj));
       return;
    }
    public final zr5 o(int p0,RecyclerView p1){
       co5.o(p1, "parent");
       Context context = p1.getContext();
       co5.l(context, "parent.context");
       View view = ap5.s(context, R.layout.allboarding_item_tag, null, 6);
       co5.l(view, "view");
       return new vz6(view, this.v, this.w);
    }
}
