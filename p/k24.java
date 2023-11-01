package p.k24;
import p.ce5;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.String;
import android.os.BaseBundle;
import android.os.Parcelable;
import p.tp2;
import p.o90;
import p.uc4;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.view.ContextThemeWrapper;
import android.content.Context;
import p.ej5;
import p.n24;
import android.content.res.Resources;
import p.vc4;
import android.widget.GridView;
import p.f24;
import java.lang.Object;
import p.n3;
import p.wh7;
import p.u51;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import p.g24;
import p.hr5;
import com.google.android.material.datepicker.c;
import p.uv1;
import p.yq5;
import androidx.recyclerview.widget.GridLayoutManager;
import p.ls7;
import p.h24;
import p.er5;
import com.google.android.material.button.MaterialButton;
import java.lang.CharSequence;
import android.widget.TextView;
import p.i24;
import p.mr5;
import p.k8;
import android.view.View$OnClickListener;
import p.j24;
import p.g65;
import java.util.GregorianCalendar;
import java.lang.IllegalArgumentException;
import java.lang.Math;
import p.zj7;
import java.lang.Runnable;

public final class k24 extends ce5	// class@001b92 from classes.dex
{
    public View A;
    public int b;
    public o90 c;
    public uc4 t;
    public int v;
    public ej5 w;
    public RecyclerView x;
    public RecyclerView y;
    public View z;
    public static final int B;

    public void k24(){
       super();
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       if (p0 == null) {
          p0 = this.getArguments();
       }
       this.b = p0.getInt("THEME_RES_ID_KEY");
       tp2.r(p0.getParcelable("GRID_SELECTOR_KEY"));
       this.c = p0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
       this.t = p0.getParcelable("CURRENT_MONTH_KEY");
       return;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       int i1;
       ContextThemeWrapper uContextThem = new ContextThemeWrapper(this.getContext(), this.b);
       this.w = new ej5(uContextThem);
       p0 = p0.cloneInContext(uContextThem);
       o90 a = this.c.a;
       boolean b = true;
       if (n24.E(uContextThem)) {
          i = 0x7f0d0108;
          i1 = 1;
       }else {
          i = 0x7f0d0103;
          i1 = 0;
       }
       View view = p0.inflate(i, p1, false);
       Resources resources = this.requireContext().getResources();
       int dimensionPix = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
       int t = vc4.t;
       int i2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * t;
       view.setMinimumHeight(((((resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height))) + dimensionPix) + ((resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (t - 1)) + i2)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding)));
       GridView gridView = view.findViewById(R.id.mtrl_calendar_days_of_week);
       wh7.o(gridView, new f24(false, this));
       gridView.setAdapter(new u51());
       gridView.setNumColumns(a.t);
       gridView.setEnabled(false);
       this.y = view.findViewById(R.id.mtrl_calendar_months);
       this.getContext();
       this.y.setLayoutManager(new g24(this, i1, i1));
       this.y.setTag("MONTHS_VIEW_GROUP_TAG");
       c uoc = new c(uContextThem, this.c, new uv1(15, this));
       this.y.setAdapter(uoc);
       int integer = uContextThem.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
       i = 0x7f0a049b;
       RecyclerView recyclerView = view.findViewById(i);
       this.x = recyclerView;
       if (recyclerView != null) {
          recyclerView.setHasFixedSize(b);
          this.x.setLayoutManager(new GridLayoutManager(integer, false));
          this.x.setAdapter(new ls7(this));
          this.x.h(new h24(this), -1);
       }
       integer = 0x7f0a048e;
       if (view.findViewById(integer) != null) {
          MaterialButton materialButt = view.findViewById(integer);
          materialButt.setTag("SELECTOR_TOGGLE_TAG");
          wh7.o(materialButt, new f24(b, this));
          MaterialButton materialButt1 = view.findViewById(R.id.month_navigation_previous);
          materialButt1.setTag("NAVIGATION_PREV_TAG");
          MaterialButton materialButt2 = view.findViewById(R.id.month_navigation_next);
          materialButt2.setTag("NAVIGATION_NEXT_TAG");
          this.z = view.findViewById(i);
          this.A = view.findViewById(R.id.mtrl_calendar_day_selector_frame);
          this.v(b);
          materialButt.setText(this.t.d(view.getContext()));
          this.y.i(new i24(this, uoc, materialButt));
          materialButt.setOnClickListener(new k8(3, this));
          materialButt2.setOnClickListener(new j24(this, uoc, false));
          materialButt1.setOnClickListener(new j24(this, uoc, b));
       }
       if (!n24.E(uContextThem)) {
          new g65().a(this.y);
       }
       k24 ty = this.y;
       k24 tt = this.t;
       o90 a1 = uoc.v.a;
       if (a1.a instanceof GregorianCalendar) {
          ty.g0(((tt.b - a1.b) + ((tt.c - a1.c) * 12)));
          return view;
       }else {
          throw new IllegalArgumentException("Only Gregorian calendars are supported.");
       }
    }
    public final void onSaveInstanceState(Bundle p0){
       p0.putInt("THEME_RES_ID_KEY", this.b);
       p0.putParcelable("GRID_SELECTOR_KEY", null);
       p0.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.c);
       p0.putParcelable("CURRENT_MONTH_KEY", this.t);
    }
    public final void u(uc4 p0){
       o90 a = this.y.getAdapter().v.a;
       uc4 a1 = a.a;
       String str = "Only Gregorian calendars are supported.";
       if (!a1 instanceof GregorianCalendar) {
          throw new IllegalArgumentException(str);
       }
       uc4 c = a.c;
       uc4 b = a.b;
       int i = (p0.b - b) + ((p0.c - c) * 12);
       k24 tt = this.t;
       if (!a1 instanceof GregorianCalendar) {
          throw new IllegalArgumentException(str);
       }
       int i1 = i - ((tt.b - b) + ((tt.c - c) * 12));
       tt = 0;
       a1 = (Math.abs(i1) > 3)? 1: 0;
       if (i1 > 0) {
          tt = 1;
       }
       this.t = p0;
       if (a1 && tt) {
          this.y.g0((i - 3));
          this.y.post(new zj7(i, 3, this));
       }else if(a1){
          this.y.g0((i + 3));
          this.y.post(new zj7(i, 3, this));
       }else {
          this.y.post(new zj7(i, 3, this));
       }
       return;
    }
    public final void v(int p0){
       this.v = p0;
       if (p0 == 2) {
          this.x.getLayoutManager().D0((this.t.c - this.x.getAdapter().t.c.a.c));
          this.z.setVisibility(0);
          this.A.setVisibility(8);
       }else if(p0 == 1){
          this.z.setVisibility(8);
          this.A.setVisibility(0);
          this.u(this.t);
       }
       return;
    }
}
