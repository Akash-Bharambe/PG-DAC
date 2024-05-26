import { useSelector } from "react-redux";

function TodoList() {
  const tasks = useSelector((state) => state.tasks)

  return (
    <div>
      <table border={1}>
        <thead>
          <tr>
            <td>Task Name</td>
            <td>Task Duration</td>
          </tr>
        </thead>
        <tbody>
          {tasks.map((task,index) => (
            <tr key={index}>
              <td>{task.taskName}</td>
              <td>{task.duration}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default TodoList;
