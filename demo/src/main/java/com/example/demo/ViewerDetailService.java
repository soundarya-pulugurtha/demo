package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ViewerDetailService {

    @Autowired
    private ViewerDetailsRepository viewerDetailsRepository;

    public List<ViewerDetails> getAllViewers(){
        List<ViewerDetails> viewerDetails = new ArrayList<>();
        viewerDetailsRepository.findAll().forEach(viewerDetails1 -> viewerDetails.add(viewerDetails1));
        return viewerDetails;
    }

    public ViewerDetails getViewerById(String id){
        return viewerDetailsRepository.findById(id).get();
    }

    public void saveViewer(ViewerDetails viewerDetails){
        viewerDetailsRepository.save(viewerDetails);
    }

    public void updateViewerAge(String id, int age){
        viewerDetailsRepository.updateViewerAge(id, age);
    }

    public void deleteViewer(String id){
        viewerDetailsRepository.deleteById(id);
    }
}
