package p.qg4;
import p.ug4;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.Enum;
import java.io.Serializable;
import p.co5;
import p.av6;
import p.en6;

public final class qg4 extends ug4	// class@002398 from classes.dex
{
    public final Class n;

    public void qg4(Class p0){
       super(p0, 0);
       if (!p0.isEnum()) {
          throw new IllegalArgumentException(p0+" is not an Enum type.".toString());
       }
       this.n = p0;
       return;
    }
    public final String b(){
       return this.n.getName();
    }
    public final Object c(String p0){
       return this.f(p0);
    }
    public final Serializable e(String p0){
       return this.f(p0);
    }
    public final Enum f(String p0){
       object oobject;
       co5.o(p0, "value");
       qg4 tn = this.n;
       Object[] enumConstant = tn.getEnumConstants();
       co5.l(enumConstant, "type.enumConstants");
       int len = enumConstant.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = enumConstant[i];
             if (av6.i0(oobject.name(), p0, true)) {
             label_0029 :
                if (oobject == null) {
                   throw new IllegalArgumentException(en6.t("Enum value ", p0, " not found for type ")+tn.getName()+'.');
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             oobject = null;
             goto label_0029 ;
          }
       }
       return oobject;
    }
}
