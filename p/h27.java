package p.h27;
import p.n3;
import com.google.android.material.textfield.TextInputLayout;
import android.view.View;
import p.y3;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View$AccessibilityDelegate;
import android.widget.EditText;
import android.text.Editable;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import android.os.Build$VERSION;
import p.p3;

public class h27 extends n3	// class@0017cc from classes.dex
{
    public final TextInputLayout d;

    public void h27(TextInputLayout p0){
       super();
       this.d = p0;
    }
    public void d(View p0,y3 p1){
       EditText editText;
       int i3;
       n3 on3 = this;
       y3 oy3 = p1;
       y3 a = oy3.a;
       on3.a.onInitializeAccessibilityNodeInfo(p0, a);
       h27 d = on3.d;
       Editable text = ((editText = d.getEditText()) != null)? editText.getText(): null;
       CharSequence hint = d.getHint();
       CharSequence error = d.getError();
       CharSequence placeholderT = d.getPlaceholderText();
       int counterMaxLe = d.getCounterMaxLength();
       CharSequence counterOverf = d.getCounterOverflowDescription();
       int i = TextUtils.isEmpty(text) ^ 1;
       int i1 = TextUtils.isEmpty(hint) ^ 1;
       int i2 = d.X0 ^ 1;
       int i4 = (!(i3 = TextUtils.isEmpty(error) ^ 1) && TextUtils.isEmpty(counterOverf))? 0: 1;
       String str = (i1)? hint.toString(): "";
       if (i) {
          oy3.i(text);
       }else if(!TextUtils.isEmpty(str)){
          oy3.i(str);
          if (i2 && placeholderT != null) {
             oy3.i(str+", "+placeholderT);
          }
       }else if(placeholderT != null){
          oy3.i(placeholderT);
       }
       if (!TextUtils.isEmpty(str)) {
          if ((i2 = Build$VERSION.SDK_INT) >= 26) {
             oy3.h(str);
          }else if(i){
             str = text+", "+str;
          }
          oy3.i(str);
          int i5 = i ^ 0x01;
          if (i2 >= 26) {
             p3.w(a, i5);
          }else {
             oy3.f(4, i5);
          }
       }
       if (text == null || text.length() != counterMaxLe) {
          counterMaxLe = -1;
       }
       a.setMaxTextLength(counterMaxLe);
       if (i4) {
          if (!i3) {
             error = counterOverf;
          }
          a.setError(error);
       }
       if (editText != null) {
          editText.setLabelFor(R.id.textinput_helper_text);
       }
       return;
    }
}
