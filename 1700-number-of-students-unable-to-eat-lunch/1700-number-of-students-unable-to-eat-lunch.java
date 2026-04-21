class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] Count = new int[2];

        for(int s : students) {
            Count[s]++;
        }

        for(int sandwich : sandwiches ) {
            if (Count[sandwich] == 0) {
                break;
            }
            Count[sandwich]--;
        }
        return Count[0] + Count[1];
    }
}