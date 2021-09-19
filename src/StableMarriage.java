import java.util.Scanner;

public class StableMarriage {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase>0){
            int nPairs=sc.nextInt();
            int[] wEngage=new int[nPairs];
            int[] mEngage=new int[nPairs];
            for(int i=0;i<nPairs;i++){
                wEngage[i]=-1;
                mEngage[i]=-1;
            }
            int[][] wPref = new int[nPairs][nPairs];
            int[][] mPref = new int[nPairs][nPairs];

            for (int i = 0; i < nPairs; i++) {
                int women = sc.nextInt();
                women--;
                for (int j = 0; j < nPairs; j++){
                    wPref[women][j]=sc.nextInt();
                    wPref[women][j]--;
                }
            }
            for (int i = 0; i < nPairs; i++) {
                int men =sc.nextInt();
                men--;
                for (int j = 0; j < nPairs; j++) {
                    mPref[men][j] = sc.nextInt();
                    mPref[men][j]--;
                }
            }
            while(allMenEngaged(mEngage)!=true){
                for(int i=0;i<nPairs;i++){
                    if(mEngage[i]==-1){
                        for(int j=0;j<nPairs;j++) {
                            int wPropse = mPref[i][j];
                            if (wPropse != -1) {
                                int mCurr = wEngage[wPropse];
                                if (mCurr == -1) {
                                    mEngage[i] = wPropse;
                                    wEngage[wPropse] = i;
                                } else if (preferBetter(i, mCurr, wPref, wPropse) == true) {
                                    mEngage[i] = wPropse;
                                    wEngage[wPropse] = i;
                                    mEngage[mCurr] = -1;
                                }
                                mPref[i][j] = -1;
                                break;
                            }

                        }
                    }
                }
            }
            for(int i=0;i<nPairs;i++){
                System.out.println(i+1+" "+(mEngage[i]+1));
            }
            testcase--;
        }
    }
    public static boolean preferBetter(int a,int b,int[][] wp,int idx) {

        boolean bEncountered=false;
        for(int i=0;i<wp[idx].length;i++) {
            if(wp[idx][i]==a && bEncountered==false) return true;
            else if(wp[idx][i]==b) {bEncountered=true; break;}
        }
        return false;
    }
    public static boolean allMenEngaged(int[] mEngage){
        for(int i=0;i<mEngage.length;i++){
            if(mEngage[i]==-1){
                return false;
            }
        }
        return true;
    }
}
