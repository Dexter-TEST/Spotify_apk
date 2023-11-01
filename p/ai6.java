package p.ai6;
import p.t57;
import p.u10;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Integer;

public final class ai6 extends t57	// class@000f8d from classes.dex
{
    public final short c;
    public final short d;

    public void ai6(t57 p0,int p1,int p2){
       super(p0);
       this.c = (short)p1;
       this.d = (short)p2;
    }
    public final void a(u10 p0,byte[] p1){
       p0.c(this.c, this.d);
    }
    public final String toString(){
       ai6 td = this.d;
       return "<"+Integer.toBinaryString(((1 << td) | ((((1 << td) - 1) & this.c) | (1 << td)))).substring(1)+'>';
    }
}
