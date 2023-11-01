package p.vz3;
import p.vy6;
import java.lang.String;
import java.lang.System;
import java.lang.Boolean;
import java.util.Iterator;
import p.tp2;
import p.la6;
import p.pa6;
import java.util.ArrayList;
import p.oa6;
import java.util.List;
import p.ye7;
import java.lang.Iterable;
import java.lang.Object;
import p.uz3;
import p.tz3;
import java.lang.IllegalStateException;

public abstract class vz3	// class@002a95 from classes.dex
{
    public static final tz3 a;

    static {
       uz3 ouz3;
       String str = "kotlinx.coroutines.fast.service.loader";
       int i = 0;
       try{
          str = System.getProperty(str);
       }catch(java.lang.SecurityException e0){
          str = i;
       }
       if (str != null) {
          Boolean.parseBoolean(str);
       }
       List list = ye7.N(oa6.H(pa6.F(tp2.p())));
       Iterator iterator = list.iterator();
       if (!iterator.hasNext()) {
          ouz3 = i;
       }else {
          ouz3 = iterator.next();
          if (iterator.hasNext()) {
             int i1 = ouz3.c();
             do {
                Object obj = iterator.next();
                int i2 = obj.c();
                if (i1 < i2) {
                   ouz3 = obj;
                   i1 = i2;
                }
             } while (!iterator.hasNext());
          }
       }
       if (ouz3 != null) {
          tz3 otz3 = ouz3.b(list);
          if (otz3 != null) {
             vz3.a = otz3;
          }
       }
       throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. \'kotlinx-coroutines-android\' and ensure it has the same version as \'kotlinx-coroutines-core\'");
    }
}
