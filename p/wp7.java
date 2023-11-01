package p.wp7;
import p.s3;

public abstract class wp7	// class@002b83 from classes.dex
{

    public static int a(int p0){
       int i2;
       int i = 0;
       int i1 = 1;
       while (i1 <= 256) {
          if (i2 = p0 & i1) {
             if (i1 != 1) {
                if (i1 != 2) {
                   if (i1 != 4) {
                      if (i1 != 8) {
                         if (i1 != 16) {
                            if (i1 != 32) {
                               if (i1 != 64) {
                                  if (i1 == 128) {
                                     i2 = s3.t();
                                  }
                               }else {
                                  i2 = s3.s();
                               }
                            }else {
                               i2 = s3.r();
                            }
                         }else {
                            i2 = s3.q();
                         }
                      }else {
                         i2 = s3.p();
                      }
                   }else {
                      i2 = s3.o();
                   }
                }else {
                   i2 = s3.m();
                }
             }else {
                i2 = s3.a();
             }
             i = i | i2;
          }
          i1 = i1 << 1;
       }
       return i;
    }
}
