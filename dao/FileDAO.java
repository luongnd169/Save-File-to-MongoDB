package com.fujitsu.fsonar.dao;

import com.fujitsu.fsonar.config.Constants;
import com.fujitsu.fsonar.service.mongo.MongoService;
import com.mongodb.gridfs.GridFSDBFile;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsOperations;

import java.io.File;
import java.util.List;

/**
 * Created by LUONGND1 on 9/8/2016.
 */
public class FileDAO {
    private File file;
    private MongoService mongoService;
    private static MongoOperations operations = MongoService.getMongoOperations();
    private static GridFsOperations gridOperations = MongoService.getGridFsOperations();


    public static boolean save(File f) {
        if(f != null) {
            operations.save(f);
            return true;
        }
        return false;
    }

    public static List<File> load(String fileName){
        List<GridFSDBFile> result = gridOperations.find(
            new Query().addCriteria(Criteria.where(Constants.FILE_NAME).is(fileName)));
        //must handle result
        return null;
    }

}
