package com.springmvc.springmvc1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.springmvc1.Models.Tasks;
import com.springmvc.springmvc1.Repository.TasksRepository;

@Service
public class TasksServiceImpl implements TasksService {
     @Autowired
     public TasksRepository tasksRepository;
     
    @Override
    public Tasks createTasks(Tasks tasks) {
        return tasksRepository.save(tasks);
      
    }

    @Override
    public void deleteTasks(long id) {
        tasksRepository.deleteById(id);
        
    }

    @Override
    public List<Tasks> getallTasks() {
        return tasksRepository.findAll();
        
    }

    @Override
    public Tasks updateTasks(Tasks updatedTasks, long id) {
        Tasks tasks = tasksRepository.findById(id).get();
        if(tasks!=null){
            tasks.setTaskName(updatedTasks.getTaskName());
            return tasksRepository.save(tasks);
        }
        return null;
 
    }

    @Override
    public Tasks getoneTask(long id) {
      Tasks tasks = tasksRepository.findById(id).get();
      return tasks;

    }

}
