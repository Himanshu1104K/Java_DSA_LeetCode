import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // Main logic
        Arrays.sort(candidates);
        int endIdx = candidates.length - 1;

        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, new ArrayList<>(), candidates, 0, endIdx, target);
        System.out.println(result);
        return result;
    }

    public static void backTrack(List<List<Integer>> result, List<Integer> temp, int[] candidates, int sidx, int endIdx,
            int target) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            result.add(new ArrayList<>(temp));
        } else {
            for (int i = sidx; i <= endIdx; i++) {
                // Skip duplicates
                if (i > sidx && candidates[i] == candidates[i - 1])
                    continue;

                temp.add(candidates[i]);

                backTrack(result, temp, candidates, i + 1, endIdx, target - candidates[i]);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        combinationSum2(new int[] { 3, 1, 3, 5, 1, 1 }, 8);
    }
}

// public static List<List<Integer>> combinationSum2(int[] candidates, int
// target) {
// Set<List<Integer>> set = new HashSet<>();

// // Base case
// if (candidates.length == 0) {
// return new ArrayList<>(set);
// } else if (candidates.length == 1 && target != candidates[0]) {
// return new ArrayList<>(set);
// }

// // Main logic

// Arrays.sort(candidates);
// int endIdx = candidates.length - 1;
// for (int i = candidates.length - 1; i >= 0; i--) {
// if (candidates[i] <= target) {
// endIdx = i;
// break;
// }
// }
// for (int i = 0; i <= endIdx; i++) {
// if (candidates[i] == target) {
// List<Integer> temp = new ArrayList<>();
// temp.add(candidates[i]);
// set.add(temp);
// } else {
// for (int j = i + 1; j <= endIdx; j++) {
// if (candidates[i] + candidates[j] == target) {
// List<Integer> temp = new ArrayList<>();
// temp.add(candidates[i]);
// temp.add(candidates[j]);
// set.add(temp);
// } else {
// for (int k = j + 1; k <= endIdx; k++) {
// if (candidates[i] + candidates[j] + candidates[k] == target) {
// List<Integer> temp = new ArrayList<>();
// temp.add(candidates[i]);
// temp.add(candidates[j]);
// temp.add(candidates[k]);
// set.add(temp);
// } else {
// for (int l = k + 1; l <= endIdx; l++) {
// if (candidates[i] + candidates[j] + candidates[k] + candidates[l] == target)
// {
// List<Integer> temp = new ArrayList<>();
// temp.add(candidates[i]);
// temp.add(candidates[j]);
// temp.add(candidates[k]);
// temp.add(candidates[l]);
// set.add(temp);
// } else {
// for (int m = l + 1; m <= endIdx; m++) {
// if (candidates[i] + candidates[j] + candidates[k]
// + candidates[l]+candidates[m] == target) {
// List<Integer> temp = new ArrayList<>();
// temp.add(candidates[i]);
// temp.add(candidates[j]);
// temp.add(candidates[k]);
// temp.add(candidates[l]);
// temp.add(candidates[m]);
// set.add(temp);

// }
// }
// }
// }
// }
// }
// }
// }
// }
// }

// System.out.println(set);
// return new ArrayList<>(set);
// }