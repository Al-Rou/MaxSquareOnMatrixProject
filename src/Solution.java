public class Solution {
    public int solution(int[] A)
    {
        //It starts from the end of array to take as biggest slice as possible
        for(int i = A.length; i > 0; i--)
        {
            int[] aux = new int[i];
            //This loop counts and separates slices as big as i determines
            for(int k = 0; k < A.length-i+1; k++) {
                int auxCounter = aux.length;
                //This loop fills out the aux array
                for (int j = A.length - k; j > A.length - i - k; j--) {
                    aux[auxCounter - 1] = A[j - 1];
                    auxCounter--;
                }
                //This variable determines if the slice is the answer
                boolean check = true;
                //If there is one element inside the aux array which is smaller than i, then the slice
                //is NOT the answer and the program has to go for another slice
                for (int z = 0; z < aux.length; z++) {
                    if (aux[z] < i) {
                        check = false;
                        break;
                    }
                }
                //If check is true, which means all elements inside the slice are not smaller than i, then
                //the answer is i which should be returned
                if (check) {
                    return i;
                }
            }
        }
        //If the program comes out of the outtest loop, it means there is no black cell at all, hence zero!
        return 0;
    }
}
