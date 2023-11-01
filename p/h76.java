package p.h76;
import p.yy;
import android.content.Context;
import com.spotify.search.view.ToolbarSearchFieldView;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import p.ry7;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.content.res.Resources;
import p.lp6;
import p.sp6;
import android.widget.Button;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.FrameLayout$LayoutParams;
import android.widget.TextView;
import p.vv7;
import p.n6;
import android.graphics.drawable.Drawable;
import p.v27;
import com.spotify.search.view.BackKeyEditText;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;
import p.wh7;
import p.jh7;
import p.g76;
import p.n67;
import p.f76;
import p.m67;
import android.widget.TextView$OnEditorActionListener;
import p.rj5;
import android.view.View$OnFocusChangeListener;
import p.g86;
import android.text.TextWatcher;
import java.lang.CharSequence;
import android.view.inputmethod.InputMethodManager;
import android.animation.Animator;
import p.l67;

public final class h76 extends yy	// class@0017f8 from classes.dex
{
    public final ToolbarSearchFieldView d;

    public void h76(Context p0,ToolbarSearchFieldView p1,boolean p2){
       int i3;
       co5.o(p0, "context");
       super();
       this.d = p1;
       int i = -1;
       p1.getLayoutParams().width = i;
       ViewGroup$LayoutParams layoutParams = p1.getLayoutParams();
       int i1 = ry7.u(p0);
       if (!p0 instanceof Activity) {
       }else if((p0.getWindow().getAttributes().flags & 0x4000000)){
          lp6 olp6 = 1;
       label_0035 :
          if (i2) {
             i1 = i1 + ry7.F(p0);
          }
          layoutParams.height = i1;
          Resources resources = p0.getResources();
          co5.l(resources, "context.resources");
          olp6 = new lp6(p0, sp6.f0, (float)resources.getDimensionPixelSize(R.dimen.std_24dp));
          Button searchPlaceH = p1.getSearchPlaceHolder();
          i1 = p1.getInsetX() + (int)TypedValue.applyDimension(1, 8.00f, resources.getDisplayMetrics());
          co5.l(searchPlaceH, "searchPlaceHolder");
          FrameLayout$LayoutParams resources1 = new FrameLayout$LayoutParams(-2, i);
          resources1.leftMargin = i1;
          resources1.rightMargin = i1;
          resources1.gravity = 0x800003;
          searchPlaceH.setLayoutParams(resources1);
          vv7.Q(searchPlaceH, R.style.TextAppearance.Encore.MestoBold);
          if (p2) {
             i3 = 0x7f050161;
             searchPlaceH.setTextColor(n6.b(searchPlaceH.getContext(), i3));
             olp6.b(n6.b(searchPlaceH.getContext(), i3));
          }else {
             i3 = 0x7f050163;
             searchPlaceH.setTextColor(n6.b(searchPlaceH.getContext(), i3));
             olp6.b(n6.b(searchPlaceH.getContext(), i3));
          }
          v27.g(searchPlaceH, olp6, null, null, null);
          InputFilter$LengthFilter[] lengthFilter = new InputFilter$LengthFilter[]{new InputFilter$LengthFilter(500)};
          p1.getQueryEditText().setFilters(lengthFilter);
          jh7.v(p1.findViewById(R.id.search_toolbar), "search_field");
          p1.setToolbarSearchFieldRightButtonListener(new g76(this));
          p1.setToolbarSearchFieldCallbacks(new f76(this));
          BackKeyEditText uBackKeyEdit = this.a();
          uBackKeyEdit.setOnEditorActionListener(this.c);
          uBackKeyEdit.setOnFocusChangeListener(new rj5(1, this));
          uBackKeyEdit.addTextChangedListener(new g86(this));
          ToolbarSearchFieldView v = p1.v;
          v.setContentDescription(v.getContext().getString(R.string.search_clear_query_accessibility));
          return;
       }
       int i2 = 0;
       goto label_0035 ;
    }
    public final BackKeyEditText a(){
       BackKeyEditText queryEditTex = this.d.getQueryEditText();
       co5.l(queryEditTex, "mSearchFieldView.queryEditText");
       return queryEditTex;
    }
    public final void b(){
       BackKeyEditText uBackKeyEdit = this.a();
       uBackKeyEdit.requestFocus();
       uBackKeyEdit.getContext().getSystemService("input_method").showSoftInput(uBackKeyEdit, 1);
       ToolbarSearchFieldView c = this.d.C;
       Animator[] uAnimatorArr = new Animator[]{c.d,c.c};
       c.b(uAnimatorArr);
    }
}
