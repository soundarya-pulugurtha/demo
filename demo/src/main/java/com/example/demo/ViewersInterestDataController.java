package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/api")
public class ViewersInterestDataController {

    ConcurrentMap<String, ViewerDetails> viewers = new ConcurrentHashMap<>();

    @GetMapping("/getDetails")
    public List<ViewerDetails> getAllViewers(){
        return new ArrayList<ViewerDetails>(viewers.values());
    }

    @GetMapping("getDetails/{id}")
    public ViewerDetails getViewerDetails(@PathVariable String id){
        return viewers.get(id);
    }

    @PostMapping("/addNewViewer")
    public void addNewViewer(@RequestBody ViewerDetails viewerDetails){
        viewers.put(viewerDetails.getId(),viewerDetails);
    }

}
