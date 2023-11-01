package p.dd0;
import p.wc0;

public final class dd0 extends wc0	// class@001323 from classes.dex
{
    public final int a;
    public final short b;
    public final int c;

    public void dd0(int p0,long p1,int p2){
       this.a = p2;
       if (p2 != 1) {
          super();
          this.c = p0;
          this.b = (short)(int)p1;
          return;
       }else {
          super();
          this.b = (short)p0;
          this.c = (int)p1;
          return;
       }
    }
    public final int a(){
       switch (this.a){
           case 0:
           default:
             return this.b;
       }
       return this.c;
    }
    public final long b(){
       dd0 tb;
       switch (this.a){
           case 0:
             tb = this.b;
             break;
           default:
             tb = this.c;
       }
       return (long)tb;
    }
}
