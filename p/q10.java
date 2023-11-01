package p.q10;
import p.hr0;
import java.lang.Object;
import p.p10;
import p.mg6;
import p.c85;
import p.tg6;
import p.ji1;
import p.ng6;
import p.q35;
import p.jc5;
import p.za0;
import p.xb5;
import p.di2;
import com.spotify.litesignup.phonesignup.view.BirthdayGenderContainerView;
import p.dc5;
import p.wb5;
import p.pg6;

public final class q10 implements hr0	// class@00230d from classes.dex
{
    public final int a;
    public final hr0 b;

    public void q10(hr0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       q10 tb = this.b;
       switch (this.a){
           case 0:
             tb.accept(new wb5(p0));
             return;
           case 1:
             tb.accept(new dc5(p0));
             return;
           case 2:
             tb.accept(new xb5(p0));
             return;
           case 3:
             tb.accept(new jc5(p0));
             return;
           case 4:
             tb.accept(new ng6(p0));
             return;
           case 5:
             tb.accept(new tg6(p0));
             return;
           case 6:
             tb.accept(new mg6(p0));
             return;
           default:
             tb.accept(new pg6(p0));
             return;
       }
    }
}
