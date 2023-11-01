package p.u;
import java.util.concurrent.atomic.AtomicBoolean;
import p.ej4;
import java.io.File;
import p.b17;
import p.af7;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ya3;
import java.util.Iterator;
import p.mb2;
import java.util.List;
import java.util.Comparator;
import p.dj0;
import org.json.JSONArray;
import java.lang.Math;
import p.ib3;
import p.eb3;
import p.gb3;
import p.hb3;
import p.t;
import p.om2;

public abstract class u	// class@00286e from classes.dex
{
    public static final AtomicBoolean a;

    static {
       u.a = new AtomicBoolean(false);
    }
    public static final void a(){
       File uFile;
       File[] uFileArray;
       Iterator obj;
       if (ej4.X()) {
          return;
       }
       if ((uFile = b17.n()) == null) {
          uFileArray = new File[0];
       }else if((uFileArray = uFile.listFiles(new af7(3))) == null){
          uFileArray = new File[0];
       }
       ArrayList uArrayList = new ArrayList(uFileArray.length);
       int len = uFileArray.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = uFileArray[i];
          co5.o(oobject, "file");
          uArrayList.add(new ya3(oobject));
       }
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          if (obj.b()) {
             uArrayList1.add(obj);
          }
       }
       List list = dj0.x0(uArrayList1, new mb2(1));
       JSONArray jSONArray = new JSONArray();
       obj = eb3.J(0, Math.min(list.size(), 5)).iterator();
       while (obj.c != null) {
          jSONArray.put(list.get(obj.nextInt()));
       }
       b17.z("anr_reports", jSONArray, new t(0, list));
       return;
    }
}
