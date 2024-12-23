package com.lingolearnhub.progress;

import lombok.AllArgsConstructor;

/**
 * Represents user performance statistics during learning challenges.
 * Statistics include metrics like the total number of challenges attempted,
 * successfully completed challenges, and the success rate percantage.
 */
@AllArgsConstructor
public class ChallengeStatistics {

    private final int totalChallenges;
    private final int completedChallenges;

    /**
     * Calculates and returns the success rate as a percentage
     * based on total and completed challenges.
     *
     * @return The success rate (e.g., if 7 out of 10 completed, return 70.0).
     */
    private double getSuccessRate() {
        if (totalChallenges == 0) {
            return 0.0; // Prevent division by zer
        }
        return (double) completedChallenges / totalChallenges * 100;}

    @Override
    public String toString() {
        return "Total: " + totalChallenges +
                ", Completed: " + completedChallenges +
                ", Success Rate: " + getSuccessRate() + "%";
    }

}
