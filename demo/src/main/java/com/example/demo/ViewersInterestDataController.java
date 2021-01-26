package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/api")
@Component
public class ViewersInterestDataController {

    @Autowired
     private ViewerDetailService viewerDetailService;


    @GetMapping("/getDetails")
    public List<ViewerDetails> getAllViewers(){
        return viewerDetailService.getAllViewers();
    }

    @GetMapping("/getDetails/{id}")
    public ViewerDetails getViewerDetails(@PathVariable String id){
        return viewerDetailService.getViewerById(id);
    }

    @PostMapping("/addNewViewer")
    public void addNewViewer(@RequestBody ViewerDetails viewerDetails){
        viewerDetailService.saveViewer(viewerDetails);
    }

    @PostMapping("/updateAgeOfViewer/{id}/{age}")
    public void addNewViewer(@PathVariable String id, @PathVariable int age){
        viewerDetailService.updateViewerAge(id,age);
    }

    @DeleteMapping("/deleteViewer/{id}")
    public void deleteNewViewer(@PathVariable String id){
        viewerDetailService.deleteViewer(id);
    }

}
