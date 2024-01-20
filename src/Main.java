public class Main {
    public static void main(String[] args) {

        // bir integer arrayin bir integer k sayisi verilir deyilirki arrayin 0-ci elementi
        //ile birinci elementinin cemi k-ya bolunurmu ? sonra 0-ci element ile 2-ci elementi k-ya
        // bolunurmu ? (i ,j) i < j -den butun elementleri toplayib boldukden sonra
        // 1-ci element ile 2 ci elementin cemi k-ya bolunurmu? sonra 1 ile 3 -cu element
        // bu sekilde arrayin butun elementlerini sira ile toplayib k-ya bolunub bolunmediyini yoxlayin

        int[] array = new int[]{1, 3, 4, 2, 3, 1, 4, 1};
        int k = 2;
        int count = 0;// nece defe bolune bildiyini saymaq ucun

        //niye -1 den? cunki arrayin axirdan 2-ci elementine qeder
        //gedecek yeni 4-e qeder 4 ile 1-i toplayib k-ya bolunub bolunmediyine
        //baxaciq sonuncu element 1-dir 1 den sora element yoxdur dvor bitsin
        // Bes neye gore i + 1 den ? cunki 1-ci forda i-0 dan basliyir bizde dedik 0-ile 1-i topla 0-ile 2-ni
        //j = i+1 den yeni baslanqic noqtemiz ozu ve ozunden sonraki dovr bitdikden sonra 1-ci element ile 2-cini toplasin
        // j-nin baslanqic noqtesi her defe ucun i +1 dir  i den 1 sonraki elementden baslayacaq
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) % k == 0) {
                    count++;
                }
            }
        }
        System.out.println("count = " + count);

    }
}



