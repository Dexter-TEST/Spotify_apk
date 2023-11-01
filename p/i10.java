package p.i10;
import android.view.View$OnClickListener;
import p.k10;
import java.lang.Object;
import android.view.View;
import p.ic;
import java.lang.Class;
import java.util.Calendar;
import android.widget.DatePicker;
import p.zh0;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import p.hr0;
import p.o10;
import p.wb5;
import p.p10;
import com.spotify.signup.signup.SignupActivity;
import p.mg6;
import androidx.fragment.app.f;

public final class i10 implements View$OnClickListener	// class@001900 from classes.dex
{
    public final int a;
    public final k10 b;

    public void i10(k10 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       k10 j;
       i10 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.v(false, false);
             return;
       }
       tb.K.clearFocus();
       if ((j = tb.J) != null) {
          tb.I.getClass();
          Calendar instance = Calendar.getInstance();
          instance.set(tb.K.getYear(), tb.K.getMonth(), tb.K.getDayOfMonth());
          zh0 c = j.c;
          zh0 b = j.b;
          switch (j.a){
              case 5:
                b.S.getClass();
                c.accept(new wb5(new o10(instance, Calendar.getInstance())));
                break;
              default:
                b.Y.getClass();
                c.accept(new mg6(new o10(instance, Calendar.getInstance())));
          }
       }
       tb.v(false, false);
       return;
    }
}
