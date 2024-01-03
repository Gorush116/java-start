package cond.ex;

public class MovieRecommendEx {

    public static void main(String[] args) {
        double rating = 9.5;

        if(rating >= 9.0) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if(rating >= 8.0) {
            System.out.println("'토이스토리'을 추천합니다.");
        }
        if(rating >= 7.0) {
            System.out.println("'고질라'을 추천합니다.");
        }
        if(rating < 7.0){
            System.out.println("가서 유튜브 쇼츠봐라");
        }


    }
}
