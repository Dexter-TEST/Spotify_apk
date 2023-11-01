package p.of2;
import android.database.DatabaseErrorHandler;
import p.kd3;
import p.b7;
import java.lang.Object;
import android.database.sqlite.SQLiteDatabase;
import java.lang.String;
import p.co5;
import p.rf2;
import p.nf2;
import p.qf2;
import java.lang.StringBuilder;
import android.util.Log;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import android.util.Pair;

public final class of2 implements DatabaseErrorHandler	// class@00210b from classes.dex
{
    public final kd3 a;
    public final b7 b;

    public void of2(kd3 p0,b7 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onCorruption(SQLiteDatabase p0){
       String str;
       try{
          co5.o(this.a, "$callback");
          of2 tb = this.b;
          co5.o(tb, "$dbRef");
          co5.l(p0, "dbObj");
          nf2 onf2 = qf2.c(tb, p0);
          Log.e("SupportSQLite", "Corruption reported by sqlite on database: "+onf2+".path");
          if (!onf2.isOpen()) {
             if ((str = onf2.d()) != null) {
                kd3.c(str);
             }
          }else {
             int i = 0;
             List list = onf2.n();
             try{
                onf2.close();
             }catch(java.io.IOException e0){
             }
             if (list != null) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   Pair second = iterator.next().second;
                   co5.l(second, e0);
                   kd3.c(second);
                }
             }else if((str = onf2.d()) != null){
                kd3.c(str);
             }
          }
       }catch(android.database.sqlite.SQLiteException e0){
       }
       return;
    }
}
