package p.v1;
import p.r74;
import java.lang.Object;
import java.lang.Iterable;
import java.util.Collection;
import java.util.List;
import p.cc3;
import java.lang.Class;
import p.cj3;
import java.util.Iterator;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.NullPointerException;
import p.i80;
import p.jk5;
import java.util.ArrayList;
import p.s74;
import p.hc7;
import com.google.protobuf.a;
import java.io.InputStream;
import p.yx1;
import p.sh0;
import p.u1;
import java.lang.RuntimeException;
import java.lang.Throwable;
import p.u74;
import java.lang.IllegalArgumentException;

public abstract class v1 implements r74	// class@002966 from classes.dex
{

    public void v1(){
       super();
    }
    public static void addAll(Iterable p0,Collection p1){
       p1.addAll(p0, p1);
    }
    public static void addAll(Iterable p0,List p1){
       int i;
       Iterator iterator;
       Object obj;
       String str2;
       int i1;
       p0.getClass();
       String str = " is null.";
       String str1 = "Element at index ";
       if (p0 instanceof cj3) {
          List list = p1;
          i = p1.size();
          iterator = p0.j().iterator();
          while (iterator.hasNext()) {
             if ((obj = iterator.next()) == null) {
                str2 = str1+(list.size() - i)+str;
                for (i1 = list.size() - 1; i1 >= i; i1 = i1 - 1) {
                   list.remove(i1);
                }
                throw new NullPointerException(str2);
             }else if(obj instanceof i80){
                list.e(obj);
             }else {
                list.add(obj);
             }
          }
       }else if(p0 instanceof jk5){
          p1.addAll(p0);
       }else if(p1 instanceof ArrayList && p0 instanceof Collection){
          p1.ensureCapacity((p0.size() + p1.size()));
       }
       i = p1.size();
       iterator = p0.iterator();
       while (iterator.hasNext()) {
          if ((obj = iterator.next()) == null) {
             str2 = str1+(p1.size() - i)+str;
             i1 = p1.size();
             while ((i1 = i1 - 1) >= i) {
                p1.remove(i1);
             }
             throw new NullPointerException(str2);
          }
          p1.add(obj);
       }
       return;
    }
    public static hc7 newUninitializedMessageException(s74 p0){
       return new hc7();
    }
    public final String a(){
       return "Reading "+this.getClass().getName()+" from a ByteString threw an IOException \(should never happen\).";
    }
    public abstract v1 internalMergeFrom(a p0);
    public boolean mergeDelimitedFrom(InputStream p0){
       return this.mergeDelimitedFrom(p0, yx1.a());
    }
    public boolean mergeDelimitedFrom(InputStream p0,yx1 p1){
       int i;
       if ((i = p0.read()) == -1) {
          return false;
       }
       this.mergeFrom(new u1(sh0.t(i, p0), p0), p1);
       return true;
    }
    public r74 mergeFrom(InputStream p0){
       return this.mergeFrom(p0);
    }
    public r74 mergeFrom(InputStream p0,yx1 p1){
       return this.mergeFrom(p0, p1);
    }
    public r74 mergeFrom(i80 p0){
       return this.mergeFrom(p0);
    }
    public r74 mergeFrom(i80 p0,yx1 p1){
       return this.mergeFrom(p0, p1);
    }
    public r74 mergeFrom(s74 p0){
       return this.mergeFrom(p0);
    }
    public r74 mergeFrom(sh0 p0){
       return this.mergeFrom(p0);
    }
    public r74 mergeFrom(byte[] p0){
       return this.mergeFrom(p0);
    }
    public r74 mergeFrom(byte[] p0,yx1 p1){
       return this.mergeFrom(p0, p1);
    }
    public v1 mergeFrom(InputStream p0){
       sh0 osh0 = sh0.g(p0);
       this.mergeFrom(osh0);
       osh0.a(0);
       return this;
    }
    public v1 mergeFrom(InputStream p0,yx1 p1){
       sh0 osh0 = sh0.g(p0);
       this.mergeFrom(osh0, p1);
       osh0.a(0);
       return this;
    }
    public v1 mergeFrom(i80 p0){
       try{
          sh0 osh0 = p0.m();
          this.mergeFrom(osh0);
          osh0.a(0);
          return this;
       }catch(p.rc3 e3){
          throw e3;
       }catch(java.io.IOException e3){
          throw new RuntimeException(this.a(), e3);
       }
    }
    public v1 mergeFrom(i80 p0,yx1 p1){
       try{
          sh0 osh0 = p0.m();
          this.mergeFrom(osh0, p1);
          osh0.a(0);
          return this;
       }catch(p.rc3 e2){
          throw e2;
       }catch(java.io.IOException e2){
          throw new RuntimeException(this.a(), e2);
       }
    }
    public v1 mergeFrom(s74 p0){
       if (this.getDefaultInstanceForType().getClass().isInstance(p0)) {
          return this.internalMergeFrom(p0);
       }
       throw new IllegalArgumentException("mergeFrom\(MessageLite\) can only merge messages of the same type.");
    }
    public v1 mergeFrom(sh0 p0){
       return this.mergeFrom(p0, yx1.a());
    }
    public abstract v1 mergeFrom(sh0 p0,yx1 p1);
    public v1 mergeFrom(byte[] p0){
       return this.mergeFrom(p0, 0, p0.length);
    }
    public abstract v1 mergeFrom(byte[] p0,int p1,int p2);
    public abstract v1 mergeFrom(byte[] p0,int p1,int p2,yx1 p3);
    public v1 mergeFrom(byte[] p0,yx1 p1){
       return this.mergeFrom(p0, 0, p0.length, p1);
    }
}
