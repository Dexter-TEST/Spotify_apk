package p.kn1;
import p.rt2;
import p.qn1;
import java.lang.Object;
import p.tt2;
import p.cu2;
import java.lang.Class;
import p.au2;
import java.lang.String;
import p.b7;
import p.yq5;
import p.aq6;
import p.td7;
import java.util.Map;
import java.lang.Boolean;
import p.dn1;
import p.an5;
import p.cn1;
import android.net.Uri;

public final class kn1 implements rt2	// class@001c46 from classes.dex
{
    public final int b;
    public final qn1 c;

    public void kn1(qn1 p0,int p1){
       this.b = p1;
       this.c = p0;
       super();
    }
    public final void a(tt2 p0,cu2 p1){
       int i;
       String str;
       kn1 tc = this.c;
       switch (this.b){
           case 0:
             tc.getClass();
             aq6 uoaq6 = td7.d(p0.b().q("uri"));
             Boolean uBoolean = p1.c.get("download");
             if (uoaq6 != null && uBoolean != null) {
                qn1 a = tc.A;
                if (uBoolean.booleanValue()) {
                   a.onNext(new dn1(uoaq6));
                }else {
                   a.onNext(new cn1(uoaq6));
                }
             }
             break;
           case 1:
             tc.getClass();
             if ((i = p0.b().c("position", -1)) > -1) {
                tc.G.b.h(i);
             }
             return;
             break;
           default:
             tc.getClass();
             if ((str = p0.b().q("uri")) != null) {
                Uri.parse(str);
                tc.z.getClass();
             }
             return;
       }
       return;
    }
}
