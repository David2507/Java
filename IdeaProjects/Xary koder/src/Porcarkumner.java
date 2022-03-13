import java.util.Arrays;

public class Porcarkumner {
    public static void main(String[] args) {
        int[] masiv = {5, 2, 4, 1, 8, 10, 6};
        Arrays.sort(masiv);
        System.out.println(Arrays.toString(masiv));
        //System.out.println(GCAIN(masiv,6));
        //System.out.println(GCAin_hskichov(masiv,10));
        //System.out.println(binarySearch(masiv, 7));
        System.out.println(TRICHQnerovSearch(masiv,10));
        //System.out.println(interpolationSearch(masiv,9));

    }

    /**
     * hertov bolor tareri vayov ancnum enq
     */
    public static int GCAIN(int masiv[], int tiv) {   ///  1 2 3  4

        for (int i = 0; i < masiv.length; ++i) {
            if (masiv[i] == tiv)
                return i;
        }
        return -1;
    }

    /**
     * hskichov voronum
     * ayn depq@ vor mer voronvox tvyal@ ka
     */
    public static int GCAin_hskichov(int masiv[], int tiv) { ////  1 2 3 4 3

        for (int i = 0; ; ++i) {
            if (masiv[i] == tiv)
                return i == masiv.length ? -1 : i;
        }

    }

    /**
     * algoritmi himqum @nkac e kisel exac infon  aynqan minchev chhasneqn ayn tvin votr@ mez petq e
     * <p>
     * ---hamarvum  e optimal  erb texasharjman sahmanpakumner chkan ----
     * <p>
     * KA naxapayman >>>  masiv@ petq e sortavorvac lini
     */
    public static int binarySearch(int masiv[], int tiv) {

        int firstIndex = 0;
        int end = masiv.length - 1;

        for (int i = (firstIndex + end) / 2; firstIndex <= end; i = (firstIndex + end) / 2) {

            if (masiv[i] == tiv) {
                return i;
            } else {
                if (masiv[i] < tiv) {
                    firstIndex = i + 1;
                } else {   /// nkati unenalov  if (masiv[i] > tiv)
                    end = i - 1;
                }
            }
        }
        return -1 - firstIndex;
    }

    /**
     * JUMp Search
     * i tarberutyun  binaraini  voronum@ katarvum e achman kargov
     * npatak@ ayspisin e katarel trichqner  masivi erkarutyan qarakusi armati chapov Minchev chgtnenq mer tiv@
     * ete gerazancecinq mer tiv@  apa katavum e gcain
     * --- ogtagorcvum e erb tuylatvac che het qayl@  kam shat caxsatar e -----
     * KA naxapayman >>>  masiv@ petq e sortavorvac lini
     */
    public static int TRICHQnerovSearch(int[] masiv, int tiv) {

        final int length = masiv.length;
        final int jump = (int) Math.sqrt(length);

        int jumpStep = jump;
        int id = 0;

        while (tiv > masiv[Math.min(jumpStep, length) - 1]) {
            id = jumpStep;

            jumpStep += jump; /// 10    11

            if (id >= length) {
                return --id;
            }
        }
        while (tiv > masiv[id]) {


            if ((++id) == Math.min(jumpStep, length))
                return --id;

        }


        return masiv[id] == tiv ? id : --id;
    }

    /**
     * Interpolation Search
     * <p>
     * ---- ardyunavetutyun@ zgacvum e erb ashxatum enq mec qanakakutyamb tvaylneri het , voroq bashxvca en havasaramet ( havasarvac , havasar ev kanonavor bashxvac )  ----
     * <p>
     * <p>
     * !!!  petq e sortavorvac lini
     */
    public static int interpolationSearch(int[] masiv, int tiv) {

        int start = 0;
        int end = (masiv.length - 1);

        while ((start <= end) && (tiv >= masiv[start]) && (tiv <= masiv[end])) {

            int id = start + (((end - start) / (masiv[end] - masiv[start])) * (tiv - masiv[start]));

            if (masiv[id] == tiv) {
                return id;
            }

            if (masiv[id] < tiv) {
                start = id + 1;
            } else {
                end = id - 1;
            }
        }
        return -1;
    }

}
