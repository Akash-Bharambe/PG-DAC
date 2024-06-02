import { createSlice } from "@reduxjs/toolkit";

export const tasksReducer = createSlice({
  name: "tasks",
  initialState:[],
  reducers: {
    addTask: (tasks, action) => {
      tasks.push(action.payload.newTask)
    },
  },
});

// Action creators are generated for each case reducer function
export const { addTask } = tasksReducer.actions;

export default tasksReducer.reducer;
