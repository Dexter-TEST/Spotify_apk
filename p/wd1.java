package p.wd1;
import p.rt2;
import p.yd1;
import java.lang.Object;
import p.tt2;
import p.cu2;
import java.lang.Class;
import p.au2;
import java.lang.String;
import p.ug1;
import p.an5;
import p.vh1;

public final class wd1 implements rt2	// class@002b12 from classes.dex
{
    public final int b;
    public final yd1 c;

    public void wd1(yd1 p0,int p1){
       this.b = p1;
       this.c = p0;
       super();
    }
    public final void a(tt2 p0,cu2 p1){
       wd1 tc = this.c;
       switch (this.b){
           case 0:
           default:
             tc.getClass();
             au2 uoau2 = p0.b();
             String str = uoau2.b("uri", "");
             String str1 = uoau2.b("title", "");
             String str2 = uoau2.b("subtitle", "");
             String str3 = uoau2.b("showUri", "");
             String str4 = uoau2.b("imageUri", "");
             vh1 uoau21 = new vh1(str, str1, str2, str3, str4);
             tc.x.onNext(uoau2);
             return;
       }
       tc.getClass();
       tc.x.onNext(new ug1(p0.b().b("uri", "")));
       return;
    }
}
