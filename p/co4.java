package p.co4;
import p.is6;
import java.math.BigDecimal;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.IllegalStateException;
import p.gb6;
import p.vf3;
import p.uf3;
import java.lang.Integer;

public final class co4 extends is6	// class@001248 from classes.dex
{
    public static final co4 t;

    static {
       co4.t = new co4();
    }
    public void co4(){
       super(1, BigDecimal.class);
    }
    public final String d(Object p0){
       throw new IllegalStateException();
    }
    public final boolean isEmpty(gb6 p0,Object p1){
       return false;
    }
    public final void serialize(Object p0,vf3 p1,gb6 p2){
       if (p1.f(uf3.b)) {
          int i = ((i = p0.scale()) >= -9999 && i <= 9999)? 1: 0;
          if (i) {
             p0 = p0.toPlainString();
          }else {
             Object[] objArray = new Object[]{Integer.valueOf(p0.scale()),Integer.valueOf(9999),Integer.valueOf(9999)};
             objArray = new Object[0];
             p2.y(String.format("Attempt to write plain `java.math.BigDecimal` \(see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN\) with illegal scale \(%d\): needs to be between [-%d, %d]", objArray), objArray);
             throw null;
          }
       }else {
          p0 = p0.toString();
       }
       p1.x0(p0);
       return;
    }
}
