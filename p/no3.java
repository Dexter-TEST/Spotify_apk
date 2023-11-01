package p.no3;
import p.rt2;
import p.j8;
import java.lang.Object;
import p.tt2;
import p.cu2;
import p.zs2;
import p.vk7;
import p.an5;
import p.au2;
import java.lang.String;
import p.av2;
import p.wu2;
import java.lang.Class;
import p.r45;
import p.ye5;
import p.fo1;
import p.c0;
import p.ze5;
import p.tk7;
import java.lang.Enum;
import java.lang.StringBuilder;
import p.jl;
import p.bv2;
import p.yu2;
import p.zu2;
import p.vu2;
import p.ju2;
import p.xu2;

public final class no3 implements rt2	// class@002019 from classes.dex
{
    public final int b;
    public final j8 c;

    public void no3(j8 p0,int p1){
       this.b = p1;
       this.c = p0;
       super();
    }
    public final void a(tt2 p0,cu2 p1){
       String str2;
       r45 or452;
       int i;
       boolean b = false;
       String str = "";
       String str1 = "uri";
       no3 tc = this.c;
       switch (this.b){
           case 0:
             tc.getClass();
             str2 = p0.b().b(str1, str);
             if (!str2.isEmpty()) {
                tc.c.b(new tk7(str2), 19);
                tc.v.onNext(new vu2(str2, p1.b));
             }
             return;
             break;
           case 1:
             tc.getClass();
             String str3 = p0.b().b(str1, str);
             r45 or45 = r45.a(p0.b().q("offline_uri"));
             r45 or451 = r45.a(p0.b().q("uid"));
             b = p0.b().y("mobile_on_demand", b);
             if (!str3.isEmpty()) {
                fo1 a = ye5.a;
                if ((str2 = p0.b().q("action")) != null) {
                   or452 = a.b(str2);
                }else {
                   a.getClass();
                   or452 = c0.a;
                }
                ze5 oze5 = or452.e(ze5.a);
                str1 = (or45.c())? or45.b(): str3;
                tk7 otk7 = new tk7(str1);
                if (i = oze5.ordinal()) {
                   if (i != 1) {
                      if (i != 2) {
                         jl.d("Cannot handle action, "+oze5);
                      }else {
                         tc.c.b(otk7, 30);
                         tc.v.onNext(new bv2());
                      }
                   }else {
                      tc.c.b(otk7, 22);
                      tc.v.onNext(new yu2());
                   }
                }else {
                   tc.c.b(otk7, 23);
                   tc.v.onNext(new zu2(str3, or45, or451, b));
                }
             }
             return;
             break;
           case 2:
             tc.v.onNext(new wu2(p1));
             return;
           case 3:
             j8 c = tc.c;
             c.b(c.c, 25);
             tc.v.onNext(new av2(p0.b().y("allow_offline", b)));
             return;
           default:
             tc.v.onNext(new xu2());
             return;
       }
    }
}
