package p.fh6;
import p.hr0;
import p.px3;
import java.lang.Object;
import java.util.Calendar;
import com.spotify.signup.signup.SignupActivity;
import androidx.fragment.app.Fragment;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import java.lang.Class;
import android.os.Bundle;
import java.io.Serializable;
import p.ae2;
import androidx.fragment.app.k;
import androidx.fragment.app.f;
import androidx.fragment.app.a;
import androidx.fragment.app.o;

public final class fh6 implements hr0	// class@0015cc from classes.dex
{
    public final px3 a;

    public void fh6(px3 p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       px3 a = this.a.a;
       if (a.U.isAdded()) {
          p0 = new Object[0];
          Logger.i("Birthday picker already added, aborting...", p0);
       }else if(p0 != null){
          SignupActivity u = a.U;
          u.getClass();
          Bundle uBundle = new Bundle();
          uBundle.putSerializable("ARG_DATE", p0);
          u.setArguments(uBundle);
       }else {
          a.U.setArguments(null);
       }
       p0 = a.U;
       ae2 uoae2 = a.y();
       p0.E = false;
       p0.F = true;
       uoae2.getClass();
       a uoa = new a(uoae2);
       uoa.p = true;
       uoa.g(0, p0, "FRAGMENT_BIRTHDATE_PICKER", true);
       uoa.f();
       return;
    }
}
