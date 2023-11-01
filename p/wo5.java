package p.wo5;
import android.media.Rating;

public abstract class wo5	// class@002b79 from classes.dex
{

    public static float a(Rating p0){
       return p0.getPercentRating();
    }
    public static int b(Rating p0){
       return p0.getRatingStyle();
    }
    public static float c(Rating p0){
       return p0.getStarRating();
    }
    public static boolean d(Rating p0){
       return p0.hasHeart();
    }
    public static boolean e(Rating p0){
       return p0.isRated();
    }
    public static boolean f(Rating p0){
       return p0.isThumbUp();
    }
    public static Rating g(boolean p0){
       return Rating.newHeartRating(p0);
    }
    public static Rating h(float p0){
       return Rating.newPercentageRating(p0);
    }
    public static Rating i(int p0,float p1){
       return Rating.newStarRating(p0, p1);
    }
    public static Rating j(boolean p0){
       return Rating.newThumbRating(p0);
    }
    public static Rating k(int p0){
       return Rating.newUnratedRating(p0);
    }
}
