package duke.command;

import duke.Ui;
import duke.exception.DukeException;
import duke.task.TaskList;

/**
 * Represents a list tasks command
 */
public class ListCommand extends Command {

    /**
     * Executes the command.
     *
     * @param taskList list of stored tasks
     * @return list of tasks
     * @throws DukeException if user input has wrong format
     */
    @Override
    public String execute(TaskList taskList) throws DukeException {
        return Ui.printTaskList(taskList);
    }
}
