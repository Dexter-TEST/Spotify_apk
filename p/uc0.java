package p.uc0;
import p.ir0;
import com.spotify.litesettings.settings.CellularSettingsActivity;
import java.lang.Object;
import p.u65;
import java.lang.Class;
import p.l51;
import p.z4;
import java.lang.String;
import java.lang.Throwable;
import p.jl;
import p.yi4;
import java.lang.Long;
import p.p80;
import p.xj0;
import p.yt;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.View;
import android.content.Context;
import android.text.format.DateUtils;
import androidx.constraintlayout.widget.Group;
import android.widget.ProgressBar;
import androidx.appcompat.app.a;
import java.lang.Math;
import p.jc7;
import android.app.Activity;

public final class uc0 implements ir0	// class@002880 from classes.dex
{
    public final int a;
    public final CellularSettingsActivity b;

    public void uc0(CellularSettingsActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       z4 b1;
       uc0 ouc0 = this;
       uc0 b = ouc0.b;
       switch (ouc0.a){
           case 0:
             break;
           default:
             b.finish();
             return;
       }
       u65 ou65 = p0;
       b.getClass();
       u65 a = ou65.a;
       a.getClass();
       ou65 = ou65.b;
       ou65.getClass();
       int i = 8;
       if (a.a == null && ou65.a == null) {
          if ((b1 = a.b) != null) {
             jl.f("Error loading network stats", b1);
          }else if((b1 = ou65.b) != null){
             jl.f("Error loading usage limit", b1);
          }else {
             l51 c = a.c;
             long l = c.a + c.b;
             long l1 = ou65.c.longValue();
             p80 op80 = xj0.r0(l);
             p80 op801 = xj0.r0(l1);
             b.R.b.setText(String.valueOf(op80.b(l)));
             b.R.h.setText(xj0.t0(b, op80));
             b.R.c.setVisibility(0);
             b.R.d.setText(String.valueOf(op801.b(l1)));
             b.R.e.setText(xj0.t0(b, op801));
             b.R.g.setVisibility(0);
             Object[] objArray = new Object[]{DateUtils.formatDateTime(b, c.c, i)};
             b.R.f.setText(b.getString(R.string.cellular_data_reset, objArray));
             b.R.i.setVisibility(0);
             b.R.l.setMax((int)(l1 / 1000));
             b.R.l.setProgress((int)(l / 1000));
             b.R.o.setText(xj0.s0(b, 0, p80.a));
             b.R.m.setText(xj0.s0(b, l1, op801));
             long l2 = Math.max(0, (l1 - l));
             String str = xj0.s0(b, l, op80);
             Object[] objArray1 = new Object[]{str};
             b.R.p.setText(b.getString(R.string.cellular_data_used, objArray1));
             Object[] objArray2 = new Object[]{xj0.s0(b, l2, xj0.r0(l2))};
             b.R.n.setText(b.getString(R.string.cellular_data_remaining, objArray2));
          }
       }else {
          b.R.b.setText(null);
          b.R.h.setText(null);
          b.R.c.setVisibility(i);
          b.R.d.setText(null);
          b.R.e.setText(null);
          b.R.g.setVisibility(i);
          b.R.f.setText(null);
          b.R.i.setVisibility(i);
       }
       return;
    }
}
