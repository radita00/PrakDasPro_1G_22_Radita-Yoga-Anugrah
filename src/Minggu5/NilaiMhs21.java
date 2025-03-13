package Minggu5;

public class NilaiMhs21 {
    int cariMaxUTS(int [] uts, int l, int r){
        if (l == r) {
            return uts[l];
        }
        int mid = (l + r)/2;
        int lmax = cariMaxUTS(uts, l, mid);
        int rmax = cariMaxUTS(uts, mid +1, r);
        if (lmax > rmax) {
            return lmax;
        } else{
            return rmax;
        }
    }
    int cariMinUTS (int [] uts, int l, int r){
        if (l==r) {
            return uts[l];
        }
        int mid = (l + r)/2;
        int lmin = cariMinUTS(uts, l, mid);
        int rmin = cariMinUTS(uts, mid + 1, r);
        if (lmin < rmin) {
            return lmin;
        } else {
            return rmin;
        }
    }
    double carirata2UAS(int [] uas){
        int sum = 0;
        for (int nilai : uas) {
            sum += nilai;
        }
        return (double) sum / uas.length;
    }
}
