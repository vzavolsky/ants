public class Main {
    public static void main(String[] args) {

        int[][] params = {
                {1, 3, 4},
                {4, 1, 4},
                {4, 3, 4},
                {0, 3, 4},
                {3, 1, 3}
        };

        int left;
        int right;
        int plank;

        for (int example = 0; example < params.length; example++) {
            left = params[example][0];
            right = params[example][1];
            plank = params[example][2];

            if ((plank > Math.pow(10, 4) || plank < 1)
                    || (left > plank || left < 1)
                    || (right > plank || right < 1)
                    || (left == right)) {
                System.out.printf("Example #%d: условия заданы не корректно.\n", example + 1);
                continue;
            }

            int stepCounter = 0;

            for (int i = 1; i <= plank; i++) {
                if (left > right && left - right == 1) {
                    left--;
                    right++;
                }
                if (left == right) {
                    right++;
                }
                left--;
                right++;
                stepCounter++;
                if (left < 0 || right > plank) {
                    break;
                }
            }
            System.out.printf("Example #%d: %d\n", example + 1, stepCounter);
        }
    }
}