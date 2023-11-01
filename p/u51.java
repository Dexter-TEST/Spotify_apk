package p.u51;
import android.widget.BaseAdapter;
import android.os.Build$VERSION;
import java.util.Calendar;
import p.pe7;
import java.lang.Object;
import java.lang.Integer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p.et0;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.util.Locale;
import java.lang.String;
import java.lang.CharSequence;
import android.content.Context;

public final class u51 extends BaseAdapter	// class@002844 from classes.dex
{
    public final Calendar a;
    public final int b;
    public final int c;
    public static final int t;

    static {
       int i = (Build$VERSION.SDK_INT >= 26)? 4: 1;
       u51.t = i;
    }
    public void u51(){
       super();
       Calendar uCalendar = pe7.c(null);
       this.a = uCalendar;
       this.b = uCalendar.getMaximum(7);
       this.c = uCalendar.getFirstDayOfWeek();
    }
    public final int getCount(){
       return this.b;
    }
    public final Object getItem(int p0){
       Integer integer;
       u51 tb = this.b;
       if (p0 >= tb) {
          integer = null;
       }else if((p0 = p0 + this.c) > tb){
          p0 = p0 - tb;
       }
       integer = Integer.valueOf(p0);
       return integer;
    }
    public final long getItemId(int p0){
       return 0;
    }
    public final View getView(int p0,View p1,ViewGroup p2){
       View view = p1;
       if (p1 == null) {
          view = et0.n(p2, R.layout.mtrl_calendar_day_of_week, p2, false);
       }
       p0 = p0 + this.c;
       u51 tb = this.b;
       if (p0 > tb) {
          p0 = p0 - tb;
       }
       tb = this.a;
       tb.set(7, p0);
       view.setText(tb.getDisplayName(7, u51.t, view.getResources().getConfiguration().locale));
       Object[] objArray = new Object[]{tb.getDisplayName(7, 2, Locale.getDefault())};
       view.setContentDescription(String.format(p2.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), objArray));
       return view;
    }
}
