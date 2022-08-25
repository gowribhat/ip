package duke.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import duke.DukeException;

public class Event extends Task {
    private LocalDate at;

    public Event(String description, String at) {
        super(description);
        try {
            this.at = LocalDate.parse(at);
        } catch (DateTimeParseException e) {
            throw new DukeException("Date/Time format is wrong.");
        }
    }

    /**
     * Returns this Event Task in CSV format.
     *
     * @return CSV representation of this Event Task
     */
    @Override
    public String toCsv() {
        return "E," + super.toCsv() + "," + this.at + "\n";
    }

    /**
     * Returns a string representation of this Event Task.
     *
     * @return a string representation of this Event Task
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + this.at.format(DateTimeFormatter.ofPattern("MMM dd yyyy")) + ")";
    }
}
