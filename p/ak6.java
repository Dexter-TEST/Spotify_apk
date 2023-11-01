package p.ak6;
import p.fl3;
import p.a07;
import p.uf;
import p.r55;
import p.zr5;
import p.yj6;
import p.kn;
import java.lang.Object;
import java.util.List;
import p.j46;
import java.lang.String;
import p.co5;
import p.j57;
import p.p81;
import p.lq5;
import android.widget.TextView;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatCheckBox;
import android.widget.CompoundButton;
import p.cm1;
import android.view.View;
import com.spotify.legacyglue.icons.SpotifyIconView;
import p.sp6;
import p.vf4;
import p.o81;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import p.vm0;
import p.en6;
import p.zf2;

public final class ak6 extends fl3	// class@000f9f from classes.dex
{
    public final vm0 v;
    public final zf2 w;
    public static final a07 x;

    static {
       ak6.x = new a07(2);
    }
    public void ak6(uf p0,r55 p1){
       super(ak6.x);
       this.v = p0;
       this.w = p1;
    }
    public final void n(zr5 p0,int p1){
       p81 c;
       j46 oj46 = this.t.f.get(p1);
       co5.l(oj46, "item");
       j57 oj57 = new j57(oj46.a, oj46.c);
       yj6 u = p0.u;
       switch (u.a){
           case 0:
             u.c.t.setText(oj57.a);
             u.c.c.setChecked(oj57.b);
             break;
           default:
             View view = u.b.findViewById(R.id.btn_close);
             co5.l(view, "fragmentView.findViewById\(R.id.btn_close\)");
             u.c = view;
             view.setIcon(sp6.q0);
       }
       vf4 ovf4 = new vf4(p0, 4, oj46);
       switch (u.a){
           case 0:
             u.getView().setOnClickListener(new o81(0, ovf4));
             break;
           default:
             if ((c = u.c) != null) {
                c.setOnClickListener(new o81(1, ovf4));
             }else {
                co5.N("dismissButton");
                throw null;
             }
       }
       return;
    }
    public final zr5 o(int p0,RecyclerView p1){
       co5.o(p1, "parent");
       ak6 tv = this.v;
       switch (tv.a){
           case 0:
       }
       return new yj6(en6.a(tv), this.w);
    }
}
