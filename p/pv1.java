package p.pv1;
import java.lang.Enum;
import java.lang.String;
import p.xe7;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.Object;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import p.dj0;
import java.lang.Class;

public final class pv1 extends Enum	// class@0022d8 from classes.dex
{
    public final int a;
    public static final pv1 A;
    public static final pv1 B;
    public static final pv1 C;
    public static final pv1[] D;
    public static final LinkedHashMap b;
    public static final Set c;
    public static final int t;
    public static final pv1 v;
    public static final pv1 w;
    public static final pv1 x;
    public static final pv1 y;
    public static final pv1 z;

    static {
       int i1;
       object oobject;
       pv1 opv1 = new pv1("ENTERED", 0, 0);
       pv1.v = opv1;
       pv1 opv11 = new pv1("REJECTED_CLIENT", 1, 1);
       pv1.w = opv11;
       int i = 2;
       pv1 opv12 = new pv1("DROPPED", i, i);
       pv1.x = opv12;
       pv1 opv13 = new pv1("PERSISTED", 3, 3);
       pv1.y = opv13;
       pv1 opv14 = new pv1("REJECTED_BACKEND", 4, 4);
       pv1.z = opv14;
       pv1 opv15 = new pv1("DELIVERED", 5, 5);
       pv1.A = opv15;
       pv1 opv16 = new pv1("DELETED", 6, 6);
       pv1.B = opv16;
       pv1 opv17 = new pv1("UNKNOWN", 7, -1);
       pv1.C = opv17;
       pv1[] opv1Array = new pv1[]{opv1,opv11,opv12,opv13,opv14,opv15,opv16,opv17};
       pv1.D = opv1Array;
       pv1[] opv1Array1 = pv1.values();
       if ((i1 = xe7.F(opv1Array1.length)) < 16) {
          i1 = 16;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap(i1);
       i1 = opv1Array1.length;
       for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
          oobject = opv1Array1[i2];
          linkedHashMa.put(Integer.valueOf(oobject.a), oobject);
       }
       pv1.b = linkedHashMa;
       opv1Array1 = pv1.values();
       ArrayList uArrayList = new ArrayList();
       int len = opv1Array1.length;
       i2 = 0;
       while (i2 < len) {
          opv14 = ((oobject = opv1Array1[i2]) != pv1.C)? 1: 0;
          if (opv14) {
             uArrayList.add(oobject);
          }
          i2 = i2 + 1;
       }
       Set set = dj0.F0(uArrayList);
       pv1.c = set;
       pv1.t = set.size();
    }
    public void pv1(String p0,int p1,int p2){
       this.a = p2;
    }
    public static pv1 valueOf(String p0){
       return Enum.valueOf(pv1.class, p0);
    }
    public static pv1[] values(){
       return pv1.D.clone();
    }
}
