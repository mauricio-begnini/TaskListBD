package com.example.tasklistbd.ui.viewmodels

import com.example.tasklistbd.data.Task

data class TaskScreenUiState (
    val allTasks: List<Task> = listOf(
        Task("Preparar aula de PDM", isImportant = true),
        Task("Gravar aula de PDM",),
        Task("Corrigir trabalhos de PDM", isImportant = true, isCompleted = true),
        Task("Elaborar recuperação de PDM"),
    )
)