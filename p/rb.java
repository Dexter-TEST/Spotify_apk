package p.rb;
import p.kd7;
import p.i70;
import java.lang.Object;
import p.xt;
import p.wa;
import p.ma;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.ja;
import com.spotify.allboarding.entrypoint.EntryPoint;
import p.ls6;
import p.n46;
import java.util.ArrayList;
import p.h9;
import p.x8;
import java.util.Set;
import p.fa;
import p.u8;
import p.l46;
import p.t4;
import p.y4;
import p.m46;
import java.util.LinkedHashSet;
import p.e46;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import p.he5;
import p.de5;
import p.vk;
import p.f9;
import java.lang.Integer;
import java.util.List;
import p.f46;
import p.ca;
import p.g46;
import p.ba;
import p.h46;
import p.p46;
import p.en6;
import p.z8;
import p.cd2;
import p.ia;
import p.aj0;
import p.ba6;
import p.hb2;
import p.v8;
import p.nr0;
import p.je5;
import p.mi;
import java.lang.Number;
import p.ox1;
import p.y8;
import p.ye7;
import p.dj0;
import p.b9;
import p.iq6;
import p.wc4;
import p.ge5;
import p.xc4;
import p.la;
import p.k46;
import p.j46;
import p.k5;
import p.ea;
import p.ll1;
import java.util.RandomAccess;
import java.util.ListIterator;
import java.util.HashSet;
import java.util.UUID;
import p.tp2;
import java.lang.IllegalArgumentException;
import p.ga;
import p.c9;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import p.da;
import p.z9;
import p.a9;
import p.t8;
import p.g9;
import p.sl6;
import p.ha;
import p.e9;
import p.aa;
import p.ka;

public final class rb implements kd7	// class@0024b8 from classes.dex
{
    public final i70 a;

