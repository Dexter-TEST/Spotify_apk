package p.gc6;
import p.a02;
import java.util.Set;
import java.util.Collections;
import java.lang.Object;
import p.ta3;
import java.util.List;
import p.fc6;
import java.util.ArrayList;
import p.tm5;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Class;
import java.util.Iterator;

public final class gc6 implements a02	// class@0016e3 from classes.dex
{
    public final List a;
    public final List b;

    static {
       ta3.a(Collections.emptySet());
    }
    public void gc6(List p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static fc6 a(int p0,int p1){
       return new fc6(p0, p1);
    }
    public final Object get(){
       gc6 ta = this.a;
       int i = ta.size();
       gc6 tb = this.b;
       ArrayList uArrayList = new ArrayList(tb.size());
       int i1 = tb.size();
       int i2 = 0;
       for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
          Collection uCollection = tb.get(i3).get();
          i = i + uCollection.size();
          uArrayList.add(uCollection);
       }
       if (i < 3) {
          i = i + 1;
       }else if(i < 0x40000000){
          i = (int)(((float)i / 0x3f400000) + 0x3f800000);
       }else {
          i = Integer.MAX_VALUE;
       }
       HashSet hashSet = new HashSet(i);
       i = ta.size();
       for (i1 = 0; i1 < i; i1 = i1 + 1) {
          Object obj = ta.get(i1).get();
          obj.getClass();
          hashSet.add(obj);
       }
       int i4 = uArrayList.size();
       while (i2 < i4) {
          Iterator iterator = uArrayList.get(i2).iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             obj1.getClass();
             hashSet.add(obj1);
          }
          i2 = i2 + 1;
       }
       return Collections.unmodifiableSet(hashSet);
    }
}
