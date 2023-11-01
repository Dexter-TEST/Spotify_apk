package p.yu6;
import p.xu6;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import p.co5;
import p.vv7;
import java.lang.Character;
import java.lang.Long;

public abstract class yu6 extends xu6	// class@002e2e from classes.dex
{

    public static final Integer c0(String p0){
       int i;
       Integer integer;
       int i2;
       int i3;
       int i5;
       int i6;
       co5.o(p0, "<this>");
       vv7.f(10);
       if (!(i = p0.length())) {
       }else {
          int i1 = 0;
          char c = p0.charAt(i1);
          if (co5.r(c, 48) < 0) {
             i2 = 1;
             if (i != i2) {
                if (c == '-') {
                   i3 = 1;
                label_0034 :
                   int i4 = -59652323;
                   while (true) {
                      if (i2 < i) {
                         if ((i5 = Character.digit(p0.charAt(i2), 10)) >= 0) {
                            if (i1 < i4) {
                               if (i4 == -59652323) {
                                  i4 = Integer.MIN_VALUE / 10;
                                  if (i1 >= i4) {
                                  }
                               }
                            }else {
                            }
                         }
                      }else if(i3){
                         integer = Integer.valueOf(i1);
                         break ;
                      }else {
                         integer = Integer.valueOf((- i1));
                         break ;
                      }
                   }
                   return integer;
                }else if(c == '+'){
                   integer = null;
                }
             }
          }else {
             i2 = 0;
          }
          int i7 = -2147483647;
          i3 = 0;
          goto label_0034 ;
       }
    }
    public static final Long d0(String p0){
       int i;
       int i2;
       long l;
       int i4;
       long l2;
       long l3;
       Long obj = p0;
       co5.o(obj, "<this>");
       vv7.f(10);
       if (!(i = p0.length())) {
       }else {
          int i1 = 0;
          char c = obj.charAt(i1);
          if (co5.r(c, 48) < 0) {
             i2 = 1;
             if (i != i2) {
                if (c == '-') {
                   l = Long.MIN_VALUE;
                   i1 = 1;
                label_0038 :
                   long l1 = 0;
                   int i3 = 0xfc71c71c71c71c72;
                   while (true) {
                      if (i2 < i) {
                         if ((i4 = Character.digit(obj.charAt(i2), 10)) >= 0) {
                            if ((l1 - i3) < 0) {
                               if (!(i3 - 0xfc71c71c71c71c72)) {
                                  i3 = l / (long)10;
                                  if ((l1 - i3) >= 0) {
                                  }
                               }
                            }else {
                            }
                         }
                      }else if(i1){
                         obj = Long.valueOf(l1);
                         break ;
                      }else {
                         obj = Long.valueOf((- l1));
                         break ;
                      }
                   }
                   return obj;
                }else if(c == '+'){
                   obj = null;
                }
             }
          }else {
             i2 = 0;
          }
          l = 0x8000000000000001;
          goto label_0038 ;
       }
    }
}
