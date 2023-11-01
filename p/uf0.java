package p.uf0;
import p.ah3;
import p.tf0;
import java.lang.Class;
import p.wf2;
import p.zf2;
import p.ng2;
import p.fv1;
import p.mf2;
import p.tg2;
import p.vg2;
import p.xg2;
import p.zg2;
import p.bh2;
import p.xf2;
import p.ag2;
import p.bg2;
import p.cg2;
import p.dg2;
import p.eg2;
import p.fg2;
import p.gg2;
import p.hg2;
import p.ig2;
import p.kg2;
import p.lg2;
import p.mg2;
import java.lang.Object;
import java.util.List;
import p.ye7;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import java.lang.Integer;
import p.t65;
import java.util.Map;
import p.q14;
import java.util.HashMap;
import java.util.Collection;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import p.av6;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Number;
import java.util.LinkedHashMap;
import p.xe7;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public final class uf0 implements ah3, tf0	// class@002899 from classes.dex
{
    public final Class a;
    public static final Map b;
    public static final HashMap c;
    public static final LinkedHashMap d;

    static {
       char c;
       Class[] uClassArray = new Class[23];
       int i = 0;
       uClassArray[i] = wf2.class;
       uClassArray[1] = zf2.class;
       uClassArray[2] = ng2.class;
       uClassArray[3] = fv1.class;
       uClassArray[4] = mf2.class;
       uClassArray[5] = tg2.class;
       uClassArray[6] = vg2.class;
       uClassArray[7] = xg2.class;
       uClassArray[8] = zg2.class;
       uClassArray[9] = bh2.class;
       uClassArray[10] = xf2.class;
       uClassArray[11] = ag2.class;
       uClassArray[12] = bg2.class;
       uClassArray[13] = cg2.class;
       uClassArray[14] = dg2.class;
       uClassArray[15] = eg2.class;
       uClassArray[16] = fg2.class;
       uClassArray[17] = gg2.class;
       uClassArray[18] = hg2.class;
       uClassArray[19] = ig2.class;
       uClassArray[20] = kg2.class;
       uClassArray[21] = lg2.class;
       uClassArray[22] = mg2.class;
       List list = ye7.K(uClassArray);
       ArrayList uArrayList = new ArrayList(aj0.b0(list));
       Iterator iterator = list.iterator();
       while (true) {
          if (iterator.hasNext()) {
             Object obj = iterator.next();
             int i1 = i + 1;
             if (i >= 0) {
                uArrayList.add(new t65(obj, Integer.valueOf(i)));
                i = i1;
             }else {
                break ;
             }
          }else {
             uf0.b = q14.q0(uArrayList);
             HashMap iterator1 = new HashMap();
             iterator1.put("boolean", "kotlin.Boolean");
             iterator1.put("char", "kotlin.Char");
             iterator1.put("byte", "kotlin.Byte");
             String str = "kotlin.Short";
             iterator1.put("short", str);
             String str1 = "kotlin.Int";
             iterator1.put("int", str1);
             iterator1.put("float", "kotlin.Float");
             iterator1.put("long", "kotlin.Long");
             iterator1.put("double", "kotlin.Double");
             HashMap i2 = new HashMap();
             i2.put("java.lang.Boolean", "kotlin.Boolean");
             i2.put("java.lang.Character", "kotlin.Char");
             i2.put("java.lang.Byte", "kotlin.Byte");
             i2.put("java.lang.Short", str);
             i2.put("java.lang.Integer", str1);
             i2.put("java.lang.Float", "kotlin.Float");
             i2.put("java.lang.Long", "kotlin.Long");
             i2.put("java.lang.Double", "kotlin.Double");
             HashMap hashMap = new HashMap();
             hashMap.put("java.lang.Object", "kotlin.Any");
             hashMap.put("java.lang.String", "kotlin.String");
             hashMap.put("java.lang.CharSequence", "kotlin.CharSequence");
             hashMap.put("java.lang.Throwable", "kotlin.Throwable");
             hashMap.put("java.lang.Cloneable", "kotlin.Cloneable");
             hashMap.put("java.lang.Number", "kotlin.Number");
             hashMap.put("java.lang.Comparable", "kotlin.Comparable");
             hashMap.put("java.lang.Enum", "kotlin.Enum");
             hashMap.put("java.lang.annotation.Annotation", "kotlin.Annotation");
             hashMap.put("java.lang.Iterable", "kotlin.collections.Iterable");
             hashMap.put("java.util.Iterator", "kotlin.collections.Iterator");
             hashMap.put("java.util.Collection", "kotlin.collections.Collection");
             hashMap.put("java.util.List", "kotlin.collections.List");
             hashMap.put("java.util.Set", "kotlin.collections.Set");
             hashMap.put("java.util.ListIterator", "kotlin.collections.ListIterator");
             hashMap.put("java.util.Map", "kotlin.collections.Map");
             hashMap.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
             hashMap.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
             hashMap.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
             hashMap.putAll(iterator1);
             hashMap.putAll(i2);
             Collection uCollection = iterator1.values();
             co5.l(uCollection, "primitiveFqNames.values");
             iterator = uCollection.iterator();
             while (true) {
                c = '.';
                if (iterator.hasNext()) {
                   String str2 = iterator.next();
                   co5.l(str2, "kotlinName");
                   hashMap.put("kotlin.jvm.internal.".append(av6.H0(c, str2, str2)).append("CompanionObject").toString(), str2.concat(".Companion"));
                }else {
                   break ;
                }
             }
             iterator = uf0.b.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                Class key = uEntry.getKey();
                hashMap.put(key.getName(), "kotlin.Function".append(uEntry.getValue().intValue()).toString());
             }
             uf0.c = hashMap;
             LinkedHashMap linkedHashMa = new LinkedHashMap(xe7.F(hashMap.size()));
             Iterator iterator2 = hashMap.entrySet().iterator();
             while (iterator2.hasNext()) {
                Map$Entry uEntry1 = iterator2.next();
                Object key1 = uEntry1.getKey();
                linkedHashMa.put(key1, av6.H0(c, uEntry1.getValue(), uEntry1.getValue()));
             }
             uf0.d = linkedHashMa;
          }
       }
       ye7.W();
       throw null;
    }
    public void uf0(Class p0){
       co5.o(p0, "jClass");
       super();
       this.a = p0;
    }
    public final Class a(){
       return this.a;
    }
    public final String b(){
       Method enclosingMet;
       Constructor enclosingCon;
       String str1;
       uf0 ta = this.a;
       co5.o(ta, "jClass");
       String str = null;
       if (ta.isAnonymousClass()) {
       }else if(ta.isLocalClass()){
          String simpleName = ta.getSimpleName();
          if ((enclosingMet = ta.getEnclosingMethod()) != null) {
             str = av6.G0(simpleName, enclosingMet.getName()+'$');
          }else if((enclosingCon = ta.getEnclosingConstructor()) != null){
             str = av6.G0(simpleName, enclosingCon.getName()+'$');
          }else {
             str = av6.F0(simpleName, '$');
          }
       }else {
          LinkedHashMap d = uf0.d;
          if (ta.isArray()) {
             Class componentTyp = ta.getComponentType();
             if (componentTyp.isPrimitive() && (str1 = d.get(componentTyp.getName())) != null) {
                str = str1.concat("Array");
             }
             if (str == null) {
                str = "Array";
             }
          }else if((str = d.get(ta.getName())) == null){
             str = ta.getSimpleName();
          }
       }
       return str;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof uf0 && co5.c(ye7.A(this), ye7.A(p0)))? true: false;
       return b;
    }
    public final int hashCode(){
       return ye7.A(this).hashCode();
    }
    public final String toString(){
       return this.a.toString()+" \(Kotlin reflection is not available\)";
    }
}
