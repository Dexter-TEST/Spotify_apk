package p.qj1;
import p.fj1;
import android.widget.TextView;
import p.rj1;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.ref.Reference;
import android.text.InputFilter;
import android.view.View;
import java.lang.CharSequence;
import p.hj1;
import java.lang.Class;
import android.text.Selection;
import android.text.Spannable;

public final class qj1 extends fj1	// class@0023b0 from classes.dex
{
    public final WeakReference a;
    public final WeakReference b;

    public void qj1(TextView p0,rj1 p1){
       super();
       this.a = new WeakReference(p0);
       this.b = new WeakReference(p1);
    }
    public final void b(){
       int selectionSta;
       InputFilter[] filters;
       TextView textView = this.a.get();
       InputFilter inputFilter = this.b.get();
       int i = 0;
       if (inputFilter != null && (textView != null && (filters = textView.getFilters()) != null)) {
          int i1 = 0;
          while (true) {
             if (i1 < filters.length) {
                if (filters[i1] == inputFilter) {
                   selectionSta = 1;
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }
          }
          if (!inputFilter) {
             return;
          }else if(textView.isAttachedToWindow()){
             CharSequence text = textView.getText();
             hj1 ohj1 = hj1.a();
             if (text == null) {
                i1 = 0;
             }else {
                ohj1.getClass();
                i1 = text.length();
             }
             CharSequence uCharSequenc = ohj1.f(i, i1, text);
             if (text == uCharSequenc) {
                return;
             }else {
                selectionSta = Selection.getSelectionStart(uCharSequenc);
                int selectionEnd = Selection.getSelectionEnd(uCharSequenc);
                textView.setText(uCharSequenc);
                if (uCharSequenc instanceof Spannable) {
                   if (selectionSta >= 0 && selectionEnd >= 0) {
                      Selection.setSelection(uCharSequenc, selectionSta, selectionEnd);
                   }else if(selectionSta >= 0){
                      Selection.setSelection(uCharSequenc, selectionSta);
                   }else if(selectionEnd >= 0){
                      Selection.setSelection(uCharSequenc, selectionEnd);
                   }
                }
             }
          }
          return;
       }
       inputFilter = 0;
    }
}
