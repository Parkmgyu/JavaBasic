package javaPractice8.Practice3;

public class ArrayListNormalPractice {
    public static void main(String[] args) {

        DigitalCamera myCamera = new DigitalCamera();

        myCamera.takePicture( "새끼 고양이" );
        myCamera.takePicture( "런치" );
        myCamera.takePicture( "카푸치노" );
        myCamera.takePicture( "아기" );
        myCamera.takePicture( "투샷" );
        System.out.println();

        System.out.println( "현재 촬영 매수:" + myCamera.getPictureCount());
        System.out.println();

        myCamera.showPictures();
        System.out.println();

        myCamera.clearMemory();
        System.out.println();

        System.out.println( "현재 촬영 매수:" + myCamera.getPictureCount());
    }
}
