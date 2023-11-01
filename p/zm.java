package p.zm;
import p.vi7;
import android.content.Context;
import p.c96;
import p.np3;
import p.t2;
import p.zg5;
import p.e43;
import android.content.res.Resources;
import android.content.res.Configuration;
import p.br3;
import p.is7;
import java.util.Locale;
import java.lang.String;
import p.ox7;
import java.lang.Object;
import p.w51;
import p.k73;
import p.dt5;

public final class zm extends vi7	// class@002f2a from classes.dex
{
    public final c96 t;
    public final zg5 v;
    public final np3 w;
    public final t2 x;
    public final dt5 y;
    public final e43 z;

    public void zm(Context p0,c96 p1,np3 p2,t2 p3,zg5 p4,e43 p5){
       super();
       this.t = p1;
       this.v = p4;
       this.w = p2;
       this.x = p3;
       this.z = p5;
       String str = ox7.j();
       String country = is7.p(p0.getResources().getConfiguration()).c(0).getCountry();
       w51.f("locale", str);
       w51.f("country", country);
       Object[] objArray = new Object[]{"locale",str,"catalogue","free","country",country,"limit","20"};
       this.y = dt5.k(4, objArray, null);
    }
}
