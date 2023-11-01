package p.os4;
import p.ox4;
import java.lang.Object;
import p.cd1;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.NoSuchElementException;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class os4 extends ox4	// class@00217f from classes.dex
{
    public final int c;
    public final boolean t;
    public final Object v;

    public void os4(int p0,Object p1,boolean p2){
       this.c = p0;
       super();
       this.t = p2;
       this.v = p1;
    }
    public final void onComplete(){
       ox4 tb;
       cd1 a = cd1.a;
       Object obj = null;
       switch (this.c){
           case 0:
             if (!this.isDone()) {
                this.b = obj;
                this.a.lazySet(a);
                if (this.t != null) {
                   this.complete(this.v);
                }else {
                   this.completeExceptionally(new NoSuchElementException());
                }
             }
             break;
           case 1:
             if (!this.isDone()) {
                tb = this.b;
                this.b = obj;
                this.a.lazySet(a);
                if (tb != null) {
                   this.complete(tb);
                }else if(this.t != null){
                   this.complete(this.v);
                }else {
                   this.completeExceptionally(new NoSuchElementException());
                }
             }
             return;
             break;
           default:
             if (!this.isDone()) {
                tb = this.b;
                this.b = obj;
                this.a.lazySet(a);
                if (tb != null) {
                   this.complete(tb);
                }else if(this.t != null){
                   this.complete(this.v);
                }else {
                   this.completeExceptionally(new NoSuchElementException());
                }
             }
             return;
       }
       return;
    }
    public final void onNext(Object p0){
       switch (this.c){
           case 0:
             this.complete(p0);
             return;
           case 1:
             this.b = p0;
             return;
           default:
             if (this.b != null) {
                this.b = null;
                this.completeExceptionally(new IllegalArgumentException("Sequence contains more than one element!"));
             }else {
                this.b = p0;
             }
             return;
       }
    }
}
