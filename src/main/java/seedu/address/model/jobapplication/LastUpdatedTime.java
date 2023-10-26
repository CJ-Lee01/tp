package seedu.address.model.jobapplication;

import java.time.LocalDateTime;

/**
 * The latest time that the job application was updated.
 * Completely immutable, users are not able to specify the updated time.
 */
public class LastUpdatedTime {

    public final LocalDateTime lastUpdatedTime;

    /**
     * Constructs an autogenerated {@code LastUpdatedTime}
     */
    public LastUpdatedTime() {
        this.lastUpdatedTime = LocalDateTime.now();
    }

    /**
     * Constructs a {@code LastUpdatedTime} for testing purposes only.
     * @param dateTime of the updated time.
     */
    public LastUpdatedTime(LocalDateTime dateTime) {
        this.lastUpdatedTime = dateTime;
    }

    @Override
    public String toString() {
        return lastUpdatedTime.toString();
    }
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof LastUpdatedTime)) {
            return false;
        }

        LastUpdatedTime otherLastUpdate = (LastUpdatedTime) other;
        return lastUpdatedTime.equals(otherLastUpdate.lastUpdatedTime);
    }

}