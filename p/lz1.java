package p.lz1;
import p.b5;
import com.spotify.signup.signup.facebook.FacebookLoginActivity;
import java.lang.Object;
import android.app.Activity;

public final class lz1 implements b5	// class@001df0 from classes.dex
{
    public final int a;
    public final FacebookLoginActivity b;

    public void lz1(FacebookLoginActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       lz1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.setResult(3);
             tb.finish();
             return;
       }
       tb.setResult(0);
       tb.finish();
       return;
    }
}
