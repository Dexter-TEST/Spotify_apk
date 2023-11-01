package p.mx2;
import p.sy2;
import p.nk2;
import java.lang.Enum;
import java.util.EnumSet;
import com.spotify.legacyglue.gluelib.components.trackcloud.a;
import java.lang.Class;
import java.util.Random;
import p.c33;
import p.b06;
import p.zk2;
import p.ju2;
import p.uu2;
import p.bt2;
import p.au2;
import java.lang.String;
import p.tu2;
import p.w51;
import java.util.ArrayList;
import p.a77;
import java.lang.Object;
import android.os.Parcelable;
import p.lx2;
import java.util.List;
import java.util.Collections;
import p.b77;
import android.view.View;
import p.ry7;
import p.co5;
import java.util.Map;
import p.dv2;
import p.du2;
import p.hu2;
import p.j13;
import p.te5;
import p.jl;
import java.lang.CharSequence;
import p.a06;
import p.io2;
import android.widget.TextView;
import p.zz5;
import p.bz2;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import p.hv5;
import p.wd5;
import android.widget.ImageView;
import p.sz5;
import p.qz5;
import p.tu6;
import android.content.Context;
import android.view.ViewGroup;
import p.eo5;
import p.o85;
import p.xj0;

public final class mx2 extends sy2	// class@001f22 from classes.dex
{
    public final int d;
    public final Object e;

    public void mx2(){
       this.d = 0;
       super(EnumSet.of(nk2.y), a.class, 1);
       this.e = new Random();
    }
    public void mx2(c33 p0){
       this.d = 1;
       super(EnumSet.of(nk2.y), b06.class, 1);
       this.e = p0;
    }
    public final void e(zk2 p0,ju2 p1,uu2 p2,bt2 p3){
       lx2 olx2;
       String str8;
       mx2 omx2 = this;
       ju2 oju2 = p1;
       uu2 ouu2 = p2;
       bt2 uobt2 = p3;
       mx2 e = omx2.e;
       String str = "longClick";
       String str1 = "";
       boolean b = true;
       int b1 = false;
       switch (omx2.d){
           case 0:
             au2[] uoau2Array = p1.b().e("tracks");
             String str2 = p1.y().d();
             boolean b2 = p1.b().y("showArtists", b);
             int i = p1.b().c("maxTracksToShow", 10);
             boolean b3 = p1.b().y("showHearts", b1);
             b = p1.b().y("showNumbers", b1);
             boolean b4 = p1.b().y("shuffle", b1);
             String str3 = str;
             int i1 = p1.b().c("maxLines", 3);
             String str4 = p1.b().b("ellipsis", str1);
             int i2 = p0;
             boolean b5 = p1.b().y("leftAligned", false);
             if (uoau2Array != null) {
                int len = uoau2Array.length;
                w51.h(len, "initialArraySize");
                ArrayList uArrayList = new ArrayList(len);
                len = uoau2Array.length;
                String str5 = str4;
                b1 = 0;
                while (b1 < len) {
                   object oobject = uoau2Array[b1];
                   String str6 = oobject.b("artistName", str1);
                   String str7 = oobject.b("trackName", str1);
                   boolean b6 = oobject.y("isHearted", false);
                   uArrayList.add(new a77(str7, b6, oobject.y("isEnabled", true), str6));
                   b1 = b1 + 1;
                   len = len;
                   b5 = b5;
                   i1 = i1;
                   b = b;
                }
                boolean b7 = b5;
                int i3 = i1;
                boolean b8 = b;
                if (b4) {
                   if ((olx2 = uobt2.a(oju2)) == null) {
                      olx2 = new lx2(e.nextInt());
                      uobt2.b(oju2, olx2);
                   }
                   Collections.shuffle(uArrayList, new Random((long)olx2.a));
                }
                b77 olx21 = new b77();
                olx21.a = str2;
                olx21.d = uArrayList;
                olx21.e = b2;
                olx21.h = i;
                olx21.f = b3;
                olx21.g = b8;
                olx21.c = i3;
                olx21.i = b7;
                olx21.b = str5;
                a uoa = i2;
                uoa.a(olx21);
                a c = uoa.c;
                ry7.d(c);
                ouu2 = p2;
                co5.e(c, oju2, ouu2);
                str8 = str3;
                if (p1.m().containsKey(str8)) {
                   dv2 uodv2 = new dv2(ouu2.c);
                   uodv2.c(str8);
                   uodv2.g(oju2);
                   uodv2.f(c);
                   uodv2.e();
                }
             }
             break;
           default:
             str8 = str;
             String str9 = str1;
             a06 uoa06 = p0;
             String str10 = p1.y().d();
             str1 = p1.y().j();
             j13 oj13 = p1.u().e();
             int i4 = 1;
             jl.h((te5.a(str10) ^ i4), "title not set");
             jl.h((te5.a(p1.y().m()) ^ i4), "subtitle not set");
             jl.h((te5.a(str1) ^ i4), "accesory not set");
             if (oj13 == null) {
                i4 = false;
             }
             jl.h(i4, "main image not set");
             uoa06.setTitle(str10);
             str10 = p1.y().m();
             Drawable uDrawable = null;
             if (!te5.a(str10)) {
                if (io2.j(p1.b().b("subtitleStyle", str9), "metadata")) {
                   uoa06.e(str10);
                }else {
                   uoa06.setSubtitle(str10);
                }
             }else {
                uoa06.setSubtitle(uDrawable);
             }
             uoa06.w.setText(str1);
             c33 b9 = e.b;
             zz5 v = uoa06.v;
             if (oj13 != null) {
                Drawable uDrawable1 = e.a(oj13.c(), bz2.c);
                b9.getClass();
                hv5 ohv5 = new hv5(b9, c33.d(oj13.a()));
                ohv5.h(uDrawable1);
                ohv5.b(uDrawable1);
                ohv5.e(v);
             }else {
                b9.b(v);
                v.setImageDrawable(uDrawable);
             }
             uoa06.setActive(p1.b().y("active", false));
             sz5 a = uoa06.a;
             ry7.d(a);
             co5.e(a, oju2, ouu2);
             if (p1.m().containsKey(str8)) {
                dv2 uodv21 = new dv2(ouu2.c);
                uodv21.c(str8);
                uodv21.g(oju2);
                uodv21.f(a);
                uodv21.e();
             }
             tu6.f(uoa06, oju2, ouu2);
             return;
       }
       return;
    }
    public final zk2 f(Context p0,ViewGroup p1,uu2 p2){
       switch (this.d){
           case 0:
           default:
             b06 uob06 = new b06(xj0.x0(p0, p1, R.layout.glue_listtile_2_landscape_image));
             eo5.P(uob06);
             return uob06;
       }
       a uoa = new a(p0, p1);
       eo5.P(uoa);
       return uoa;
    }
}
