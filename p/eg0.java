package p.eg0;
import p.i27;
import p.im1;
import java.lang.Object;
import com.google.android.material.textfield.TextInputLayout;
import android.widget.EditText;
import android.widget.AutoCompleteTextView;
import p.df1;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.widget.TextView;
import p.q24;
import android.view.View;
import p.ry7;
import p.p24;
import p.bd6;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.LayerDrawable;
import p.wh7;
import p.dh7;
import p.bf1;
import android.view.View$OnTouchListener;
import android.view.View$OnFocusChangeListener;
import p.cf1;
import android.widget.AutoCompleteTextView$OnDismissListener;
import android.text.TextWatcher;
import p.h27;
import java.lang.RuntimeException;
import java.lang.String;
import p.ig0;
import p.l85;
import com.google.android.material.internal.CheckableImageButton;

public final class eg0 implements i27	// class@00147c from classes.dex
{
    public final int a;
    public final im1 b;

    public void eg0(im1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void a(TextInputLayout p0){
       EditText editText1;
       int boxBackgroun;
       boolean b = false;
       eg0 tb = this.b;
       boolean b1 = true;
       switch (this.a){
           case 0:
           case 1:
             editText1 = p0.getEditText();
             if (!editText1 instanceof AutoCompleteTextView) {
                throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
             }
             if ((boxBackgroun = tb.a.getBoxBackgroundMode()) == 2) {
                editText1.setDropDownBackgroundDrawable(tb.n);
             }else if(boxBackgroun == b1){
                editText1.setDropDownBackgroundDrawable(tb.m);
             }
             boxBackgroun = (editText1.getKeyListener() != null)? 1: 0;
             if (!boxBackgroun) {
                im1 a = tb.a;
                q24 int boxBackgroun1 = a.getBoxBackgroundMode();
                q24 boxBackgroun2 = a.getBoxBackground();
                int i = ry7.w(editText1, R.attr.colorControlHighlight);
                int[][] ointArray = new int[][2];
                int[] ointArray1 = new int[b1];
                ointArray1[b] = 0x10100a7;
                ointArray[0] = ointArray1;
                ointArray1 = new int[b];
                ointArray[1] = ointArray1;
                float f1 = 0.10f;
                if (boxBackgroun1 == 2) {
                   boxBackgroun = ry7.w(editText1, R.attr.colorSurface);
                   boxBackgroun1 = new q24(boxBackgroun2.a.a);
                   i = ry7.M(i, f1, boxBackgroun);
                   ointArray1 = new int[]{i,b};
                   boxBackgroun1.k(new ColorStateList(ointArray, ointArray1));
                   boxBackgroun1.setTint(boxBackgroun);
                   ointArray1 = new int[]{i,boxBackgroun};
                   q24 oq24 = new q24(boxBackgroun2.a.a);
                   oq24.setTint(-1);
                   Drawable[] uDrawableArr = new Drawable[]{new RippleDrawable(new ColorStateList(ointArray, ointArray1), boxBackgroun1, oq24),boxBackgroun2};
                   dh7.q(editText1, new LayerDrawable(uDrawableArr));
                }else if(boxBackgroun1 == b1){
                   boxBackgroun = a.getBoxBackgroundColor();
                   int[] ointArray2 = new int[]{ry7.M(i, f1, boxBackgroun),boxBackgroun};
                   dh7.q(editText1, new RippleDrawable(new ColorStateList(ointArray, ointArray2), boxBackgroun2, boxBackgroun2));
                }
             }
             editText1.setOnTouchListener(new bf1(tb, editText1));
             editText1.setOnFocusChangeListener(tb.f);
             editText1.setOnDismissListener(new cf1(tb));
             editText1.setThreshold(b);
             df1 e = tb.e;
             editText1.removeTextChangedListener(e);
             editText1.addTextChangedListener(e);
             p0.setEndIconCheckable(b1);
             p0.setErrorIconDrawable(null);
             if (editText1.getKeyListener() != null) {
                b = true;
             }
             if (!b) {
                dh7.s(tb.c, 2);
             }
             p0.setTextInputAccessibilityDelegate(tb.g);
             p0.setEndIconVisible(b1);
             return;
             break;
           default:
             editText1 = p0.getEditText();
             p0.setEndIconVisible(b1);
             p0.setEndIconCheckable(b1);
             tb.c.setChecked((l85.d(tb) ^ b1));
             l85 e1 = tb.e;
             editText1.removeTextChangedListener(e1);
             editText1.addTextChangedListener(e1);
             return;
       }
       ig0 editText = p0.getEditText();
       p0.setEndIconVisible(ig0.d(tb));
       p0.setEndIconCheckable(b);
       ig0 f = tb.f;
       editText.setOnFocusChangeListener(f);
       tb.c.setOnFocusChangeListener(f);
       f = tb.e;
       editText.removeTextChangedListener(f);
       editText.addTextChangedListener(f);
       return;
    }
}
