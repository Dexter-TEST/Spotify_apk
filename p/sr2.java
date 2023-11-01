package p.sr2;
import p.i07;
import java.lang.String;
import p.tr2;
import p.as2;
import java.io.IOException;

public final class sr2 extends i07	// class@000338 from classes2.dex
{
    public final tr2 e;
    public final int f;
    public final long g;

    public void sr2(String p0,tr2 p1,int p2,long p3){
       this.e = p1;
       this.f = p2;
       this.g = p3;
       super(p0, true);
    }
    public final long a(){
       sr2 te = this.e;
       try{
          te.P.i0(this.f, this.g);
       }catch(java.io.IOException e1){
          te.f(e1);
       }
       return -1;
    }
}
