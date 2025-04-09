package org.springframework;

public class ClassicalMusic implements Music {
private ClassicalMusic(){};
    public static  ClassicalMusic getClassicalMusic()
    {
        return new ClassicalMusic();
    }
    public  void doMyInit()
    {
        System.out.println("Doing my initialization");
    }

    public  void doMyIDestroy()
    {
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong(){
    return  "Hungarian Rhapsody";

    }
}
