package expetion;

 class Break {
    public static void main(String[] args) {
        int[][] array = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
        int searchValue = 2;
        int px = -1;
        int py = -1;
        PARENT_LOOP:
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                if (array[x][y] == searchValue) {
                    px = x;
                    py = y;
                    break;
                    //break PARENT_LOOP;
                }
            }
        }
        if (px == -1 || py == -1) {
            System.out.println("Value " + searchValue + " not found!!");
        } else {
            System.out.println("Value " + searchValue + " found at: (" + px + ", " + py + ")");
        }
    }
}

