package p.wr2;
import java.io.Closeable;
import p.fr2;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import java.lang.Object;
import p.co5;
import p.g70;
import p.vr2;
import p.xl2;
import p.nr2;
import p.we7;
import p.ir2;
import java.util.List;
import java.lang.StringBuilder;
import p.tr2;
import p.pr2;
import p.i07;
import p.r07;
import p.zr2;
import p.mp2;
import java.lang.Integer;
import java.util.Map;
import p.u07;
import p.kr2;
import java.io.IOException;
import p.lr2;
import java.util.logging.Level;
import p.qc6;
import p.ib3;
import p.eb3;
import p.gb3;
import p.mr2;
import p.mo1;
import p.qr2;
import p.tp2;
import p.e70;
import p.nn6;
import p.or2;
import p.yr2;
import java.io.EOFException;
import p.j80;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.lang.NullPointerException;
import p.xq2;
import p.ro2;
import java.util.Arrays;
import java.lang.Iterable;
import p.dj0;

public final class wr2 implements Closeable	// class@0003ac from classes2.dex
{
    public final g70 a;
    public final boolean b;
    public final vr2 c;
    public final xl2 t;
    public static final Logger v;

    static {
       Logger logger = Logger.getLogger(fr2.class.getName());
       co5.l(logger, "getLogger\(Http2::class.java.name\)");
       wr2.v = logger;
    }
    public void wr2(g70 p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
       vr2 ovr2 = new vr2(p0);
       this.c = ovr2;
       this.t = new xl2(ovr2);
    }
    public final void J(nr2 p0,int p1,int p2,int p3){
       zr2 ozr2;
       if (!p3) {
          throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
       }
       int i = 0;
       int i1 = 1;
       boolean b = ((p2 & 0x01))? true: false;
       int i2 = ((p2 & 0x08))? this.a.readByte() & 0x00ff: 0;
       if ((p2 & 0x20)) {
          wr2 ta = this.a;
          ta.readInt();
          ta.readByte();
          p0.getClass();
          p1 = p1 - 5;
       }
       List list = this.y(ir2.D(p1, p2, i2), i2, p2, p3);
       p0.getClass();
       p0.b.getClass();
       if (p3 && !((p3 & 0x01))) {
          i = 1;
       }
       if (i) {
          p0 = p0.b;
          p0.getClass();
          pr2 i3 = new pr2(p0.t+'['+p3+"] onHeaders", p0, p3, list, b);
          p0.A.c(i, 0);
       }else {
          p0 = p0.b;
          _monitor_enter(p0);
          if ((ozr2 = p0.x(p3)) == null) {
             if (p0.x != null) {
                _monitor_exit(p0);
             }else if(p3 <= p0.v){
                _monitor_exit(p0);
             }else if(((p3 % 2)) == (p0.w % 2)){
                _monitor_exit(p0);
             }else {
                ozr2 = new zr2(p3, p0, false, b, we7.v(list));
                p0.v = p3;
                p0.c.put(Integer.valueOf(p3), ozr2);
                p0.y.f().c(new kr2(p0.t+'['+p3+"] onStream", p0, ozr2, i1), 0);
                _monitor_exit(p0);
             }
          }else {
             _monitor_exit(p0);
             ozr2.j(we7.v(list), b);
          }
       }
       return;
    }
    public final void T(nr2 p0,int p1,int p2,int p3){
       if (p1 != 8) {
          throw new IOException(co5.K(Integer.valueOf(p1), "TYPE_PING length != 8: "));
       }
       if (p3) {
          throw new IOException("TYPE_PING streamId != 0");
       }
       p1 = this.a.readInt();
       p3 = this.a.readInt();
       int i = 1;
       p2 = ((p2 & i))? 1: 0;
       if (p2) {
          p0 = p0.b;
          _monitor_enter(p0);
          long l = 1;
          if (p1 != i) {
             if (p1 != 2) {
                if (p1 == 3) {
                   p0.notifyAll();
                }
             }else {
                p0.G = p0.G + l;
             }
          }else {
             p0.E = p0.E + l;
          }
          _monitor_exit(p0);
       }else {
          nr2 b = p0.b;
          b.z.c(new lr2(co5.K(" ping", b.t), p0.b, p1, p3), 0);
       }
       return;
    }
    public final boolean b(boolean p0,nr2 p1){
       int i;
       wr2 a;
       zr2 ozr2;
       zr2 i8;
       e70 b3;
       object oobject1;
       object oobject2;
       wr2 owr2 = this;
       nr2 obj = p1;
       co5.o(obj, "handler");
       try{
          i = 0;
          owr2.a.V(9);
          int i1 = we7.t(owr2.a);
          int i2 = 0x4000;
          if (i1 > i2) {
             throw new IOException(co5.K(Integer.valueOf(i1), "FRAME_SIZE_ERROR: "));
          }
          int i3 = owr2.a.readByte() & 0x00ff;
          int i4 = owr2.a.readByte() & 0x00ff;
          int i5 = owr2.a.readInt() & Integer.MAX_VALUE;
          Logger v = wr2.v;
          boolean b = true;
          if (v.isLoggable(Level.FINE)) {
             v.fine(fr2.a(b, i5, i1, i3, i4));
          }
          v = 4;
          if (p0 && i3 != v) {
             String[] b6 = fr2.b;
             if (i3 < b6.length) {
                oobject2 = b6[i3];
             }else {
                Object[] objArray = new Object[b];
                objArray[i] = Integer.valueOf(i3);
                oobject2 = we7.i("0x%02x", objArray);
             }
             throw new IOException(co5.K(oobject2, "Expected a SETTINGS frame but was "));
          }else {
             long l = 0;
             int i6 = 5;
             char c = '[';
             switch (i3){
                 case 0:
                   long l1 = l;
                   if (i5) {
                      boolean b1 = ((i4 & 0x01))? true: false;
                      i = ((i4 & 0x20))? 1: 0;
                      if (!i) {
                         i = ((i4 & 0x08))? owr2.a.readByte() & 0x00ff: 0;
                         int i7 = ir2.D(i1, i4, i);
                         a = owr2.a;
                         co5.o(a, "source");
                         obj.b.getClass();
                         i4 = (i5 && !((i5 & 0x01)))? 1: 0;
                         if (i4) {
                            obj = obj.b;
                            obj.getClass();
                            e70 uoe70 = new e70();
                            long l2 = (long)i7;
                            a.V(l2);
                            a.o(uoe70, l2);
                            or2 a1 = new or2(obj.t+c+i5+"] onData", obj, i5, uoe70, i7, b1);
                            obj.A.c(a, l1);
                         }else if((ozr2 = obj.b.x(i5)) == null){
                            obj.b.i0(i5, mo1.c);
                            l1 = (long)i7;
                            obj.b.g0(l1);
                            a.skip(l1);
                         }else {
                            i8 = ozr2.i;
                            long l3 = (long)i7;
                            i8.getClass();
                            while (true) {
                               if ((l3 - l1) > 0) {
                                  yr2 w = i8.w;
                                  _monitor_enter(w);
                                  yr2 b2 = i8.b;
                                  long l4 = i8.t.b + l3;
                                  l4 = ((l4 - i8.a) > 0)? 1: 0;
                                  _monitor_exit(w);
                                  if (l4) {
                                     a.skip(l3);
                                     i8.w.e(mo1.v);
                                  label_0313 :
                                     if (b1) {
                                        ozr2.j(we7.b, true);
                                     }
                                  }else if(b2 != null){
                                     a.skip(l3);
                                     goto label_0313 ;
                                  }else {
                                     l1 = a.o(i8.c, l3);
                                     if (l1 - -1) {
                                        l3 = l3 - l1;
                                        w = i8.w;
                                        _monitor_enter(w);
                                        if (i8.v != null) {
                                           b2 = i8.c;
                                           b3 = b2.b;
                                           b2.f();
                                        }else {
                                           b2 = i8.t;
                                           b3 = (!(b2.b))? 1: 0;
                                           b2.A(i8.c);
                                           if (b3) {
                                              w.notifyAll();
                                           }
                                           b3 = 0;
                                        }
                                        _monitor_exit(w);
                                        w = 0;
                                        if ((b3 - w) > 0) {
                                           i8.b(b3);
                                        }
                                     }else {
                                        throw new EOFException();
                                     }
                                  }
                               }else {
                                  goto label_0313 ;
                               }
                            }
                         }
                         owr2.a.skip((long)i);
                      }else {
                         throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                      }
                   }else {
                      throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                   }
                   break;
                 case 1:
                   owr2.J(obj, i1, i4, i5);
                   break;
                 case 2:
                   if (i1 == i6) {
                      if (i5) {
                         wr2 a2 = owr2.a;
                         a2.readInt();
                         a2.readByte();
                      }else {
                         throw new IOException("TYPE_PRIORITY streamId == 0");
                      }
                   }else {
                      throw new IOException(tp2.l("TYPE_PRIORITY length: ", i1, " != 5"));
                   }
                   break;
                 case 3:
                   if (i1 == v) {
                      if (i5) {
                         i1 = owr2.a.readInt();
                         mo1[] omo1Array = mo1.values();
                         i3 = omo1Array.length;
                         i4 = 0;
                         while (true) {
                            if (i4 < i3) {
                               object oobject = omo1Array[i4];
                               i6 = (oobject.a == i1)? 1: 0;
                               if (i6) {
                                  oobject1 = oobject;
                               label_0170 :
                                  if (oobject1 != null) {
                                     obj = obj.b;
                                     obj.getClass();
                                     if (i5 && !((i5 & 0x01))) {
                                        i = 1;
                                     }
                                     if (i) {
                                        qr2 i9 = new qr2(obj.t+c+i5+"] onReset", obj, i5, oobject1, 0);
                                        obj.A.c(i, l);
                                        break ;
                                     }else if((i8 = obj.J(i5)) == null){
                                        i8.k(oobject1);
                                        break ;
                                     }
                                  }else {
                                     throw new IOException(co5.K(Integer.valueOf(i1), "TYPE_RST_STREAM unexpected error code: "));
                                  }
                               }else {
                                  i4 = i4 + 1;
                               }
                            }else {
                               oobject1 = null;
                               goto label_0170 ;
                            }
                         }
                      }else {
                         throw new IOException("TYPE_RST_STREAM streamId == 0");
                      }
                   }else {
                      throw new IOException(tp2.l("TYPE_RST_STREAM length: ", i1, " != 4"));
                   }
                   break;
                 case 4:
                   if (!i5) {
                      if (i3 = i4 & 0x01) {
                         if (i1) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                         }
                      }else if(!(i3 = i1 % 6)){
                         qc6 oqc6 = new qc6();
                         gb3 ogb3 = eb3.F(eb3.J(i, i1), 6);
                         gb3 a3 = ogb3.a;
                         gb3 b4 = ogb3.b;
                         if ((ogb3 = ogb3.c) > null && (a3 <= b4 || (ogb3 < null && b4 <= a3))) {
                            while (true) {
                               int i10 = a3 + ogb3;
                               wr2 a4 = owr2.a;
                               i5 = a4.readShort() & 0xffff;
                               int i11 = a4.readInt();
                               if (i5 != 2) {
                                  if (i5 != 3) {
                                     if (i5 != v) {
                                        if (i5 != i6 || (i11 >= i2 && i11 <= 0xffffff)) {
                                        label_0116 :
                                           oqc6.c(i5, i11);
                                           if (a3 != b4) {
                                              a3 = i10;
                                           }
                                        }else {
                                           throw new IOException(co5.K(Integer.valueOf(i11), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                        }
                                     }else if(i11 >= 0){
                                        i5 = 7;
                                        goto label_0116 ;
                                     }else {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                     }
                                  }else {
                                     i5 = 4;
                                     goto label_0116 ;
                                  }
                               }else if(i11 && i11 != b){
                                  throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                               }else {
                                  goto label_0116 ;
                               }
                            }
                         }
                         nr2 b5 = obj.b;
                         b5.z.c(new mr2(co5.K(" applyAndAckSettings", b5.t), obj, oqc6), l);
                      }else {
                         throw new IOException(co5.K(Integer.valueOf(i1), "TYPE_SETTINGS length % 6 != 0: "));
                      }
                   }else {
                      throw new IOException("TYPE_SETTINGS streamId != 0");
                   }
                   break;
                 case 5:
                   owr2.g0(obj, i1, i4, i5);
                   break;
                 case 6:
                   owr2.T(obj, i1, i4, i5);
                   break;
                 case 7:
                   owr2.x(obj, i1, i5);
                   break;
                 case 8:
                   owr2.h0(obj, i1, i5);
                   break;
                 default:
                   owr2.a.skip((long)i1);
             }
             return true;
          }
       }catch(java.io.EOFException e0){
          return i;
       }
    }
    public final void close(){
       this.a.close();
    }
    public final void f(nr2 p0){
       co5.o(p0, "handler");
       if (this.b != null) {
          if (!this.b(true, p0)) {
             throw new IOException("Required SETTINGS preface not received");
          }
       }else {
          j80 a = fr2.a;
          j80 oj80 = this.a.q((long)a.a.length);
          Logger v = wr2.v;
          if (v.isLoggable(Level.FINE)) {
             Object[] objArray = new Object[0];
             v.fine(we7.i(co5.K(oj80.e(), "<< CONNECTION "), objArray));
          }
          if (!co5.c(a, oj80)) {
             throw new IOException(co5.K(oj80.q(), "Expected a connection header but was "));
          }
       }
       return;
    }
    public final void g0(nr2 p0,int p1,int p2,int p3){
       qr2 b.t+'['+i1+"] onRequest";
       if (!p3) {
          throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
       }
       int i = ((p2 & 0x08))? this.a.readByte() & 0x00ff: 0;
       int i1 = this.a.readInt() & Integer.MAX_VALUE;
       List list = this.y(ir2.D((p1 - 4), p2, i), i, p2, p3);
       p0.getClass();
       nr2 b = p0.b;
       b.getClass();
       _monitor_enter(b);
       if (b.R.contains(Integer.valueOf(i1))) {
          b.i0(i1, mo1.c);
          _monitor_exit(b);
       }else {
          b.R.add(Integer.valueOf(i1));
          _monitor_exit(b);
          b.t+'['+i1+"] onRequest" = new qr2(b.t+'['+i1+"] onRequest", b, i1, list, 2);
          b.A.c(b.t+'['+i1+"] onRequest", 0);
       }
       return;
    }
    public final void h0(nr2 p0,int p1,int p2){
       zr2 ozr2;
       if (p1 != 4) {
          throw new IOException(co5.K(Integer.valueOf(p1), "TYPE_WINDOW_UPDATE length !=4: "));
       }
       long l = (long)this.a.readInt() & 0x7fffffff;
       if (!(p1 = l)) {
          throw new IOException("windowSizeIncrement was 0");
       }
       if (!p2) {
          p0 = p0.b;
          _monitor_enter(p0);
          p0.N = p0.N + l;
          p0.notifyAll();
          _monitor_exit(p0);
       }else if((ozr2 = p0.b.x(p2)) != null){
          _monitor_enter(ozr2);
          ozr2.f = ozr2.f + l;
          if (p1 > 0) {
             ozr2.notifyAll();
          }
          _monitor_exit(ozr2);
       }
       return;
    }
    public final void x(nr2 p0,int p1,int p2){
       object oobject;
       Object[] objArray;
       int i = 8;
       if (p1 < i) {
          throw new IOException(co5.K(Integer.valueOf(p1), "TYPE_GOAWAY length < 8: "));
       }
       if (p2) {
          throw new IOException("TYPE_GOAWAY streamId != 0");
       }
       p2 = this.a.readInt();
       int i1 = this.a.readInt();
       p1 = p1 - i;
       mo1[] omo1Array = mo1.values();
       int len = omo1Array.length;
       int i2 = 0;
       int i3 = 0;
       while (true) {
          if (i3 < len) {
             oobject = omo1Array[i3];
             int i4 = (oobject.a == i1)? 1: 0;
             if (i4) {
             label_002d :
                if (oobject != null) {
                   j80 t = j80.t;
                   if (p1 > 0) {
                      t = this.a.q((long)p1);
                   }
                   p0.getClass();
                   co5.o(t, "debugData");
                   t.d();
                   nr2 b = p0.b;
                   _monitor_enter(b);
                   zr2[] ozr2Array = new zr2[i2];
                   if ((objArray = b.c.values().toArray(ozr2Array)) != null) {
                      b.x = true;
                      _monitor_exit(b);
                      b = objArray.length;
                      while (i2 < b) {
                         object oobject1 = objArray[i2];
                         i2 = i2 + 1;
                         if (oobject1.a > p2 && oobject1.h()) {
                            oobject1.k(mo1.w);
                            p0.b.J(oobject1.a);
                         }else {
                            continue ;
                         }
                      }
                      return;
                   }else {
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                   }
                }else {
                   throw new IOException(co5.K(Integer.valueOf(i1), "TYPE_GOAWAY unexpected error code: "));
                }
             }else {
                i3 = i3 + 1;
             }
          }else {
             oobject = null;
             goto label_002d ;
          }
       }
    }
    public final List y(int p0,int p1,int p2,int p3){
       xl2 g;
       j80 oj80;
       wr2 tc = this.c;
       tc.v = p0;
       tc.b = p0;
       tc.w = p1;
       tc.c = p2;
       tc.t = p3;
       while (true) {
          wr2 tt = this.t;
          g = tt.g;
          if (!g.F()) {
             g = g.readByte() & 0x00ff;
             p2 = 128;
             if (g == p2) {
                throw new IOException("index == 0");
             }
             p3 = g & 0x0080;
             int i = 0;
             if (p3 == p2) {
                g = tt.h(g, 127) - 1;
                p2 = 1;
                if (g >= 0) {
                   p3 = xq2.a.length - p2;
                   if (g <= p3) {
                      i = 1;
                   }
                }
                if (i) {
                   tt.f.add(xq2.a[g]);
                }else {
                   p3 = g - xq2.a.length;
                   i = tt.c + p2;
                   if ((i = i + p3) >= 0) {
                      xl2 h = tt.h;
                      if (i < h.length) {
                         object oobject = h[i];
                         co5.i(oobject);
                         tt.f.add(oobject);
                      }
                   }
                   break ;
                }
             }else {
                p2 = 64;
                if (g == p2) {
                   oj80 = tt.g();
                   xq2.a(oj80);
                   tt.e(new ro2(oj80, tt.g()));
                }else if((p3 = g & 0x40) == p2){
                   g = tt.h(g, 63) - 1;
                   tt.e(new ro2(tt.d(g), tt.g()));
                }else if((p2 = g & 0x20) == 32){
                   g = tt.h(g, 31);
                   tt.b = g;
                   if (g < 0 || g > tt.a) {
                      throw new IOException(co5.K(Integer.valueOf(tt.b), "Invalid dynamic table size update "));
                   }
                   xl2 e = tt.e;
                   if (g < e) {
                      if (!g) {
                         g = tt.h;
                         Arrays.fill(g, i, g.length, null);
                         g = tt.h.length - 1;
                         tt.c = g;
                         tt.d = i;
                         tt.e = i;
                      }else {
                         e = e - g;
                         tt.c(e);
                      }
                   }
                }else if(g != 16 && g){
                   g = tt.h(g, 15) - 1;
                   tt.f.add(new ro2(tt.d(g), tt.g()));
                }else {
                   oj80 = tt.g();
                   xq2.a(oj80);
                   tt.f.add(new ro2(oj80, tt.g()));
                }
             }
          }else {
             tt.f.clear();
             return dj0.B0(tt.f);
          }
       }
       throw new IOException(co5.K(Integer.valueOf((g + p2)), "Header index too large "));
    }
}
