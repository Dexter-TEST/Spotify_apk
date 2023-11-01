package p.w55;
import p.u55;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class w55 extends Enum implements u55	// class@002ace from classes.dex
{
    public final String a;
    public static final w55 b;
    public static final w55 c;
    public static final w55 t;
    public static final w55 v;
    public static final w55 w;
    public static final w55[] x;

    static {
    }
    public void w55(String p0,int p1,String p2){
       super(p0, p1);
       this.a = p2;
    }
    public static w55 valueOf(String p0){
       return Enum.valueOf(w55.class, p0);
    }
    public static w55[] values(){
       return w55.x.clone();
    }
    public final String toString(){
       return en6.p("{pageIdentifier=\'", this.a, "\'}");
    }
}
