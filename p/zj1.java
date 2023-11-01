package p.zj1;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.Object;
import android.view.View;
import android.text.Editable;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.Selection;
import p.hj1;
import java.lang.Class;
import android.text.Spannable;
import p.ax6;
import p.fj1;

public final class zj1 implements TextWatcher	// class@002f08 from classes.dex
{
    public final EditText a;
    public final boolean b;
    public ax6 c;
    public boolean t;

    public void zj1(EditText p0){
       super();
       this.a = p0;
       this.b = false;
       this.t = true;
    }
    public static void a(EditText p0,int p1){
       int i;
       if (p1 == 1 && (p0 != null && p0.isAttachedToWindow())) {
          Editable editableText = p0.getEditableText();
          p1 = Selection.getSelectionStart(editableText);
          int selectionEnd = Selection.getSelectionEnd(editableText);
          hj1 ohj1 = hj1.a();
          if (editableText == null) {
             i = 0;
          }else {
             ohj1.getClass();
             i = editableText.length();
          }
          ohj1.f(0, i, editableText);
          if (p1 >= 0 && selectionEnd >= 0) {
             Selection.setSelection(editableText, p1, selectionEnd);
          }else if(p1 >= 0){
             Selection.setSelection(editableText, p1);
          }else if(selectionEnd >= 0){
             Selection.setSelection(editableText, selectionEnd);
          }
       }
       return;
    }
    public final void afterTextChanged(Editable p0){
    }
    public final void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public final void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       int i;
       hj1 ohj1;
       zj1 ta = this.a;
       if (!ta.isInEditMode()) {
          if (this.t != null) {
             i = 0;
             if (this.b == null) {
                int i1 = (hj1.j != null)? 1: 0;
                if (!i1) {
                label_001b :
                   i = 1;
                }
             }
          }else {
             goto label_001b ;
          }
          if (!i && (p2 <= p3 && p0 instanceof Spannable)) {
             if (p2 = hj1.a().b()) {
                if (p2 != 1) {
                   if (p2 == 3) {
                   }
                }else {
                   hj1.a().f(p1, (p3 + p1), p0);
                }
             }else {
             }
          }
       }
       return;
    }
}
