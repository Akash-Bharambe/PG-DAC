import { configureStore } from "@reduxjs/toolkit";
import tasksReducer from "./tasksReducer";

export const store = configureStore({
    reducer: {
        tasks : tasksReducer
    }
})