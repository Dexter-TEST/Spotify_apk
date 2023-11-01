package p.o7;
import p.xq5;
import java.lang.Object;
import p.th5;
import java.util.ArrayList;
import p.uf;
import p.n7;
import androidx.recyclerview.widget.RecyclerView;
import p.vr5;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import p.zr5;

public final class o7	// class@0020c8 from classes.dex
{
    public final th5 a;
    public final ArrayList b;
    public final ArrayList c;
    public final xq5 d;
    public final uf e;
    public int f;

    public void o7(xq5 p0){
       super();
       this.a = new th5(30, 1);
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.f = 0;
       this.d = p0;
       this.e = new uf(0, this);
    }
    public final boolean a(int p0){
       n7 a;
       int i2;
       int i4;
       o7 tc = this.c;
       int i = tc.size();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             n7 on7 = tc.get(i1);
             if ((a = on7.a) == 8) {
                i2 = i1 + 1;
                if (this.f(on7.d, i2) == p0) {
                }
             }else if(a == true){
                a = on7.b;
                int i3 = on7.d + a;
                while (true) {
                   if (a < i3) {
                      if ((i4 = i1 + 1) == p0) {
                         return true;
                      }else {
                         i2 = a + 1;
                      }
                   }
                }
                return false;
             }
             i1 = i1 + 1;
          }else {
          }
       }
       return true;
    }
    public final void b(){
       o7 tc = this.c;
       int i = tc.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.d.a(tc.get(i1));
       }
       this.l(tc);
       this.f = 0;
       return;
    }
    public final void c(){
       this.b();
       o7 tb = this.b;
       int i = tb.size();
       int i1 = 0;
       while (i1 < i) {
          n7 on7 = tb.get(i1);
          n7 a = on7.a;
          int b = true;
          o7 td = this.d;
          if (a != b) {
             if (a != 2) {
                if (a != 4) {
                   if (a == 8) {
                      td.a(on7);
                      td.f(on7.b, on7.d);
                   }
                }else {
                   td.a(on7);
                   td.d(on7.b, on7.d, on7.c);
                }
             }else {
                td.a(on7);
                on7 = on7.d;
                xq5 a1 = td.a;
                a1.R(on7.b, b, on7);
                a1.B0 = b;
                RecyclerView y0 = a1.y0;
                b = y0.c + on7;
                y0.c = b;
             }
          }else {
             td.a(on7);
             td.e(on7.b, on7.d);
          }
          i1 = i1 + 1;
       }
       this.l(tb);
       this.f = 0;
       return;
    }
    public final void d(n7 p0){
       n7 a;
       n7 a1;
       int i1;
       n7 a2;
       int i6;
       if ((a = p0.a) == 1 || a == 8) {
          throw new IllegalArgumentException("should not dispatch add or move for pre layout");
       }
       int i = this.m(p0.b, a);
       n7 b = p0.b;
       if ((a1 = p0.a) != 2) {
          if (a1 == 4) {
             i1 = 1;
          }else {
             throw new IllegalArgumentException("op should be remove or update."+p0);
          }
       }else {
          i1 = 0;
       }
       int i2 = 1;
       int i3 = 1;
       while (i2 < p0.d) {
          int i4 = i1 * i2;
          i4 = i4 + p0.b;
          int i5 = this.m(i4, p0.a);
          if ((a2 = p0.a) != 2) {
             if (a2 == 4) {
                i6 = i + 1;
                if (i5 == i6) {
                label_0050 :
                   i6 = 1;
                label_0053 :
                   if (i6) {
                      i3 = i3 + 1;
                   }else {
                      a = this.h(p0.c, a2, i, i3);
                      this.e(a, b);
                      this.k(a);
                      if (p0.a == 4) {
                         b = b + i3;
                      }
                      i = i5;
                      i3 = 1;
                   }
                   i2 = i2 + 1;
                }
             }
          }else if(i5 == i){
             goto label_0050 ;
          }
          i6 = 0;
          goto label_0053 ;
       }
       n7 c = p0.c;
       this.k(p0);
       if (i3 > 0) {
          p0 = this.h(c, p0.a, i, i3);
          this.e(p0, b);
          this.k(p0);
       }
       return;
    }
    public final void e(n7 p0,int p1){
       n7 a;
       o7 td = this.d;
       td.a(p0);
       if ((a = p0.a) != 2) {
          if (a == 4) {
             td.d(p1, p0.d, p0.c);
          }else {
             throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
          }
       }else {
          p0 = p0.d;
          xq5 a1 = td.a;
          a1.R(p1, true, p0);
          a1.B0 = true;
          RecyclerView y0 = a1.y0;
          y0.c = y0.c + p0;
       }
       return;
    }
    public final int f(int p0,int p1){
       n7 a;
       n7 b;
       o7 tc = this.c;
       int i = tc.size();
       while (true) {
          if (p1 >= i) {
             return p0;
          }
          n7 on7 = tc.get(p1);
          if ((a = on7.a) == 8) {
             if ((a = on7.b) == p0) {
                n7 d = on7.d;
             }else if(a < p0){
                p0--;
             }
             if (on7.d <= p0) {
                p0++;
             }
          }else if((b = on7.b) <= p0){
             if (a == 2) {
                on7 = on7.d;
                int i1 = b + on7;
                if (p0 < i1) {
                   break ;
                }else {
                   p0 = p0 - on7;
                }
             }else if(a == 1){
                p0 = p0 + on7.d;
             }
          }
          p1++;
       }
       return -1;
    }
    public final boolean g(){
       boolean b = (this.b.size() > 0)? true: false;
       return b;
    }
    public final n7 h(Object p0,int p1,int p2,int p3){
       n7 on7;
       if ((on7 = this.a.a()) == null) {
          on7 = new n7(p0, p1, p2, p3);
       }else {
          on7.a = p1;
          on7.b = p2;
          on7.d = p3;
          on7.c = p0;
       }
       return on7;
    }
    public final void i(n7 p0){
       this.c.add(p0);
       n7 a = p0.a;
       boolean b = true;
       o7 td = this.d;
       if (a != b) {
          if (a != 2) {
             if (a != 4) {
                if (a == 8) {
                   td.f(p0.b, p0.d);
                }else {
                   throw new IllegalArgumentException("Unknown update op type for "+p0);
                }
             }else {
                td.d(p0.b, p0.d, p0.c);
             }
          }else {
             xq5 a1 = td.a;
             a1.R(p0.b, false, p0.d);
             a1.B0 = b;
          }
       }else {
          td.e(p0.b, p0.d);
       }
       return;
    }
    public final void j(){
       n7 on7;
       n7 on71;
       n7 on72;
       n7 a;
       n7 d;
       n7 on73;
       int i7;
       int i8;
       int i9;
       n7 d1;
       int i10;
       n7 b5;
       int i12;
       int i13;
       o7 oo7 = this;
       o7 b = oo7.b;
       o7 e = oo7.e;
       e.getClass();
       while (true) {
          int i = 1;
          int i1 = b.size() - i;
          int i2 = 0;
          break ;
       }
       while (true) {
          int i3 = 8;
          int i4 = -1;
          if (i1 >= 0) {
             if (b.get(i1).a == i3) {
                if (i2) {
                label_0027 :
                   on7 = null;
                   int i5 = 4;
                   int i6 = 2;
                   if (i1 != i4) {
                      i3 = i1 + 1;
                      on71 = b.get(i1);
                      on72 = b.get(i3);
                      if ((a = on72.a) != i) {
                         uf b1 = e.b;
                         if (a != i6) {
                            if (a != i5) {
                               continue ;
                            }else {
                               d = on71.d;
                               n7 b2 = on72.b;
                               if (d < b2) {
                                  i6 = b2 - 1;
                                  on72.b = i6;
                               }else {
                                  a = on72.d;
                                  i6 = b2 + a;
                                  if (d < i6) {
                                     i8 = a - 1;
                                     on72.d = i8;
                                     on73 = b1.h(on72.c, i5, on71.b, i);
                                  label_0066 :
                                     d = on71.b;
                                     b2 = on72.b;
                                     if (d <= b2) {
                                        i6 = b2 + 1;
                                        on72.b = i6;
                                     }else {
                                        i6 = b2 + on72.d;
                                        if (d < i6) {
                                           i6 = i6 - d;
                                           i7 = d + 1;
                                           on7 = b1.h(on72.c, i5, i7, i6);
                                           i7 = on72.d - i6;
                                           on72.d = i7;
                                        }
                                     }
                                     b.set(i3, on71);
                                     if (on72.d > null) {
                                        b.set(i1, on72);
                                     }else {
                                        b.remove(i1);
                                        b1.k(on72);
                                     }
                                     if (on73 != null) {
                                        b.add(i1, on73);
                                     }
                                     if (on7 != null) {
                                        b.add(i1, on7);
                                     }else {
                                        continue ;
                                     }
                                  }
                               }
                               on73 = on7;
                               goto label_0066 ;
                            }
                         }else {
                            n7 b3 = on71.b;
                            a = on71.d;
                            if (b3 < a) {
                               if (on72.b == b3) {
                                  i5 = a - b3;
                                  if (on72.d == i5) {
                                     i7 = 0;
                                  label_00c7 :
                                     i5 = i7;
                                     i7 = 1;
                                  }
                               }
                               i7 = 0;
                               b3 = 0;
                            }else {
                               i10 = a + 1;
                               if (on72.b == i10) {
                                  i5 = b3 - a;
                                  if (on72.d == i5) {
                                     i7 = 1;
                                     goto label_00c7 ;
                                  }
                               }
                               i7 = 0;
                               b3 = 1;
                            }
                            n7 b4 = on72.b;
                            if (a < b4) {
                               i9 = b4 - 1;
                               on72.b = i9;
                            }else {
                               d1 = on72.d;
                               i9 = b4 + d1;
                               if (a < i9) {
                                  i10 = d1 - 1;
                                  on72.d = i10;
                                  on71.a = i6;
                                  on71.d = i;
                                  if (on72.d == null) {
                                     b.remove(i3);
                                     b1.k(on72);
                                     continue ;
                                  }else {
                                     continue ;
                                  }
                               }
                            }
                            on73 = on71.b;
                            a = on72.b;
                            if (on73 <= a) {
                               i8 = a + 1;
                               on72.b = i8;
                            }else {
                               i8 = a + on72.d;
                               if (on73 < i8) {
                                  i8 = i8 - on73;
                                  i = on73 + 1;
                                  on7 = b1.h(on7, i6, i, i8);
                                  i = on71.b - on72.b;
                                  on72.d = i;
                               }
                            }
                            if (i7) {
                               b.set(i1, on72);
                               b.remove(i3);
                               b1.k(on71);
                               continue ;
                            }else if(i5){
                               if (on7 != null) {
                                  if ((on73 = on71.b) > on7.b) {
                                     i = on73 - on7.d;
                                     on71.b = i;
                                  }
                                  if ((on73 = on71.d) > on7.b) {
                                     i = on73 - on7.d;
                                     on71.d = i;
                                  }
                               }
                               if ((on73 = on71.b) > on72.b) {
                                  i = on73 - on72.d;
                                  on71.b = i;
                               }
                               if ((on73 = on71.d) > on72.b) {
                                  i = on73 - on72.d;
                                  on71.d = i;
                               }
                            }else if(on7 != null){
                               if ((on73 = on71.b) >= on7.b) {
                                  i = on73 - on7.d;
                                  on71.b = i;
                               }
                               if ((on73 = on71.d) >= on7.b) {
                                  i = on73 - on7.d;
                                  on71.d = i;
                               }
                            }
                            if ((on73 = on71.b) >= on72.b) {
                               i = on73 - on72.d;
                               on71.b = i;
                            }
                            if ((on73 = on71.d) >= on72.b) {
                               i = on73 - on72.d;
                               on71.d = i;
                            }
                            b.set(i1, on72);
                            if (on71.b != on71.d) {
                               b.set(i3, on71);
                            }else {
                               b.remove(i3);
                            }
                            if (on7 != null) {
                               b.add(i1, on7);
                               continue ;
                            }else {
                               continue ;
                            }
                         }
                      }else {
                         on73 = on71.d;
                         on7 = on72.b;
                         i7 = (on73 < on7)? -1: 0;
                         if ((b5 = on71.b) < on7) {
                            i7 = i7 + 1;
                         }
                         if (on7 <= b5) {
                            i4 = b5 + on72.d;
                            on71.b = i4;
                         }
                         if ((on7 = on72.b) <= on73) {
                            i = on73 + on72.d;
                            on71.d = i;
                         }
                         i2 = on7 + i7;
                         on72.b = i2;
                         b.set(i1, on72);
                         b.set(i3, on71);
                         continue ;
                      }
                   }else {
                      int i11 = b.size();
                      i1 = 0;
                      while (i1 < i11) {
                         on71 = b.get(i1);
                         if ((on72 = on71.a) != i) {
                            o7 d2 = oo7.d;
                            if (on72 != i6) {
                               if (on72 != i5) {
                                  if (on72 == i3) {
                                     oo7.i(on71);
                                  }
                               }else {
                                  on72 = on71.b;
                                  i9 = on71.d + on72;
                                  d1 = on72;
                                  i7 = 0;
                                  i3 = -1;
                                  for (; on72 < i9; i12 = on72 + 1) {
                                     if (d2.b(on72) == null && !oo7.a(on72)) {
                                        if (i3 == i) {
                                           oo7.i(oo7.h(on71.c, i5, d1, i7));
                                           d1 = on72;
                                           i7 = 0;
                                        }
                                        i3 = 0;
                                     }else if(!i3){
                                        oo7.d(oo7.h(on71.c, i5, d1, i7));
                                        d1 = on72;
                                        i7 = 0;
                                     }
                                     i3 = 1;
                                     i7 = i7 + i;
                                  }
                                  if (i7 != on71.d) {
                                     oo7.k(on71);
                                     on71 = oo7.h(on71.c, i5, d1, i7);
                                  }
                                  if (!i3) {
                                     oo7.d(on71);
                                  }else {
                                     oo7.i(on71);
                                  }
                               }
                            }else {
                               d = on71.b;
                               i3 = on71.d + d;
                               on72 = d;
                               i9 = 0;
                               i10 = -1;
                               while (on72 < i3) {
                                  if (d2.b(on72) == null && !oo7.a(on72)) {
                                     if (i10 == i) {
                                        oo7.i(oo7.h(on7, i6, d, i9));
                                        i10 = 1;
                                     }else {
                                        i10 = 0;
                                     }
                                     i13 = 0;
                                  }else if(!i10){
                                     oo7.d(oo7.h(on7, i6, d, i9));
                                     i10 = 1;
                                  }else {
                                     i10 = 0;
                                  }
                                  i13 = 1;
                                  if (i10) {
                                     i12 = on72 - i9;
                                     i3 = i3 - i9;
                                     i9 = 1;
                                  }else {
                                     i9 = i9 + 1;
                                  }
                                  i12 = i12 + i;
                                  i10 = i13;
                               }
                               if (i9 != on71.d) {
                                  oo7.k(on71);
                                  on71 = oo7.h(on7, i6, d, i9);
                               }
                               if (!i10) {
                                  oo7.d(on71);
                               }else {
                                  oo7.i(on71);
                               }
                            }
                         }else {
                            oo7.i(on71);
                         }
                         i1 = i1 + 1;
                         i3 = 8;
                      }
                      b.clear();
                      return;
                   }
                }
             }else {
                on7 = 1;
             }
             i1 = i1 - 1;
          }else {
             i1 = -1;
             goto label_0027 ;
          }
       }
    }
    public final void k(n7 p0){
       p0.c = null;
       this.a.b(p0);
    }
    public final void l(ArrayList p0){
       int i = p0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.k(p0.get(i1));
       }
       p0.clear();
       return;
    }
    public final int m(int p0,int p1){
       int i2;
       n7 a;
       n7 b;
       n7 on71;
       n7 on72;
       int i3;
       n7 d;
       o7 tc = this.c;
       int i = 1;
       int i1 = tc.size() - i;
       while (true) {
          i2 = 8;
          if (i1 >= 0) {
             n7 on7 = tc.get(i1);
             if ((a = on7.a) == i2) {
                b = on7.b;
                a = on7.d;
                if (b < a) {
                   on71 = b;
                   on72 = a;
                }else {
                   on72 = b;
                   on71 = a;
                }
                if (p0 >= on71 && p0 <= on72) {
                   if (on71 == b) {
                      if (p1 == i) {
                         i3 = a + 1;
                         on7.d = i3;
                      }else if(p1 == 2){
                         i3 = a - 1;
                         on7.d = i3;
                      }
                      p0++;
                   }else if(p1 == i){
                      i2 = b + 1;
                      on7.b = i2;
                   }else if(p1 == 2){
                      i2 = b - 1;
                      on7.b = i2;
                   }
                   p0--;
                }else if(p0 < b){
                   if (p1 == i) {
                      i2 = b + 1;
                      on7.b = i2;
                      i3 = a + 1;
                      on7.d = i3;
                   }else if(p1 == 2){
                      i2 = b - 1;
                      on7.b = i2;
                      i3 = a - 1;
                      on7.d = i3;
                   }
                }
             }else if((b = on7.b) <= p0){
                if (a == i) {
                   p0 = p0 - on7.d;
                }else if(a == 2){
                   p0 = p0 + on7.d;
                }
             }else if(p1 == i){
                i2 = b + 1;
                on7.b = i2;
             }else if(p1 == 2){
                i2 = b - 1;
                on7.b = i2;
             }
             i1 = i1 - 1;
          }else {
             break ;
          }
       }
       p1 = tc.size() - i;
       while (p1 >= 0) {
          n7 on73 = tc.get(p1);
          if (on73.a == i2) {
             if ((d = on73.d) == on73.b || d < null) {
                tc.remove(p1);
                this.k(on73);
             }
          }else if(on73.d <= null){
             tc.remove(p1);
             this.k(on73);
          }
          p1--;
       }
       return p0;
    }
}
