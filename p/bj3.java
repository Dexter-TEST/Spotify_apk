package p.bj3;
import p.cj3;
import java.util.RandomAccess;
import p.f2;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.AbstractList;
import java.util.Collection;
import p.i80;
import p.bc3;
import java.lang.IllegalArgumentException;
import p.cc3;
import java.nio.charset.Charset;
import p.se7;
import p.qe7;
import p.tc7;
import java.util.Collections;

public final class bj3 extends f2 implements cj3, RandomAccess	// class@0010d6 from classes.dex
{
    public final ArrayList b;

    static {
       new bj3(10).a = false;
    }
    public void bj3(int p0){
       super(new ArrayList(p0));
    }
    public void bj3(ArrayList p0){
       super();
       this.b = p0;
    }
    public final void add(int p0,Object p1){
       this.a();
       this.b.add(p0, p1);
       this.modCount = this.modCount + 1;
    }
    public final boolean addAll(int p0,Collection p1){
       List list;
       this.a();
       if (p1 instanceof cj3) {
          list = p1.j();
       }
       this.modCount = this.modCount + 1;
       return this.b.addAll(p0, list);
    }
    public final boolean addAll(Collection p0){
       return this.addAll(this.size(), p0);
    }
    public final void clear(){
       this.a();
       this.b.clear();
       this.modCount = this.modCount + 1;
    }
    public final void e(i80 p0){
       this.a();
       this.b.add(p0);
       this.modCount = this.modCount + 1;
    }
    public final bc3 f(int p0){
       if (p0 < this.size()) {
          throw new IllegalArgumentException();
       }
       ArrayList uArrayList = new ArrayList(p0);
       uArrayList.addAll(this.b);
       return new bj3(uArrayList);
    }
    public final Object get(int p0){
       String str1;
       bj3 tb = this.b;
       String str = tb.get(p0);
       if (str instanceof String) {
       }else if(str instanceof i80){
          str1 = str.r();
          if (str.l()) {
             tb.set(p0, str1);
          }
       }else {
          str1 = new String(str, cc3.a);
          int i = 0;
          if (!se7.a.q0(i, str.length, str)) {
             i = 1;
          }
          if (i) {
             tb.set(p0, str1);
          }
       }
       str = str1;
       return str;
    }
    public final cj3 h(){
       if (this.a != null) {
          return new tc7(this);
       }
       return this;
    }
    public final Object i(int p0){
       return this.b.get(p0);
    }
    public final List j(){
       return Collections.unmodifiableList(this.b);
    }
    public final Object remove(int p0){
       this.a();
       String str = this.b.remove(p0);
       this.modCount = this.modCount + 1;
       if (str instanceof String) {
       }else if(str instanceof i80){
          str = str.r();
       }else {
          str = new String(str, cc3.a);
       }
       return str;
    }
    public final Object set(int p0,Object p1){
       this.a();
       String str = this.b.set(p0, p1);
       if (str instanceof String) {
       }else if(str instanceof i80){
          str = str.r();
       }else {
          str = new String(str, cc3.a);
       }
       return str;
    }
    public final int size(){
       return this.b.size();
    }
}
