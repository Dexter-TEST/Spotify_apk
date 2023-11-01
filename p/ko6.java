package p.ko6;
import java.util.Iterator;
import p.ch3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.h1;
import p.h0;
import android.view.ViewGroup;
import p.jo6;
import java.util.NoSuchElementException;
import android.view.View;
import java.lang.IndexOutOfBoundsException;
import java.lang.Throwable;
import java.lang.UnsupportedOperationException;

public class ko6 implements Iterator, ch3	// class@001c54 from classes.dex
{
    public final int a;
    public int b;
    public final Object c;

    public void ko6(int p0,Object p1){
       this.a = p0;
       this.c = p1;
       super();
    }
    public void ko6(Object[] p0){
       this.a = 3;
       co5.o(p0, "array");
       super();
       this.c = p0;
    }
    public final boolean hasNext(){
       boolean b = false;
       ko6 tc = this.c;
       switch (this.a){
           case 0:
             if (this.b < tc.g()) {
                b = true;
             }
             break;
           case 1:
             if (this.b < tc.getChildCount()) {
                b = true;
             }
             return b;
             break;
           case 2:
             if (this.b < tc.a()) {
                b = true;
             }
             return b;
             break;
           default:
             if (this.b < tc.length) {
                b = true;
             }
             return b;
       }
       return b;
    }
    public final Object next(){
       ko6 tb;
       View childAt;
       ko6 tc = this.c;
       switch (this.a){
           case 0:
           case 1:
             tb = this.b;
             this.b = tb + 1;
             if ((childAt = tc.getChildAt(tb)) != null) {
                return childAt;
             }
             throw new IndexOutOfBoundsException();
             break;
           case 2:
             if (!this.hasNext()) {
                throw new NoSuchElementException();
             }
             tb = this.b;
             this.b = tb + 1;
             return tc.get(tb);
             break;
           default:
             try{
                tb = this.b;
                this.b = tb + 1;
                return tc[tb];
             }catch(java.lang.ArrayIndexOutOfBoundsException e0){
                this.b = this.b - 1;
                throw new NoSuchElementException(e0.getMessage());
             }
       }
       tb = this.b;
       this.b = tb + 1;
       return tc.h(tb);
    }
    public final void remove(){
       String str = "Operation is not supported for read-only collection";
       switch (this.a){
           case 0:
             throw new UnsupportedOperationException(str);
           case 1:
             int i = this.b - 1;
             this.b = i;
             this.c.removeViewAt(i);
             return;
           case 2:
             throw new UnsupportedOperationException(str);
           default:
             throw new UnsupportedOperationException(str);
       }
    }
}
