package p.g86;
import android.text.TextWatcher;
import java.lang.Object;
import p.mw;
import p.yy;
import android.text.Editable;
import java.lang.String;
import java.lang.CharSequence;
import p.h76;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p.d76;
import java.lang.Class;
import com.spotify.search.view.ToolbarSearchFieldView;
import p.co5;
import com.google.android.material.textfield.TextInputLayout;
import p.ig0;
import p.im1;
import com.spotify.litesignup.phonesignup.view.OtpInputView;
import androidx.appcompat.widget.SearchView;
import android.widget.EditText;
import android.text.TextUtils;
import android.widget.ImageView;
import p.n86;

public final class g86 implements TextWatcher	// class@0016be from classes.dex
{
    public final int a;
    public final Object b;

    public void g86(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void g86(mw p0){
       this.a = 5;
       super(5, p0);
    }
    public void g86(yy p0){
       this.a = 4;
       this.b = p0;
       super();
    }
    public final void afterTextChanged(Editable p0){
       boolean b = false;
       g86 tb = this.b;
       switch (this.a){
           case 1:
             if (tb.a.getSuffixText() == null) {
                tb.e(ig0.d(tb));
             }
             return;
             break;
           case 2:
             tb.s((tb.d1 ^ 1), b);
             if (tb.A != null) {
                tb.n(p0.length());
             }
             if (tb.H != null) {
                tb.t(p0.length());
             }
             return;
             break;
           case 3:
           case 4:
             String str = (p0 != null)? p0.toString(): null;
             Iterator iterator = tb.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().b(str);
             }
             if (str == null || !str.length()) {
                b = 1;
             }
             h76 d = tb.d;
             d.getClass();
             d.setRightButtonVisible((b ^ 0x01));
             return;
             break;
           default:
             return;
       }
       co5.o(p0, "s");
       return;
    }
    public final void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       switch (this.a){
           case 3:
           default:
             return;
       }
       co5.o(p0, "s");
       return;
    }
    public final void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       Editable text;
       OtpInputView z;
       int i = 0;
       g86 tb = this.b;
       switch (this.a){
           case 0:
             text = tb.G.getText();
             tb.r0 = text;
             text = TextUtils.isEmpty(text) ^ 1;
             tb.v(text);
             text = text ^ 1;
             if (tb.p0 != null && (tb.i0 == null && text)) {
                tb.L.setVisibility(8);
             }else {
                i = 8;
             }
             tb.N.setVisibility(i);
             tb.r();
             tb.u();
             if (tb.e0 != null && !TextUtils.equals(p0, tb.q0)) {
                tb.e0.c(p0.toString());
             }
             tb.q0 = p0.toString();
             return;
             break;
           case 1:
           case 2:
          label_0052 :
             return;
           case 3:
             co5.o(p0, "s");
             if (p3 <= p2) {
                goto label_0052 ;
             }else {
                String str = p0.toString().substring((p2 + p1), (p1 + p3));
                co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
                if (tb.z < null || !OtpInputView.d(str)) {
                   goto label_0052 ;
                }else {
                   tb.e(tb.z, str);
                   text = ((z = tb.z) >= null)? 1: 0;
                   if (text) {
                      text = (z >= null)? 1: 0;
                      if (text && z == (tb.y - 1)) {
                         i = 1;
                      }
                      if (!i) {
                         tb.a((z + 1));
                         goto label_0052 ;
                      }else {
                         goto label_0052 ;
                      }
                   }else {
                      goto label_0052 ;
                   }
                }
             }
             break;
           case 4:
             return;
           default:
             tb.a();
             return;
       }
    }
}
