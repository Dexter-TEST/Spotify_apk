package p.pj1;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import p.gg1;
import p.hj1;
import android.os.Bundle;
import p.cj1;
import android.text.Editable;
import android.widget.TextView;
import java.lang.Class;
import java.lang.Object;

public final class pj1 extends InputConnectionWrapper	// class@002270 from classes.dex
{
    public final TextView a;
    public final gg1 b;

    public void pj1(EditText p0,InputConnection p1,EditorInfo p2){
       boolean b = false;
       super(p1, b);
       this.a = p0;
       this.b = new gg1(14);
       int i = 1;
       int i1 = (hj1.j != null)? 1: 0;
       if (i1) {
          hj1 ohj1 = hj1.a();
          if (ohj1.b() == i) {
             b = true;
          }
          if (b && p2 != null) {
             if (p2.extras == null) {
                p2.extras = new Bundle();
             }
             ohj1.e.P(p2);
          }
       }
       return;
    }
    public final boolean deleteSurroundingText(int p0,int p1){
       this.b.getClass();
       boolean b = false;
       if (gg1.H(this, this.a.getEditableText(), p0, p1, b) || super.deleteSurroundingText(p0, p1)) {
          b = true;
       }
       return b;
    }
    public final boolean deleteSurroundingTextInCodePoints(int p0,int p1){
       this.b.getClass();
       boolean b = true;
       if (!gg1.H(this, this.a.getEditableText(), p0, p1, b) && !super.deleteSurroundingTextInCodePoints(p0, p1)) {
          b = false;
       }
       return b;
    }
}
