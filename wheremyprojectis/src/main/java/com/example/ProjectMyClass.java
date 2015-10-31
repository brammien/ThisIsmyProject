package com.example;

public class ProjectMyClass {

    int ProjectMyClassNum;

    public ProjectMyClass(String name){
        // This constructor has one parameter, name.
        System.out.println("Name of the Camera I'm choosing is :" + name );
    }

    public void setNum( int Num ){
        ProjectMyClassNum = Num;
    }

    public int getNum( ){
        System.out.println("Model Number :" + ProjectMyClassNum + " Silver");
        return ProjectMyClassNum;
    }

    public static void main(String []args){
      /* Object creation */
        ProjectMyClass myModel = new ProjectMyClass( "Hero" );

      /* Call class method to set Model Number */
        myModel.setNum( 4 );

      /* Call another class method Model Number */
        myModel.getNum( );

    }
}