package p.gg4;
import java.util.LinkedHashMap;
import p.dh4;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.eh4;
import java.lang.Class;
import p.ir2;
import java.util.ArrayList;
import p.jo6;
import p.eg4;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.mf4;
import java.util.AbstractMap;
import java.lang.Iterable;
import java.util.Collection;
import p.cg4;
import java.util.AbstractCollection;
import p.cj0;
import p.dj0;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import android.os.Bundle;
import p.vg4;
import android.os.BaseBundle;
import p.en6;
import p.lf4;
import java.lang.Integer;
import p.q14;
import p.ko6;
import p.ry7;
import p.la6;
import p.pa6;
import p.di7;
import p.ko1;
import p.fg4;
import android.net.Uri;
import p.ay6;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import p.av6;
import p.ts5;
import java.util.List;
import p.ll1;
import java.util.ListIterator;
import p.ng4;
import p.tp2;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import p.io2;
import android.content.res.TypedArray;
import p.eo5;

public abstract class gg4	// class@001702 from classes.dex
{
    public final String a;
    public ig4 b;
    public String c;
    public CharSequence t;
    public final ArrayList v;
    public final jo6 w;
    public final LinkedHashMap x;
    public int y;
    public String z;
    public static final int A;

    static {
       LinkedHashMap linkedHashMa = new LinkedHashMap();
    }
    public void gg4(dh4 p0){
       co5.o(p0, "navigator");
       super();
       this.a = ir2.z(p0.getClass());
       this.v = new ArrayList();
       this.w = new jo6();
       this.x = new LinkedHashMap();
    }
    public final void a(eg4 p0){
       int i;
       int i1;
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = this.d().entrySet().iterator();
       while (true) {
          i = 1;
          if (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             mf4 value = uEntry.getValue();
             if (value.b != null || value.c != null) {
                i = 0;
             }
             if (i) {
                linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
             }
          }else {
             break ;
          }
       }
       ArrayList uArrayList = new ArrayList();
       iterator = linkedHashMa.keySet().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = obj;
          eg4 d = p0.d;
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator1 = p0.e.values().iterator();
          while (iterator1.hasNext()) {
             cj0.c0(iterator1.next().b, uArrayList1);
          }
          if (i1 = dj0.u0(uArrayList1, d).contains(obj1) ^ i) {
             uArrayList.add(obj);
          }
       }
       if (!uArrayList.isEmpty()) {
          throw new IllegalArgumentException("Deep link "+p0.a+" can\'t be used to open destination "+this+".\nFollowing required arguments are missing: "+uArrayList.toString());
       }
       this.v.add(p0);
       return;
    }
    public final Bundle b(Bundle p0){
       int i;
       Bundle uBundle;
       mf4 value;
       gg4 tx = this.x;
       if (p0 == null) {
          uBundle = (tx != null && !tx.isEmpty())? 0: 1;
          if (i) {
             return null;
          }
       }
       uBundle = new Bundle();
       Iterator iterator = tx.entrySet().iterator();
       while (true) {
          String str = "name";
          if (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             value = uEntry.getValue();
             value.getClass();
             co5.o(key, str);
             if (value.c != null) {
                value.a.d(uBundle, key, value.d);
             }
          }else if(p0 != null){
             uBundle.putAll(p0);
             Iterator iterator1 = tx.entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry1 = iterator1.next();
                String key1 = uEntry1.getKey();
                mf4 value1 = uEntry1.getValue();
                value1.getClass();
                co5.o(key1, str);
                value1 = value1.a;
                if (value1.b == null && (uBundle.containsKey(key1) && uBundle.get(key1) == null)) {
                   value = 0;
                }else {
                   try{
                      value1.a(uBundle, key1);
                      value = 1;
                   }catch(java.lang.ClassCastException e0){
                   }
                }
                if (value) {
                }else {
                   throw new IllegalArgumentException(en6.t("Wrong argument type for \'", key1, "\' in argument bundle. ")+value1.b()+" expected.".toString());
                }
             }
          }
          return uBundle;
       }
    }
    public final lf4 c(int p0){
       gg4 tw = this.w;
       int i = (!tw.g())? 1: 0;
       lf4 olf4 = null;
       int i1 = (i)? olf4: tw.e(p0, olf4);
       if (i1 == null) {
          if ((tw = this.b) != null) {
             olf4 = tw.c(p0);
          }
       }else {
          olf4 = i1;
       }
       return olf4;
    }
    public final Map d(){
       return q14.r0(this.x);
    }
    public boolean equals(Object p0){
       int i;
       Map$Entry uEntry;
       boolean b = false;
       if (p0 != null && p0 instanceof gg4) {
          gg4 tv = this.v;
          gg4 v = p0.v;
          co5.o(tv, "<this>");
          co5.o(v, "other");
          Set set = dj0.E0(tv);
          set.retainAll(v);
          tv = ((i = set.size()) == tv.size())? 1: 0;
          v = this.w;
          gg4 w = p0.w;
          if (v.g() == w.g()) {
             Iterator iterator = pa6.F(ry7.V(v)).iterator();
             while (true) {
                if (iterator.hasNext()) {
                   lf4 olf4 = iterator.next();
                   if (w.a != null) {
                      w.d();
                   }
                   int i1 = 0;
                   while (true) {
                      if (i1 < w.t) {
                         if (w.c[i1] == olf4) {
                         label_006c :
                            olf4 = (i1 >= 0)? 1: 0;
                            if (!olf4) {
                               iterator = 0;
                            }else {
                               continue ;
                            }
                         }else {
                            i1 = i1 + 1;
                         }
                      }else {
                         i1 = -1;
                         goto label_006c ;
                      }
                   }
                }else {
                   iterator = 1;
                }
                if (iterator) {
                   iterator = pa6.F(ry7.V(w)).iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         lf4 olf41 = iterator.next();
                         if (v.a != null) {
                            v.d();
                         }
                         int i2 = 0;
                         while (true) {
                            if (i2 < v.t) {
                               if (v.c[i2] == olf41) {
                               label_00a7 :
                                  olf41 = (i2 >= 0)? 1: 0;
                                  if (!olf41) {
                                     i = 0;
                                  }else {
                                     continue ;
                                  }
                               }else {
                                  i2 = i2 + 1;
                               }
                            }else {
                               i2 = -1;
                               goto label_00a7 ;
                            }
                         }
                      }else {
                         i = 1;
                      }
                      if (i) {
                         i = 1;
                      label_00b6 :
                         if (this.d().size() == p0.d().size()) {
                            iterator = dj0.e0(this.d().entrySet()).iterator();
                            while (true) {
                               if (iterator.hasNext()) {
                                  uEntry = iterator.next();
                                  uEntry = (p0.d().containsKey(uEntry.getKey()) && co5.c(p0.d().get(uEntry.getKey()), uEntry.getValue()))? 1: 0;
                                  if (!uEntry) {
                                     iterator = 0;
                                  }else {
                                     continue ;
                                  }
                               }else {
                                  iterator = 1;
                               }
                               if (iterator) {
                                  iterator = dj0.e0(p0.d().entrySet()).iterator();
                                  while (true) {
                                     if (iterator.hasNext()) {
                                        uEntry = iterator.next();
                                        uEntry = (this.d().containsKey(uEntry.getKey()) && co5.c(this.d().get(uEntry.getKey()), uEntry.getValue()))? 1: 0;
                                        if (!uEntry) {
                                           iterator = 0;
                                        }else {
                                           continue ;
                                        }
                                     }else {
                                        iterator = 1;
                                     }
                                     if (iterator) {
                                        iterator = 1;
                                     label_015f :
                                        if (this.y == p0.y && (co5.c(this.z, p0.z) && (tv && (i && iterator)))) {
                                           b = true;
                                           break ;
                                        }
                                     }
                                  }
                               }
                            }
                         }
                         iterator = 0;
                         goto label_015f ;
                      }
                   }
                }
             }
          }
          i = 0;
          goto label_00b6 ;
       }
       return b;
    }
    public fg4 g(ko1 p0){
       ko1 b;
       Pattern value;
       fg4 uofg42;
       fg4 uofg43;
       eg4 c;
       Pattern value1;
       int i1;
       fg4 value1;
       int i2;
       String str2;
       int i4;
       eg4 obj;
       int i7;
       int i8;
       int i9;
       int i10;
       Iterator obj1;
       ko1 oko11;
       eg4 uoeg41;
       Matcher matcher1;
       int i11;
       ko1 oko1 = p0;
       gg4 v = this.v;
       fg4 uofg4 = null;
       if (v.isEmpty()) {
          return uofg4;
       }
       Iterator iterator = v.iterator();
       fg4 uofg41 = uofg4;
       while (iterator.hasNext()) {
          eg4 uoeg4 = iterator.next();
          if ((b = oko1.b) != null) {
             Map map = this.d();
             uoeg4.getClass();
             Matcher matcher = ((value = uoeg4.g.getValue()) != null)? value.matcher(b.toString()): uofg4;
             if (matcher == null || !matcher.matches()) {
                uofg42 = uofg4;
             }else {
                uofg42 = new Bundle();
                eg4 d = uoeg4.d;
                i2 = d.size();
                int i6 = 0;
                while (i6 < i2) {
                   String str3 = d.get(i6);
                   i6 = i6 + 1;
                   String str4 = Uri.decode(matcher.group(i6));
                   obj = map.get(str3);
                   try{
                      co5.l(str4, "value");
                      eg4.b(uofg42, str3, str4, obj);
                      str4 = 0;
                   }catch(java.lang.IllegalArgumentException e0){
                   }
                }
                if (uoeg4.h != null) {
                   obj = uoeg4.e;
                   Iterator iterator1 = obj.keySet().iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         str2 = iterator1.next();
                         cg4 uocg4 = obj.get(str2);
                         str2 = b.getQueryParameter(str2);
                         if (uoeg4.i != null) {
                            String Bundle str5 = b.toString();
                            co5.l(str5, "deepLink.toString\(\)");
                            String str6 = av6.F0(str5, '?');
                            if (!co5.c(str6, str5)) {
                               str2 = str6;
                            }
                         }
                         if (str2 != null) {
                            co5.i(uocg4);
                            matcher = Pattern.compile(uocg4.a, 32).matcher(str2);
                            if (matcher.matches()) {
                            }
                         }else {
                            matcher = null;
                         }
                      }
                   }
                }
                Iterator obj2 = map.entrySet().iterator();
                while (obj2.hasNext()) {
                   Map$Entry obj3 = obj2.next();
                   String key = obj3.getKey();
                   mf4 value2 = ((value2 = obj3.getValue()) != null && (value2.b == null && value2.c == null))? 1: 0;
                   if (!value2 || uofg42.containsKey(key)) {
                   }
                   i4 = 0;
                   break ;
                }
             }
             uofg43 = uofg42;
          }else {
             uofg43 = null;
          }
          boolean b1 = ((b = oko1.c) != null && co5.c(b, uoeg4.b))? true: false;
          b = oko1.t;
          int i = -1;
          if (b != null) {
             uoeg4.getClass();
             if ((c = uoeg4.c) != null) {
                value1 = uoeg4.k.getValue();
                co5.i(value1);
                if (!value1.matcher(b).matches()) {
                label_0274 :
                   b = -1;
                }else {
                   String str = "/";
                   List list = new ts5(str).a(c);
                   ll1 a = ll1.a;
                   if (!list.isEmpty()) {
                      ListIterator listIterator = list.listIterator(list.size());
                      while (true) {
                         if (listIterator.hasPrevious()) {
                            i2 = (!listIterator.previous().length())? 1: 0;
                            if (!i2) {
                               i2 = 1;
                               int i3 = listIterator.nextIndex() + i2;
                               list = dj0.y0(list, i3);
                            label_0210 :
                               String str1 = list.get(0);
                               str2 = list.get(i2);
                               List list1 = new ts5(str).a(b);
                               if (!list1.isEmpty()) {
                                  listIterator = list1.listIterator(list1.size());
                                  while (true) {
                                     if (listIterator.hasPrevious()) {
                                        i2 = (!listIterator.previous().length())? 1: 0;
                                        if (!i2) {
                                           i4 = 1;
                                           i3 = listIterator.nextIndex() + i4;
                                           a = dj0.y0(list1, i3);
                                        label_0257 :
                                           int i5 = 0;
                                           str = a.get(i4);
                                           if (co5.c(str1, a.get(i5))) {
                                              i5 = 2;
                                           }
                                           if (co5.c(str2, str)) {
                                              i5 = i5 + 1;
                                           }
                                        }else {
                                           continue ;
                                        }
                                     }
                                  }
                               }
                               i4 = 1;
                               goto label_0257 ;
                            }
                         }
                      }
                   }
                   i2 = 1;
                   ll1 oll1 = a;
                   goto label_0210 ;
                }
             }else {
                goto label_0274 ;
             }
             i1 = b;
          }else {
             i1 = -1;
          }
          if (uofg43 != null || (b1 || i1 > i)) {
             value1 = new fg4(this, uofg43, uoeg4.l, b1, i1);
             if (uofg41 == null || value1.a(uofg41) > 0) {
                uofg41 = value1;
             }
          }
          value1 = 0;
       }
       return uofg41;
    }
    public int hashCode(){
       gg4 tz;
       eg4 a;
       int i2;
       int i3;
       lf4 b;
       Set set;
       Object obj;
       Object obj1;
       int i = this.y * 31;
       int i1 = ((tz = this.z) != null)? tz.hashCode(): 0;
       i = i + i1;
       Iterator iterator = this.v.iterator();
       while (iterator.hasNext()) {
          eg4 uoeg4 = iterator.next();
          i = i * 31;
          i2 = ((a = uoeg4.a) != null)? a.hashCode(): 0;
          i = i + i2;
          i = i * 31;
          i2 = ((a = uoeg4.b) != null)? a.hashCode(): 0;
          i = i + i2;
          i = i * 31;
          i3 = ((uoeg4 = uoeg4.c) != null)? uoeg4.hashCode(): 0;
          i = i + i3;
       }
       ko6 oko6 = ry7.V(this.w);
       while (oko6.hasNext()) {
          lf4 olf4 = oko6.next();
          i = i * 31;
          i = i + olf4.a;
          i = i * 31;
          i2 = ((b = olf4.b) != null)? b.hashCode(): 0;
          i = i + i2;
          if ((b = olf4.c) != null && (set = b.keySet()) != null) {
             Iterator iterator1 = set.iterator();
             while (iterator1.hasNext()) {
                i = i * 31;
                lf4 c = olf4.c;
                co5.i(c);
                int i4 = ((obj = c.get(iterator1.next())) != null)? obj.hashCode(): 0;
                i = i + i4;
             }
          }
       }
       iterator = this.d().keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          i = i * 31;
          i = tp2.g(str, i, 31);
          i3 = ((obj1 = this.d().get(str)) != null)? obj1.hashCode(): 0;
          i = i + i3;
       }
       return i;
    }
    public void k(Context p0,AttributeSet p1){
       String str;
       String str1;
       gg4 tz;
       co5.o(p0, "context");
       TypedArray typedArray = p0.getResources().obtainAttributes(p1, io2.D);
       co5.l(typedArray, "context.resources.obtain…s, R.styleable.Navigator\)");
       if ((str = typedArray.getString(2)) == null) {
          this.y = 0;
          this.c = null;
       }else if((av6.p0(str) ^ 1)){
          String str3 = "android-app://androidx.navigation/".concat(str);
          this.y = str3.hashCode();
          this.c = null;
          this.a(new eg4(str3, null, null));
       }else {
          throw new IllegalArgumentException("Cannot have an empty route".toString());
       }
       gg4 tv = this.v;
       Iterator iterator = tv.iterator();
       while (true) {
          if (iterator.hasNext()) {
             str1 = iterator.next();
             eg4 a = str1.a;
             String str2 = ((tz = this.z) != null)? "android-app://androidx.navigation/".concat(tz): "";
             if (!co5.c(a, str2)) {
                continue ;
             }
          }else {
             str1 = null;
          }
          eo5.d(tv);
          tv.remove(str1);
          this.z = str;
          if (typedArray.hasValue(1)) {
             int resourceId = typedArray.getResourceId(1, 0);
             this.y = resourceId;
             this.c = null;
             this.c = ir2.x(p0, resourceId);
             break ;
          }
          break ;
       }
       this.t = typedArray.getText(0);
       typedArray.recycle();
       return;
    }
    public String toString(){
       gg4 tc;
       StringBuilder str = this.getClass().getSimpleName()+"\(";
       str = ((tc = this.c) == null)? str+"0x"+Integer.toHexString(this.y): str+tc;
       str = str+"\)";
       tc = ((tc = this.z) != null && !av6.p0(tc))? 0: 1;
       if (!tc) {
          str = str+" route="+this.z;
       }
       if (this.t != null) {
          str = str+" label="+this.t;
       }
       str = str;
       co5.l(str, "sb.toString\(\)");
       return str;
    }
}
