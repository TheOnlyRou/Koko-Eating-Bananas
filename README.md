# Koko Eating Bananas

## Problem Statement

Koko loves to eat bananas. There are `n` piles of bananas, the `ith` pile has `piles[i]` bananas. The guards have gone and will come back in `h` hours.

Koko can decide her bananas-per-hour eating speed of `k`. Each hour, she chooses some pile of bananas and eats `k` bananas from that pile. If the pile has less than `k` bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return *the minimum integer* `k` *such that she can eat all the bananas within* `h` *hours*.

**Example 1:**

**Input:** piles = [3,6,7,11], h = 8
**Output:** 4

**Example 2:**

**Input:** piles = [30,11,23,4,20], h = 5
**Output:** 30

**Example 3:**

**Input:** piles = [30,11,23,4,20], h = 6
**Output:** 23

**Constraints:**

- `1 <= piles.length <= 104`
- `piles.length <= h <= 109`
- `1 <= piles[i] <= 109`

## Explanation & Solution

The problem can be solved using binary search. We first find the minimum and maximum pile sizes in the given array of piles. Then, we perform a binary search on the possible values of k, which lie between 1 and the maximum pile size. For each value of k, we calculate the total number of hours Koko would take to eat all the bananas using that k. If this value exceeds h, we increase the minimum possible value of k to mid+1, else we decrease the maximum possible value of k to mid. Finally, we return the minimum possible value of k.

In the binary search loop, we calculate the total number of hours required to eat all the bananas using the current value of k. We do this by dividing the size of each pile by k and rounding up to the nearest integer. The sum of all these values gives us the total number of hours required.
