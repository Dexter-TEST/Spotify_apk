package p.i24;
import p.mr5;
import p.k24;
import com.google.android.material.datepicker.c;
import com.google.android.material.button.MaterialButton;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import p.hr5;
import androidx.recyclerview.widget.LinearLayoutManager;
import p.o90;
import p.uc4;
import java.util.Calendar;
import p.pe7;
import java.util.TimeZone;
import android.content.Context;
import java.lang.String;
import android.text.format.DateUtils;

public final class i24 extends mr5	// class@00190e from classes.dex
{
    public final c a;
    public final MaterialButton b;
    public final k24 c;

    public void i24(k24 p0,c p1,MaterialButton p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public final void a(RecyclerView p0,int p1){
       if (!p1) {
          p0.announceForAccessibility(this.b.getText());
       }
       return;
    }
    public final void b(RecyclerView p0,int p1,int p2){
       i24 tc = this.c;
       p1 = (p1 < 0)? tc.y.getLayoutManager().a1(): tc.y.getLayoutManager().c1();
       i24 ta = this.a;
       Calendar uCalendar = pe7.a(ta.v.a.a);
       uCalendar.add(2, p1);
       tc.t = new uc4(uCalendar);
       Calendar uCalendar1 = pe7.a(ta.v.a.a);
       uCalendar1.add(2, p1);
       uCalendar1.set(5, 1);
       uCalendar1 = pe7.a(uCalendar1);
       uCalendar1.get(2);
       uCalendar1.get(1);
       uCalendar1.getMaximum(7);
       uCalendar1.getActualMaximum(5);
       uCalendar1.getTimeInMillis();
       long timeInMillis = uCalendar1.getTimeInMillis();
       this.b.setText(DateUtils.formatDateTime(ta.t, (timeInMillis - (long)TimeZone.getDefault().getOffset(timeInMillis)), 36));
       return;
    }
}
