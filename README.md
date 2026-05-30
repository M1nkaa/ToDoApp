# 📝 Todo App

A simple Android app for managing your daily tasks.

## 📸 Screenshots

| Task List | Add Task |
|-----------|----------|
| <img width="322" height="678" alt="image" src="https://github.com/user-attachments/assets/876361d5-eea4-45cb-9d4f-14eb875f91c8" /> | <img width="322" height="678" alt="image" src="https://github.com/user-attachments/assets/b68940cb-7811-4e08-b0e2-9156cc8e1ef7" /> |

## ✨ Features

- View list of tasks
- Add a new task via the **+** button
- Mark tasks as done with a checkbox
- Navigate between screens using Navigation Component

## 🛠 Tech Stack

- **Kotlin**
- **Android Jetpack Navigation Component**
- **RecyclerView**
- **Fragment + Activity**

## 📁 Project Structure

```
app/src/main/
├── java/com/m1nkaa/todoapp/
│   ├── MainActivity.kt        # Entry point
│   ├── TaskListFragment.kt    # Task list screen
│   ├── AddTaskFragment.kt     # Add task screen
│   ├── TaskAdapter.kt         # RecyclerView adapter
│   └── Task.kt                # Data model
└── res/
    ├── layout/
    │   ├── activity_main.xml
    │   ├── fragment_task_list.xml
    │   ├── fragment_add_task.xml
    │   └── item_task.xml
    └── navigation/
        └── nav_graph.xml
```

## ▶️ Getting Started

1. Clone the repository
```bash
git clone https://github.com/m1nkaa/TodoApp.git
```
2. Open in **Android Studio**
3. Run on an emulator or real device (API 24+)

## 📚 What I Learned

- Working with `Fragment` and `Activity`
- Android `Lifecycle` management
- Screen navigation with `Navigation Component`
- Passing data between fragments via `FragmentResult`
- `RecyclerView` with a custom adapter and `ViewHolder`
- Git flow: branches, commits, Pull Requests
