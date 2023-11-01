package p.oe4;
import p.kj3;
import java.lang.Enum;

public abstract class oe4	// class@002104 from classes.dex
{
    public static final int[] a;

    static {
       int[] ointArray = new int[kj3.values().length];
       try{
          oe4.a = ointArray;
          ointArray[kj3.ON_RESUME.ordinal()] = 1;
          try{
             oe4.a[kj3.ON_PAUSE.ordinal()] = 2;
             try{
                oe4.a[kj3.ON_DESTROY.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
