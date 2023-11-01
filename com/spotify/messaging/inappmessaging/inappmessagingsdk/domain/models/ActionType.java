package com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.ActionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ActionType extends Enum	// class@000a28 from classes.dex
{
    private static final ActionType[] $VALUES;
    public static final ActionType ADD_TO_PLAYLIST;
    public static final ActionType BAN_ENTITY;
    public static final ActionType CREATE_PLAYLIST;
    public static final ActionType DISMISS;
    public static final ActionType EMAIL_VERIFICATION;
    public static final ActionType ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES;
    public static final ActionType ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES_V2;
    public static final ActionType EXTERNAL_URL;
    public static final ActionType IAP;
    public static final ActionType INTERNAL_WEBVIEW;
    public static final ActionType OPT_IN;
    public static final ActionType OPT_OUT_BRAND_LIFT;
    public static final ActionType PDP_URL;
    public static final ActionType PRESENT_SSO_EMAIL_COLLECTION;
    public static final ActionType SAVE_AND_NAVIGATE;
    public static final ActionType SAVE_ENTITY;
    public static final ActionType SELECT_OPTION;
    public static final ActionType SET_NOTIFICATION_PREFERENCE;
    public static final ActionType SHARE_CONTENT;
    public static final ActionType SHARE_DYNAMIC_CONTENT;
    public static final ActionType SHARE_ENTITY;
    public static final ActionType START_PLAYBACK;
    public static final ActionType TOGGLE_NOTIFICATION_PREFERENCE;
    public static final ActionType TOGGLE_SAVE_ENTITY;
    public static final ActionType TRIAL;
    public static final ActionType URL;
    public static final ActionType URL_V2;

    private static final ActionType[] $values(){
       ActionType[] uActionTypeA = new ActionType[27];
       uActionTypeA[0] = ActionType.URL;
       uActionTypeA[1] = ActionType.PDP_URL;
       uActionTypeA[2] = ActionType.INTERNAL_WEBVIEW;
       uActionTypeA[3] = ActionType.EXTERNAL_URL;
       uActionTypeA[4] = ActionType.IAP;
       uActionTypeA[5] = ActionType.DISMISS;
       uActionTypeA[6] = ActionType.TRIAL;
       uActionTypeA[7] = ActionType.EMAIL_VERIFICATION;
       uActionTypeA[8] = ActionType.ADD_TO_PLAYLIST;
       uActionTypeA[9] = ActionType.CREATE_PLAYLIST;
       uActionTypeA[10] = ActionType.BAN_ENTITY;
       uActionTypeA[11] = ActionType.SAVE_AND_NAVIGATE;
       uActionTypeA[12] = ActionType.SAVE_ENTITY;
       uActionTypeA[13] = ActionType.START_PLAYBACK;
       uActionTypeA[14] = ActionType.SELECT_OPTION;
       uActionTypeA[15] = ActionType.SET_NOTIFICATION_PREFERENCE;
       uActionTypeA[16] = ActionType.TOGGLE_NOTIFICATION_PREFERENCE;
       uActionTypeA[17] = ActionType.ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES;
       uActionTypeA[18] = ActionType.ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES_V2;
       uActionTypeA[19] = ActionType.TOGGLE_SAVE_ENTITY;
       uActionTypeA[20] = ActionType.URL_V2;
       uActionTypeA[21] = ActionType.SHARE_CONTENT;
       uActionTypeA[22] = ActionType.OPT_OUT_BRAND_LIFT;
       uActionTypeA[23] = ActionType.SHARE_ENTITY;
       uActionTypeA[24] = ActionType.SHARE_DYNAMIC_CONTENT;
       uActionTypeA[25] = ActionType.PRESENT_SSO_EMAIL_COLLECTION;
       uActionTypeA[26] = ActionType.OPT_IN;
       return uActionTypeA;
    }
    static {
       ActionType.URL = new ActionType("URL", 0);
       ActionType.PDP_URL = new ActionType("PDP_URL", 1);
       ActionType.INTERNAL_WEBVIEW = new ActionType("INTERNAL_WEBVIEW", 2);
       ActionType.EXTERNAL_URL = new ActionType("EXTERNAL_URL", 3);
       ActionType.IAP = new ActionType("IAP", 4);
       ActionType.DISMISS = new ActionType("DISMISS", 5);
       ActionType.TRIAL = new ActionType("TRIAL", 6);
       ActionType.EMAIL_VERIFICATION = new ActionType("EMAIL_VERIFICATION", 7);
       ActionType.ADD_TO_PLAYLIST = new ActionType("ADD_TO_PLAYLIST", 8);
       ActionType.CREATE_PLAYLIST = new ActionType("CREATE_PLAYLIST", 9);
       ActionType.BAN_ENTITY = new ActionType("BAN_ENTITY", 10);
       ActionType.SAVE_AND_NAVIGATE = new ActionType("SAVE_AND_NAVIGATE", 11);
       ActionType.SAVE_ENTITY = new ActionType("SAVE_ENTITY", 12);
       ActionType.START_PLAYBACK = new ActionType("START_PLAYBACK", 13);
       ActionType.SELECT_OPTION = new ActionType("SELECT_OPTION", 14);
       ActionType.SET_NOTIFICATION_PREFERENCE = new ActionType("SET_NOTIFICATION_PREFERENCE", 15);
       ActionType.TOGGLE_NOTIFICATION_PREFERENCE = new ActionType("TOGGLE_NOTIFICATION_PREFERENCE", 16);
       ActionType.ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES = new ActionType("ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES", 17);
       ActionType.ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES_V2 = new ActionType("ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES_V2", 18);
       ActionType.TOGGLE_SAVE_ENTITY = new ActionType("TOGGLE_SAVE_ENTITY", 19);
       ActionType.URL_V2 = new ActionType("URL_V2", 20);
       ActionType.SHARE_CONTENT = new ActionType("SHARE_CONTENT", 21);
       ActionType.OPT_OUT_BRAND_LIFT = new ActionType("OPT_OUT_BRAND_LIFT", 22);
       ActionType.SHARE_ENTITY = new ActionType("SHARE_ENTITY", 23);
       ActionType.SHARE_DYNAMIC_CONTENT = new ActionType("SHARE_DYNAMIC_CONTENT", 24);
       ActionType.PRESENT_SSO_EMAIL_COLLECTION = new ActionType("PRESENT_SSO_EMAIL_COLLECTION", 25);
       ActionType.OPT_IN = new ActionType("OPT_IN", 26);
       ActionType.$VALUES = ActionType.$values();
    }
    private void ActionType(String p0,int p1){
       super(p0, p1);
    }
    public static ActionType valueOf(String p0){
       return Enum.valueOf(ActionType.class, p0);
    }
    public static ActionType[] values(){
       return ActionType.$VALUES.clone();
    }
}
