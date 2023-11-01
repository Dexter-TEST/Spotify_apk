package p.m73;
import java.util.Map;
import java.io.Serializable;
import java.lang.Object;
import p.k73;
import java.util.SortedMap;
import java.util.Set;
import java.util.Collection;
import p.dt5;
import java.lang.String;
import p.w51;
import java.io.ObjectInputStream;
import java.io.InvalidObjectException;
import p.at5;
import java.lang.UnsupportedOperationException;
import com.google.common.collect.b;
import p.bt5;
import com.google.common.collect.d;
import p.l73;

public abstract class m73 implements Map, Serializable	// class@001e3c from classes.dex
{
    public d a;
    public d b;
    public b c;

    public void m73(){
       super();
    }
    public static k73 a(){
       return new k73(4);
    }
    public static m73 b(Map p0){
       if (p0 instanceof m73 && !p0 instanceof SortedMap) {
          p0.g();
          return p0;
       }else {
          Set set = p0.entrySet();
          int i = (set instanceof Collection)? set.size(): 4;
          k73 ok73 = new k73(i);
          ok73.f(set);
          return ok73.b(true);
       }
    }
    public static dt5 h(String p0,Object p1){
       w51.f(p0, p1);
       Object[] objArray = new Object[]{p0,p1};
       return dt5.k(1, objArray, null);
    }
    public static dt5 i(String p0,Object p1,String p2,Object p3,String p4,Object p5){
       w51.f(p0, p1);
       w51.f(p2, p3);
       w51.f(p4, p5);
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
       return dt5.k(3, objArray, null);
    }
    private void readObject(ObjectInputStream p0){
       throw new InvalidObjectException("Use SerializedForm");
    }
    public abstract at5 c();
    public final void clear(){
       throw new UnsupportedOperationException();
    }
    public final boolean containsKey(Object p0){
       boolean b = (this.get(p0) != null)? true: false;
       return b;
    }
    public final boolean containsValue(Object p0){
       return this.j().contains(p0);
    }
    public abstract bt5 d();
    public abstract b e();
    public final Set entrySet(){
       m73 ta;
       if ((ta = this.a) == null) {
          ta = this.c();
          this.a = ta;
       }
       return ta;
    }
    public final boolean equals(Object p0){
       return w51.q(this, p0);
    }
    public final d f(){
       m73 ta;
       if ((ta = this.a) == null) {
          ta = this.c();
          this.a = ta;
       }
       return ta;
    }
    public abstract void g();
    public abstract Object get(Object p0);
    public final Object getOrDefault(Object p0,Object p1){
       if ((p0 = this.get(p0)) != null) {
          return p0;
       }
       return p1;
    }
    public final int hashCode(){
       m73 ta;
       if ((ta = this.a) == null) {
          ta = this.c();
          this.a = ta;
       }
       return w51.C(ta);
    }
    public final boolean isEmpty(){
       boolean b = (!this.size())? true: false;
       return b;
    }
    public b j(){
       m73 tc;
       if ((tc = this.c) == null) {
          tc = this.e();
          this.c = tc;
       }
       return tc;
    }
    public final Set keySet(){
       m73 tb;
       if ((tb = this.b) == null) {
          tb = this.d();
          this.b = tb;
       }
       return tb;
    }
    public final Object put(Object p0,Object p1){
       throw new UnsupportedOperationException();
    }
    public final void putAll(Map p0){
       throw new UnsupportedOperationException();
    }
    public final Object remove(Object p0){
       throw new UnsupportedOperationException();
    }
    public final String toString(){
       return w51.V(this);
    }
    public Collection values(){
       return this.j();
    }
    public Object writeReplace(){
       return new l73(this);
    }
}
