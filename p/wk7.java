package p.wk7;
import p.vk7;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class wk7 extends Enum implements vk7	// class@002b57 from classes.dex
{
    public final String a;
    public static final wk7 A;
    public static final wk7 B;
    public static final wk7 C;
    public static final wk7 D;
    public static final wk7 E;
    public static final wk7 F;
    public static final wk7 G;
    public static final wk7 H;
    public static final wk7 I;
    public static final wk7 J;
    public static final wk7 K;
    public static final wk7 L;
    public static final wk7 M;
    public static final wk7 N;
    public static final wk7 O;
    public static final wk7 P;
    public static final wk7 Q;
    public static final wk7 R;
    public static final wk7 S;
    public static final wk7[] T;
    public static final wk7 b;
    public static final wk7 c;
    public static final wk7 t;
    public static final wk7 v;
    public static final wk7 w;
    public static final wk7 x;
    public static final wk7 y;
    public static final wk7 z;

    static {
       wk7 owk7 = new wk7("ADD_TO_OR_CREATE_PLAYLIST", 0, "spotify:add-to-or-create-playlist");
       wk7.b = owk7;
       wk7 owk71 = new wk7("BROWSE", 3, "spotify:find");
       wk7.c = owk71;
       wk7 owk72 = new wk7("CREATE_PLAYLIST", 4, "spotify:create-playlist");
       wk7.t = owk72;
       wk7 owk73 = new wk7("DOWNLOADED_SONGS", 5, "spotify:favorites:downloaded-episodes");
       wk7.v = owk73;
       wk7 owk74 = new wk7();
       wk7.w = owk74;
       wk7 owk75 = new wk7("FAVORITES_ALBUMS", 7, "spotify:favorites:albums");
       wk7.x = owk75;
       wk7 owk76 = new wk7("FAVORITES_ARTISTS", 8, "spotify:favorites:artists");
       wk7.y = owk76;
       wk7 owk77 = new wk7("FAVORITES_PLAYLISTS", 9, "spotify:favorites:playlists");
       wk7.z = owk77;
       wk7 owk78 = new wk7("FAVORITES_SHOWS", 10, "spotify:favorites:shows");
       wk7.A = owk78;
       wk7 owk79 = new wk7("HOME", 11, "spotify:home");
       wk7.B = owk79;
       wk7 owk710 = new wk7("LOGOUT_DIALOG", 14, "spotify:logout-dialog");
       wk7.C = owk710;
       wk7 owk711 = owk710;
       wk7 owk712 = new wk7("PREMIUM", 17, "spotify:premium");
       wk7.D = owk712;
       wk7 owk713 = owk712;
       owk710 = new wk7("SEARCH", 18, "spotify:search");
       wk7.E = owk710;
       wk7 owk714 = owk710;
       owk712 = new wk7("SEARCH_SEE_MORE", 19, "spotify:search-see-more");
       wk7.F = owk712;
       wk7 owk715 = owk712;
       owk710 = new wk7("SETTINGS", 20, "spotify:settings");
       wk7.G = owk710;
       wk7 owk716 = owk710;
       owk712 = new wk7("SETTINGS_ABOUT", 21, "spotify:settings:about");
       wk7.H = owk712;
       wk7 owk717 = owk712;
       owk710 = new wk7("SETTINGS_ACCOUNT", 22, "spotify:settings:account");
       wk7.I = owk710;
       wk7 owk718 = owk710;
       owk712 = new wk7("SETTINGS_AUDIO", 23, "spotify:settings:audio");
       wk7.J = owk712;
       wk7 owk719 = owk712;
       owk710 = new wk7("SETTINGS_CELLULAR", 24, "spotify:settings:cellular");
       wk7.K = owk710;
       wk7 owk720 = owk710;
       owk712 = new wk7("SETTINGS_EXPLICIT_CONTENT", 25, "spotify:settings:explicit-content");
       wk7.L = owk712;
       wk7 owk721 = owk712;
       owk710 = new wk7("SETTINGS_OFFLINE", 26, "spotify:settings:offline");
       wk7.M = owk710;
       wk7 owk722 = owk710;
       owk712 = new wk7("SETTINGS_OFFLINE_MODE", 27, "spotify:settings:offline-mode");
       wk7.N = owk712;
       wk7 owk723 = owk712;
       owk710 = new wk7("SETTINGS_PRIVATE", 28, "spotify:settings:private");
       wk7.O = owk710;
       wk7 owk724 = owk710;
       owk712 = new wk7("SETTINGS_STORAGE", 29, "spotify:settings:storage");
       wk7.P = owk712;
       wk7 owk725 = owk712;
       owk710 = new wk7("SETTINGS_STORAGE_LOCATION", 30, "spotify:settings:storage-location");
       wk7.Q = owk710;
       wk7 owk726 = owk710;
       owk710 = new wk7("SETTINGS_STORAGE_MISSING", 32, "spotify:settings:storage-missing");
       wk7.R = owk710;
       wk7 owk727 = owk710;
       owk710 = new wk7("UNDEFINED", 38, "spotify:undefined");
       wk7.S = owk710;
       wk7 owk728 = owk710;
       wk7[] owk7Array = new wk7[40];
       owk7Array[0] = owk7;
       owk7Array[1] = new wk7("APP_RATER", 1, "spotify:app-rater");
       owk7Array[2] = new wk7("BLOCKING_DIALOG", 2, "spotify:blocking-dialog");
       owk7Array[3] = owk71;
       owk7Array[4] = owk72;
       owk7Array[5] = owk73;
       owk7Array[6] = owk74;
       owk7Array[7] = owk75;
       owk7Array[8] = owk76;
       owk7Array[9] = owk77;
       owk7Array[10] = owk78;
       owk7Array[11] = owk79;
       owk7Array[12] = new wk7("LANGUAGE_ONBOARDING", 12, "spotify:language-onboarding");
       owk7Array[13] = new wk7("LOCAL_HUBS", 13, "spotify:local-hubs");
       owk7Array[14] = owk711;
       owk7Array[15] = new wk7("NAVIGATION_BAR", 15, "spotify:navigation-bar");
       owk7Array[16] = new wk7("NOW_PLAYING_VIEW", 16, "spotify:now-playing-view");
       owk7Array[17] = owk713;
       owk7Array[18] = owk714;
       owk7Array[19] = owk715;
       owk7Array[20] = owk716;
       owk7Array[21] = owk717;
       owk7Array[22] = owk718;
       owk7Array[23] = owk719;
       owk7Array[24] = owk720;
       owk7Array[25] = owk721;
       owk7Array[26] = owk722;
       owk7Array[27] = owk723;
       owk7Array[28] = owk724;
       owk7Array[29] = owk725;
       owk7Array[30] = owk726;
       owk7Array[31] = new wk7("SETTINGS_STORAGE_LOCATION_CONFIRM_DIALOG", 31, "spotify:settings:storage-location:confirm-dialog");
       owk7Array[32] = owk727;
       owk7Array[33] = new wk7("TASTE_ONBOARDING_ARTIST_SEARCH", 33, "spotify:taste-onboarding:artist-search");
       owk7Array[34] = new wk7("TASTE_ONBOARDING_SKIP_DIALOG", 34, "spotify:taste-onboarding:skip-dialog");
       owk7Array[35] = new wk7("TASTE_ONBOARDING_TASTE_PICKER", 35, "spotify:taste-onboarding:taste-picker");
       owk7Array[36] = new wk7("TASTE_ONBOARDING_TASTE_UPLOAD", 36, "spotify:taste-onboarding:taste-upload");
       owk7Array[37] = new wk7("TRIAL_OFFBOARDING", 37, "spotify:sevenday-trial:offboarding-dialog");
       owk7Array[38] = owk728;
       owk7Array[39] = new wk7("WELCOME", 39, "spotify:welcome");
       wk7.T = owk7Array;
    }
    public void wk7(){
       super("FAVORITES", 6);
       this.a = "spotify:favorites";
    }
    public void wk7(String p0,int p1,String p2){
       super(p0, p1);
       this.a = p2;
    }
    public static wk7 valueOf(String p0){
       return Enum.valueOf(wk7.class, p0);
    }
    public static wk7[] values(){
       return wk7.T.clone();
    }
    public final String a(){
       return this.a;
    }
}
