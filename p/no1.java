package p.no1;
import java.lang.String;
import java.lang.IllegalArgumentException;

public abstract class no1	// class@002017 from classes.dex
{
    public static final int[] a;
    public static final int[][] b;
    public static final int[] c;
    public static final int[] d;

    static {
       no1.a = new int[16]{5,7,10,11,12,14,18,20,24,28,'$','*','0','8','>','D'};
       int[][] ointArray = new int[][16];
       int i = 0;
       ointArray[i] = new int[5]{228,'0',15,'o','>'};
       ointArray[1] = new int[7]{23,'D',144,134,240,92,254};
       int i1 = 10;
       ointArray[2] = new int[i1]{28,24,185,166,223,248,'t',255,'n','='};
       ointArray[3] = new int[11]{175,138,205,12,194,168,39,245,'<','a','x'};
       ointArray[4] = new int[12]{')',153,158,'[','=','*',142,213,'a',178,'d',242};
       ointArray[5] = new int[14]{156,'a',192,252,'_',9,157,'w',138,'-',18,186,'S',185};
       ointArray[6] = new int[18]{'S',195,'d',39,188,'K','B','=',241,213,'m',129,'^',254,225,'0','Z',188};
       ointArray[7] = new int[20]{15,195,244,9,233,'G',168,2,188,160,153,145,253,'O','l','R',27,174,186,172};
       ointArray[8] = new int[24]{'4',190,'X',205,'m',39,176,21,155,197,251,223,155,21,5,172,254,'|',12,181,184,'`','2',193};
       ointArray[9] = new int[28]{211,231,'+','a','G','`','g',174,'%',151,170,'5','K','"',249,'y',17,138,'n',213,141,136,'x',151,233,168,']',255};
       ointArray[i1] = new int[36]{245,127,242,218,130,250,162,181,'f','x','T',179,220,251,'P',182,229,18,2,4,'D','!','e',137,'_','w','s',',',175,184,';',25,225,'b','Q','p'};
       ointArray[11] = new int[42]{'M',193,137,31,19,'&',22,153,247,'i','z',2,245,133,242,8,175,'_','d',9,167,'i',214,'o','9','y',21,1,253,'9','6','e',248,202,'E','2',150,177,226,5,9,5};
       ointArray[12] = new int[48]{245,132,172,223,'`',32,'u',22,238,133,238,231,205,188,237,'W',191,'j',16,147,'v',23,'%','Z',170,205,131,'X','x','d','B',138,186,240,'R',',',176,'W',187,147,160,175,'E',213,92,253,225,19};
       ointArray[13] = new int[56]{175,9,223,238,12,17,220,208,'d',29,175,170,230,192,215,235,150,159,'$',223,'&',200,132,'6',228,146,218,234,'u',203,29,232,144,238,22,150,201,'u','>',207,164,13,137,245,127,'C',247,28,155,'+',203,'k',233,'5',143,'.'};
       ointArray[14] = new int[62]{242,']',169,'2',144,210,39,'v',202,188,201,189,143,'l',196,'%',185,'p',134,230,245,'?',197,190,250,'j',185,221,175,'@','r','G',161,',',147,6,27,218,'3','?','W',10,'(',130,188,17,163,31,176,170,4,'k',232,7,'^',166,224,'|','V','/',11,204};
       ointArray[15] = new int[68]{220,228,173,'Y',251,149,159,'8','Y','!',147,244,154,'$','I',127,213,136,248,180,234,197,158,177,'D','z',']',213,15,160,227,236,'B',139,153,185,202,167,179,25,220,232,'`',210,231,136,223,239,181,241,';','4',172,25,'1',232,211,189,'@','6','l',153,132,'?','`','g','R',186};
       no1.b = ointArray;
       int[] ointArray1 = new int[256];
       no1.c = ointArray1;
       int[] ointArray2 = new int[255];
       no1.d = ointArray2;
       int i2 = 1;
       while (i < 255) {
          no1.d[i] = i2;
          no1.c[i2] = i;
          if ((i2 = i2 << 1) >= 256) {
             i2 = i2 ^ 0x012d;
          }
          i = i + 1;
       }
    }
    public static String a(int p0,String p1){
       int i5;
       int i8;
       int i = p1.length();
       char c = 0;
       int i1 = 0;
       while (true) {
          if (i1 < 16) {
             if (no1.a[i1] == p0) {
             label_0016 :
                if (i1 < 0) {
                   throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(p0)));
                }
                object oobject = no1.b[i1];
                char[] uocharArray = new char[p0];
                for (int i2 = 0; i2 < p0; i2 = i2 + 1) {
                   uocharArray[i2] = c;
                }
                i2 = 0;
                while (true) {
                   int i3 = c + i;
                   if (i2 < i3) {
                      i3 = p0 - 1;
                      int i4 = uocharArray[i3] ^ p1.charAt(i2);
                      while (true) {
                         int[] c1 = no1.c;
                         int[] d = no1.d;
                         if (i3 > 0) {
                            if (i4 && (i5 = oobject[i3])) {
                               int i6 = i3 - 1;
                               int i7 = c1[i4] + c1[i5];
                               i7 = i7 % 255;
                               i8 = d[i7] ^ uocharArray[i6];
                               uocharArray[i3] = (char)i8;
                            }else {
                               i8 = i3 - 1;
                               uocharArray[i3] = uocharArray[i8];
                            }
                            i3 = i3 - 1;
                         }else if(i4 && (i3 = oobject[c])){
                            i4 = c1[i4] + c1[i3];
                            i4 = i4 % 255;
                            uocharArray[c] = (char)d[i4];
                         }else {
                            uocharArray[c] = c;
                         }
                         i2 = i2 + 1;
                      }
                   }else {
                      break ;
                   }
                }
                char[] uocharArray1 = new char[p0];
                for (; c < p0; c = c + 1) {
                   i = p0 - c;
                   i = i - 1;
                   uocharArray1[c] = uocharArray[i];
                }
                return String.valueOf(uocharArray1);
             }else {
                i1 = i1 + 1;
             }
          }else {
             i1 = -1;
             goto label_0016 ;
          }
       }
    }
}
