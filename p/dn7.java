package p.dn7;
import p.xo0;
import androidx.appcompat.app.a;
import java.lang.Object;
import p.hr0;
import p.ap0;
import com.spotify.lite.welcome.WelcomeActivity;
import p.hm6;
import p.fx6;
import p.yf2;
import io.reactivex.rxjava3.core.Observable;
import p.gn7;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.in7;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import p.zh0;
import p.k10;
import p.up0;
import p.gb0;
import p.va5;
import p.o17;
import p.rd5;

public final class dn7 implements xo0	// class@001380 from classes.dex
{
    public final int a;
    public final a b;

    public void dn7(a p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ap0 d(hr0 p0){
       dn7 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.d0.J = new zh0(tb, 5, p0);
             tb.c0.M = new up0(12, p0);
             tb.e0.d = new va5(p0);
             return new in7(tb, 2, tb.a0.d(p0));
       }
       return new in7(tb, 0, tb.S.e.map(new fx6(17)).subscribe(new gn7(p0, 0)));
    }
}
