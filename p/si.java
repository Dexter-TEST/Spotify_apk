package p.si;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class si extends Enum	// class@002639 from classes.dex
{
    public final String a;
    public static final si[] b;

    static {
       si[] osiArray = new si[]{new si("OPTIONS", 0, "data_processing_options"),new si("COUNTRY", 1, "data_processing_options_country"),new si("STATE", 2, "data_processing_options_state")};
       si.b = osiArray;
    }
    public void si(String p0,int p1,String p2){
       this.a = p2;
    }
    public static si valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(si.class, p0);
    }
    public static si[] values(){
       return Arrays.copyOf(si.b, 3);
    }
}
