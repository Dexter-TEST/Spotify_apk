package com.spotify.hubs.moshi.HubsJsonComponentBundle;
import java.lang.Object;
import java.util.Map;
import java.util.List;
import java.lang.Class;
import java.lang.reflect.Array;
import java.lang.String;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Number;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import p.od1;
import java.lang.Boolean;
import java.lang.Error;
import java.lang.StringBuilder;
import p.au2;
import p.zt2;
import p.a23;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.p13;
import com.spotify.hubs.moshi.HubsJsonComponentBundle$HubsJsonComponentBundleCompatibility;

public final class HubsJsonComponentBundle	// class@0008c3 from classes.dex
{
    private Map a;
    private static final String b = "data";

    public void HubsJsonComponentBundle(){
       super();
    }
    public void HubsJsonComponentBundle(Map p0){
       super();
       this.a = p0;
    }
    private static Object[] a(List p0,Class p1){
       Object[] objArray = Array.newInstance(p1, p0.size());
       for (int i = 0; i < p0.size(); i = i + 1) {
          objArray[i] = p1.cast(p0.get(i));
       }
       return objArray;
    }
    private static Object b(List p0){
       Object[] objArray;
       int len;
       object oobject;
       int i = 0;
       if (p0.isEmpty()) {
          String[] stringArray = new String[i];
          return stringArray;
       }else {
          Object obj = p0.get(i);
          obj.getClass();
          Class class = obj.getClass();
          if (obj instanceof String) {
             return HubsJsonComponentBundle.a(p0, String.class);
          }
          Map map = Map.class;
          if (map.isAssignableFrom(class)) {
             return HubsJsonComponentBundle.a(p0, map);
          }
          if (obj instanceof Integer) {
             objArray = p0.toArray();
             len = objArray.length;
             int[] ointArray = new int[len];
             for (; i < len; i = i + 1) {
                oobject = objArray[i];
                oobject.getClass();
                ointArray[i] = oobject.intValue();
             }
             return ointArray;
          }else if(obj instanceof Long){
             objArray = p0.toArray();
             len = objArray.length;
             long[] olongArray = new long[len];
             for (; i < len; i = i + 1) {
                oobject = objArray[i];
                oobject.getClass();
                olongArray[i] = oobject.longValue();
             }
             return olongArray;
          }else if(obj instanceof Float){
             objArray = p0.toArray();
             len = objArray.length;
             float[] uofloatArray = new float[len];
             for (; i < len; i = i + 1) {
                oobject = objArray[i];
                oobject.getClass();
                uofloatArray[i] = oobject.floatValue();
             }
             return uofloatArray;
          }else if(obj instanceof Double){
             objArray = p0.toArray();
             len = objArray.length;
             double[] uodoubleArra = new double[len];
             for (; i < len; i = i + 1) {
                oobject = objArray[i];
                oobject.getClass();
                uodoubleArra[i] = oobject.doubleValue();
             }
             return uodoubleArra;
          }else if(obj instanceof Boolean){
             objArray = p0.toArray();
             len = objArray.length;
             boolean[] uobooleanArr = new boolean[len];
             for (; i < len; i = i + 1) {
                oobject = objArray[i];
                oobject.getClass();
                uobooleanArr[i] = oobject.booleanValue();
             }
             return uobooleanArr;
          }else {
             throw new Error("Not Implemented. Convert List to Array. Type: "+p0.getClass()+", elm: "+class);
          }
       }
    }
    public au2 c(){
       HubsJsonComponentBundle ta;
       Object value;
       zt2 ozt2 = a23.N();
       if ((ta = this.a) != null) {
          Iterator iterator = ta.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             if ((value = uEntry.getValue()) == null) {
                continue ;
             }else {
                Class class = value.getClass();
                if (List.class.isAssignableFrom(class)) {
                   value = HubsJsonComponentBundle.b(value);
                   class = value.getClass();
                }
                if (value instanceof String) {
                   ozt2 = ozt2.r(key, value);
                }else if(value instanceof Integer){
                   ozt2 = ozt2.l(value.intValue(), key);
                }else if(value instanceof Long){
                   ozt2 = ozt2.o(key, value.longValue());
                }else if(value instanceof Float){
                   ozt2 = ozt2.k(key, value.floatValue());
                }else if(value instanceof Double){
                   ozt2 = ozt2.i(key, value.doubleValue());
                }else if(value instanceof Boolean){
                   ozt2 = ozt2.b(key, value.booleanValue());
                }else if(value instanceof au2){
                   ozt2 = ozt2.e(key, value);
                }else if(String[].class.equals(class)){
                   ozt2 = ozt2.s(key, value);
                }else if(int[].class.equals(class)){
                   ozt2 = ozt2.m(key, value);
                }else if(byte[].class.equals(class)){
                   ozt2 = ozt2.g(key, value);
                }else if(long[].class.equals(class)){
                   ozt2 = ozt2.n(key, value);
                }else if(float[].class.equals(class)){
                   ozt2 = ozt2.j(key, value);
                }else if(double[].class.equals(class)){
                   ozt2 = ozt2.h(key, value);
                }else if(boolean[].class.equals(class)){
                   ozt2 = ozt2.c(key, value);
                }else if(Map[].class.equals(class)){
                   au2[] uoau2Array = new au2[value.length];
                   for (int i = 0; i < value.length; i = i + 1) {
                      uoau2Array[i] = new HubsJsonComponentBundle(value[i]).c();
                   }
                   ozt2 = ozt2.f(key, uoau2Array);
                }else if(au2[].class.equals(class)){
                   ozt2 = ozt2.f(key, value);
                }else if(Map.class.isAssignableFrom(class)){
                   ozt2 = ozt2.e(key, new HubsJsonComponentBundle(value).c());
                }else {
                   throw new Error("Not Implemented. Type: ".concat(class.getSimpleName()));
                }
             }
          }
       }
       return new HubsJsonComponentBundle$HubsJsonComponentBundleCompatibility(ozt2.d());
    }
}
