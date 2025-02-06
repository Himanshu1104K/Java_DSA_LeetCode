import java.util.*;

public class FindPlayersWithZeroLoseOneWin {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> losCount = new HashMap<>();
        Set<Integer> players = new HashSet<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];
            players.add(winner);
            players.add(loser);

            losCount.put(loser, losCount.getOrDefault(loser, 0) + 1);
        }

        List<Integer> winner = new ArrayList<>();
        List<Integer> oneLossPlayers = new ArrayList<>();

        for (int player : players) {
            int loss = losCount.getOrDefault(player, 0);
            if (loss == 0) {
                winner.add(player);
            } else if (loss == 1) {
                oneLossPlayers.add(player);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        Collections.sort(winner);
        Collections.sort(oneLossPlayers);
        result.add(winner);
        result.add(oneLossPlayers);
        return result;
    }
}
