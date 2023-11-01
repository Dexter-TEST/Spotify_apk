package p.l85;
import p.im1;
import com.google.android.material.textfield.TextInputLayout;
import p.ze1;
import p.eg0;
import p.fg0;
import android.widget.EditText;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import android.text.method.PasswordTransformationMethod;
import android.content.res.Resources;
import android.view.View;
import java.lang.CharSequence;
import p.k8;
import java.lang.Object;
import android.view.View$OnClickListener;
import java.util.AbstractCollection;

public final class l85 extends im1	// class@001d04 from classes.dex
{
    public final ze1 e;
    public final eg0 f;
    public final fg0 g;

    public void l85(TextInputLayout p0,int p1){
       super(p0, p1);
       this.e = new ze1(this, 1);
       this.f = new eg0(this, 2);
       this.g = new fg0(this, 2);
    }
    public static boolean d(l85 p0){
       EditText editText;
       boolean b = ((editText = p0.a.getEditText()) != null && editText.getTransformationMethod() instanceof PasswordTransformationMethod)? true: false;
       return b;
    }
    public final void a(){
       im1 td;
       EditText editText;
       if ((td = this.d) == null) {
          td = 0x7f07011d;
       }
       im1 ta = this.a;
       ta.setEndIconDrawable(td);
       ta.setEndIconContentDescription(ta.getResources().getText(R.string.password_toggle_content_description));
       ta.setEndIconOnClickListener(new k8(6, this));
       l85 tf = this.f;
       ta.w0.add(tf);
       if (ta.v != null) {
          tf.a(ta);
       }
       ta.A0.add(this.g);
       ta = ((editText = ta.getEditText()) != null && (editText.getInputType() == 16 && (editText.getInputType() != 128 && (editText.getInputType() != 144 && editText.getInputType() != 224))))? 1: 0;
       if (ta) {
          editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
       }
       return;
    }
}
