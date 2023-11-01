package p.cp1;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class cp1 extends Enum implements tb3	// class@00124e from classes.dex
{
    public final int a;
    public static final cp1 A;
    public static final cp1 B;
    public static final cp1 C;
    public static final cp1 D;
    public static final cp1 E;
    public static final cp1 F;
    public static final cp1 G;
    public static final cp1 H;
    public static final cp1 I;
    public static final cp1 J;
    public static final cp1 K;
    public static final cp1 L;
    public static final cp1 M;
    public static final cp1 N;
    public static final cp1 O;
    public static final cp1 P;
    public static final cp1 Q;
    public static final cp1 R;
    public static final cp1 S;
    public static final cp1 T;
    public static final cp1 U;
    public static final cp1 V;
    public static final cp1 W;
    public static final cp1 X;
    public static final cp1 Y;
    public static final cp1 Z;
    public static final cp1 a0;
    public static final cp1 b;
    public static final cp1 b0;
    public static final cp1 c;
    public static final cp1 c0;
    public static final cp1 d0;
    public static final cp1 e0;
    public static final cp1 f0;
    public static final cp1 g0;
    public static final cp1 h0;
    public static final cp1 i0;
    public static final cp1[] j0;
    public static final cp1 t;
    public static final cp1 v;
    public static final cp1 w;
    public static final cp1 x;
    public static final cp1 y;
    public static final cp1 z;

    static {
       cp1 uocp1 = new cp1("SUCCESS", 0, 0);
       cp1.b = uocp1;
       cp1 uocp11 = new cp1("PLAYBACK_STUCK", 1, 1);
       cp1.c = uocp11;
       cp1 uocp12 = new cp1("PLAYBACK_ERROR", 2, 2);
       cp1.t = uocp12;
       cp1 uocp13 = new cp1("LICENSE_CHANGE", 3, 3);
       cp1.v = uocp13;
       cp1 uocp14 = new cp1("PLAY_RESTRICTED", 4, 4);
       cp1.w = uocp14;
       cp1 uocp15 = new cp1("STOP_RESTRICTED", 5, 5);
       cp1.x = uocp15;
       cp1 uocp16 = new cp1("UPDATE_RESTRICTED", 6, 6);
       cp1.y = uocp16;
       cp1 uocp17 = new cp1("PAUSE_RESTRICTED", 7, 7);
       cp1.z = uocp17;
       cp1 uocp18 = new cp1("RESUME_RESTRICTED", 8, 8);
       cp1.A = uocp18;
       cp1 uocp19 = new cp1("SKIP_TO_PREV_RESTRICTED", 9, 9);
       cp1.B = uocp19;
       cp1 uocp110 = new cp1("SKIP_TO_NEXT_RESTRICTED", 10, 10);
       cp1.C = uocp110;
       cp1 uocp111 = new cp1("SKIP_TO_NON_EXISTENT_TRACK", 11, 11);
       cp1.D = uocp111;
       cp1 uocp112 = new cp1("SEEK_TO_RESTRICTED", 12, 12);
       cp1.E = uocp112;
       cp1 uocp113 = new cp1("TOGGLE_REPEAT_CONTEXT_RESTRICTED", 13, 13);
       cp1.F = uocp113;
       cp1 uocp114 = uocp113;
       cp1 uocp115 = new cp1("TOGGLE_REPEAT_TRACK_RESTRICTED", 14, 14);
       cp1.G = uocp115;
       cp1 uocp116 = uocp115;
       cp1 uocp117 = new cp1("SET_OPTIONS_RESTRICTED", 15, 15);
       cp1.H = uocp117;
       cp1 uocp118 = uocp117;
       uocp113 = new cp1("TOGGLE_SHUFFLE_RESTRICTED", 16, 16);
       cp1.I = uocp113;
       cp1 uocp119 = uocp113;
       uocp115 = new cp1("SET_QUEUE_RESTRICTED", 17, 17);
       cp1.J = uocp115;
       cp1 uocp120 = uocp115;
       uocp117 = new cp1("INTERRUPT_PLAYBACK_RESTRICTED", 18, 18);
       cp1.K = uocp117;
       cp1 uocp121 = uocp117;
       uocp113 = new cp1("ONE_TRACK_UNPLAYABLE", 19, 19);
       cp1.L = uocp113;
       cp1 uocp122 = uocp113;
       uocp115 = new cp1("ONE_TRACK_UNPLAYABLE_AUTO_STOPPED", 20, 20);
       cp1.M = uocp115;
       cp1 uocp123 = uocp115;
       uocp117 = new cp1("ALL_TRACKS_UNPLAYABLE_AUTO_STOPPED", 21, 21);
       cp1.N = uocp117;
       cp1 uocp124 = uocp117;
       cp1 uocp125 = uocp112;
       uocp113 = new cp1("SKIP_TO_NON_EXISTENT_TRACK_AUTO_STOPPED", 22, 22);
       cp1.O = uocp113;
       cp1 uocp126 = uocp113;
       uocp117 = new cp1("QUEUE_REVISION_MISMATCH", 23, 23);
       cp1.P = uocp117;
       cp1 uocp127 = uocp117;
       uocp115 = new cp1("VIDEO_PLAYBACK_ERROR", 24, 24);
       cp1.Q = uocp115;
       cp1 uocp128 = uocp115;
       uocp117 = new cp1("VIDEO_GEOGRAPHICALLY_RESTRICTED", 25, 25);
       cp1.R = uocp117;
       cp1 uocp129 = uocp117;
       uocp115 = new cp1("VIDEO_UNSUPPORTED_PLATFORM_VERSION", 26, 26);
       cp1.S = uocp115;
       cp1 uocp130 = uocp115;
       uocp117 = new cp1("VIDEO_UNSUPPORTED_CLIENT_VERSION", 27, 27);
       cp1.T = uocp117;
       cp1 uocp131 = uocp117;
       uocp115 = new cp1("VIDEO_UNSUPPORTED_KEY_SYSTEM", 28, 28);
       cp1.U = uocp115;
       cp1 uocp132 = uocp115;
       uocp117 = new cp1("VIDEO_MANIFEST_DELETED", 29, 29);
       cp1.V = uocp117;
       cp1 uocp133 = uocp117;
       uocp115 = new cp1("VIDEO_COUNTRY_RESTRICTED", 30, 30);
       cp1.W = uocp115;
       cp1 uocp134 = uocp115;
       uocp117 = new cp1("VIDEO_UNAVAILABLE", 31, 31);
       cp1.X = uocp117;
       cp1 uocp135 = uocp117;
       uocp115 = new cp1("VIDEO_CATALOGUE_RESTRICTED", 32, 32);
       cp1.Y = uocp115;
       cp1 uocp136 = uocp115;
       uocp117 = new cp1("INVALID", 33, 33);
       cp1.Z = uocp117;
       cp1 uocp137 = uocp117;
       uocp115 = new cp1("TIMEOUT", 34, 34);
       cp1.a0 = uocp115;
       cp1 uocp138 = uocp115;
       uocp117 = new cp1("PLAYBACK_REPORTING_ERROR", 35, 35);
       cp1.b0 = uocp117;
       cp1 uocp139 = uocp117;
       uocp115 = new cp1("UNKNOWN", 36, 36);
       cp1.c0 = uocp115;
       cp1 uocp140 = uocp115;
       uocp117 = new cp1("ADD_TO_QUEUE_RESTRICTED", 37, 37);
       cp1.d0 = uocp117;
       cp1 uocp141 = uocp117;
       uocp115 = new cp1("PICK_AND_SHUFFLE_CAPPED", 38, 38);
       cp1.e0 = uocp115;
       cp1 uocp142 = uocp115;
       uocp117 = new cp1("PICK_AND_SHUFFLE_CONNECT_RESTRICTED", 39, 39);
       cp1.f0 = uocp117;
       cp1 uocp143 = uocp117;
       uocp115 = new cp1("CONTEXT_LOADING_FAILED", 40, 40);
       cp1.g0 = uocp115;
       cp1 uocp144 = uocp115;
       uocp117 = new cp1("AUDIOBOOK_NOT_PLAYABLE", 41, 41);
       cp1.h0 = uocp117;
       cp1 uocp145 = uocp117;
       uocp115 = new cp1("UNRECOGNIZED", 42, -1);
       cp1.i0 = uocp115;
       cp1[] uocp1Array = new cp1[43];
       uocp1Array[0] = uocp1;
       uocp1Array[1] = uocp11;
       uocp1Array[2] = uocp12;
       uocp1Array[3] = uocp13;
       uocp1Array[4] = uocp14;
       uocp1Array[5] = uocp15;
       uocp1Array[6] = uocp16;
       uocp1Array[7] = uocp17;
       uocp1Array[8] = uocp18;
       uocp1Array[9] = uocp19;
       uocp1Array[10] = uocp110;
       uocp1Array[11] = uocp111;
       uocp1Array[12] = uocp125;
       uocp1Array[13] = uocp114;
       uocp1Array[14] = uocp116;
       uocp1Array[15] = uocp118;
       uocp1Array[16] = uocp119;
       uocp1Array[17] = uocp120;
       uocp1Array[18] = uocp121;
       uocp1Array[19] = uocp122;
       uocp1Array[20] = uocp123;
       uocp1Array[21] = uocp124;
       uocp1Array[22] = uocp126;
       uocp1Array[23] = uocp127;
       uocp1Array[24] = uocp128;
       uocp1Array[25] = uocp129;
       uocp1Array[26] = uocp130;
       uocp1Array[27] = uocp131;
       uocp1Array[28] = uocp132;
       uocp1Array[29] = uocp133;
       uocp1Array[30] = uocp134;
       uocp1Array[31] = uocp135;
       uocp1Array[32] = uocp136;
       uocp1Array[33] = uocp137;
       uocp1Array[34] = uocp138;
       uocp1Array[35] = uocp139;
       uocp1Array[36] = uocp140;
       uocp1Array[37] = uocp141;
       uocp1Array[38] = uocp142;
       uocp1Array[39] = uocp143;
       uocp1Array[40] = uocp144;
       uocp1Array[41] = uocp145;
       uocp1Array[42] = uocp115;
       cp1.j0 = uocp1Array;
    }
    public void cp1(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static cp1 a(int p0){
       switch (p0){
           case 0:
             return cp1.b;
           case 1:
             return cp1.c;
           case 2:
             return cp1.t;
           case 3:
             return cp1.v;
           case 4:
             return cp1.w;
           case 5:
             return cp1.x;
           case 6:
             return cp1.y;
           case 7:
             return cp1.z;
           case 8:
             return cp1.A;
           case 9:
             return cp1.B;
           case 10:
             return cp1.C;
           case 11:
             return cp1.D;
           case 12:
             return cp1.E;
           case 13:
             return cp1.F;
           case 14:
             return cp1.G;
           case 15:
             return cp1.H;
           case 16:
             return cp1.I;
           case 17:
             return cp1.J;
           case 18:
             return cp1.K;
           case 19:
             return cp1.L;
           case 20:
             return cp1.M;
           case 21:
             return cp1.N;
           case 22:
             return cp1.O;
           case 23:
             return cp1.P;
           case 24:
             return cp1.Q;
           case 25:
             return cp1.R;
           case 26:
             return cp1.S;
           case 27:
             return cp1.T;
           case 28:
             return cp1.U;
           case 29:
             return cp1.V;
           case 30:
             return cp1.W;
           case 31:
             return cp1.X;
           case 32:
             return cp1.Y;
           case '!':
             return cp1.Z;
           case '"':
             return cp1.a0;
           case '#':
             return cp1.b0;
           case '$':
             return cp1.c0;
           case '%':
             return cp1.d0;
           case '&':
             return cp1.e0;
           case 39:
             return cp1.f0;
           case '(':
             return cp1.g0;
           case ')':
             return cp1.h0;
           default:
             return null;
       }
    }
    public static cp1 valueOf(String p0){
       return Enum.valueOf(cp1.class, p0);
    }
    public static cp1[] values(){
       return cp1.j0.clone();
    }
    public final int getNumber(){
       if (this != cp1.i0) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
