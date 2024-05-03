package com.springmvc.springmvc1.Service;

import java.util.List;

import com.springmvc.springmvc1.Models.Tasks;
import com.springmvc.springmvc1.Repository.TasksRepository;

public interface TasksService {

  Tasks createTasks(Tasks tasks);
  void deleteTasks(long id);
  List<Tasks> getallTasks();
  Tasks updateTasks(Tasks tasks,long id);
  Tasks getoneTask(long id);
}
