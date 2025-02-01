// https://school.programmers.co.kr/learn/courses/30/lessons/49994?language=java
// 방문 길이

package src;

import java.util.HashMap;
import java.util.HashSet;

public class p07 {

    public static void main(String[] args) {
        String dirs1 = "ULURRDLLU";
        String dirs2 = "LULLLLLLU";

        p07 p = new p07();
        int result1 = p.solution(dirs1);
        int result2 = p.solution(dirs2);

        System.out.println(result1);
        System.out.println(result2);
    }

    private static boolean checkCoordinate(int nx, int ny) {
        return -5 <= nx && nx <= 5 && -5 <= ny && ny <= 5;
    }

    private static final HashMap<Character, int[]> direction = new HashMap<>();

    private static void init() {
        direction.put('U', new int[]{0, 1});
        direction.put('D', new int[]{0, -1});
        direction.put('R', new int[]{1, 0});
        direction.put('L', new int[]{-1, 0});
    }

    public int solution(String dirs) {
        init();

        int x = 0;
        int y = 0;

        // 중복된 길 저장
        HashSet<String> visited = new HashSet<>();

        for (int i = 0; i < dirs.length(); i++) {
            char dir = dirs.charAt(i);
            int[] move = direction.get(dir);

            int nx = x + move[0];
            int ny = y + move[1];

            // 좌표 내의 값인지 체크
            if (!checkCoordinate(nx, ny)) {
                continue;
            }

            // 양방향 길 체크
            // 작은 값이 앞에 오도록 정렬하여 저장
            String path = Math.min(x, nx) + "," + Math.min(y, ny) + "," + Math.max(x, nx) + "," + Math.max(y, ny);
            visited.add(path);

            // 이동
            x = nx;
            y = ny;
        }

        return visited.size();
    }
}
