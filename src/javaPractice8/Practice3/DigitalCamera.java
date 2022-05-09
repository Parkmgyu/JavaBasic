package javaPractice8.Practice3;

import java.util.ArrayList;

public class DigitalCamera {
    private ArrayList<Picture> memory;

    public DigitalCamera(){
        memory = new ArrayList<Picture>();
    }

    public void takePicture(String target){
        System.out.println(target + "을 찍었습니다.");
        memory.add(new Picture(target));
    }

    public void showPictures(){
        System.out.println("★☆ 이미지 일람 ☆★");
        for(Picture picture : memory){
            System.out.println(picture);
        }
    }

    public int getPictureCount(){
        return memory.size();
    }

    public void clearMemory(){
        memory.clear();
        System.out.println("모든 이미지를 삭제했습니다.");
    }
}
