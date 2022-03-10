public class ABFinder {
    public static void main(String[] args) {
        int[][] abArray = new int[100][2]; // A와 B의 조합을 담는 배열
        int cnt = 0; // 조합의 개수

        for (int i = 0; i < 10; i++) {  // A
            for (int j = 0; j < 10; j++) {  // B
                if (((i*10+j) + (j*10+i)) == 99) {
                    abArray[cnt][0] = i;
                    abArray[cnt][1] = j;
                    cnt++;
                }
            }
        }

        for (int i = 0; i < cnt; i++) {
            System.out.printf("%d %d\n", abArray[i][0], abArray[i][1]);
        }
    }
}
