package p.pf6;
import android.view.View$OnClickListener;
import com.spotify.signup.signup.SignupActivity;
import java.lang.Object;
import android.view.View;

public final class pf6 implements View$OnClickListener	// class@002251 from classes.dex
{
    public final SignupActivity a;

    public void pf6(SignupActivity p0){
       this.a = p0;
    }
    public final void onClick(View p0){
       this.a.onBackPressed();
    }
}
