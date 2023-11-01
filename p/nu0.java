package p.nu0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class nu0 extends Enum	// class@00204b from classes.dex
{
    public final String a;
    public static final nu0 A;
    public static final nu0 B;
    public static final nu0 C;
    public static final nu0 D;
    public static final nu0 E;
    public static final nu0 F;
    public static final nu0[] G;
    public static final nu0 b;
    public static final nu0 c;
    public static final nu0 t;
    public static final nu0 v;
    public static final nu0 w;
    public static final nu0 x;
    public static final nu0 y;
    public static final nu0 z;

    static {
       nu0 onu0 = new nu0("UNLOCKED_ACHIEVEMENT", 0, "AchievementUnlocked");
       nu0.b = onu0;
       nu0 onu01 = new nu0("ACTIVATED_APP", 1, "ActivateApp");
       nu0.c = onu01;
       nu0 onu02 = new nu0("ADDED_PAYMENT_INFO", 2, "AddPaymentInfo");
       nu0.t = onu02;
       nu0 onu03 = new nu0("ADDED_TO_CART", 3, "AddToCart");
       nu0.v = onu03;
       nu0 onu04 = new nu0("ADDED_TO_WISHLIST", 4, "AddToWishlist");
       nu0.w = onu04;
       nu0 onu05 = new nu0("COMPLETED_REGISTRATION", 5, "CompleteRegistration");
       nu0.x = onu05;
       nu0 onu06 = new nu0("VIEWED_CONTENT", 6, "ViewContent");
       nu0.y = onu06;
       nu0 onu07 = new nu0("INITIATED_CHECKOUT", 7, "InitiateCheckout");
       nu0.z = onu07;
       nu0 onu08 = new nu0("ACHIEVED_LEVEL", 8, "LevelAchieved");
       nu0.A = onu08;
       nu0 onu09 = new nu0("PURCHASED", 9, "Purchase");
       nu0.B = onu09;
       nu0 onu010 = new nu0("RATED", 10, "Rate");
       nu0.C = onu010;
       nu0 onu011 = new nu0("SEARCHED", 11, "Search");
       nu0.D = onu011;
       nu0 onu012 = new nu0("SPENT_CREDITS", 12, "SpentCredits");
       nu0.E = onu012;
       nu0 onu013 = onu012;
       nu0 onu014 = new nu0("COMPLETED_TUTORIAL", 13, "TutorialCompletion");
       nu0.F = onu014;
       nu0[] onu0Array = new nu0[14];
       onu0Array[0] = onu0;
       onu0Array[1] = onu01;
       onu0Array[2] = onu02;
       onu0Array[3] = onu03;
       onu0Array[4] = onu04;
       onu0Array[5] = onu05;
       onu0Array[6] = onu06;
       onu0Array[7] = onu07;
       onu0Array[8] = onu08;
       onu0Array[9] = onu09;
       onu0Array[10] = onu010;
       onu0Array[11] = onu011;
       onu0Array[12] = onu013;
       onu0Array[13] = onu014;
       nu0.G = onu0Array;
    }
    public void nu0(String p0,int p1,String p2){
       this.a = p2;
    }
    public static nu0 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(nu0.class, p0);
    }
    public static nu0[] values(){
       return Arrays.copyOf(nu0.G, 14);
    }
}
