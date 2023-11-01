package p.tf2;
import p.uw6;
import p.jn5;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteProgram;

public final class tf2 extends jn5 implements uw6	// class@00275c from classes.dex
{
    public final SQLiteStatement c;

    public void tf2(SQLiteStatement p0){
       super(p0);
       this.c = p0;
    }
    public final long Z(){
       return this.c.executeInsert();
    }
    public final int u(){
       return this.c.executeUpdateDelete();
    }
}
