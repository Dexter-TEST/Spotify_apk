package p.ze1;
import p.l37;
import p.im1;
import android.text.Editable;
import p.df1;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import android.widget.AutoCompleteTextView;
import android.view.accessibility.AccessibilityManager;
import android.text.method.KeyListener;
import android.widget.TextView;
import android.view.View;
import p.t5;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.CharSequence;
import p.l85;
import com.google.android.material.internal.CheckableImageButton;

public final class ze1 extends l37	// class@002edb from classes.dex
{
    public final int a;
    public final im1 b;

    public void ze1(im1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void afterTextChanged(Editable p0){
       EditText editText;
       switch (this.a){
           case 0:
             ze1 tb = this.b;
             editText = tb.a.getEditText();
             if (!editText instanceof AutoCompleteTextView) {
                throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
             }
             if (tb.o.isTouchExplorationEnabled()) {
                int i = (editText.getKeyListener() != null)? 1: 0;
                if (i && !tb.c.hasFocus()) {
                   editText.dismissDropDown();
                }
             }
             break;
           default:
             return;
       }
       editText.post(new t5(this, 24, editText));
       return;
    }
    public final void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       switch (this.a){
           case 1:
           default:
             return;
       }
       ze1 tb = this.b;
       tb.c.setChecked((l85.d(tb) ^ 0x01));
       return;
    }
}
