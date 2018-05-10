package controllers;

import db.DBCourse;
import models.Course;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class CourseController {

    public static void main(String[] args) {
        staticFileLocation("/public");

//        ManagersController managersController = new ManagersController();

//        Seeds.seedData();

        get("/courses", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Course> courses = DBCourse.getCourses();
            model.put("template", "templates/courses/index.vtl");
            model.put("courses", courses);
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

    }
}
