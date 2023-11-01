package p.b11;
import p.im1;
import com.google.android.material.textfield.TextInputLayout;
import android.view.View$OnClickListener;
import android.view.View$OnLongClickListener;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;

public final class b11 extends im1	// class@001031 from classes.dex
{
    public final int e;

    public void b11(TextInputLayout p0){
       this.e = 1;
       super(p0, 0);
    }
    public void b11(TextInputLayout p0,int p1){
       this.e = 0;
       super(p0, p1);
    }
    public final void a(){
       im1 ta = this.a;
       switch (this.e){
           case 0:
           default:
             ta.setEndIconOnClickListener(null);
             ta.setEndIconDrawable(null);
             ta.setEndIconContentDescription(null);
             return;
       }
       ta.setEndIconDrawable(this.d);
       ta.setEndIconOnClickListener(null);
       ta.setEndIconOnLongClickListener(null);
       return;
    }
}
