package p.b2;
import android.view.View$OnClickListener;
import p.ju2;
import p.uu2;
import java.lang.Object;
import android.view.View;
import java.util.List;
import java.util.Collection;
import p.w51;
import android.content.Context;
import p.tu2;
import java.lang.String;
import p.xe7;
import java.lang.CharSequence;
import p.tj2;
import java.util.Map;
import p.kn3;
import p.kf6;
import java.lang.Boolean;
import p.dt5;
import p.m73;
import p.cu2;
import p.du2;
import p.p33;
import p.b33;

public final class b2 implements View$OnClickListener	// class@001042 from classes.dex
{
    public final int a;
    public final ju2 b;
    public final uu2 c;

    public void b2(ju2 p0,uu2 p1){
       this.a = 0;
       super();
       this.c = p1;
       this.b = p0;
    }
    public void b2(ju2 p0,uu2 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       ju2 oju2;
       p33 op33;
       String str = "click";
       b2 tb = this.b;
       b2 tc = this.c;
       switch (this.a){
           case 0:
           case 1:
             if ((oju2 = w51.w(tb.j())) != null) {
                tj2 otj2 = xe7.k0(p0.getContext(), xe7.J(oju2.y().d()), xe7.J(oju2.y().e()));
                otj2.e = true;
                ju2 oju21 = w51.w(oju2.e("positive_button"));
                DialogInterface$OnClickListener onClickListe = null;
                if (oju21 != null) {
                   String str1 = oju21.y().d();
                   kn3 okn3 = (oju21.m().containsKey(str))? new kn3(tc, 0, oju21): onClickListe;
                   otj2.a = str1;
                   otj2.c = okn3;
                }
                if ((oju2 = w51.w(oju2.e("negative_button"))) != null) {
                   String str2 = oju2.y().d();
                   if (oju2.m().containsKey(str)) {
                      onClickListe = new kn3(tc, 0, oju2);
                   }
                   otj2.b = str2;
                   otj2.d = onClickListe;
                }
                otj2.a().l();
             }
             return;
             break;
           default:
             if (tb.m().containsKey(str)) {
                tc.c.a(new cu2(str, tb, dt5.x));
             }else if((op33 = tb.D()) != null){
                tc.b.b(op33, tb);
             }
             return;
       }
       tc.c.a(new cu2("downloadClick", tb, m73.h("download", Boolean.TRUE)));
       return;
    }
}
