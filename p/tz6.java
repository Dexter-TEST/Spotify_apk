package p.tz6;
import java.lang.String;
import java.util.Map;
import java.util.AbstractSet;
import java.lang.Object;
import p.nf2;
import java.lang.StringBuilder;
import android.database.Cursor;
import p.ml1;
import java.io.Closeable;
import java.lang.Throwable;
import p.eb3;
import p.a14;
import p.co5;
import p.pz6;
import p.hl3;
import p.rz6;
import p.ye7;
import java.lang.Iterable;
import java.util.List;
import p.dj0;
import java.lang.Comparable;
import java.util.Arrays;
import p.uk;
import p.ec6;
import java.util.ArrayList;
import java.util.Iterator;
import p.qz6;
import java.util.TreeMap;
import java.lang.Integer;
import java.util.Collection;
import p.sz6;

public final class tz6	// class@002813 from classes.dex
{
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public void tz6(String p0,Map p1,AbstractSet p2,AbstractSet p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static final tz6 a(nf2 p0,String p1){
       ml1 a;
       int columnIndex;
       int columnIndex4;
       int columnIndex7;
       int columnIndex8;
       String str6;
       List list;
       rz6 obj;
       List list1;
       Throwable throwable1;
       String str8;
       int columnIndex11;
       int i;
       int i1;
       String str9;
       int i2;
       Throwable throwable2;
       AbstractSet uAbstractSet;
       nf2 onf2 = p0;
       String str = p1;
       String str1 = "seq";
       String str2 = "id";
       String str3 = "type";
       String str4 = "`\)";
       Cursor uCursor = onf2.a0("PRAGMA table_info\(`"+str+str4);
       String str5 = "name";
       Throwable throwable = null;
       if (uCursor.getColumnCount() <= 0) {
          a = ml1.a;
          eb3.d(uCursor, throwable);
       }else {
          columnIndex = uCursor.getColumnIndex(str5);
          columnIndex4 = uCursor.getColumnIndex(str3);
          columnIndex7 = uCursor.getColumnIndex("notnull");
          columnIndex8 = uCursor.getColumnIndex("pk");
          columnIndex11 = uCursor.getColumnIndex("dflt_value");
          a14 uoa14 = new a14();
          while (uCursor.moveToNext()) {
             String str11 = uCursor.getString(columnIndex);
             str8 = uCursor.getString(columnIndex4);
             boolean b = (uCursor.getInt(columnIndex7))? true: false;
             co5.l(str11, str5);
             co5.l(str8, str3);
             pz6 columnIndex13 = new pz6(str11, str8, b, uCursor.getInt(columnIndex8), uCursor.getString(columnIndex11), 2);
             uoa14.put(str11, columnIndex);
             columnIndex = columnIndex;
             str11 = 0;
          }
          uoa14.b();
          uoa14.C = true;
          eb3.d(uCursor, null);
          a = uoa14;
       }
       uCursor = onf2.a0("PRAGMA foreign_key_list\(`"+str+str4);
       columnIndex = uCursor.getColumnIndex(str2);
       int columnIndex1 = uCursor.getColumnIndex(str1);
       int columnIndex2 = uCursor.getColumnIndex("table");
       boolean columnIndex3 = uCursor.getColumnIndex("on_delete");
       columnIndex4 = uCursor.getColumnIndex("on_update");
       int columnIndex5 = uCursor.getColumnIndex(str2);
       int columnIndex6 = uCursor.getColumnIndex(str1);
       columnIndex7 = uCursor.getColumnIndex("from");
       columnIndex8 = uCursor.getColumnIndex("to");
       hl3 ohl3 = new hl3();
       while (uCursor.moveToNext()) {
          str1 = uCursor.getString(columnIndex7);
          co5.l(str1, "cursor.getString\(fromColumnIndex\)");
          str6 = uCursor.getString(columnIndex8);
          co5.l(str6, "cursor.getString\(toColumnIndex\)");
          ohl3.add(new rz6(uCursor.getInt(columnIndex5), str1, uCursor.getInt(columnIndex6), str6));
          a = a;
          str5 = str5;
          columnIndex8 = columnIndex8;
       }
       ml1 oml1 = a;
       String str7 = str5;
       ye7.g(ohl3);
       if (ohl3.a() <= 1) {
          list = dj0.B0(ohl3);
          a = 0;
       }else {
          Comparable[] uComparableA = new Comparable[0];
          Object[] objArray = ohl3.toArray(uComparableA);
          Object[] objArray1 = objArray;
          if (objArray1.length > 1) {
             Arrays.sort(objArray1);
          }
          list = uk.h0(objArray);
       }
       uCursor.moveToPosition(-1);
       ec6 uoec6 = new ec6();
       while (uCursor.moveToNext()) {
          if (uCursor.getInt(columnIndex1)) {
             continue ;
          }else {
             columnIndex7 = uCursor.getInt(columnIndex);
             ArrayList uArrayList = new ArrayList();
             ArrayList uArrayList1 = new ArrayList();
             ArrayList uArrayList2 = new ArrayList();
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                list1 = list;
                list = (obj.a == columnIndex7)? 1: 0;
                if (list) {
                   uArrayList2.add(obj);
                }
                list = list1;
                obj = -1;
             }
             list1 = list;
             Iterator qz6 iterator1 = uArrayList2.iterator();
             while (iterator1.hasNext()) {
                obj = iterator1.next();
                uArrayList.add(obj.c);
                uArrayList1.add(obj.t);
             }
             str2 = uCursor.getString(columnIndex2);
             co5.l(str2, "cursor.getString\(tableColumnIndex\)");
             str3 = uCursor.getString(columnIndex3);
             co5.l(str3, "cursor.getString\(onDeleteColumnIndex\)");
             str6 = uCursor.getString(columnIndex4);
             co5.l(str6, "cursor.getString\(onUpdateColumnIndex\)");
             iterator1 = new qz6(str2, str3, str6, uArrayList, uArrayList1);
             uoec6.add(iterator1);
             columnIndex = columnIndex;
             list = list1;
             uArrayList2 = 0;
          }
       }
       co5.f(uoec6);
       eb3.d(uCursor, null);
       Cursor uCursor1 = onf2.a0("PRAGMA index_list\(`"+str+str4);
       str2 = str7;
       int columnIndex9 = uCursor1.getColumnIndex(str2);
       int columnIndex10 = uCursor1.getColumnIndex("origin");
       columnIndex = uCursor1.getColumnIndex("unique");
       columnIndex1 = -1;
       if (columnIndex9 != columnIndex1 && (columnIndex10 != columnIndex1 && columnIndex != columnIndex1)) {
          ec6 uoec61 = new ec6();
          while (true) {
             if (uCursor1.moveToNext()) {
                if (!co5.c("c", uCursor1.getString(columnIndex10))) {
                   continue ;
                }else {
                   str8 = uCursor1.getString(columnIndex9);
                   columnIndex3 = (uCursor1.getInt(columnIndex) == 1)? true: false;
                   co5.l(str8, str2);
                   Cursor uCursor2 = onf2.a0("PRAGMA index_xinfo\(`".append(str8).append(str4).toString());
                   columnIndex8 = uCursor2.getColumnIndex("seqno");
                   columnIndex11 = uCursor2.getColumnIndex("cid");
                   columnIndex4 = uCursor2.getColumnIndex(str2);
                   int columnIndex12 = uCursor2.getColumnIndex("desc");
                   str7 = str2;
                   obj = -1;
                   if (columnIndex8 != obj && (columnIndex11 != obj && (columnIndex4 != obj && columnIndex12 != obj))) {
                      TreeMap treeMap = new TreeMap();
                      i = columnIndex9;
                      TreeMap treeMap1 = new TreeMap();
                      while (uCursor2.moveToNext()) {
                         if (uCursor2.getInt(columnIndex11) < 0) {
                            continue ;
                         }else {
                            int intx = uCursor2.getInt(columnIndex8);
                            i1 = columnIndex10;
                            String str10 = uCursor2.getString(columnIndex4);
                            str9 = (uCursor2.getInt(columnIndex12) > 0)? "DESC": "ASC";
                            co5.l(str10, "columnName");
                            treeMap.put(Integer.valueOf(intx), str10);
                            treeMap1.put(Integer.valueOf(intx), str9);
                            columnIndex10 = i1;
                            str4 = str4;
                            columnIndex12 = columnIndex12;
                            columnIndex = columnIndex;
                         }
                      }
                      i1 = columnIndex10;
                      str9 = str4;
                      i2 = columnIndex;
                      Collection uCollection = treeMap.values();
                      co5.l(uCollection, "columnsMap.values");
                      Collection uCollection1 = treeMap1.values();
                      co5.l(uCollection1, "ordersMap.values");
                      throwable2 = new sz6(str8, columnIndex3, dj0.B0(uCollection), dj0.B0(uCollection1));
                      eb3.d(uCursor2, null);
                      throwable1 = null;
                   }else {
                      i = columnIndex9;
                      i1 = columnIndex10;
                      str9 = str4;
                      i2 = columnIndex;
                      throwable1 = null;
                      eb3.d(uCursor2, throwable1);
                      throwable2 = throwable1;
                   }
                   if (throwable2 == null) {
                      eb3.d(uCursor1, throwable1);
                      uAbstractSet = null;
                      break ;
                   }else {
                      uoec61.add(throwable2);
                      onf2 = p0;
                      str2 = str7;
                      columnIndex9 = i;
                      columnIndex10 = i1;
                      str4 = str9;
                      columnIndex = i2;
                   }
                }
             }else {
                co5.f(uoec61);
                eb3.d(uCursor1, null);
                uAbstractSet = uoec61;
                break ;
             }
          }
       }else {
          throwable1 = null;
          eb3.d(uCursor1, throwable1);
          throwable = throwable1;
       }
       return new tz6(str, oml1, uoec6, throwable);
    }
    public final boolean equals(Object p0){
       tz6 td;
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof tz6) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if ((td = this.d) != null && (p0 = p0.d) != null) {
          b = co5.c(td, p0);
       }
       return b;
    }
    public final int hashCode(){
       return (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31));
    }
    public final String toString(){
       return "TableInfo{name=\'"+this.a+"\', columns="+this.b+", foreignKeys="+this.c+", indices="+this.d+'}';
    }
}
