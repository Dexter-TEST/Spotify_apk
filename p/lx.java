package p.lx;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class lx extends Enum	// class@001de5 from classes.dex
{
    public static final lx A;
    public static final lx B;
    public static final lx C;
    public static final lx[] D;
    public static final lx a;
    public static final lx b;
    public static final lx c;
    public static final lx t;
    public static final lx v;
    public static final lx w;
    public static final lx x;
    public static final lx y;
    public static final lx z;

    static {
       lx olx = new lx("AZTEC", 0);
       lx.a = olx;
       lx olx1 = new lx("CODE_39", 2);
       lx.b = olx1;
       lx olx2 = new lx("CODE_93", 3);
       lx.c = olx2;
       lx olx3 = new lx("CODE_128", 4);
       lx.t = olx3;
       lx olx4 = new lx("DATA_MATRIX", 5);
       lx.v = olx4;
       lx olx5 = new lx("EAN_8", 6);
       lx.w = olx5;
       lx olx6 = new lx("EAN_13", 7);
       lx.x = olx6;
       lx olx7 = new lx("ITF", 8);
       lx.y = olx7;
       lx olx8 = new lx("PDF_417", 10);
       lx.z = olx8;
       lx olx9 = new lx("QR_CODE", 11);
       lx.A = olx9;
       lx olx10 = new lx("UPC_A", 14);
       lx.B = olx10;
       lx olx11 = olx10;
       lx olx12 = new lx("UPC_E", 15);
       lx.C = olx12;
       lx olx13 = olx12;
       lx[] olxArray = new lx[17];
       olxArray[0] = olx;
       olxArray[1] = new lx("CODABAR", 1);
       olxArray[2] = olx1;
       olxArray[3] = olx2;
       olxArray[4] = olx3;
       olxArray[5] = olx4;
       olxArray[6] = olx5;
       olxArray[7] = olx6;
       olxArray[8] = olx7;
       olxArray[9] = new lx("MAXICODE", 9);
       olxArray[10] = olx8;
       olxArray[11] = olx9;
       olxArray[12] = new lx("RSS_14", 12);
       olxArray[13] = new lx("RSS_EXPANDED", 13);
       olxArray[14] = olx11;
       olxArray[15] = olx13;
       olxArray[16] = new lx("UPC_EAN_EXTENSION", 16);
       lx.D = olxArray;
    }
    public void lx(String p0,int p1){
       super(p0, p1);
    }
    public static lx valueOf(String p0){
       return Enum.valueOf(lx.class, p0);
    }
    public static lx[] values(){
       return lx.D.clone();
    }
}
