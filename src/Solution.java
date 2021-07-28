public class Solution {
    public int solution(int[] A)
    {
        for(int i = A.length; i > 0; i--)
        {
            int[] aux = new int[i];
            for(int k = 0; k < A.length-i+1; k++) {
                int auxCounter = aux.length;
                for (int j = A.length - k; j > A.length - i - k; j--) {
                    aux[auxCounter - 1] = A[j - 1];
                    auxCounter--;
                }
                boolean check = true;
                for (int z = 0; z < aux.length; z++) {
                    if (aux[z] < i) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    return i;
                }
            }
        }
        return 0;
    }
}
