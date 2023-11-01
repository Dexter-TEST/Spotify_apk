package p.n72;
import p.wz;
import p.zn0;
import java.lang.Object;
import p.bi5;
import java.lang.Throwable;
import p.co5;
import p.kv6;
import p.yf2;
import java.lang.String;
import java.util.Objects;
import p.iv6;
import p.yh6;

public final class n72 extends wz	// class@001f7e from classes.dex
{
    public final int w;
    public final Object x;

    public void n72(zn0 p0,Object p1,int p2){
       this.w = p2;
       this.x = p1;
    }
    public final int b(int p0){
       switch (this.w){
           case 0:
           default:
             return this.d(p0);
       }
       return this.d(p0);
    }
    public final boolean c(Object p0){
       n72 tx = this.x;
       wz ta = this.a;
       boolean b = true;
       switch (this.w){
           case 0:
             if (this.t != null) {
                b = false;
             }else if(this.v != null){
                b = ta.c(null);
             }else if(tx.test(p0) && ta.c(p0)){
             }
             break;
           default:
             if (this.t == null) {
                if (this.v != null) {
                   ta.c(null);
                }else {
                   p0 = tx.apply(p0);
                   Objects.requireNonNull(p0, "The mapper function returned a null value.");
                   b = ta.c(p0);
                }
             }
             return b;
       }
       return b;
    }
    public final void onNext(Object p0){
       switch (this.w){
           case 0:
             if (!this.c(p0)) {
                this.b.a(1);
             }
             break;
           default:
             if (this.t == null) {
                wz ta = this.a;
                if (this.v != null) {
                   ta.onNext(null);
                }else {
                   p0 = this.x.apply(p0);
                   Objects.requireNonNull(p0, "The mapper function returned a null value.");
                   ta.onNext(p0);
                }
             }
             return;
       }
       return;
    }
    public final Object poll(){
       Object obj1;
       Object obj2;
       Object obj = null;
       n72 tx = this.x;
       switch (this.w){
           case 0:
             wz tc = this.c;
             n72 on72 = tx;
             while ((obj1 = tc.poll()) != null) {
                if (on72.test(obj1)) {
                   obj = obj1;
                   break ;
                }else if(this.v == 2){
                   tc.a(1);
                }
             }
             break;
           default:
             if ((obj2 = this.c.poll()) != null) {
                obj = tx.apply(obj2);
                Objects.requireNonNull(obj, "The mapper function returned a null value.");
             }
             return obj;
       }
       return obj;
    }
}
