package p.kz1;
import p.ir0;
import com.spotify.signup.signup.facebook.FacebookLoginActivity;
import java.lang.Object;
import p.uy1;
import java.lang.Class;
import android.content.Intent;
import java.lang.String;
import android.app.Activity;
import p.tp2;

public final class kz1 implements ir0	// class@001cae from classes.dex
{
    public final int a;
    public final FacebookLoginActivity b;

    public void kz1(FacebookLoginActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       switch (this.a){
           case 0:
           default:
             tp2.v(p0);
             throw null;
       }
       kz1 tb = this.b;
       tb.getClass();
       tb.setResult(-1, new Intent().putExtra("RESULT_ACCESS_TOKEN", p0.H).putExtra("RESULT_FROM_SIGNUP", p0.I));
       tb.finish();
       return;
    }
}
