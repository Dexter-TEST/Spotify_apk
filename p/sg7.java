package p.sg7;
import p.rg7;
import android.os.Parcel;
import p.pk;
import java.lang.String;
import android.util.SparseIntArray;
import java.lang.StringBuilder;
import p.en6;

public final class sg7 extends rg7	// class@002626 from classes.dex
{
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public void sg7(Parcel p0){
       super(p0, p0.dataPosition(), p0.dataSize(), "", new pk(), new pk(), new pk());
    }
    public void sg7(Parcel p0,int p1,int p2,String p3,pk p4,pk p5,pk p6){
       super(p4, p5, p6);
       this.d = new SparseIntArray();
       this.i = -1;
       this.k = -1;
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.j = p1;
       this.h = p3;
    }
    public final sg7 a(){
       sg7 tj;
       sg7 te = this.e;
       int i = te.dataPosition();
       if ((tj = this.j) == this.f) {
          tj = this.g;
       }
       tj = new sg7(te, i, tj, en6.p("", this.h, "  "), this.a, this.b, this.c);
       return v8;
    }
    public final boolean e(int p0){
       boolean b;
       sg7 tk;
       while (true) {
          b = true;
          if (this.j < this.g) {
             if ((tk = this.k) == p0) {
                return b;
             }else if(String.valueOf(tk).compareTo(String.valueOf(p0)) > 0){
                return false;
             }else {
                sg7 te = this.e;
                te.setDataPosition(this.j);
                int i = te.readInt();
                this.k = te.readInt();
                int i1 = this.j + i;
                this.j = i1;
             }
          }else if(this.k == p0){
             b = false;
             break ;
          }
          break ;
       }
       return b;
    }
    public final void i(int p0){
       sg7 ti = this.i;
       sg7 td = this.d;
       sg7 te = this.e;
       if (ti >= null) {
          int i = td.get(ti);
          int i1 = te.dataPosition();
          te.setDataPosition(i);
          te.writeInt((i1 - i));
          te.setDataPosition(i1);
       }
       this.i = p0;
       td.put(p0, te.dataPosition());
       te.writeInt(0);
       te.writeInt(p0);
       return;
    }
}
