package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Component
public class ViewerDetailService {

    ConcurrentMap<String, ViewerDetails> viewers = new ConcurrentHashMap<>();


    public List<ViewerDetails> getAllViewers(){
        return new ArrayList<ViewerDetails>(viewers.values());
    }

    public ViewerDetails getViewerById(String id){
        return viewers.get(id);
    }

    public void saveViewer(ViewerDetails viewerDetails){
        viewers.put(viewerDetails.getId(),viewerDetails);
    }

    public void updateViewerAge(String id, int age){
        viewers.get(id).setAge(age);
    }

    public void deleteViewer(String id){
        viewers.remove(id);
    }
}
