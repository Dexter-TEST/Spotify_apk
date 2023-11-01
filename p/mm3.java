package p.mm3;
import p.kj3;
import java.lang.Enum;

public abstract class mm3	// class@001ec2 from classes.dex
{
    public static final int[] a;

    static {
       int[] ointArray = new int[kj3.values().length];
       try{
          mm3.a = ointArray;
          ointArray[kj3.ON_CREATE.ordinal()] = 1;
          try{
             mm3.a[kj3.ON_START.ordinal()] = 2;
             try{
                mm3.a[kj3.ON_STOP.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
