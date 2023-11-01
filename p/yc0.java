package p.yc0;
import p.wc0;

public final class yc0 extends wc0	// class@002d8b from classes.dex
{
    public final int a;
    public final int b;
    public final byte c;

    public void yc0(int p0,long p1,int p2){
       this.a = p2;
       if (p2 != 1) {
          super();
          this.c = (byte)p0;
          this.b = (int)p1;
          return;
       }else {
          super();
          this.b = p0;
          this.c = (byte)(int)p1;
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
       yc0 tb;
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
