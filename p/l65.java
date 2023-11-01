package p.l65;
import p.ir0;
import p.m65;
import java.lang.Object;
import java.lang.Boolean;
import android.view.View;
import java.lang.Throwable;
import p.l51;
import java.lang.Class;
import p.z4;
import p.an5;
import java.util.List;
import p.q65;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p.mn3;
import p.hr5;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Parcelable;
import p.yq5;
import p.jc7;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.et0;

public final class l65 implements ir0	// class@001cf2 from classes.dex
{
    public final int a;
    public final m65 b;

    public void l65(m65 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       int i = 8;
       l65 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             tb.b.onNext(Boolean.valueOf(p0.a));
             l51 c = p0.c;
             if ((p0 = p0.b) != null) {
                tb.z(p0);
             }else if(c != null){
                p0 = tb.u();
                p0.x = c;
                tb.c.setVisibility(0);
                tb.y.setVisibility(i);
                tb.A.a.setVisibility(i);
                if (tb.B != null) {
                   hr5 layoutManage = tb.x.getLayoutManager();
                   layoutManage.getClass();
                   layoutManage.s0(tb.B);
                   tb.B = null;
                }
                p0.g();
             }
             return;
             break;
           case 1:
           case 2:
             m65 y = tb.y;
             if (p0.booleanValue()) {
                i = 0;
             }
             y.setVisibility(i);
             return;
             break;
           default:
             et0.d(tb.getActivity());
             return;
       }
       tb.z(p0);
       return;
    }
}
