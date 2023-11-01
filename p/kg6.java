package p.kg6;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class kg6 extends Enum	// class@001c0c from classes.dex
{
    public final int a;
    public static final kg6 b;
    public static final kg6[] c;

    static {
       kg6 okg6 = new kg6("STATUS_UNKNOWN_ERROR", 1, 5);
       kg6.b = okg6;
       kg6[] okg6Array = new kg6[10];
       okg6Array[0] = new kg6("STATUS_OK", 0, 1);
       okg6Array[1] = okg6;
       okg6Array[2] = new kg6("STATUS_ALREADY_REGISTERED", 2, 10);
       okg6Array[3] = new kg6("STATUS_EMAIL_ALREADY_EXISTS", 3, 20);
       okg6Array[4] = new kg6("STATUS_INVALID_FORM_DATA", 4, 100);
       okg6Array[5] = new kg6("STATUS_INVALID_COUNTRY", 5, 120);
       okg6Array[6] = new kg6("STATUS_INVALID_EMAIL", 6, 130);
       okg6Array[7] = new kg6("STATUS_VALIDATE_TOO_YOUNG", 7, 200);
       okg6Array[8] = new kg6("STATUS_REQUEST_FROM_DATACENTER", 8, 320);
       okg6Array[9] = new kg6("STATUS_NO_CONNECTION", 9, -1);
       kg6.c = okg6Array;
    }
    public void kg6(String p0,int p1,int p2){
       this.a = p2;
    }
    public static kg6 valueOf(String p0){
       return Enum.valueOf(kg6.class, p0);
    }
    public static kg6[] values(){
       return kg6.c.clone();
    }
}
