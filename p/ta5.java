package p.ta5;
import java.lang.Runnable;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import java.lang.Object;
import p.sc5;
import p.an5;

public final class ta5 implements Runnable	// class@002732 from classes.dex
{
    public final int a;
    public final PhoneNumberSignupActivity b;

    public void ta5(PhoneNumberSignupActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       ta5 tb = this.b;
       switch (this.a){
           case 0:
             tb.Y.onNext(new sc5());
             return;
           case 1:
             tb.Y.onNext(new sc5());
             return;
           default:
             tb.Y.onNext(new sc5());
             return;
       }
    }
}