    public void rb(i70 p0){
       this.a = p0;
       super();
    }
    public final xt e(Object p0,Object p1){
       u8 obj2;
       xt oxt;
       LinkedHashSet linkedHashSe;
       e46 c;
       ls6 ols61;
       Iterator iterator;
       he5 ohe5;
       de5 c1;
       wa t1;
       l46 ol46;
       int i2;
       wa owa;
       ArrayList uArrayList;
       ia a1;
       he5 ohe51;
       he5 ohe52;
       de5 t2;
       Iterator iterator3;
       Iterator obj3;
       ArrayList obj4;
       de5 x;
       je5 oje5;
       String obj5;
       de5 uode51;
       de5 uode52;
       Integer integer1;
       Iterator iterator4;
       int i5;
       String ohe531;
       e46 ohe531;
       e46 uoe46;
       Integer integer2;
       ArrayList uArrayList1;
       int i7;
       int i8;
       he5 ohe55;
       String str2;
       Integer integer3;
       int i9;
       k46 ok461;
       wa owa1;
       ArrayList obj6;
       ll1 a5;
       LinkedHashSet linkedHashSe2;
       Object obj9;
       de5 obj3;
       int i10;
       String obj10;
       ArrayList obj11;
       ArrayList uArrayList4;
       Object obj12;
       he5 ohe56;
       int i11;
       EntryPoint uEntryPoint;
       ls6 ols62;
       ha obj13;
       List list3;
       e46 t3;
       h9[] oh9Array;
       int i12;
       je5 b6;
       ea obj = p0;
       ls6 obj1 = p1;
       co5.o(obj, "p0");
       co5.o(obj1, "p1");
       this.a.getClass();
       if (obj1 instanceof ja) {
          obj2 = obj1;
          oxt = new xt(wa.a(obj, obj2.a, wa.w.b, null, null, null, 28), co5.B(co5.H(new x8(obj2.a))));
       }else {
          obj2 = u8.a;
          int i = 0;
          int b = true;
          if (obj1 instanceof fa) {
             fa a = obj1.a;
             if (a.c instanceof l46) {
                ls6 t = ((t = a.t) != null)? t.b: 0;
                t = (t instanceof t4)? 1: t instanceof y4;
                if (t) {
                   t = 1;
                label_006d :
                   if (t) {
                      oxt = new xt(wa.a(obj, null, a, m46.a, 0, 0, 25), co5.B(co5.H(obj2)));
                   }else {
                      linkedHashSe = new LinkedHashSet();
                      t = a.c;
                      if (t instanceof e46) {
                         ls6 ols6 = t;
                         c = ols6.c;
                         if (!c instanceof Collection || !c.isEmpty()) {
                            iterator = c.iterator();
                            do {
                               if (iterator.hasNext()) {
                                  ohe5 = iterator.next();
                                  if (ohe5 instanceof de5) {
                                  }else {
                                     ohe5 = null;
                                  }
                                  c1 = (ohe5 != null)? ohe5.c: 0;
                               }
                            } while (c1 instanceof vk);
                            if (b) {
                               linkedHashSe.add(f9.a);
                            }
                            c = e46.a(ols6, null, null, null, Integer.valueOf(i), 2047);
                         }
                         b = 0;
                      }else {
                         t1 = obj.t;
                         if (t instanceof f46) {
                            co5.o(t1, "selectedContent");
                            ols61 = new f46(t.a, t1);
                         label_0103 :
                            oxt = new xt(wa.a(obj, null, obj1.a, ols61, null, null, 25), co5.B(linkedHashSe));
                         }else if(t instanceof l46){
                            ol46 = l46.a(t, t1);
                         }
                      }
                      ols61 = c;
                      goto label_0103 ;
                   }
                }
             }
             ol46 = 0;
             goto label_006d ;
          }else if(obj1 instanceof ca){
             oxt = xt.d(wa.a(obj, null, null, g46.a, null, obj1.a, 11));
          }else {
             int i1 = 10;
             wa b1 = obj.b;
             wa c2 = obj.c;
             if (obj1 instanceof ba) {
                if (c2 instanceof g46) {
                   oxt = new xt(wa.a(obj, null, null, h46.a, null, null, 27), co5.B(co5.H(obj.v)));
                }else if(i2 = en6.A(obj1.a.a)){
                   if (i2 == b) {
                      if ((obj1 = b1.v) != null) {
                         oxt = i70.t(obj, obj1, new z8(b1.a, i));
                      }else {
                         oxt = xt.e();
                      }
                   }else {
                      throw new cd2(i1);
                   }
                }else if((obj1 = b1.t) != null){
                   oxt = i70.t(obj, obj1, new z8(b1.a, b));
                }else {
                   oxt = xt.e();
                }
             }else {
                i = -1;
                if (obj1 instanceof ia) {
                   if (c2 instanceof e46) {
                   }else {
                      i5 = 0;
                   }
                   if ((owa = c2) == null) {
                      oxt = xt.e();
                   }else {
                      linkedHashSe = new LinkedHashSet();
                      e46 c3 = owa.c;
                      uArrayList = new ArrayList(aj0.b0(c3));
                      Iterator iterator1 = c3.iterator();
                      while (true) {
                         a1 = obj1.a;
                         if (iterator1.hasNext()) {
                            ohe51 = iterator1.next();
                            if (ohe51 instanceof de5) {
                               ohe52 = ohe51;
                               if (co5.c(ohe52.b(), a1.b()) && a1.c instanceof ba6) {
                                  int i3 = a1.t ^ 0x01;
                                  ohe51 = de5.a(ohe52, i3, false, null, false, 119);
                               }
                            }
                            uArrayList.add(ohe51);
                         }else {
                            break ;
                         }
                      }
                      c1 = a1.c;
                      t2 = a1.t;
                      if (c1 instanceof hb2 && c1.p()) {
                         linkedHashSe.add(new v8(c1, (t2 ^ 0x01)));
                      }
                      Iterator iterator2 = co5.w(c3, mi.p(owa)).iterator();
                      int i4 = 0;
                      while (true) {
                         if (iterator2.hasNext()) {
                            ohe52 = iterator2.next();
                            if (ohe52 instanceof de5) {
                            }else {
                               ohe52 = null;
                            }
                            String str = (ohe52 != null)? ohe52.b(): null;
                            if (co5.c(str, a1.b())) {
                            label_025d :
                               Integer integer = Integer.valueOf(i4);
                               i = (integer.intValue() != i)? 1: 0;
                               if (!i) {
                                  i5 = 0;
                               }
                               iterator3 = uArrayList.iterator();
                               while (true) {
                                  if (iterator3.hasNext()) {
                                     obj3 = iterator3.next();
                                     obj4 = obj3;
                                     obj4 = (obj4 instanceof de5 && co5.c(obj4.b(), a1.b()))? 1: 0;
                                     if (!obj4) {
                                        continue ;
                                     }
                                  }else {
                                     obj3 = null;
                                  }
                                  if (obj3 instanceof de5) {
                                  }else {
                                     obj3 = null;
                                  }
                                  if (obj3 == null) {
                                     oxt = xt.e();
                                     break ;
                                  }else {
                                     v2 = c1 instanceof ox1;
                                     x = obj3.x;
                                     if (iterator3 && t2 == null) {
                                        obj3 = (iterator3 && (a1.v == null && c1.v()))? 1: 0;
                                        if (obj3) {
                                           if (x == null) {
                                              oje5 = ((oje5 = mi.p(owa)) != null)? oje5.b: 0;
                                              obj4 = new ArrayList();
                                              obj3 = c3.iterator();
                                              while (obj3.hasNext()) {
                                                 p0 = integer;
                                                 obj5 = obj3.next();
                                                 obj5 = (obj5 instanceof de5)? obj5.b(): null;
                                                 if (obj5 != null) {
                                                    obj4.add(obj5);
                                                 }
                                                 integer = p0;
                                              }
                                              p0 = integer;
                                              de5 uode5 = c1;
                                              List list = uode5.f();
                                              String str1 = uode5.G();
                                              uode51 = x;
                                              uode52 = t2;
                                              y8 uode53 = new y8(c1, oje5, obj4, list, str1);
                                              linkedHashSe.add(uode5);
                                           }else {
                                           label_032d :
                                              p0 = integer;
                                              uode51 = x;
                                              uode52 = t2;
                                           }
                                        }else {
                                           p0 = integer;
                                           uode51 = x;
                                           uode52 = t2;
                                           if (obj1.b == null) {
                                              integer1 = p0;
                                           label_0335 :
                                              iterator4 = c3.iterator();
                                              i5 = 0;
                                              while (true) {
                                                 if (iterator4.hasNext()) {
                                                    he5 de5 ohe53 = iterator4.next();
                                                    if (ohe53 instanceof de5) {
                                                    }else {
                                                       ohe53 = null;
                                                    }
                                                    ohe53 = (ohe53 != null)? ohe53.a: null;
                                                    if (co5.c(ohe53, a1.a)) {
                                                    label_0361 :
                                                       iterator4 = c3.iterator();
                                                       b = 0;
                                                       while (true) {
                                                          if (iterator4.hasNext()) {
                                                             ohe53 = iterator4.next();
                                                             if (ohe53 instanceof de5) {
                                                             }else {
                                                                ohe53 = null;
                                                             }
                                                             ohe531 = (ohe53 != null)? ohe53.b(): null;
                                                             if (co5.c(ohe531, a1.b())) {
                                                             label_0391 :
                                                                oje5 = mi.p(owa);
                                                                ohe531 = owa.z;
                                                                if (oje5 != null && (oje5 = oje5.b) != null) {
                                                                   obj3 = owa.y.iterator();
                                                                   i1 = 0;
                                                                   while (true) {
                                                                      if (obj3.hasNext()) {
                                                                         if (co5.c(obj3.next().b, oje5)) {
                                                                         label_03bf :
                                                                            de5 w = (!i1)? a1.w: ye7.J(oje5);
                                                                            if (uode52 != null) {
                                                                               ohe531 = dj0.C0(ohe531);
                                                                               iterator4 = w.iterator();
                                                                               while (iterator4.hasNext()) {
                                                                                  integer3 = Integer.valueOf(ohe531.indexOf(iterator4.next()));
                                                                                  obj4 = (integer3.intValue() != -1)? 1: 0;
                                                                                  if (!obj4) {
                                                                                     integer3 = null;
                                                                                  }
                                                                                  if (integer3 != null) {
                                                                                     ohe531.remove(integer3.intValue());
                                                                                  }else {
                                                                                     continue ;
                                                                                  }
                                                                               }
                                                                            }else {
                                                                               uoe46 = dj0.u0(w, ohe531);
                                                                            label_0405 :
                                                                               linkedHashSe.add(new b9(b1.a, a1, (b - i5)));
                                                                               if (uode51 == null && i70.c) {
                                                                                  if (!linkedHashSe.isEmpty()) {
                                                                                     iterator4 = linkedHashSe.iterator();
                                                                                     while (true) {
                                                                                        if (iterator4.hasNext()) {
                                                                                           if (iterator4.next() instanceof y8) {
                                                                                              integer2 = 1;
                                                                                           }else {
                                                                                              continue ;
                                                                                           }
                                                                                        }
                                                                                     }
                                                                                     if (iterator4) {
                                                                                        if (mi.p(owa) != null) {
                                                                                           iterator4 = uArrayList.iterator();
                                                                                           b = 0;
                                                                                           while (true) {
                                                                                              if (iterator4.hasNext()) {
                                                                                                 ohe51 = iterator4.next();
                                                                                                 if (ohe51 instanceof de5) {
                                                                                                 }else {
                                                                                                    ohe51 = null;
                                                                                                 }
                                                                                                 obj5 = (ohe51 != null)? ohe51.b(): null;
                                                                                                 if (co5.c(obj5, a1.b())) {
                                                                                                 label_046c :
                                                                                                    integer2 = Integer.valueOf(b);
                                                                                                    c3 = (integer2.intValue() != -1)? 1: 0;
                                                                                                    if (!c3) {
                                                                                                       integer2 = null;
                                                                                                    }
                                                                                                    if (integer2 != null) {
                                                                                                       integer = integer2;
                                                                                                    label_0485 :
                                                                                                       c3 = (!(v0 = c1 instanceof vk) && !c1 instanceof iq6)? 0: 1;
                                                                                                       if (integer != null && iterator3) {
                                                                                                          uArrayList1 = new ArrayList();
                                                                                                          int ohe5311 = c1.h();
                                                                                                          int i6 = 0;
                                                                                                          while (i6 < ohe5311) {
                                                                                                             de5 b2 = a1.b;
                                                                                                             if (!integer2 && !c1 instanceof wc4) {
                                                                                                                i7 = integer2;
                                                                                                                i8 = ohe5311;
                                                                                                             }else {
                                                                                                                i7 = integer2;
                                                                                                                i8 = ohe5311;
                                                                                                                uArrayList1.add(new ge5(b2, 1, a1.b()));
                                                                                                             }
                                                                                                             if (c1 instanceof iq6 || c1 instanceof xc4) {
                                                                                                                uArrayList1.add(new ge5(b2, 2, a1.b()));
                                                                                                             }
                                                                                                             i6 = i6 + 1;
                                                                                                             ohe5311 = i8;
                                                                                                             i2 = i7;
                                                                                                          }
                                                                                                          i2 = integer.intValue();
                                                                                                          if (c3) {
                                                                                                             i2 = i2 + 1;
                                                                                                          }
                                                                                                          uArrayList = dj0.C0(uArrayList);
                                                                                                          uArrayList.addAll(i2, uArrayList1);
                                                                                                       }
                                                                                                    }
                                                                                                 }else {
                                                                                                    b = b + 1;
                                                                                                 }
                                                                                              }else {
                                                                                                 b = -1;
                                                                                                 goto label_046c ;
                                                                                              }
                                                                                           }
                                                                                        }
                                                                                        integer = p0;
                                                                                        goto label_0485 ;
                                                                                     }
                                                                                  }
                                                                                  iterator4 = 0;
                                                                               }
                                                                               ArrayList uArrayList2 = new ArrayList(aj0.b0(uArrayList));
                                                                               iterator4 = uArrayList.iterator();
                                                                               while (iterator4.hasNext()) {
                                                                                  he5 ohe54 = iterator4.next();
                                                                                  if (!linkedHashSe.isEmpty()) {
                                                                                     iterator3 = linkedHashSe.iterator();
                                                                                     while (true) {
                                                                                        if (iterator3.hasNext()) {
                                                                                           if (iterator3.next() instanceof y8) {
                                                                                              str2 = 1;
                                                                                           }else {
                                                                                              continue ;
                                                                                           }
                                                                                        }
                                                                                     }
                                                                                     if (uArrayList1) {
                                                                                        ohe55 = (ohe54 instanceof de5)? ohe54: null;
                                                                                        str2 = (ohe55 != null)? ohe55.b(): null;
                                                                                        if (co5.c(str2, a1.b())) {
                                                                                           ohe54 = de5.a(ohe54, false, false, null, true, 63);
                                                                                        }
                                                                                     }
                                                                                     uArrayList2.add(ohe54);
                                                                                  }
                                                                                  uArrayList1 = 0;
                                                                               }
                                                                               oxt = new xt(wa.a(obj, null, null, e46.a(owa, uArrayList2, null, uoe46, integer1, 1787), null, null, 27), co5.B(linkedHashSe));
                                                                            }
                                                                         }else {
                                                                            i9 = i1 + 1;
                                                                         }
                                                                      }else {
                                                                         i9 = -1;
                                                                         goto label_03bf ;
                                                                      }
                                                                   }
                                                                }
                                                                uoe46 = ohe531;
                                                                goto label_0405 ;
                                                             }else {
                                                                b = b + 1;
                                                             }
                                                          }else {
                                                             b = -1;
                                                             goto label_0391 ;
                                                          }
                                                       }
                                                    }else {
                                                       i5 = i5 + 1;
                                                    }
                                                 }else {
                                                    i5 = -1;
                                                    goto label_0361 ;
                                                 }
                                              }
                                           }
                                        }
                                     }else {
                                        goto label_032d ;
                                     }
                                     integer1 = null;
                                     goto label_0335 ;
                                  }
                               }
                            }else {
                               i4 = i4 + 1;
                            }
                         }else {
                            i4 = -1;
                            goto label_025d ;
                         }
                      }
                   }
                }else if(obj1 instanceof la){
                   if (c2 instanceof k46) {
                   }else {
                      c2 = null;
                   }
                   if (c2 == null) {
                      oxt = xt.e();
                   }else {
                      j46 b3 = obj1.a.b;
                      k46 c4 = c2.c;
                      uArrayList = new ArrayList(aj0.b0(c4));
                      iterator3 = c4.iterator();
                      while (iterator3.hasNext()) {
                         j46 oj46 = iterator3.next();
                         j46 a2 = oj46.a;
                         co5.o(a2, "title");
                         oj46 = oj46.b;
                         co5.o(oj46, "uri");
                         uArrayList.add(new j46(a2, oj46, co5.c(oj46.b, b3)));
                      }
                      k46 a3 = c2.a;
                      co5.o(a3, "pageTitle");
                      k46 ok46 = new k46(a3, c2.b, uArrayList, c2.t);
                      ok461 = ok46;
                      oxt = xt.d(wa.a(obj, 0, 0, ok461, null, null, 27));
                   }
                }else if(obj1 instanceof ea){
                   if (c2 instanceof e46) {
                   }else {
                      obj13 = 0;
                   }
                   if ((owa1 = c2) == null) {
                      oxt = xt.e();
                   }else {
                      LinkedHashSet linkedHashSe1 = new LinkedHashSet();
                      e46 c5 = owa1.c;
                      iterator = co5.w(c5, mi.p(owa1)).iterator();
                      b = 0;
                      while (true) {
                         ea b4 = obj1.b;
                         if (iterator.hasNext()) {
                            ohe5 = iterator.next();
                            if (ohe5 instanceof de5) {
                            }else {
                               ohe5 = null;
                            }
                            String str3 = (ohe5 != null)? ohe5.b(): null;
                            if (co5.c(str3, b4)) {
                            label_0640 :
                               Integer integer4 = Integer.valueOf(b);
                               ok461 = (integer4.intValue() != -1)? 1: 0;
                               if (!ok461) {
                                  integer4 = null;
                               }
                               Iterator iterator5 = c5.iterator();
                               while (true) {
                                  if (iterator5.hasNext()) {
                                     obj6 = iterator5.next();
                                     String obj7 = obj6;
                                     if (obj7 instanceof de5) {
                                     }else {
                                        obj7 = null;
                                     }
                                     obj7 = (obj7 != null)? obj7.b(): null;
                                     if (!co5.c(obj7, b4)) {
                                        continue ;
                                     }
                                  }else {
                                     obj12 = null;
                                  }
                                  if (obj6 == null) {
                                     oxt = xt.e();
                                     break ;
                                  }else {
                                     String obj8 = obj6;
                                     i1 = c5.indexOf(obj6);
                                     ea d = obj1.d;
                                     List list1 = dj0.y0(c5, (i1 + d));
                                     ea a4 = obj1.a;
                                     ArrayList uArrayList3 = new ArrayList(aj0.b0(a4));
                                     obj3 = a4.iterator();
                                     while (true) {
                                        a5 = ll1.a;
                                        if (obj3.hasNext()) {
                                           nr0 onr0 = obj3.next();
                                           p0 = obj3;
                                           p1 = a5;
                                           t2 = obj8.a;
                                           linkedHashSe2 = linkedHashSe1;
                                           x = obj8.b;
                                           obj9 = obj;
                                           boolean b5 = (onr0 instanceof ba6)? onr0.J(): false;
                                           List list2 = ((obj = obj1.c) != null)? ye7.J(obj): p1;
                                           obj3 = new de5(t2, x, onr0, b5, list2, 80);
                                           uArrayList3.add(obj3);
                                           obj3 = p0;
                                           linkedHashSe1 = linkedHashSe2;
                                           obj = obj9;
                                        }else {
                                           break ;
                                        }
                                     }
                                     obj9 = obj;
                                     linkedHashSe2 = linkedHashSe1;
                                     p1 = a5;
                                     obj6 = ((i10 = (c5.size() - i1) - d) >= 0)? 1: 0;
                                     if (obj6) {
                                        if (!i10) {
                                           a5 = p1;
                                        }else {
                                           i1 = c5.size();
                                           if (i10 >= i1) {
                                              list3 = dj0.B0(c5);
                                           }else if(i10 == 1){
                                              list3 = ye7.J(dj0.r0(c5));
                                           }else {
                                              list3 = new ArrayList(i10);
                                              if (c5 instanceof RandomAccess) {
                                                 for (i10 = i1 - i10; i10 < i1; i10 = i10 + 1) {
                                                    list3.add(c5.get(i10));
                                                 }
                                              }else {
                                                 ListIterator listIterator = c5.listIterator((i1 - i10));
                                                 while (listIterator.hasNext()) {
                                                    list3.add(listIterator.next());
                                                 }
                                              }
                                           }
                                        }
                                        uArrayList1 = dj0.u0(a5, dj0.u0(uArrayList3, list1));
                                        if (i70.c) {
                                           obj8 = obj8.b();
                                           obj6 = new ArrayList();
                                           iterator3 = uArrayList1.iterator();
                                           while (iterator3.hasNext()) {
                                              obj10 = iterator3.next();
                                              obj11 = obj10;
                                              obj11 = (obj11 instanceof ge5 && co5.c(obj11.c, obj8))? 1: 0;
                                              if (!obj11) {
                                                 obj6.add(obj10);
                                              }else {
                                                 continue ;
                                              }
                                           }
                                           uArrayList1 = obj6;
                                        }
                                        if (obj1.e != null) {
                                           uArrayList4 = new ArrayList();
                                           iterator3 = uArrayList1.iterator();
                                           while (iterator3.hasNext()) {
                                              obj10 = iterator3.next();
                                              obj12 = obj10;
                                              if (obj12 instanceof de5) {
                                              }else {
                                                 obj12 = null;
                                              }
                                              str3 = (obj12 != null)? obj12.b(): null;
                                              if (!co5.c(str3, b4)) {
                                                 uArrayList4.add(obj10);
                                              }else {
                                                 continue ;
                                              }
                                           }
                                           uArrayList1 = uArrayList4;
                                        }
                                        uArrayList4 = new ArrayList(aj0.b0(uArrayList1));
                                        iterator3 = uArrayList1.iterator();
                                        while (iterator3.hasNext()) {
                                           ohe56 = iterator3.next();
                                           ohe5 = (ohe56 instanceof de5)? ohe56: null;
                                           str3 = (ohe5 != null)? ohe5.b(): null;
                                           if (co5.c(str3, b4)) {
                                              ohe56 = de5.a(ohe56, false, false, null, false, 63);
                                           }
                                           uArrayList4.add(ohe56);
                                        }
                                        iterator3 = co5.w(uArrayList4, mi.p(owa1)).iterator();
                                        b = 0;
                                        while (true) {
                                           if (iterator3.hasNext()) {
                                              ohe5 = iterator3.next();
                                              if (ohe5 instanceof de5) {
                                              }else {
                                                 ohe5 = null;
                                              }
                                              str3 = (ohe5 != null)? ohe5.b(): null;
                                              if (co5.c(str3, b4)) {
                                              label_0836 :
                                                 Integer integer5 = Integer.valueOf(b);
                                                 ohe56 = (integer5.intValue() != -1)? 1: 0;
                                                 if (!ohe56) {
                                                    integer5 = null;
                                                 }
                                                 if (integer5 != null) {
                                                    i = integer5.intValue();
                                                    if (d == null) {
                                                       i = i - a4.size();
                                                    }
                                                    integer5 = Integer.valueOf(i);
                                                 }else {
                                                    integer5 = null;
                                                 }
                                                 if (integer4 != null) {
                                                    integer4.intValue();
                                                    i11 = (integer5 != null)? integer5.intValue(): integer4.intValue();
                                                    integer4 = Integer.valueOf(i11);
                                                 }else {
                                                    uEntryPoint = 0;
                                                 }
                                                 integer3 = integer4;
                                                 uEntryPoint = null;
                                                 ols62 = null;
                                                 ArrayList uArrayList5 = new ArrayList(aj0.b0(uArrayList4));
                                                 iterator4 = uArrayList4.iterator();
                                                 while (iterator4.hasNext()) {
                                                    ohe5 = iterator4.next();
                                                    if (ohe5 instanceof de5) {
                                                       ohe52 = ohe5;
                                                       if (co5.c(ohe52.b(), b4) && ohe52.c instanceof ba6) {
                                                          c1 = de5.a(ohe52, false, true, null, false, 111);
                                                       }
                                                    }
                                                    uArrayList5.add(c1);
                                                 }
                                                 HashSet hashSet = new HashSet();
                                                 obj11 = new ArrayList();
                                                 iterator5 = uArrayList5.iterator();
                                                 while (iterator5.hasNext()) {
                                                    obj12 = iterator5.next();
                                                    obj13 = obj12;
                                                    if (obj13 instanceof de5) {
                                                    }else {
                                                       obj13 = null;
                                                    }
                                                    if (obj13 == null || (obj5 = obj13.b()) == null) {
                                                       obj5 = UUID.randomUUID().toString();
                                                       co5.l(obj5, "randomUUID\(\).toString\(\)");
                                                    }
                                                    if (hashSet.add(obj5)) {
                                                       obj11.add(obj12);
                                                    }else {
                                                       continue ;
                                                    }
                                                 }
                                                 oxt = new xt(wa.a(obj9, uEntryPoint, ols62, e46.a(owa1, obj11, null, null, integer3, 2043), null, null, 27), co5.B(linkedHashSe2));
                                              }else {
                                                 b = b + 1;
                                              }
                                           }else {
                                              b = -1;
                                              goto label_0836 ;
                                           }
                                        }
                                     }else {
                                        throw new IllegalArgumentException(tp2.l("Requested element count ", i10, " is less than zero.").toString());
                                     }
                                  }
                               }
                            }else {
                               b = b + 1;
                            }
                         }else {
                            b = -1;
                            goto label_0640 ;
                         }
                      }
                   }
                }else {
                   obj9 = obj;
                   if (obj1 instanceof ga) {
                      if (c2 instanceof e46) {
                      }else {
                         c2 = null;
                      }
                      if (c2 != null && (t3 = c2.t) != null) {
                         oxt = xt.a(co5.H(new c9(b1.a, t3)));
                      }else {
                         oxt = xt.e();
                      }
                   }else if(obj1 instanceof da){
                      oxt = i70.r(obj9, obj1);
                   }else {
                      Object obj14 = obj9;
                      obj10 = "";
                      if (obj1 instanceof z9) {
                         if (c2 instanceof g46) {
                            oh9Array = new h9[]{new a9(b1.a),new t8(obj10)};
                            oxt = xt.a(co5.I(oh9Array));
                         }else if(!c2 instanceof e46){
                            oxt = xt.e();
                         }else {
                            obj1 = b1.t;
                            ohe55 = dj0.k0(c2.c);
                            if (ohe55 instanceof de5) {
                            }else {
                               ohe55 = null;
                            }
                            de5 c6 = (ohe55 != null)? ohe55.c: 0;
                            obj12 = ((t1 = obj14.a) != null && t1.getSubmitOnBack() == true)? 1: 0;
                            ls6 a6 = b1.a;
                            if (obj12 && obj1 != null) {
                               oxt = i70.t(obj14, obj1, new a9(a6));
                            }else if(t1 != null){
                               i11 = 1;
                               if (t1.getCanExit() == i11) {
                                  oh9Array = 1;
                               label_09da :
                                  if (oh9Array) {
                                     oh9Array = new h9[]{obj2,new a9(a6)};
                                     oxt = xt.a(co5.I(oh9Array));
                                  }else {
                                     i2 = 2;
                                     if (c6 instanceof vk) {
                                        oh9Array = new h9[i2];
                                        oh9Array[0] = new a9(a6);
                                        oh9Array[1] = new g9(c2.A, a6);
                                        oxt = xt.a(co5.I(oh9Array));
                                     }else {
                                        oxt = xt.e();
                                     }
                                  }
                               }
                            }else {
                               i11 = 1;
                            }
                            oh9Array = 0;
                            goto label_09da ;
                         }
                      }else if(obj1 instanceof ha){
                         if (c2 instanceof e46) {
                         }else {
                            obj13 = 0;
                         }
                         if ((owa = c2) == null) {
                            oxt = xt.e();
                         }else {
                            ohe531 = owa.y;
                            iterator3 = ohe531.iterator();
                            b = 0;
                            while (true) {
                               obj13 = obj1.a;
                               if (iterator3.hasNext()) {
                                  if (co5.c(iterator3.next().b, obj13.b)) {
                                     i12 = b;
                                  label_0a59 :
                                     obj4 = new ArrayList(aj0.b0(ohe531));
                                     iterator4 = ohe531.iterator();
                                     while (iterator4.hasNext()) {
                                        je5 oje51 = iterator4.next();
                                        obj4.add(je5.a(oje51, co5.c(obj13.b, oje51.b)));
                                     }
                                     wa owa2 = wa.a(obj14, 0, 0, e46.a(owa, null, obj4, null, Integer.valueOf(0), 1919), null, null, 27);
                                     ols62 = b1.a;
                                     if ((b6 = ohe531.get(i12).b) != null) {
                                        je5 oje52 = b6;
                                     }
                                     oxt = new xt(owa2, co5.B(co5.H(new e9(ols62, i12, obj10))));
                                  }else {
                                     b = b + 1;
                                  }
                               }else {
                                  i12 = -1;
                                  goto label_0a59 ;
                               }
                            }
                         }
                      }else if(obj1 instanceof aa){
                         oxt = i70.q(obj14);
                      }else if(obj1 instanceof ka){
                         oxt = i70.s(obj14);
                      }else {
                         throw new cd2(i1);
                      }
                   }
                }
             }
          }
       }
       return oxt;
    }
}
