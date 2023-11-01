package p.o57;
import p.q57;
import java.lang.String;
import p.jg3;
import java.lang.Number;
import java.lang.Long;
import java.lang.Double;
import p.r04;
import java.lang.StringBuilder;
import java.lang.Object;
import p.cd2;
import p.en6;
import java.lang.Throwable;

public final class o57 extends q57	// class@0020b5 from classes.dex
{

    public void o57(){
       super("LONG_OR_DOUBLE", 2);
    }
    public final Number a(jg3 p0){
       String str = "; at path ";
       String str1 = p0.s0();
       try{
          return Long.valueOf(Long.parseLong(str1));
       }catch(java.lang.NumberFormatException e0){
          try{
             Double uDouble = Double.valueOf(str1);
             if (!uDouble.isInfinite() && (!uDouble.isNaN() || p0.b != null)) {
                return uDouble;
             }
             throw new r04(v1+uDouble+e0+p0.d());
          }catch(java.lang.NumberFormatException e1){
             throw new cd2(6, en6.t("Cannot parse ", str1, e0)+p0.d(), e1);
          }
       }
    }
}
