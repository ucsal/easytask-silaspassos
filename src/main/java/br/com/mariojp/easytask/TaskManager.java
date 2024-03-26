package br.com.mariojp.easytask;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	private List<Task> tasks;

	public TaskManager() {
		this.tasks = new ArrayList<>();
	}

	public void addTask(Task task) {
		tasks.add(task);
	}

	public void completeTask(String taskName) {
		for (Task task : tasks) {
			if (task.getName().equals(taskName)) {
				task.complete();
				return;
			}
		}
	}

	public boolean removeTask(String taskName) {
		return tasks.removeIf(task -> task.getName().equals(taskName));
	}

	public List<Task> getTasks() {
		return tasks;
	}
}