package p.un3;
import p.jg2;
import java.lang.String;
import java.lang.Object;
import com.spotify.webapi.service.models.Image;
import p.oy6;
import p.mt;
import java.lang.NullPointerException;
import p.m73;
import p.r45;

public final class un3 implements jg2	// class@0028e3 from classes.dex
{
    public final int a;
    public final String b;

    public void un3(String p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       Image url;
       un3 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             return r45.a(p0.get(tb)).e("");
       }
       oy6 ooy6 = new oy6(10);
       if (tb == null) {
          throw new NullPointerException("Null parentUri");
       }
       ooy6.b = tb;
       if ((url = p0.url) == null) {
          throw new NullPointerException("Null url");
       }
       ooy6.c = url;
       ooy6.t = p0.width;
       ooy6.v = p0.height;
       return ooy6.k();
    }
}
