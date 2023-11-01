package p.p02;
import p.wc2;
import p.el6;
import p.zf2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.e70;

public final class p02 extends wc2	// class@0021c4 from classes.dex
{
    public final int b;
    public final zf2 c;
    public boolean t;

    public void p02(el6 p0,zf2 p1,int p2){
       this.b = p2;
       if (p2 != 1) {
          super(p0);
          this.c = p1;
          return;
       }else {
          co5.o(p0, "delegate");
          super(p0);
          this.c = p1;
          return;
       }
    }
    public final void I(e70 p0,long p1){
       switch (this.b){
           case 0:
             if (this.t == null) {
                try{
                   super.I(p0, p1);
                }catch(java.io.IOException e4){
                   this.t = true;
                   this.c.invoke(e4);
                }
             }
             break;
           default:
             co5.o(p0, "source");
             if (this.t == null) {
                try{
                   super.I(p0, p1);
                }catch(java.io.IOException e4){
                   this.t = true;
                   this.c.invoke(e4);
                }
             }
             return;
       }
       return;
    }
    public final void close(){
       p02 tc = this.c;
       switch (this.b){
           case 0:
             try{
                super.close();
             }catch(java.io.IOException e0){
                this.t = true;
                tc.invoke(e0);
             }
             return;
             break;
           default:
             if (this.t == null) {
                try{
                   super.close();
                }catch(java.io.IOException e0){
                   this.t = true;
                   tc.invoke(e0);
                }
             }
       }
       return;
    }
    public final void flush(){
       p02 tc = this.c;
       switch (this.b){
           case 0:
             try{
                super.flush();
             }catch(java.io.IOException e0){
                this.t = true;
                tc.invoke(e0);
             }
             return;
             break;
           default:
             if (this.t == null) {
                try{
                   super.flush();
                }catch(java.io.IOException e0){
                   this.t = true;
                   tc.invoke(e0);
                }
             }
       }
       return;
    }
}
