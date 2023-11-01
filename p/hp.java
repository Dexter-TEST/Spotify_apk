package p.hp;
import p.ew5;
import p.lj;
import p.ru1;
import p.oh5;
import p.xs6;
import p.za3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.gw5;
import p.xb4;
import p.zb4;
import p.ku1;
import p.yc;
import p.cm5;
import p.ok0;
import p.pl;
import java.lang.Long;

public final class hp implements ew5	// class@00189d from classes.dex
{
    public final gw5 a;

    public void hp(lj p0,ru1 p1,oh5 p2,xs6 p3){
       co5.o(p0, "appMetadata");
       co5.o(p2, "policyInputs");
       super();
       this.a = new gw5(xb4.a, p3, new za3(p1, p0, p2, 0), 8);
    }
    public final cm5 a(yc p0){
       return this.a.a(p0);
    }
    public final void b(boolean p0){
       this.a.b(p0);
    }
    public final ok0 c(){
       return this.a.c();
    }
    public final void clear(){
       this.a.clear();
    }
    public final boolean d(byte[] p0){
       co5.o(p0, "configuration");
       return this.a.d(p0);
    }
    public final pl e(String p0,String p1){
       return this.a.e(p0, p1);
    }
    public final Long getSnapshotId(){
       return this.a.getSnapshotId();
    }
}
