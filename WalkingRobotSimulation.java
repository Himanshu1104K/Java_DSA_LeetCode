
public class WalkingRobotSimulation {

    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        int axis = 90;
        int i = 0;
        for (int command : commands) {
            if (command == -2) {
                command = (command - 90) % 360;
            } else if (command == -1) {
                command = (command + 90) % 360;
            } else {
                switch (axis) {
                    case 0 ->
                        x += command;
                    case 90 ->
                        y += command;
                    case 180 ->
                        x -= command;
                    case 270 ->
                        y -= command;
                }
            }
        }
        return (x * x + y * y);
    }

    public static void main(String[] args) {

    }
}
