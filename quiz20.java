public class Quiz {
    public void one(int a[]) {
        int n = a.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            two(a, n, i);

        for (int i = n - 1; i > 0; i--) {

            int t = a[0];
            a[0] = a[i];
            a[i] = t;

            two(a, i, 0);
        }
    }

    public void two(int a[], int n, int e) {
        int m = e;
        int l = 2 * e + 1;
        int r = 2 * e + 2;

        if (l < n && a[l] > a[m])
            m = l;

        if (r < n && a[r] > a[m])
            m = r;

        if (m != e) {
            int t = a[e];
            a[e] = a[m];
            a[m] = t;

            two(a, n, m);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        Quiz obj = new Quiz();
        obj.one(arr);
    }
}