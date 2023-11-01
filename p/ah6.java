package p.ah6;
import p.b5;
import p.px3;
import java.lang.Object;
import com.spotify.signup.signup.SignupActivity;
import android.app.Activity;
import android.content.res.Resources;
import androidx.appcompat.app.a;
import java.lang.String;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;

public final class ah6 implements b5	// class@000f84 from classes.dex
{
    public final int a;
    public final px3 b;

    public void ah6(px3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       px3 a;
       ah6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             a = tb.a;
             Toast.makeText(a, a.getResources().getString(R.string.signup_no_internet_error), 1).show();
             return;
       }
       a = tb.a;
       a.setResult(0);
       a.finish();
       return;
    }
}
