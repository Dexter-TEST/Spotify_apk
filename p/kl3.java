package p.kl3;
import p.ml3;
import java.util.List;
import java.util.Collections;
import java.lang.Class;
import java.lang.Object;
import p.gd7;
import p.cj3;
import p.bj3;
import p.jk5;
import p.bc3;
import java.util.ArrayList;
import java.util.Collection;
import p.tc7;
import p.f2;

public final class kl3 extends ml3	// class@001c36 from classes.dex
{
    public static final Class c;

    static {
       kl3.c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }
    public void kl3(){
       super();
    }
    public static List d(int p0,long p1,Object p2){
       ArrayList uArrayList;
       List list = gd7.p(p1, p2);
       if (list.isEmpty()) {
          if (list instanceof cj3) {
             list = new bj3(p0);
          }else if(list instanceof jk5 && list instanceof bc3){
             list = list.f(p0);
          }else {
             list = new ArrayList(p0);
          }
          gd7.z(p1, p2, list);
       }else if(kl3.c.isAssignableFrom(list.getClass())){
          uArrayList = new ArrayList((list.size() + p0));
          uArrayList.addAll(list);
          gd7.z(p1, p2, uArrayList);
       }else if(list instanceof tc7){
          uArrayList = new bj3((list.size() + p0));
          uArrayList.addAll(list);
          gd7.z(p1, p2, uArrayList);
       }else if(list instanceof jk5 && list instanceof bc3){
          List list1 = list;
          if (list1.a == null) {
             list = list1.f((list.size() + p0));
             gd7.z(p1, p2, list);
          }
       }
       list = uArrayList;
       return list;
    }
    public final void a(long p0,Object p1){
       cj3 uocj3;
       List list = gd7.p(p0, p1);
       if (list instanceof cj3) {
          uocj3 = list.h();
       }else if(kl3.c.isAssignableFrom(list.getClass())){
          return;
       }else if(list instanceof jk5 && list instanceof bc3){
          if (list.a != null) {
             list.a = false;
          }
          return;
       }else {
          uocj3 = Collections.unmodifiableList(list);
       }
       gd7.z(p0, p1, uocj3);
       return;
    }
    public final void b(long p0,Object p1,Object p2){
       p2 = gd7.p(p0, p2);
       List list = kl3.d(p2.size(), p0, p1);
       int i = list.size();
       int i1 = p2.size();
       if (i > 0 && i1 > 0) {
          list.addAll(p2);
       }
       if (i > 0) {
          p2 = list;
       }
       gd7.z(p0, p1, p2);
       return;
    }
    public final List c(long p0,Object p1){
       return kl3.d(10, p0, p1);
    }
}
