package p.wi1;
import android.widget.TextView$OnEditorActionListener;
import java.lang.Runnable;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;
import com.spotify.signup.signup.view.EmailView;
import com.spotify.signup.signup.view.PasswordView;

public final class wi1 implements TextView$OnEditorActionListener	// class@002b3f from classes.dex
{
    public final int a;
    public final Runnable b;

    public void wi1(int p0,Runnable p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       boolean b = false;
       wi1 tb = this.b;
       switch (this.a){
           case 0:
             if (p1 == 5) {
                tb.run();
                b = true;
             }
             break;
           default:
             if (p1 == 5) {
                tb.run();
                b = true;
             }
             return b;
       }
       return b;
    }
}
