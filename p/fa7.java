package p.fa7;
import java.io.Serializable;
import java.lang.String;
import p.he3;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import p.en6;
import java.lang.Class;
import java.util.Map;
import p.ea7;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.AbstractList;
import java.lang.Iterable;
import java.util.Collections;
import java.util.Arrays;
import p.wf0;

public final class fa7 implements Serializable	// class@001590 from classes.dex
{
    public final String[] a;
    public final he3[] b;
    public final String[] c;
    public final int t;
    public static final String[] v;
    public static final he3[] w;
    public static final fa7 x;

    static {
       String[] stringArray = new String[0];
       fa7.v = stringArray;
       he3[] ohe3Array = new he3[0];
       fa7.w = ohe3Array;
       fa7.x = new fa7(stringArray, ohe3Array, null);
    }
    public void fa7(String[] p0,he3[] p1,String[] p2){
       super();
       if (p0 == null) {
          p0 = fa7.v;
       }
       this.a = p0;
       if (p1 == null) {
          p1 = fa7.w;
       }
       this.b = p1;
       if (p0.length == p1.length) {
          int len = p1.length;
          int i = 1;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             i = i + this.b[i1].b;
          }
          this.c = p2;
          this.t = i;
          return;
       }else {
          throw new IllegalArgumentException(en6.o("Mismatching names \("+p0.length+"\), types \(", p1.length, "\)"));
       }
    }
    public static fa7 a(Class p0,he3 p1,he3 p2){
       TypeVariable[] f;
       if (p0 == Map.class) {
          f = ea7.f;
       }else if(p0 == HashMap.class){
          f = ea7.g;
       }else if(p0 == LinkedHashMap.class){
          f = ea7.h;
       }else {
          f = p0.getTypeParameters();
       }
       int i = (f == null)? 0: f.length;
       if (i == 2) {
          String[] stringArray = new String[]{f[0].getName(),f[1].getName()};
          he3[] ohe3Array = new he3[]{p1,p2};
          return new fa7(stringArray, ohe3Array, null);
       }else {
          throw new IllegalArgumentException("Cannot create TypeBindings for class "+p0.getName()+" with 2 type parameters: class expects "+i);
       }
    }
    public static fa7 b(Class p0,he3[] p1){
       TypeVariable[] typeParamete;
       String[] v;
       int len1;
       int i = 0;
       if (p1 == null) {
          p1 = fa7.w;
       }else if((len1 = p1.length) != 1){
          if (len1 == 2) {
             return fa7.a(p0, p1[i], p1[1]);
          }
       }else {
          return fa7.c(p1[i], p0);
       }
       if ((typeParamete = p0.getTypeParameters()) != null && typeParamete.length) {
          int len = typeParamete.length;
          v = new String[len];
          for (; i < len; i = i + 1) {
             v[i] = typeParamete[i].getName();
          }
       }else {
          v = fa7.v;
       }
       if (v.length != p1.length) {
          StringBuilder str = "Cannot create TypeBindings for class "+p0.getName()+" with "+p1.length+" type parameter";
          String str1 = (p1.length == 1)? "": "s";
          throw new IllegalArgumentException(str+str1+": class expects "+v.length);
       }else {
          return new fa7(v, p1, null);
       }
    }
    public static fa7 c(he3 p0,Class p1){
       TypeVariable[] b;
       if (p1 == Collection.class) {
          b = ea7.b;
       }else if(p1 == List.class){
          b = ea7.d;
       }else if(p1 == ArrayList.class){
          b = ea7.e;
       }else if(p1 == AbstractList.class){
          b = ea7.a;
       }else if(p1 == Iterable.class){
          b = ea7.c;
       }else {
          b = p1.getTypeParameters();
       }
       int i = 0;
       int i1 = (b == null)? 0: b.length;
       if (i1 == 1) {
          String[] stringArray = new String[]{b[i].getName()};
          he3[] ohe3Array = new he3[]{p0};
          return new fa7(stringArray, ohe3Array, null);
       }else {
          throw new IllegalArgumentException("Cannot create TypeBindings for class "+p1.getName()+" with 1 type parameter: class expects "+i1);
       }
    }
    public final List d(){
       fa7 tb = this.b;
       if (!tb.length) {
          return Collections.emptyList();
       }
       return Arrays.asList(tb);
    }
    public final boolean e(){
       boolean b = (!this.b.length)? true: false;
       return b;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!wf0.k(fa7.class, p0)) {
          return false;
       }
       fa7 tb = this.b;
       int len = tb.length;
       p0 = p0.b;
       if (len != p0.length) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          if (!p0[i].equals(tb[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final int hashCode(){
       return this.t;
    }
    public Object readResolve(){
       fa7 ta;
       if ((ta = this.a) != null && ta.length) {
          return this;
       }
       return fa7.x;
    }
    public final String toString(){
       fa7 tb = this.b;
       if (!tb.length) {
          return "<>";
       }
       String str = "<";
       int len = tb.length;
       for (int i = 0; i < len; i = i + 1) {
          if (i > 0) {
             str = str.append(',');
          }
          StringBuilder str1 = new StringBuilder(40);
          tb[i].f(str1);
          str = str.append(str1.toString());
       }
       return str+'>';
    }
}
