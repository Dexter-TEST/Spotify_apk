package p.ua5;
import android.content.DialogInterface$OnClickListener;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import java.lang.Object;
import android.content.DialogInterface;
import p.bc5;
import p.an5;
import p.i35;
import p.jc5;
import p.q35;

public final class ua5 implements DialogInterface$OnClickListener	// class@002874 from classes.dex
{
    public final int a;
    public final PhoneNumberSignupActivity b;

    public void ua5(PhoneNumberSignupActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       ua5 tb = this.b;
       switch (this.a){
           case 0:
             tb.Y.onNext(new jc5(new i35()));
             return;
           case 1:
             tb.Y.onNext(new bc5());
             return;
           default:
             tb.Y.onNext(new jc5(new i35()));
             return;
       }
    }
}
