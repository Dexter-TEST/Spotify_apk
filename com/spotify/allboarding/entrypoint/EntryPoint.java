package com.spotify.allboarding.entrypoint.EntryPoint;
import java.lang.Enum;
import java.lang.String;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.do1;
import android.content.Intent;
import java.lang.Class;
import java.lang.Object;
import p.co5;

public final class EntryPoint extends Enum	// class@000511 from classes.dex
{
    private final boolean canExit;
    private final String endpointPath;
    private final String label;
    private final boolean submitOnBack;
    private final String uriSegment;
    private static final EntryPoint[] $VALUES;
    public static final do1 Companion;
    public static final EntryPoint DEBUG_ARTIST;
    public static final EntryPoint DEBUG_LANGUAGE_ARTIST_ONBOARDING;
    public static final EntryPoint DEBUG_LANGUAGE_FILTER;
    public static final EntryPoint DEBUG_LANGUAGE_ONBOARDING;
    public static final EntryPoint DEBUG_OPTIN_SHOW;
    public static final EntryPoint DEBUG_SHOW;
    public static final EntryPoint DEBUG_SKIP;
    public static final EntryPoint DEFAULT;
    public static final EntryPoint DELAYED_PO_BANNER;
    private static final String ENTRY_POINT_ARG;
    public static final EntryPoint HOME_ARTIST_HEADER;
    public static final EntryPoint HOME_AUDIOBOOKS_BOTTOM_SHEET;
    public static final EntryPoint HOME_AUDIOBOOKS_SUB_FEED;
    public static final EntryPoint HOME_AUDIOBOOKS_SUB_FEED_REENTRY;
    public static final EntryPoint HOME_PODCASTS;
    public static final EntryPoint LIBRARY_ADD_ARTISTS;
    public static final EntryPoint LIBRARY_ADD_PODCASTS;
    public static final EntryPoint SIGNUP;

