package p.i83;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;
import java.lang.Enum;

public abstract class i83	// class@001943 from classes.dex
{
    public static final int[] a;

    static {
       int[] ointArray = new int[FormatType.values().length];
       try{
          i83.a = ointArray;
          ointArray[FormatType.FULLSCREEN.ordinal()] = 1;
          try{
             i83.a[FormatType.BANNERS.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
