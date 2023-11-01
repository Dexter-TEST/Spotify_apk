package p.xu1;
import p.kj3;
import java.lang.Enum;

public abstract class xu1	// class@002cea from classes.dex
{
    public static final int[] a;

    static {
       int[] ointArray = new int[kj3.values().length];
       try{
          xu1.a = ointArray;
          ointArray[kj3.ON_START.ordinal()] = 1;
          try{
             xu1.a[kj3.ON_STOP.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
