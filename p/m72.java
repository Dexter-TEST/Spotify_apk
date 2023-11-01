package p.m72;
import p.yf2;
import java.lang.Object;
import io.reactivex.rxjava3.core.Flowable;
import p.l72;
import java.lang.Integer;
import p.p82;
import p.j92;
import p.bm;
import java.lang.Class;
import java.lang.String;
import java.util.Objects;
import p.w00;
import p.mf1;
import p.co5;
import p.bn5;
import p.ap5;
import p.g62;
import p.e16;
import java.lang.IllegalArgumentException;
import p.tp2;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

public final class m72 implements yf2	// class@001e3b from classes.dex
{
    public final int a;
    public final int b;
    public final long c;

    public void m72(int p0,int p1,long p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public final Object apply(Object p0){
       int i1;
       l72 b;
       int i = 1;
       m72 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             return p0.zipWith(Observable.range(i, (tb + i)), new bm(i)).flatMap(new e16(4, this));
       }
       if ((i1 = tb + i) < 0) {
          throw new IllegalArgumentException(tp2.k("count >= 0 required but it was ", i1));
       }
       if (!i1) {
          b = l72.b;
       }else if(i1 == i){
          b = Flowable.o(Integer.valueOf(i));
       }else if((((long)i + (long)(i1 - 1)) - 0x7fffffff) <= 0){
          b = new j92(i1);
       }else {
          throw new IllegalArgumentException("Integer overflow");
       }
       p0.getClass();
       Objects.requireNonNull(b, "other is null");
       int a = Flowable.a;
       bn5[] uobn5Array = new bn5[]{p0,b};
       ap5.E(a, "bufferSize");
       return new g62(uobn5Array, co5.O(new bm(0)), a).i(new e16(3, this), a, a);
    }
}
