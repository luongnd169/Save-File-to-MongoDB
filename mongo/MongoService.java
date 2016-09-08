package com.fujitsu.fsonar.service.mongo;


import com.fujitsu.fsonar.config.Constants;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.gridfs.GridFsOperations;

/**
 * Created by LUONGND1 on 9/7/2016.
 */
public class MongoService {
    public static MongoOperations getMongoOperations(){
//        try {
//            Runtime.getRuntime().exec("cmd /c start D:/run-mongo.bat");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
        return (MongoOperations) ctx.getBean(Constants.MONGO_TEMPLATE);
    }

    public static GridFsOperations getGridFsOperations(){
//        try {
//            Runtime.getRuntime().exec("cmd /c start D:/run-mongo.bat");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
        return (GridFsOperations) ctx.getBean(Constants.GRIDFS_TEMPLATE);
    }

}
