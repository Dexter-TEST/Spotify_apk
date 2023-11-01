package p.it3;
import java.util.List;
import java.util.UUID;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.ib3;
import p.lo5;
import p.ko5;
import p.ej4;
import p.le0;
import java.util.Collection;
import java.lang.Iterable;
import java.util.ArrayList;
import p.dj0;
import java.util.AbstractCollection;
import p.cj0;
import java.lang.Character;
import java.util.NoSuchElementException;
import p.zf2;
import java.lang.CharSequence;
import p.av6;
import p.vv7;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;

public final class it3	// class@0019fe from classes.dex
{
    public final Set a;
    public final String b;
    public final String c;

    public void it3(List p0){
       ArrayList uArrayList;
       String str2;
       HashSet hashSet;
       int i3;
       String str = UUID.randomUUID().toString();
       co5.l(str, "randomUUID\(\).toString\(\)");
       ib3 oib3 = new ib3(43, 128);
       ko5 a = lo5.a;
       String str1 = "random";
       try{
          co5.o(a, str1);
          int i = ej4.g0(a, oib3);
          le0 ole0 = new le0('a', 'z');
          le0 ole01 = new le0('A', 'Z');
          if (ole0 instanceof Collection) {
             uArrayList = dj0.u0(ole01, ole0);
          }else {
             ArrayList uArrayList2 = new ArrayList();
             cj0.c0(ole0, uArrayList2);
             cj0.c0(ole01, uArrayList2);
             uArrayList = uArrayList2;
          }
          uArrayList = dj0.v0(Character.valueOf('~'), dj0.v0(Character.valueOf('_'), dj0.v0(Character.valueOf('.'), dj0.v0(Character.valueOf('-'), dj0.u0(new le0('0', '9'), uArrayList)))));
          ArrayList uArrayList1 = new ArrayList(i);
          int i1 = 0;
          int i2 = 0;
          while (true) {
             if (i2 < i) {
                ko5 a1 = lo5.a;
                co5.o(a1, str1);
                if (!uArrayList.isEmpty()) {
                   uArrayList1.add(Character.valueOf(uArrayList.get(a1.c(uArrayList.size())).charValue()));
                   i2 = i2 + 1;
                }else {
                   throw new NoSuchElementException("Collection is empty.");
                }
             }else {
                str2 = dj0.q0(uArrayList1, "", null, null, null, 62);
                super();
                uArrayList = (!str.length())? 1: 0;
                if (uArrayList) {
                   uArrayList = 0;
                }else if(av6.m0(str, ' ', i1, i1, 6) >= 0){
                   i3 = 1;
                }else {
                   i3 = 0;
                }
                i3 = i3 ^ 1;
                if (uArrayList && vv7.y(str2)) {
                   i1 = 1;
                }
                if (i1) {
                   hashSet = (p0 != null)? new HashSet(p0): new HashSet();
                   break ;
                }else {
                   throw new IllegalArgumentException("Failed requirement.".toString());
                }
             }
          }
          hashSet.add("openid");
          Set set = Collections.unmodifiableSet(hashSet);
          co5.l(set, "unmodifiableSet\(permissions\)");
          this.a = set;
          this.b = str;
          this.c = str2;
          return;
       }catch(java.lang.IllegalArgumentException e12){
          throw new NoSuchElementException(e12.getMessage());
       }
    }
}
