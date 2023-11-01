package p.n24;
import androidx.fragment.app.f;
import java.util.LinkedHashSet;
import android.content.Context;
import android.content.res.Resources;
import p.uc4;
import java.util.Calendar;
import p.pe7;
import p.k24;
import java.lang.String;
import java.lang.Class;
import p.ox7;
import android.content.res.TypedArray;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.os.Parcelable;
import p.tp2;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.AbstractCollection;
import java.lang.Object;
import android.content.DialogInterface$OnCancelListener;
import android.os.BaseBundle;
import p.o90;
import java.lang.CharSequence;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import p.wh7;
import p.gh7;
import com.google.android.material.internal.CheckableImageButton;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable;
import p.eb3;
import p.sg;
import p.n3;
import p.m24;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.content.DialogInterface$OnDismissListener;
import p.m90;
import java.lang.Long;
import p.n90;
import android.app.Dialog;
import android.view.Window;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import p.y93;
import android.view.View$OnTouchListener;
import p.r24;
import p.ce5;
import p.q24;
import android.util.AttributeSet;
import android.content.res.ColorStateList;
import p.jh7;

public final class n24 extends f	// class@001f53 from classes.dex
{
    public final LinkedHashSet H;
    public final LinkedHashSet I;
    public int J;
    public ce5 K;
    public o90 L;
    public k24 M;
    public int N;
    public CharSequence O;
    public boolean P;
    public int Q;
    public CheckableImageButton R;
    public q24 S;
    public Button T;

