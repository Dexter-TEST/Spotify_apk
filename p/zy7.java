package p.zy7;
import p.jd;
import java.lang.String;
import p.xy7;
import p.dx7;
import p.jx7;
import p.xv7;
import java.lang.Object;
import p.yy7;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p.uy7;
import p.ty7;
import p.ox7;
import java.lang.Long;
import java.lang.Integer;
import p.qz7;
import java.io.File;
import java.util.List;
import p.hz7;
import p.dy7;
import java.lang.Exception;
import p.vy7;
import p.fz7;
import p.vz7;
import p.sz7;
import p.ny7;
import android.os.ParcelFileDescriptor$AutoCloseInputStream;
import p.xx7;
import p.oz7;
import java.lang.Class;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.InputStream;

public final class zy7	// class@002f91 from classes.dex
{
    public final xy7 a;
    public final dx7 b;
    public final jx7 c;
    public final xv7 d;
    public static final jd e;

    static {
       zy7.e = new jd("ExtractorTaskFinder");
    }
    public void zy7(xy7 p0,dx7 p1,jx7 p2,xv7 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final yy7 a(){
       uy7 ouy7;
       uy7 ouy71;
       Long longx;
       Object[] objArray;
       uy7 c1;
       uy7 c2;
       vy7 ovy71;
       Object obj;
       vy7 f;
       Iterator iterator6;
       zy7 ozy71;
       zy7 ozy72;
       int i3;
       vz7 ovz7;
       zy7 ozy7 = this;
       zy7 a = ozy7.a;
       a.e.lock();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = a.d.values().iterator();
       while (iterator.hasNext()) {
          ouy7 = iterator.next();
          if (ox7.T(ouy7.c.d)) {
             uArrayList.add(ouy7);
          }
       }
       yy7 oyy7 = null;
       if (uArrayList.isEmpty()) {
          a.a();
          return oyy7;
       }else {
          int i = 2;
          int i1 = 1;
          int i2 = 0;
          zy7 b = ozy7.b;
          jd e = zy7.e;
          if (ozy7.d.a()) {
             HashMap hashMap = b.n();
             Iterator iterator1 = uArrayList.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   ouy71 = iterator1.next();
                   uy7 c = ouy71.c;
                   if ((longx = hashMap.get(c.a)) != null && !(c.b - longx.longValue())) {
                      objArray = new Object[i];
                      objArray[i2] = Integer.valueOf(ouy71.a);
                      objArray[i1] = c.a;
                      e.a("Found promote pack task for session %s with pack %s.", objArray);
                      ty7 a1 = c.a;
                      qz7 objArray1 = new qz7(ouy71.a, a1, (int)dx7.b(new File(b.d(), a1), i1), ouy71.b, c.b);
                   }
                }else {
                   qz7 oqz7 = null;
                }
                if (objArray != null) {
                   a.a();
                   return objArray;
                }
             }
          }
          iterator = uArrayList.iterator();
          while (true) {
             if (iterator.hasNext()) {
                ouy7 = iterator.next();
                try{
                   c1 = ouy7.c;
                   if (b.h(ouy7.b, c1.b, c1.a) == c1.f.size()) {
                      objArray = new Object[]{Integer.valueOf(ouy7.a),c1.a};
                      e.a("Found final move task for session %s with pack %s.", objArray);
                      hz7 objArray3 = new hz7(ouy7.a, c1.a, ouy7.b, c1.b, c1.c);
                   }else {
                      continue ;
                   }
                }catch(java.io.IOException e0){
                   Object[] objArray2 = new Object[2];
                   objArray2[i2] = Integer.valueOf(ouy7.a);
                   objArray2[i1] = ouy7.c.a;
                   throw new dy7(String.format("Failed to check number of completed merges for session %s, pack %s", objArray2), e0, ouy7.a);
                }
             }else {
                ovz7 = null;
             }
             if (objArray == null) {
                iterator = uArrayList.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      ouy7 = iterator.next();
                      c2 = ouy7.c;
                      if (ox7.T(c2.d)) {
                         Iterator iterator2 = c2.f.iterator();
                         while (true) {
                            if (iterator2.hasNext()) {
                               vy7 ovy7 = iterator2.next();
                               if (ozy7.b.l(c2.a, ouy7.b, c2.b, ovy7.a).exists()) {
                                  objArray = new Object[]{Integer.valueOf(ouy7.a),c2.a,ovy7.a};
                                  e.a("Found merge task for session %s with pack %s and slice %s.", objArray);
                                  fz7 objArray4 = new fz7(ouy7.a, c2.a, ouy7.b, c2.b, ovy7.a);
                               }else {
                                  obj = 0;
                               }
                            }else {
                               continue ;
                            }
                         }
                      }else {
                         continue ;
                      }
                   }else {
                      ovz7 = null;
                   }
                   if (objArray == null) {
                      iterator = uArrayList.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            ouy7 = iterator.next();
                            c1 = ouy7.c;
                            if (ox7.T(c1.d)) {
                               Iterator iterator3 = c1.f.iterator();
                               while (true) {
                                  if (iterator3.hasNext()) {
                                     ovy71 = iterator3.next();
                                     if (ozy7.b(ouy7, ovy71) && ozy7.b.k(c1.a, ouy7.b, c1.b, ovy71.a).exists()) {
                                        objArray = new Object[]{Integer.valueOf(ouy7.a),c1.a,ovy71.a};
                                        e.a("Found verify task for session %s with pack %s and slice %s.", objArray);
                                        vz7 objArray5 = new vz7(ouy7.a, c1.a, ouy7.b, c1.b, ovy71.a, ovy71.b);
                                     }else {
                                        continue ;
                                     }
                                  }else {
                                     continue ;
                                  }
                               }
                            }else {
                               continue ;
                            }
                         }else {
                            ovz7 = null;
                         }
                         if (objArray == null) {
                            Iterator iterator4 = uArrayList.iterator();
                            while (true) {
                               zy7 c3 = ozy7.c;
                               if (iterator4.hasNext()) {
                                  obj = iterator4.next();
                                  c2 = obj.c;
                                  ouy71 = obj.a;
                                  if (ox7.T(c2.d)) {
                                     Iterator iterator5 = c2.f.iterator();
                                     while (true) {
                                        if (iterator5.hasNext()) {
                                           Object obj1 = iterator5.next();
                                           oz7 ooz7 = ((f = obj1.f) != 1 && f != 2)? 0: 1;
                                           vy7 a2 = obj1.a;
                                           vy7 d = obj1.d;
                                           if (!f) {
                                              iterator6 = iterator4;
                                              Iterator iterator7 = iterator5;
                                              ty7 a3 = c2.a;
                                              ozy71 = a;
                                              oz7 obj2 = obj;
                                              ozy72 = b;
                                              sz7 osz7 = f;
                                              zy7 ozy73 = ozy7.b;
                                              ty7 oty7 = c2.a;
                                              uy7 ouy72 = obj.b;
                                              ty7 oty71 = c2.b;
                                              vy7 ovy72 = obj1.a;
                                              try{
                                                 osz7 = new sz7(ozy73, oty7, ouy72, oty71, ovy72);
                                                 i3 = f.a();
                                              }catch(java.io.IOException e0){
                                                 objArray = new Object[]{e0};
                                                 e.c("Slice checkpoint corrupt, restarting extraction. %s", objArray);
                                                 i3 = 0;
                                              }
                                              if (i3 != -1 && d.get(i3).a != null) {
                                                 Object[] xx7 objArray6 = new Object[]{Integer.valueOf(obj1.e),Integer.valueOf(ouy71),a3,a2,Integer.valueOf(i3)};
                                                 e.a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", objArray6);
                                                 uy7 obj3 = obj2;
                                                 objArray6 = new xx7(obj3.a, c2.a, obj3.b, c2.b, c2.c, obj1.a, obj1.e, i3, d.size(), c2.e, c2.d, c3.a(ouy71, a3, i3, a2));
                                              label_0338 :
                                                 if (objArray6 == null) {
                                                    iterator = uArrayList.iterator();
                                                    while (true) {
                                                       if (iterator.hasNext()) {
                                                          uy7 ouy73 = iterator.next();
                                                          obj3 = ouy73.c;
                                                          uy7 a4 = ouy73.a;
                                                          if (ox7.T(obj3.d)) {
                                                             iterator4 = obj3.f.iterator();
                                                             while (true) {
                                                                if (iterator4.hasNext()) {
                                                                   vy7 ovy73 = iterator4.next();
                                                                   obj = ((ovy71 = ovy73.f) != 1 && ovy71 != 2)? 0: 1;
                                                                   vy7 a5 = ovy73.a;
                                                                   if (obj && ovy73.d.get(0).a != null) {
                                                                      if (!this.b(ouy73, ovy73)) {
                                                                         objArray = new Object[4];
                                                                         objArray[0] = Integer.valueOf(ovy73.f);
                                                                         objArray[1] = Integer.valueOf(a4);
                                                                         ty7 a6 = obj3.a;
                                                                         objArray[2] = obj3.a;
                                                                         objArray[3] = a5;
                                                                         e.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", objArray);
                                                                         ParcelFileDescriptor$AutoCloseInputStream uAutoCloseIn = c3.a(a4, a6, 0, a5);
                                                                         ty7 a7 = obj3.a;
                                                                         ozy72.getClass();
                                                                         long l = ozy72.i(a6);
                                                                         obj2 = new oz7(ouy73.a, a7, (int)dx7.b(new File(ozy72.d(), a7), true), l, ouy73.b, obj3.b, ovy73.f, ovy73.a, ovy73.c, uAutoCloseIn);
                                                                      label_0415 :
                                                                         if (objArray != null) {
                                                                         }else {
                                                                            ozy71.a();
                                                                            return null;
                                                                         }
                                                                      }else {
                                                                         continue ;
                                                                      }
                                                                   }else {
                                                                      ozy72 = ozy72;
                                                                      continue ;
                                                                   }
                                                                }
                                                             }
                                                             ozy71.a();
                                                             return objArray;
                                                          }
                                                          ozy72 = ozy72;
                                                       }else {
                                                          ooz7 = null;
                                                          goto label_0415 ;
                                                       }
                                                    }
                                                 }else {
                                                    ozy71.a();
                                                    return objArray6;
                                                 }
                                              }else {
                                                 ozy7 = this;
                                                 obj = obj2;
                                                 iterator4 = iterator6;
                                                 iterator5 = iterator7;
                                                 a = ozy71;
                                                 b = ozy72;
                                              }
                                           }else {
                                              ozy7 = this;
                                           }
                                        }
                                     }
                                  }
                                  ozy7 = this;
                                  iterator6 = iterator4;
                                  a = a;
                                  b = b;
                               }else {
                                  ozy71 = a;
                                  ozy72 = b;
                                  xx7 oxx7 = null;
                                  goto label_0338 ;
                               }
                            }
                         }
                      }
                   }
                }
             }
             break ;
          }
          a.a();
          return objArray;
       }
    }
    public final boolean b(uy7 p0,vy7 p1){
       uy7 c = p0.c;
       jd h = sz7.h;
       zy7 tb = this.b;
       tb.getClass();
       File uFile = new File(new File(new File(new File(tb.c(p0.b, c.b, c.a), "_slices"), "_metadata"), p1.a), "checkpoint.dat");
       boolean b = false;
       if (!uFile.exists()) {
       }else {
          int i = 1;
          try{
             FileInputStream c1 = new FileInputStream(uFile);
             Properties properties = new Properties();
             properties.load(c1);
             c1.close();
             String str = "fileStatus";
             if (properties.getProperty(str) == null) {
                Object[] objArray1 = new Object[b];
                h.c("Slice checkpoint file corrupt while checking if extraction finished.", objArray1);
             }else if(Integer.parseInt(properties.getProperty(str)) == 4){
                b = true;
             }
          }catch(java.io.IOException e0){
             Object[] objArray = new Object[i];
             objArray[b] = e0;
             h.c("Could not read checkpoint while checking if extraction finished. %s", objArray);
          }
       }
       return b;
    }
}
