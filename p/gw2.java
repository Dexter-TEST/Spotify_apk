package p.gw2;
import p.ou2;
import p.iw2;
import p.ev2;
import p.aw2;
import p.mx2;
import java.lang.Object;
import android.util.SparseArray;
import p.nw2;
import p.mt2;
import p.wv2;
import p.zv2;
import p.ho3;
import p.hw2;
import p.vt2;

public final class gw2 implements ou2	// class@00178f from classes.dex
{
    public final int a;
    public final SparseArray b;

    public void gw2(iw2 p0,ev2 p1,aw2 p2,ev2 p3,aw2 p4,mx2 p5){
       this.a = 1;
       super();
       SparseArray sparseArray = new SparseArray();
       this.b = sparseArray;
       sparseArray.append(nw2.b, p0);
       sparseArray.append(nw2.c, p1);
       sparseArray.append(nw2.t, p2);
       sparseArray.append(nw2.v, p3);
       sparseArray.append(nw2.w, p4);
       sparseArray.append(nw2.x, p5);
    }
    public void gw2(mt2 p0,wv2 p1,wv2 p2,zv2 p3,ho3 p4){
       this.a = 0;
       super();
       SparseArray sparseArray = new SparseArray();
       this.b = sparseArray;
       sparseArray.append(hw2.c, p0);
       sparseArray.append(hw2.t, p1);
       sparseArray.append(hw2.v, p2);
       sparseArray.append(hw2.w, p3);
       sparseArray.append(hw2.x, p4);
    }
    public final vt2 a(int p0){
       gw2 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.get(p0);
       }
       return tb.get(p0);
    }
}