    public void n24(){
       super();
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       linkedHashSe = new LinkedHashSet();
       this.H = new LinkedHashSet();
       this.I = new LinkedHashSet();
    }
    public static int D(Context p0){
       Resources resources = p0.getResources();
       int dimensionPix = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
       int dimensionPix1 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
       uc4 t = new uc4(pe7.b()).t;
       return (((t - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + ((dimensionPix1 * t) + (dimensionPix * 2)));
    }
    public static boolean E(Context p0){
       return n24.F(p0, 0x101020d);
    }
    public static boolean F(Context p0,int p1){
       int[] ointArray = new int[]{p1};
       TypedArray typedArray = p0.obtainStyledAttributes(ox7.G(R.attr.materialCalendarStyle, p0, k24.class.getCanonicalName()), ointArray);
       typedArray.recycle();
       return typedArray.getBoolean(0, 0);
    }
    public final void C(){
       tp2.r(this.getArguments().getParcelable("DATE_SELECTOR_KEY"));
    }
    public final void onCancel(DialogInterface p0){
       Iterator iterator = this.H.iterator();
       while (iterator.hasNext()) {
          iterator.next().onCancel(p0);
       }
       return;
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       if (p0 == null) {
          p0 = this.getArguments();
       }
       this.J = p0.getInt("OVERRIDE_THEME_RES_ID");
       tp2.r(p0.getParcelable("DATE_SELECTOR_KEY"));
       this.L = p0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
       this.N = p0.getInt("TITLE_TEXT_RES_ID_KEY");
       this.O = p0.getCharSequence("TITLE_TEXT_KEY");
       this.Q = p0.getInt("INPUT_MODE_KEY");
       return;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       n24 tO;
       int i = (this.P != null)? 0x7f0d010f: 0x7f0d010e;
       View view = p0.inflate(i, p1);
       Context context = view.getContext();
       if (this.P != null) {
          view.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout$LayoutParams(n24.D(context), -2));
       }else {
          view.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout$LayoutParams(n24.D(context), -1));
       }
       int i1 = 1;
       gh7.f(view.findViewById(R.id.mtrl_picker_header_selection_text), i1);
       this.R = view.findViewById(R.id.mtrl_picker_header_toggle);
       TextView textView = view.findViewById(R.id.mtrl_picker_title_text);
       if ((tO = this.O) != null) {
          textView.setText(tO);
       }else {
          textView.setText(this.N);
       }
       this.R.setTag("TOGGLE_BUTTON_TAG");
       StateListDrawable stateListDra = new StateListDrawable();
       int[] ointArray = new int[i1];
       ointArray[0] = 0x10100a0;
       stateListDra.addState(ointArray, eb3.m(context, R.drawable.material_ic_calendar_black_24dp));
       ointArray = new int[0];
       stateListDra.addState(ointArray, eb3.m(context, R.drawable.material_ic_edit_black_24dp));
       this.R.setImageDrawable(stateListDra);
       n24 tR = this.R;
       if (this.Q == null) {
          i1 = false;
       }
       tR.setChecked(i1);
       wh7.o(this.R, null);
       tR = this.R;
       String str = (tR.isChecked())? tR.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode): tR.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
       this.R.setContentDescription(str);
       this.R.setOnClickListener(new m24(this));
       this.T = view.findViewById(R.id.confirm_button);
       this.C();
       throw null;
    }
    public final void onDismiss(DialogInterface p0){
       ViewGroup view;
       Iterator iterator = this.I.iterator();
       while (iterator.hasNext()) {
          iterator.next().onDismiss(p0);
       }
       if ((view = this.getView()) != null) {
          view.removeAllViews();
       }
       super.onDismiss(p0);
       return;
    }
    public final void onSaveInstanceState(Bundle p0){
       k24 t;
       super.onSaveInstanceState(p0);
       p0.putInt("OVERRIDE_THEME_RES_ID", this.J);
       Parcelable parcelable = null;
       p0.putParcelable("DATE_SELECTOR_KEY", parcelable);
       m90 om90 = new m90(this.L);
       if ((t = this.M.t) != null) {
          om90.c = Long.valueOf(t.w);
       }
       Bundle t1 = new Bundle();
       t1.putParcelable("DEEP_COPY_VALIDATOR_KEY", om90.d);
       uc4 ouc4 = uc4.b(om90.a);
       uc4 ouc41 = uc4.b(om90.b);
       n90 parcelable1 = t1.getParcelable("DEEP_COPY_VALIDATOR_KEY");
       if ((om90 = om90.c) != null) {
          parcelable = uc4.b(om90.longValue());
       }
       p0.putParcelable("CALENDAR_CONSTRAINTS_KEY", new o90(ouc4, ouc41, parcelable1, parcelable));
       p0.putInt("TITLE_TEXT_RES_ID_KEY", this.N);
       p0.putCharSequence("TITLE_TEXT_KEY", this.O);
       return;
    }
    public final void onStart(){
       n24 tJ;
       r24 or24;
       super.onStart();
       Window window = this.y().getWindow();
       if (this.P != null) {
          window.setLayout(-1, -1);
          window.setBackgroundDrawable(this.S);
       }else {
          window.setLayout(-2, -2);
          int dimensionPix = this.getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
          InsetDrawable v2 = new InsetDrawable(this.S, dimensionPix, dimensionPix, dimensionPix, dimensionPix);
          window.setBackgroundDrawable(v2);
          window.getDecorView().setOnTouchListener(new y93(this.y(), new Rect(dimensionPix, dimensionPix, dimensionPix, dimensionPix)));
       }
       this.requireContext();
       if ((tJ = this.J) != null) {
          this.C();
          n24 tL = this.L;
          k24 ok24 = new k24();
          Bundle uBundle = new Bundle();
          uBundle.putInt("THEME_RES_ID_KEY", tJ);
          uBundle.putParcelable("GRID_SELECTOR_KEY", null);
          uBundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", tL);
          uBundle.putParcelable("CURRENT_MONTH_KEY", tL.t);
          ok24.setArguments(uBundle);
          this.M = ok24;
          if (this.R.isChecked()) {
             this.C();
             or24 = new r24();
             uBundle = new Bundle();
             uBundle.putInt("THEME_RES_ID_KEY", tJ);
             uBundle.putParcelable("DATE_SELECTOR_KEY", null);
             uBundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.L);
             or24.setArguments(uBundle);
          }else {
             or24 = this.M;
          }
          this.K = or24;
          this.C();
          this.getContext();
          throw null;
       }else {
          this.C();
          throw null;
       }
    }
    public final void onStop(){
       this.K.a.clear();
       super.onStop();
    }
    public final Dialog x(Bundle p0){
       Context uContext = this.requireContext();
       this.requireContext();
       n24 tJ = this.J;
       AttributeSet uAttributeSe = null;
       if (tJ != null) {
          Dialog uDialog = new Dialog(uContext, tJ);
          uContext = uDialog.getContext();
          this.P = n24.E(uContext);
          int i = ox7.G(R.attr.colorSurface, uContext, n24.class.getCanonicalName());
          q24 oq24 = new q24(uContext, uAttributeSe, 0x7f0303d0, 0x7f13053a);
          this.S = oq24;
          oq24.i(uContext);
          this.S.k(ColorStateList.valueOf(i));
          this.S.j(jh7.i(uDialog.getWindow().getDecorView()));
          return uDialog;
       }else {
          this.C();
          throw uAttributeSe;
       }
    }
}
