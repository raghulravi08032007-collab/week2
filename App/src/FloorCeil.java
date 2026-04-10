class FloorCeil {

    static void findFloorCeil(int[] arr, int key) {
        int floor = -1, ceil = -1;

        for (int num : arr) {
            if (num <= key) floor = num;
            if (num >= key) {
                ceil = num;
                break;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceiling: " + ceil);
    }
}