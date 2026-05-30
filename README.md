# 📝 Todo App

Простое приложение для управления задачами на Android.

## 📸 Скриншоты

| Список задач | Добавление задачи |
|---|---|
| _скриншот сюда_ | _скриншот сюда_ |

## 🚀 Функциональность

- Просмотр списка задач
- Добавление новой задачи через кнопку **+**
- Отметка задачи как выполненной через чекбокс
- Навигация между экранами через Navigation Component

## 🛠 Стек технологий

- **Kotlin**
- **Android Jetpack Navigation Component**
- **RecyclerView**
- **Fragment + Activity**

## 📁 Структура проекта

```
app/src/main/
├── java/com/m1nkaa/todoapp/
│   ├── MainActivity.kt        # Точка входа
│   ├── TaskListFragment.kt    # Экран со списком задач
│   ├── AddTaskFragment.kt     # Экран добавления задачи
│   ├── TaskAdapter.kt         # Адаптер для RecyclerView
│   └── Task.kt                # Модель данных
└── res/
    ├── layout/
    │   ├── activity_main.xml
    │   ├── fragment_task_list.xml
    │   ├── fragment_add_task.xml
    │   └── item_task.xml
    └── navigation/
        └── nav_graph.xml
```

## ▶️ Запуск

1. Клонируй репозиторий
```bash
git clone https://github.com/m1nkaa/TodoApp.git
```
2. Открой в **Android Studio**
3. Запусти на эмуляторе или реальном устройстве (API 24+)

## 📚 Чему научилась

- Работа с `Fragment` и `Activity`
- Жизненный цикл Android (`Lifecycle`)
- Навигация через `Navigation Component`
- Передача данных между фрагментами через `FragmentResult`
- `RecyclerView` с кастомным адаптером и `ViewHolder`
- Git flow: ветки, коммиты, Pull Requests
