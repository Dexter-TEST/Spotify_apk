package p.p57;
import p.q57;
import java.lang.String;
import p.jg3;
import java.lang.Number;
import java.math.BigDecimal;
import p.cd2;
import java.lang.StringBuilder;
import p.en6;
import java.lang.Throwable;

public final class p57 extends q57	// class@0021f8 from classes.dex
{

    public void p57(){
       super("BIG_DECIMAL", 3);
    }
    public final Number a(jg3 p0){
       String str = p0.s0();
       try{
          return new BigDecimal(str);
       }catch(java.lang.NumberFormatException e1){
          throw new cd2(6, en6.t("Cannot parse ", str, "; at path ")+p0.d(), e1);
       }
    }
}