    private static final EntryPoint[] $values(){
       EntryPoint[] uEntryPointA = new EntryPoint[17];
       uEntryPointA[0] = EntryPoint.SIGNUP;
       uEntryPointA[1] = EntryPoint.HOME_ARTIST_HEADER;
       uEntryPointA[2] = EntryPoint.HOME_PODCASTS;
       uEntryPointA[3] = EntryPoint.LIBRARY_ADD_ARTISTS;
       uEntryPointA[4] = EntryPoint.LIBRARY_ADD_PODCASTS;
       uEntryPointA[5] = EntryPoint.DELAYED_PO_BANNER;
       uEntryPointA[6] = EntryPoint.HOME_AUDIOBOOKS_SUB_FEED;
       uEntryPointA[7] = EntryPoint.HOME_AUDIOBOOKS_SUB_FEED_REENTRY;
       uEntryPointA[8] = EntryPoint.HOME_AUDIOBOOKS_BOTTOM_SHEET;
       uEntryPointA[9] = EntryPoint.DEFAULT;
       uEntryPointA[10] = EntryPoint.DEBUG_LANGUAGE_FILTER;
       uEntryPointA[11] = EntryPoint.DEBUG_ARTIST;
       uEntryPointA[12] = EntryPoint.DEBUG_LANGUAGE_ONBOARDING;
       uEntryPointA[13] = EntryPoint.DEBUG_LANGUAGE_ARTIST_ONBOARDING;
       uEntryPointA[14] = EntryPoint.DEBUG_OPTIN_SHOW;
       uEntryPointA[15] = EntryPoint.DEBUG_SHOW;
       uEntryPointA[16] = EntryPoint.DEBUG_SKIP;
       return uEntryPointA;
    }
    static {
       EntryPoint v10 = new EntryPoint("SIGNUP", 0, "SIGNUP", "signup", false, false, null, 28, null);
       EntryPoint.SIGNUP = v10;
       v10 = new EntryPoint("HOME_ARTIST_HEADER", 1, "HOME_ARTIST_HEADER", "home-artist-header", false, false, null, 28, null);
       EntryPoint.HOME_ARTIST_HEADER = v10;
       v10 = new EntryPoint("HOME_PODCASTS", 2, "HOME_PODCASTS", "home-podcasts", true, true, null, 16, null);
       EntryPoint.HOME_PODCASTS = v10;
       v10 = new EntryPoint("LIBRARY_ADD_ARTISTS", 3, "LIBRARY_ADD_ARTISTS", "library-add-artists", true, true, null, 16, null);
       EntryPoint.LIBRARY_ADD_ARTISTS = v10;
       v10 = new EntryPoint("LIBRARY_ADD_PODCASTS", 4, "LIBRARY_ADD_PODCASTS", "library-add-podcasts", true, true, null, 16, null);
       EntryPoint.LIBRARY_ADD_PODCASTS = v10;
       v10 = new EntryPoint("DELAYED_PO_BANNER", 5, "DELAYED_PO_BANNER", "delayed-po-banner", true, true, null, 16, null);
       EntryPoint.DELAYED_PO_BANNER = v10;
       v10 = new EntryPoint("HOME_AUDIOBOOKS_SUB_FEED", 6, "HOME_AUDIOBOOKS_SUB_FEED", "home-audiobooks-sub-feed", true, false, null, 24, null);
       EntryPoint.HOME_AUDIOBOOKS_SUB_FEED = v10;
       v10 = new EntryPoint("HOME_AUDIOBOOKS_SUB_FEED_REENTRY", 7, "HOME_AUDIOBOOKS_SUB_FEED_REENTRY", "home-audiobooks-sub-feed-reentry", true, false, null, 24, null);
       EntryPoint.HOME_AUDIOBOOKS_SUB_FEED_REENTRY = v10;
       v10 = new EntryPoint("HOME_AUDIOBOOKS_BOTTOM_SHEET", 8, "HOME_AUDIOBOOKS_BOTTOM_SHEET", "home-audiobooks-bottom-sheet", true, false, 0, 24, null);
       EntryPoint.HOME_AUDIOBOOKS_BOTTOM_SHEET = v10;
       v10 = new EntryPoint("DEFAULT", 9, "DEFAULT", "default", false, false, null, 28, null);
       EntryPoint.DEFAULT = v10;
       EntryPoint uEntryPoint = new EntryPoint("DEBUG_LANGUAGE_FILTER", 10, "DEFAULT", "debug-language-filter", false, false, "ARTIST_FILTER", 12, null);
       EntryPoint.DEBUG_LANGUAGE_FILTER = v10;
       v10 = new EntryPoint("DEBUG_ARTIST", 11, "DEFAULT", "debug-artist", false, false, null, 28, null);
       EntryPoint.DEBUG_ARTIST = v10;
       v10 = new EntryPoint("DEBUG_LANGUAGE_ONBOARDING", 12, "DEFAULT", "debug-language", false, false, "language", 12, null);
       EntryPoint.DEBUG_LANGUAGE_ONBOARDING = v10;
       v10 = new EntryPoint("DEBUG_LANGUAGE_ARTIST_ONBOARDING", 13, "DEFAULT", "debug-language-artist", false, false, "language_artist", 12, null);
       EntryPoint.DEBUG_LANGUAGE_ARTIST_ONBOARDING = v10;
       v10 = new EntryPoint("DEBUG_OPTIN_SHOW", 14, "DEFAULT", "debug-opt-in-po", false, false, "artist_optin_show", 12, null);
       EntryPoint.DEBUG_OPTIN_SHOW = v10;
       v10 = new EntryPoint("DEBUG_SHOW", 15, "DEFAULT", "debug-show", false, false, "show", 12, null);
       EntryPoint.DEBUG_SHOW = v10;
       v10 = new EntryPoint("DEBUG_SKIP", 16, "DEFAULT", "debug-skip", false, false, "skip", 12, null);
       EntryPoint.DEBUG_SKIP = v10;
       EntryPoint.$VALUES = EntryPoint.$values();
       EntryPoint.Companion = new do1();
    }
    private void EntryPoint(String p0,int p1,String p2,String p3,boolean p4,boolean p5,String p6){
       super(p0, p1);
       this.label = p2;
       this.uriSegment = p3;
       this.canExit = p4;
       this.submitOnBack = p5;
       this.endpointPath = p6;
    }
    public void EntryPoint(String p0,int p1,String p2,String p3,boolean p4,boolean p5,String p6,int p7,DefaultConstructorMarker p8){
       boolean b = ((p7 & 0x04))? false: p4;
       boolean b1 = ((p7 & 0x08))? false: p5;
       String str = ((p7 & 0x10))? "": p6;
       super(p0, p1, p2, p3, b, b1, str);
       return;
    }
    public static final EntryPoint getEntryPointFromIntent(Intent p0){
       EntryPoint.Companion.getClass();
       return do1.a(p0);
    }
    public static final Intent putEntryPointToIntent(Intent p0,EntryPoint p1){
       EntryPoint.Companion.getClass();
       co5.o(p0, "intent");
       co5.o(p1, "entryPoint");
       p0 = p0.putExtra("entry-point", p1.ordinal());
       co5.l(p0, "intent.putExtra\(ENTRY_PO…_ARG, entryPoint.ordinal\)");
       return p0;
    }
    public static EntryPoint valueOf(String p0){
       return Enum.valueOf(EntryPoint.class, p0);
    }
    public static EntryPoint[] values(){
       return EntryPoint.$VALUES.clone();
    }
    public final boolean getCanExit(){
       return this.canExit;
    }
    public final String getEndpointPath(){
       return this.endpointPath;
    }
    public final String getLabel(){
       return this.label;
    }
    public final boolean getSubmitOnBack(){
       return this.submitOnBack;
    }
    public final String getUriSegment(){
       return this.uriSegment;
    }
}
