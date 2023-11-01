package p.wz7;
import p.jd;
import java.lang.String;
import p.dx7;
import java.lang.Object;
import p.vz7;
import p.yy7;
import java.io.File;
import java.lang.Class;
import java.util.ArrayList;
import p.uz7;
import java.util.List;
import p.xe7;
import p.dy7;
import java.lang.Exception;

public final class wz7	// class@002bdb from classes.dex
{
    public final dx7 a;
    public static final jd b;

    static {
       wz7.b = new jd("VerifySliceTaskHandler");
    }
    public void wz7(dx7 p0){
       this.a = p0;
    }
    public final void a(vz7 p0){
       Object[] objArray;
       Object[] objArray1;
       File uFile = this.a.k(p0.b, p0.c, p0.d, p0.e);
       int i = 0;
       vz7 e = p0.e;
       if (uFile.exists()) {
          try{
             wz7 ta = this.a;
             ta.getClass();
             File uFile1 = new File(new File(new File(ta.c(p0.c, p0.d, p0.b), "_slices"), "_metadata"), e);
             if (uFile1.exists()) {
                ArrayList uArrayList = uz7.a(uFile, uFile1);
                try{
                   if (xe7.m0(uArrayList).equals(p0.f)) {
                      objArray1 = new Object[]{e,p0.b};
                      wz7.b.e("Verification of slice %s of pack %s successful.", objArray1);
                      File uFile2 = this.a.l(p0.b, p0.c, p0.d, p0.e);
                      if (!uFile2.exists()) {
                         uFile2.mkdirs();
                      }
                      if (uFile.renameTo(uFile2)) {
                         return;
                      }else {
                         objArray1 = new Object[]{e};
                         throw new dy7(String.format("Failed to move slice %s after verification.", objArray1), p0.a);
                      }
                   }else {
                      objArray1 = new Object[]{e};
                      throw new dy7(String.format("Verification failed for slice %s.", objArray1), p0.a);
                   }
                }catch(java.security.NoSuchAlgorithmException e0){
                   throw new dy7("SHA256 algorithm not supported.", e0, p0.a);
                }catch(java.io.IOException e0){
                   objArray = new Object[1];
                   objArray[i] = e;
                   throw new dy7(String.format("Could not digest file during verification for slice %s.", objArray), e0, p0.a);
                }
             }else {
                try{
                   objArray1 = new Object[]{e};
                   throw new dy7(String.format("Cannot find metadata files for slice %s.", objArray1), p0.a);
                }catch(java.io.IOException e0){
                   objArray = new Object[1];
                   objArray[i] = e;
                   throw new dy7(String.format("Could not reconstruct slice archive during verification for slice %s.", objArray), e0, p0.a);
                }
             }
          }catch(java.io.IOException e0){
          }
       }else {
          objArray1 = new Object[]{e};
          throw new dy7(String.format("Cannot find unverified files for slice %s.", objArray1), p0.a);
       }
    }
}
