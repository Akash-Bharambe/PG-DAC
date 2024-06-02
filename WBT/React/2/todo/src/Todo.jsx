import { useState } from "react";
import { useSelector, useDispatch } from "react-redux";
import { addTask } from "./redux/tasksReducer";

function Todo() {
  const [taskName, setTaskName] = useState("");
  const [duration, setDuration] = useState("");
  const dispatch = useDispatch();
  const tasks = useSelector((state) => state.tasks);

  return (
    <div>
      <label htmlFor="task-name">Task Name: </label>
      <input
        type="text"
        name="task-name"
        id="task-name"
        value={taskName}
        onChange={(e) => setTaskName(e.target.value)}
      />

      <label htmlFor="task-duration">Task Duration: </label>
      <input
        type="text"
        name="task-duration"
        id="task-duration"
        value={duration}
        onChange={(e) => setDuration(e.target.value)}
      />

      <button
        type="button"
        onClick={() =>
          dispatch(
            addTask({
              tasks,
              newTask: {
                taskName,
                duration,
              },
            })
          )
        }
      >
        Add Task
      </button>
    </div>
  );
}

export default Todo;
