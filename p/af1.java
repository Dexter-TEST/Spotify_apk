package p.af1;
import p.h27;
import p.df1;
import com.google.android.material.textfield.TextInputLayout;
import android.view.View;
import p.y3;
import p.im1;
import android.widget.EditText;
import android.text.method.KeyListener;
import android.widget.TextView;
import android.widget.Spinner;
import java.lang.String;
import java.lang.Class;
import java.lang.CharSequence;
import android.view.accessibility.AccessibilityNodeInfo;
import android.os.Build$VERSION;
import p.p3;
import android.os.Bundle;
import android.os.BaseBundle;
import android.view.accessibility.AccessibilityEvent;
import p.n3;
import android.widget.AutoCompleteTextView;
import android.view.accessibility.AccessibilityManager;
import java.lang.RuntimeException;

public final class af1 extends h27	// class@000f6d from classes.dex
{
    public final df1 e;

    public void af1(df1 p0,TextInputLayout p1){
       this.e = p0;
       super(p1);
    }
    public final void d(View p0,y3 p1){
       Bundle extras;
       super.d(p0, p1);
       int i = 1;
       int i1 = (this.e.a.getEditText().getKeyListener() != null)? 1: 0;
       y3 a = p1.a;
       if (!i1) {
          a.setClassName(Spinner.class.getName());
       }
       if (Build$VERSION.SDK_INT >= 26) {
          i = p3.z(a);
       }else if((extras = a.getExtras()) == null || ((extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4)) != 4){
          i = false;
       }
       if (i) {
          p1.h(null);
       }
       return;
    }
    public final void e(View p0,AccessibilityEvent p1){
       super.e(p0, p1);
       af1 te = this.e;
       EditText editText = te.a.getEditText();
       if (!editText instanceof AutoCompleteTextView) {
          throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
       }
       int i = 1;
       if (p1.getEventType() == i && te.o.isTouchExplorationEnabled()) {
          if (te.a.getEditText().getKeyListener() == null) {
             i = 0;
          }
          if (!i) {
             df1.d(te, editText);
          }
       }
       return;
    }
}
