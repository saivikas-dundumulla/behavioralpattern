package com.saivikas.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        POJO obj = new POJO("name", 1);
        if(obj.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("Annotation present");
        }
        for(Method method : obj.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(RunImmediately.class)){
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for(int i=0; i < annotation.times();i++){
                    method.invoke(obj);
                }
            }
        }
        for(Field field : obj.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(ImportantString.class)){
                Object object = field.get(obj);
                if(object instanceof  String stringValue){
                    System.out.println(stringValue.toUpperCase());
                }
            }
        }
    }
}
