package p.iw5;
import p.c42;
import p.i70;
import p.m95;
import java.lang.String;
import p.ir2;
import java.lang.ClassLoader;
import p.wc;
import java.lang.Object;
import p.ay6;
import p.wf2;
import java.lang.Class;
import p.co5;
import p.at7;
import p.j80;
import java.util.ArrayList;
import java.lang.Math;
import java.util.List;
import p.e70;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import p.el6;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Iterator;
import p.t65;
import java.lang.Iterable;
import p.aj0;
import p.av6;
import java.util.AbstractCollection;
import p.cj0;
import p.dj0;
import java.io.FileNotFoundException;
import p.i51;
import p.xg3;
import p.nn6;

public final class iw5 extends c42	// class@00024e from classes2.dex
{
    public final ay6 b;
    public static final m95 c;

    static {
       i70 oi70 = new i70();
       iw5.c = ir2.u("/", false);
    }
    public void iw5(ClassLoader p0){
       super();
       this.b = new ay6(new wc(13, p0));
    }
    public static String m(m95 p0){
       j80 oj80;
       m95 c = iw5.c;
       c.getClass();
       co5.o(p0, "child");
       boolean b = true;
       p0 = at7.b(c, p0, b);
       int i = at7.a(p0);
       m95 om95 = null;
       int i1 = -1;
       m95 a = p0.a;
       m95 om951 = (i == i1)? om95: new m95(a.n(false, i));
       i = at7.a(c);
       m95 a1 = c.a;
       if (i != i1) {
          om95 = new m95(a1.n(false, i));
       }
       String str = " and ";
       if (co5.c(om951, om95)) {
          ArrayList uArrayList = p0.a();
          ArrayList uArrayList1 = c.a();
          int i2 = Math.min(uArrayList.size(), uArrayList1.size());
          int i3 = 0;
          while (i3 < i2 && co5.c(uArrayList.get(i3), uArrayList1.get(i3))) {
             i3 = i3 + 1;
          }
          if (i3 == i2 && a.d() == a1.d()) {
             p0 = ir2.u(".", false);
          }else if(uArrayList1.subList(i3, uArrayList1.size()).indexOf(at7.e) == i1){
             b = false;
          }
          if (b) {
             e70 uoe70 = new e70();
             if ((oj80 = at7.c(c)) == null && (oj80 = at7.c(p0)) == null) {
                oj80 = at7.f(m95.b);
             }
             int i4 = uArrayList1.size();
             for (int i5 = i3; i5 < i4; i5 = i5 + 1) {
                uoe70.u0(at7.e);
                uoe70.u0(oj80);
             }
             i4 = uArrayList.size();
             for (; i3 < i4; i3 = i3 + 1) {
                uoe70.u0(uArrayList.get(i3));
                uoe70.u0(oj80);
             }
             i4 = at7.d(uoe70, false);
          }else {
             throw new IllegalArgumentException("Impossible relative path to resolve: "+p0+str+c.toString());
          }
          return p0.toString();
       }else {
          throw new IllegalArgumentException("Paths of different roots cannot be relative to each other: "+p0+str+c.toString());
       }
    }
    public final el6 a(m95 p0){
       throw new IOException(this+" is read-only");
    }
    public final void b(m95 p0,m95 p1){
       co5.o(p0, "source");
       co5.o(p1, "target");
       throw new IOException(this+" is read-only");
    }
    public final void c(m95 p0){
       throw new IOException(this+" is read-only");
    }
    public final void d(m95 p0){
       co5.o(p0, "path");
       throw new IOException(this+" is read-only");
    }
    public final List g(m95 p0){
       m95 obj;
       co5.o(p0, "dir");
       String str = iw5.m(p0);
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       Iterator iterator = this.b.getValue().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          t65 ot65 = iterator.next();
          t65 a = ot65.a;
          ot65 = ot65.b;
          try{
             ArrayList uArrayList = new ArrayList();
             Iterator iterator1 = a.g(ot65.c(str)).iterator();
             while (iterator1.hasNext()) {
                obj = iterator1.next();
                if (i70.o(obj)) {
                   uArrayList.add(obj);
                }
             }
             ArrayList uArrayList1 = new ArrayList(aj0.b0(uArrayList));
             Iterator iterator2 = uArrayList.iterator();
             while (iterator2.hasNext()) {
                obj = iterator2.next();
                co5.o(obj, "<this>");
                String str1 = av6.w0(ot65.toString(), obj.toString()).replace('\', '/');
                co5.l(str1, "this as java.lang.String…replace\(oldChar, newChar\)");
                uArrayList1.add(iw5.c.c(str1));
             }
             cj0.c0(uArrayList1, linkedHashSe);
             i = 1;
          }catch(java.io.IOException e0){
          }
       }
       if (i) {
          return dj0.B0(linkedHashSe);
       }
       throw new FileNotFoundException("file not found: "+p0);
    }
    public final i51 i(m95 p0){
       i51 oi51;
       co5.o(p0, "path");
       if (!i70.o(p0)) {
          return null;
       }
       String str = iw5.m(p0);
       Iterator iterator = this.b.getValue().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          t65 ot65 = iterator.next();
          if ((oi51 = ot65.a.i(ot65.b.c(str))) == null) {
             continue ;
          }else {
             break ;
          }
       }
       return oi51;
    }
    public final xg3 j(m95 p0){
       co5.o(p0, "file");
       if (!i70.o(p0)) {
          throw new FileNotFoundException("file not found: "+p0);
       }
       String str = iw5.m(p0);
       Iterator iterator = this.b.getValue().iterator();
    label_001d :
       if (!iterator.hasNext()) {
          throw new FileNotFoundException("file not found: "+p0);
       }
       t65 ot65 = iterator.next();
       t65 a = ot65.a;
       ot65 = ot65.b;
       try{
          return a.j(ot65.c(str));
       }catch(java.io.FileNotFoundException e0){
          goto label_001d ;
       }
    }
    public final el6 k(m95 p0){
       co5.o(p0, "file");
       throw new IOException(this+" is read-only");
    }
    public final nn6 l(m95 p0){
       co5.o(p0, "file");
       if (!i70.o(p0)) {
          throw new FileNotFoundException("file not found: "+p0);
       }
       String str = iw5.m(p0);
       Iterator iterator = this.b.getValue().iterator();
    label_001d :
       if (!iterator.hasNext()) {
          throw new FileNotFoundException("file not found: "+p0);
       }
       t65 ot65 = iterator.next();
       t65 a = ot65.a;
       ot65 = ot65.b;
       try{
          return a.l(ot65.c(str));
       }catch(java.io.FileNotFoundException e0){
          goto label_001d ;
       }
    }
}
