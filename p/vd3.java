package p.vd3;
import p.qc7;
import java.lang.Object;
import java.util.NoSuchElementException;

public final class vd3 extends qc7	// class@0029ce from classes.dex
{
    public boolean a;
    public final Object b;

    public void vd3(Object p0){
       this.b = p0;
       super();
    }
    public final boolean hasNext(){
       return (this.a ^ 0x01);
    }
    public final Object next(){
       if (this.a != null) {
          throw new NoSuchElementException();
       }
       this.a = true;
       return this.b;
    }
}
