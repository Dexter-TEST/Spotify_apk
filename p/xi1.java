package p.xi1;
import android.view.View$OnFocusChangeListener;
import p.hr0;
import java.lang.Object;
import android.view.View;
import com.spotify.signup.signup.view.EmailView;
import p.hi1;
import com.spotify.signup.signup.view.PasswordView;
import p.a85;

public final class xi1 implements View$OnFocusChangeListener	// class@002c80 from classes.dex
{
    public final int a;
    public final hr0 b;

    public void xi1(hr0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onFocusChange(View p0,boolean p1){
       xi1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.accept(new a85(p1));
             return;
       }
       tb.accept(new hi1(p1));
       return;
    }
}
