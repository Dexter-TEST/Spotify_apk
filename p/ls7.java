package p.ls7;
import p.yq5;
import p.k24;
import p.o90;
import p.zr5;
import p.ks7;
import p.uc4;
import android.content.Context;
import android.view.View;
import java.lang.String;
import java.util.Locale;
import java.lang.Object;
import java.lang.Integer;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Calendar;
import p.pe7;
import p.ej5;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class ls7 extends yq5	// class@001db7 from classes.dex
{
    public final k24 t;

    public void ls7(k24 p0){
       super();
       this.t = p0;
    }
    public final int d(){
       return this.t.c.v;
    }
    public final void n(zr5 p0,int p1){
       ls7 tt = this.t;
       int i = tt.c.a.c + p1;
       ks7 u = p0.u;
       Object[] objArray = new Object[]{Integer.valueOf(i)};
       u.setText(String.format(Locale.getDefault(), "%d", objArray));
       Object[] objArray1 = new Object[]{Integer.valueOf(i)};
       u.setContentDescription(String.format(u.getContext().getString(R.string.mtrl_picker_navigate_to_year_description), objArray1));
       k24 w = tt.w;
       ej5 f = (pe7.b().get(1) == i)? w.f: w.e;
       throw null;
    }
    public final zr5 o(int p0,RecyclerView p1){
       return new ks7(LayoutInflater.from(p1.getContext()).inflate(R.layout.mtrl_calendar_year, p1, false));
    }
}
