package p.os6;
import java.util.concurrent.TimeUnit;
import java.lang.Enum;

public abstract class os6	// class@002181 from classes.dex
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TimeUnit.values().length];
       try{
          os6.a = ointArray;
          ointArray[TimeUnit.NANOSECONDS.ordinal()] = 1;
          try{
             os6.a[TimeUnit.MICROSECONDS.ordinal()] = 2;
             try{
                os6.a[TimeUnit.MILLISECONDS.ordinal()] = 3;
                try{
                   os6.a[TimeUnit.SECONDS.ordinal()] = 4;
                   try{
                      os6.a[TimeUnit.MINUTES.ordinal()] = 5;
                      try{
                         os6.a[TimeUnit.HOURS.ordinal()] = 6;
                         try{
                            os6.a[TimeUnit.DAYS.ordinal()] = 7;
                         }catch(java.lang.NoSuchFieldError e0){
                         }
                      }catch(java.lang.NoSuchFieldError e0){
                      }
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
