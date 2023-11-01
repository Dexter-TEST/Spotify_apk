package p.vc4;
import android.widget.BaseAdapter;
import java.util.Calendar;
import p.pe7;
import p.uc4;
import p.o90;
import java.lang.Long;
import android.widget.TextView;
import p.s51;
import p.ej5;
import p.ob2;
import java.lang.Class;
import java.lang.Object;
import p.q24;
import p.bd6;
import android.content.res.ColorStateList;
import p.p24;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.Rect;
import p.wh7;
import android.view.View;
import p.dh7;
import android.view.ViewGroup;
import android.content.Context;
import p.et0;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.lang.Integer;
import java.util.Locale;
import java.lang.String;
import java.lang.CharSequence;
import android.os.Build$VERSION;
import android.icu.text.DateFormat;
import p.zo4;
import android.icu.util.TimeZone;
import java.util.Date;
import p.k11;
import java.text.DateFormat;
import java.util.TimeZone;

public final class vc4 extends BaseAdapter	// class@0029c6 from classes.dex
{
    public final uc4 a;
    public ej5 b;
    public final o90 c;
    public static final int t;

    static {
       vc4.t = pe7.c(null).getMaximum(4);
    }
    public void vc4(uc4 p0,o90 p1){
       super();
       this.a = p0;
       this.c = p1;
       throw null;
    }
    public final int a(){
       return this.a.c();
    }
    public final Long b(int p0){
       vc4 ta = this.a;
       if (p0 < ta.c() || p0 > ((ta.c() + ta.v) - 1)) {
          return null;
       }
       Calendar uCalendar = pe7.a(ta.a);
       uCalendar.set(5, ((p0 - ta.c()) + 1));
       return Long.valueOf(uCalendar.getTimeInMillis());
    }
    public final void c(TextView p0,long p1){
       if (p0 == null) {
          return;
       }
       boolean b = true;
       boolean b1 = false;
       int i = ((p1 - this.c.c.a) >= 0)? 1: 0;
       if (!i) {
          p0.setEnabled(b1);
          ej5 g = this.b.g;
          g.getClass();
          q24 oq24 = new q24();
          q24 oq241 = new q24();
          ob2 x = g.x;
          oq24.setShapeAppearanceModel(x);
          oq241.setShapeAppearanceModel(x);
          oq24.k(g.v);
          ob2 w = g.w;
          oq24.a.k = (float)g.b;
          oq24.invalidateSelf();
          q24 a = oq24.a;
          if (a.d != w) {
             a.d = w;
             oq24.onStateChange(oq24.getState());
          }
          p0.setTextColor(g.t);
          ob2 c = g.c;
          InsetDrawable oq242 = new InsetDrawable(new RippleDrawable(g.t.withAlpha(30), oq24, oq241), c.left, c.top, c.right, c.bottom);
          dh7.q(p0, oq24);
          return;
       }else {
          p0.setEnabled(b);
          throw null;
       }
    }
    public final int getCount(){
       return (this.a() + this.a.v);
    }
    public final Object getItem(int p0){
       return this.b(p0);
    }
    public final long getItemId(int p0){
       return (long)(p0 / this.a.t);
    }
    public final View getView(int p0,View p1,ViewGroup p2){
       int i;
       Long longx;
       Locale default;
       DateFormat uDateFormat;
       DateFormat dateInstance;
       Context context = p2.getContext();
       if (this.b == null) {
          this.b = new ej5(context);
       }
       View view = p1;
       if (p1 == null) {
          view = et0.n(p2, R.layout.mtrl_calendar_day, p2, false);
       }
       if ((i = p0 - this.a()) >= 0) {
          vc4 ta = this.a;
          if (i < ta.v) {
             i = i + 1;
             view.setTag(ta);
             Object[] objArray = new Object[]{Integer.valueOf(i)};
             view.setText(String.format(view.getResources().getConfiguration().locale, "%d", objArray));
             Calendar uCalendar = pe7.a(ta.a);
             uCalendar.set(5, i);
             long timeInMillis = uCalendar.getTimeInMillis();
             Calendar uCalendar1 = pe7.b();
             uCalendar1.set(5, 1);
             uCalendar1 = pe7.a(uCalendar1);
             uCalendar1.get(2);
             int i1 = uCalendar1.get(1);
             uCalendar1.getMaximum(7);
             uCalendar1.getActualMaximum(5);
             uCalendar1.getTimeInMillis();
             String str = "UTC";
             if (ta.c == i1) {
                default = Locale.getDefault();
                if (Build$VERSION.SDK_INT >= 24) {
                   uDateFormat = zo4.b("MMMEd", default);
                   zo4.s(uDateFormat, zo4.d());
                   str = k11.l(uDateFormat, new Date(timeInMillis));
                }else {
                   dateInstance = DateFormat.getDateInstance(false, default);
                   dateInstance.setTimeZone(TimeZone.getTimeZone(str));
                   str = dateInstance.format(new Date(timeInMillis));
                }
                view.setContentDescription(str);
             }else {
                default = Locale.getDefault();
                if (Build$VERSION.SDK_INT >= 24) {
                   uDateFormat = zo4.b("yMMMEd", default);
                   zo4.s(uDateFormat, zo4.d());
                   str = k11.l(uDateFormat, new Date(timeInMillis));
                }else {
                   dateInstance = DateFormat.getDateInstance(false, default);
                   dateInstance.setTimeZone(TimeZone.getTimeZone(str));
                   str = dateInstance.format(new Date(timeInMillis));
                }
                view.setContentDescription(str);
             }
             view.setVisibility(false);
             view.setEnabled(1);
          label_00fe :
             if ((longx = this.b(p0)) != null) {
                this.c(view, longx.longValue());
             }
             return view;
          }
       }
       view.setVisibility(8);
       view.setEnabled(false);
       goto label_00fe ;
    }
    public final boolean hasStableIds(){
       return true;
    }
}
