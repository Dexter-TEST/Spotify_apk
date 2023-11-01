package p.tv5;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.scheduling.a;

public final class tv5	// class@0027ee from classes.dex
{
    private AtomicReferenceArray array;

    public void tv5(int p0){
       super();
       this.array = new AtomicReferenceArray(p0);
    }
    public final int a(){
       return this.array.length();
    }
    public final Object b(int p0){
       tv5 tarray = this.array;
       Object obj = (p0 < tarray.length())? tarray.get(p0): null;
       return obj;
    }
    public final void c(int p0,a p1){
       tv5 tarray = this.array;
       int i = tarray.length();
       if (p0 < i) {
          tarray.set(p0, p1);
       }else {
          int i1 = p0 + 1;
          int i2 = i * 2;
          if (i1 < i2) {
             i1 = i2;
          }
          AtomicReferenceArray uAtomicRefer = new AtomicReferenceArray(i1);
          for (i1 = 0; i1 < i; i1 = i1 + 1) {
             uAtomicRefer.set(i1, tarray.get(i1));
          }
          uAtomicRefer.set(p0, p1);
          this.array = uAtomicRefer;
       }
       return;
    }
}
