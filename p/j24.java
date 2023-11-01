package p.j24;
import android.view.View$OnClickListener;
import p.k24;
import com.google.android.material.datepicker.c;
import java.lang.Object;
import android.view.View;
import p.hr5;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import p.yq5;
import p.o90;
import p.uc4;
import java.util.Calendar;
import p.pe7;

public final class j24 implements View$OnClickListener	// class@001a51 from classes.dex
{
    public final int a;
    public final c b;
    public final k24 c;

    public void j24(k24 p0,c p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final void onClick(View p0){
       int i1;
       Calendar uCalendar;
       int i = 2;
       j24 tb = this.b;
       j24 tc = this.c;
       switch (this.a){
           case 0:
             if ((i1 = tc.y.getLayoutManager().a1() + 1) < tc.y.getAdapter().d()) {
                uCalendar = pe7.a(tb.v.a.a);
                uCalendar.add(i, i1);
                tc.u(new uc4(uCalendar));
             }
             break;
           default:
             if ((i1 = tc.y.getLayoutManager().c1() - 1) >= 0) {
                uCalendar = pe7.a(tb.v.a.a);
                uCalendar.add(i, i1);
                tc.u(new uc4(uCalendar));
             }
             return;
       }
       return;
    }
}
