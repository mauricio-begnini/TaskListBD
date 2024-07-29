package com.example.tasklistbd.ui.viewmodels

import com.example.tasklistbd.data.Task

data class TaskScreenUiState (
    val allTasks: List<Task> = listOf(
        Task(name = "Preparar aula de PDM", isImportant = true),
        Task(name = "Gravar aula de PDM",),
        Task(name = "Corrigir trabalhos de PDM", isImportant = true, isCompleted = true),
        Task(name = "Elaborar recuperação de PDM"),
    )
)