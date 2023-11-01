package p.gq;
import p.zf2;
import p.gi3;
import java.lang.Object;
import p.kh4;
import java.lang.String;
import p.co5;
import java.lang.Boolean;
import p.nw6;
import java.lang.Number;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;

public final class gq extends gi3 implements zf2	// class@001760 from classes.dex
{
    public final int a;
    public final int b;

    public void gq(int p0,int p1){
       this.a = p1;
       this.b = p0;
       super(1);
    }
    public final Object invoke(Object p0){
       gq tb = this.b;
       switch (this.a){
           case 0:
             co5.o(p0, "db");
             p0.setVersion(tb);
             return null;
           case 1:
             co5.o(p0, "it");
             return Boolean.valueOf(p0.startNestedScroll(tb));
           default:
             p0.intValue();
             throw new IndexOutOfBoundsException("Collection doesn\'t contain element at index "+tb+'.');
       }
    }
}
