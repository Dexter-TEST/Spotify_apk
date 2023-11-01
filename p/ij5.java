package p.ij5;
import p.ni5;
import p.to;

public abstract class ij5	// class@0019a7 from classes.dex
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[ni5.values().length];
       try{
          int i = 1;
          ointArray[0] = i;
          int i1 = 2;
          try{
             e0[i] = i1;
             ij5.a = e0;
             int len = to.values().length;
             try{
                ointArray = new int[len];
                ointArray[0] = i;
                try{
                   e0[i] = i1;
                   ij5.b = e0;
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
