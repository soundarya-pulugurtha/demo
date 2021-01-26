package com.example.demo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ViewerDetailsRepository extends CrudRepository<ViewerDetails,String> {

    @Modifying
    @Transactional
    @Query(value = "update viewer_details set age= :age where id=:id",nativeQuery = true)
    int updateViewerAge(@Param("id")String id, @Param("age")int age);

}
