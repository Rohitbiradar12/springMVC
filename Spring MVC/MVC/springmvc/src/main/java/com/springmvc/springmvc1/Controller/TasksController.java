package com.springmvc.springmvc1.Controller;

import java.net.http.HttpRequest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.springmvc1.Models.Tasks;
import com.springmvc.springmvc1.Service.TasksService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/tasks")
public class TasksController {
    
    @Autowired
    public TasksService tasksService;

    

    @PostMapping("/createTasks")
    public ResponseEntity<Tasks> createTasks(@RequestBody Tasks tasks){
        Tasks Createdtasks = tasksService.createTasks(tasks);
        return new ResponseEntity<>(Createdtasks,HttpStatus.CREATED);


    }

    @GetMapping("/allTasks")
    public ResponseEntity<List<Tasks>> getallTasks(){
        List<Tasks> tasks = tasksService.getallTasks();
        return new ResponseEntity<>(tasks,HttpStatus.OK);
    }

    @GetMapping("/deleteTask/{id}")
    public ResponseEntity<Tasks> deleteTasks(@PathVariable Long id){
               tasksService.deleteTasks(id); 
               return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @GetMapping("/getTask/{id}")
    public ResponseEntity<Tasks>  getoneTask(@PathVariable long id){
                  Tasks oneTask=tasksService.getoneTask(id);
                  return new ResponseEntity<>(oneTask,HttpStatus.OK);
        
    }
    @GetMapping("updateTasks/{id}")
    public ResponseEntity<Tasks> updateTasks(@RequestBody Tasks updatedTasks,@PathVariable long id){
               Tasks tasks = tasksService.updateTasks(updatedTasks, id);
               if(tasks!=null){
                return new ResponseEntity<>(HttpStatus.OK);
               }else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
               }

    }


}
